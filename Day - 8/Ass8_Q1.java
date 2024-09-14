public class Ass8_Q1 {

    public static void main(String[] args) {

        int num = 1;

        for(int i=0; i<4; i++){
            for(int j=0; j<=i; j++){
                System.out.print((int)Math.pow(num, 2) + " ");
                num++;
            }
            System.out.println();
        }

    }

}
