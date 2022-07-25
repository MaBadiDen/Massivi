public class Main {
    public static void main(String[] args) {
        int[] first = new int[3];
        first[0] = 1;
        first[1] = 2;
        first[2] = 3;

        double[] second = {1.57, 7.654, 9.986};

        char[] treriy = {'a', 'b', 'c'};

        for(int i = 0; i < first.length - 1; i++){
            System.out.print(first[i] + ", ");
        }
        System.out.println(first[first.length - 1]);
        for(int i = 0; i < second.length - 1; i++){
            System.out.print(second[i] + ", ");
        }
        System.out.println(second[second.length - 1]);
        for(int i = 0; i < treriy.length - 1; i++){
            System.out.print(treriy[i] + ", ");
        }
        System.out.println(treriy[treriy.length - 1]);

        System.out.println("------------------------------------------");



        for(int i = first.length - 1; i > 0; i--){
            System.out.print(first[i] + ", ");
        }
        System.out.println(first[0]);
        for(int i = second.length - 1; i > 0; i--){
            System.out.print(second[i] + ", ");
        }
        System.out.println(second[0]);
        for(int i = treriy.length - 1; i > 0; i--){
            System.out.print(treriy[i] + ", ");
        }
        System.out.println(treriy[0]);

        System.out.println("------------------------------------------");

        for(int i = 0; i < first.length; i++){
            if(first[i] % 2 != 0) {
                first[i]++;
            }
        }
        for(int i = 0; i < first.length - 1; i++){
            System.out.print(first[i] + ", ");
        }
        System.out.println(first[first.length - 1]);
    }


}