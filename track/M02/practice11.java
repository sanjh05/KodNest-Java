public class practice11 {
    public static void main(String[] args) {


        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 2; j++){
                if(j == 2){
                    break;
                }
                System.out.println("i: " + i + " " + "j: " + j);
            }
        }


         System.out.println();


        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 5; j++){
                if(j == 2){
                    continue;
                }
                System.out.println("i: " + i + " " + "j: " + j);
            }
            System.out.println();

        }
    }
}
