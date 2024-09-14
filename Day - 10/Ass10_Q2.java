public class Ass10_Q2 {

    public static void main(String[] args) {

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(j<i){
                    System.out.print("   ");
                }
                else{
                    System.out.print(4-i + "  ");
                }
            }
            System.out.println();
        }

    }

}
