public class Ass9_Q3 {

    public static void main(String[] args) {

        int A = 65;

        int a = 97;

        for(int i=0; i<4; i++){
            for(int j=0; j<4-i; j++){
                if(i%2 == 0){
                    System.out.print((char) A + "  ");
                    A++;
                }
                else{
                    System.out.print((char) a + "  ");
                    a++;
                }
            }
            A = 65;
            a = 97;
            System.out.println();
        }

    }

}
