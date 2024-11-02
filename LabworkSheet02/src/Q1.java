public class Q1 {
    public static void main(String[] args){
        int count = 0;
        for(int i =10; i <50 ; i++){
            if(count<10){
                System.out.print(i + " ");
                count++;
            } else {
                System.out.println();
                System.out.print(i+" ");
                count =1 ;
            }

        }
    }
}