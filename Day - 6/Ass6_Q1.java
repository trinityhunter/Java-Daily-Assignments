public class Ass6_Q1 {

    public static void main(String[] args) {

        int a = 20;

        int b = 30;

        int c = 40;

        if(a>b && a<c || a<b && a>c){
            System.out.println(a + " is the second largest");
        }
        else if(b>a && b<c || b<a && b>c){
            System.out.println(b + " is the second largest");
        }
        else if(c>a && c<b || c<a && c>b){
            System.out.println(c + " is the second largest");
        }

    }

}
