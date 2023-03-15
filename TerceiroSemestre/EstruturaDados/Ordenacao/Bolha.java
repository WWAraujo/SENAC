public class Bolha {
    
    public static void bolha(int[] x) {

        int[] v = x ;
        int temp;
        for (int j = 0; j < v.length - 1; j++) {//Varreduras
            for (int i = 0; i < v.length - 1 - j; i++) {//Comparações
                if (v[i] > v[i + 1]) {
                    temp = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = temp;
                }

                for (int k =0; k < v.length; k++) {
                    System.out.print(v[k]+", ");
                }
                System.out.println();
            }
        }
    }
}
