public class MultiDimensionalArray {
    public static void main(String[] args) {
//        Syntax
//        datatype[][]arrayName;
//        initialization
//        arrayName = new datatype[int rowsize][int colsize]
        int [][] brr = new int[3][5];
        int [][] array = {{1,2,3,4,5},{1,2,3,4,5}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        System.out.println("_____________");
        for (int i = 0; i < brr.length; i++) {
            for (int j = 0; j < brr[i].length; j++) {
                System.out.print(brr[i][j]);
            }
            System.out.println();
        }
    }
}
