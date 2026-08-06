public class practice10 {
    public static void main(String[] args) {
        for(int i = 1; i<=10; i++){
            if(i == 6){
                break;
            }
            System.out.println(i);
        }

           System.out.println();
           
         for(int i = 1; i<=10; i++){
            if(i == 6){
                continue;
            }
            System.out.println(i);
        }

    }
}
