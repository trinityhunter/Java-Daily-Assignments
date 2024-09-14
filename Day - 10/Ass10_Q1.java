public class Ass10_Q1 {

    public static void main(String[] args) {

        int start = 7;

        for(int i=0; i<4; i++){
            int end = start;
            for(int j=0; j<=i; j++){
                System.out.print(end + "  ");
                end--;
            }
            start = end+1;
            System.out.println();
        }

    }

}
