package ArvoreBinaria;

public class Arvore {

    private static Noh raiz;
    private static int contar;

    public Arvore() {
        this.raiz = null;
        this.contar = 0;
    }

    public static void inserirAluno(Aluno aluno) {
        raiz = inserir(raiz, aluno);
        contar++;
    }

    private static Noh inserir(Noh noh, Aluno aluno) {
        if (noh == null) {
            return new Noh(aluno);
        }

        if(pesquisarAluno(aluno.getId()) == null) {
            if (aluno.id < noh.aluno.id) {
                noh.left = inserir(noh.left, aluno);
            } else if (aluno.id > noh.aluno.id) {
                noh.right = inserir(noh.right, aluno);
            }
        } else{
            System.out.println("Aluno não inserido pois ID "+ aluno.getId() +" já existe");
        }

        return noh;
    }

    public int pegarQuantidade() {
        return contar;
    }

    public static Aluno pesquisarAluno(int id) {
        return procurar(raiz, id);
    }

    public void procurarAluno(int id) {
        Aluno aluno = procurar(raiz, id);

        if (aluno != null) {
            System.out.println(aluno.toString());
        } else {
            System.out.println("Aluno não encontrado!");
        }
    }

    private static Aluno procurar(Noh no, int id) {
        if (no == null || no.aluno.id == id) {
            return no != null ? no.aluno : null;
        }

        if (id < no.aluno.id) {
            return procurar(no.left, id);
        } else {
            return procurar(no.right, id);
        }
    }

    public String verificarFalta(int id) {
        Aluno aluno = pesquisarAluno(id);
        if (aluno == null) {
            return "Aluno não encontrado";
        }

        double faltaAluno = 0;
        if(aluno.getFaltas() > 0){
            //Considerando 16 aulas cada aula 4,5 horas
            for(int i = 1; i <= aluno.getFaltas(); i++ ){
                faltaAluno += 4.5;
            }
        }

        double cargaHoraria = 72;
        double limiteFaltas = cargaHoraria * 0.25;

        if(faltaAluno >= limiteFaltas)
            return "O Aluno foi reprovado, quantidade de horas faltantes: " + faltaAluno;

        return "O aluno não excedeu o percentual de faltas";
    }

    public void calcularMedia() {
        calcularMediaAluno(raiz);
    }

    private void calcularMediaAluno(Noh noh) {
        if (noh != null) {
            calcularMediaAluno(noh.left);
            noh.aluno.media = calcular(noh.aluno);
            calcularMediaAluno(noh.right);
        }
    }

    private double calcular(Aluno aluno) {
        return (aluno.getP1() + aluno.getP2())/2;
    }

    public double maiorMedia() {
        return pegarMaiorMediaAluno(raiz);
    }

    private double pegarMaiorMediaAluno(Noh no) {
        if (no == null) {
            return Double.MIN_VALUE;
        }

        double maiorMedia = no.aluno.media;
        double mediaEsquerda = pegarMaiorMediaAluno(no.left);
        double mediaDireita = pegarMaiorMediaAluno(no.right);

        if (mediaEsquerda > maiorMedia) {
            maiorMedia = mediaEsquerda;
        }
        if (mediaDireita > maiorMedia) {
            maiorMedia = mediaDireita;
        }

        return maiorMedia;
    }

    public double menorMedia() {
        return pegarMenorMedia(raiz);
    }

    private double pegarMenorMedia(Noh noh) {
        if (noh == null) {
            return Double.MAX_VALUE;
        }

        double menorMedia = noh.aluno.media;
        double mediaEsquerda = pegarMenorMedia(noh.left);
        double mediaDireita = pegarMenorMedia(noh.right);

        if (mediaEsquerda < menorMedia) {
            menorMedia = mediaEsquerda;
        }
        if (mediaDireita < menorMedia) {
            menorMedia = mediaDireita;
        }

        return menorMedia;
    }

    public void gerarRelatorioPorId() {
        gerarRelatorio(raiz);
    }

    private void gerarRelatorio(Noh noh) {
        if (noh != null) {
            gerarRelatorio(noh.left);
            System.out.println(noh.aluno.toString());
            gerarRelatorio(noh.right);
        }
    }

}
