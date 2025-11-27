public class SoHoanThien {
    //  Tìm tất cả những số hoàn thiện trong phạm vi từ 1-1000
    public void timso(int n){
        int sum = 0;
        for (int i =1; i <=(double)n/2; i++){
            if(n%i == 0){
                sum += i;
            }
        }
        if(sum == n){
            System.out.println(n + " là số hoàn hảo");
        }
    }

    public static void main(String[] args) {
        SoHoanThien perfectNumber = new SoHoanThien();
        for (int i = 1; i <=1000; i++){
            perfectNumber.timso(i);
        }
    }
}
