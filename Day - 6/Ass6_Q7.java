public class Ass6_Q7 {

    public static void main(String[] args) {

        int num = 65;

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print((char) num + " ");
                num++;
            }
            num = 65;
            System.out.println();
        }

    }

}
