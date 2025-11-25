public class ViduBreak {
    public static void main(String[] args) {
        int n = 0;
        for (int i =0; i<7; i++){
            n=i;
            if(n ==4){
                break;
            }
        }
        System.out.println("Số cuối cùng trước khi break là: "+ n);
    }
}
