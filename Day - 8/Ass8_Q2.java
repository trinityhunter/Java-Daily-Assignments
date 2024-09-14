public class Ass8_Q2 {

    public static void main(String[] args) {

        int num = 65;

        for(int i=0; i<4; i++){
            for(int j=0; j<=i; j++){
                System.out.print((char) num + "  ");
                num++;
            }
            System.out.println();
        }

    }

}
