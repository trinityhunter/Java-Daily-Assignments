public class Ass10_Q4 {

    public static void main(String[] args) {

        for(int i=0; i<4; i++){
            int num = 5-i;
            for(int j=0; j<4; j++){
                if(j<4-i){
                    System.out.print(num + "  ");
                    num--;
                }
            }
            System.out.println();
        }

    }

}
