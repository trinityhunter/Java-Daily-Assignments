public class Ass5_Q5 {

    public static void main(String[] args) {

        int num = 1;

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                if(j%2 == 0){
                    System.out.print("* ");
                }
                else{
                    System.out.print(num + " ");
                    num++;
                }

            }
            System.out.println();
        }

    }

}
