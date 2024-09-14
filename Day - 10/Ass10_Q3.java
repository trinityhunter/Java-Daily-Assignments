public class Ass10_Q3 {

    public static void main(String[] args) {

        for(int i=0; i<4; i++){
            int num = i+1;
            for(int j=0; j<4; j++){
                if(j+1<4-i){
                    System.out.print("   ");
                }
                else{
                    System.out.print(num + "  ");
                    num--;
                }
            }
            System.out.println();
        }

    }

}
