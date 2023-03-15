public class Sort {

    public static void selectionSort(int[] v) {
        int temp;
        for (int j = 0; j < v.length - 1; j++) { //Varreduras
            int menor=j;//índice
            for(int i=j+1;i<v.length;i++){//Comparações
                if(v[menor]>v[i]){
                    menor=i;
                }
            }
            //Troca
            temp=v[menor];
            v[menor]=v[j];
            v[j]=temp;

            for (int i : v) {
                System.out.print(i+", ");
            }
            System.out.println();
        }

    }
}
