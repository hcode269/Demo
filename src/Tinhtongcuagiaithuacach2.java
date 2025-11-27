public class Tinhtongcuagiaithuacach2 {
    public static long giaithua(int n){
        long result = 1;
        for (int i = 1; i <=n; i++){
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        long sum = 0;
        for (int i = 1; i <=10; i++){
            sum += giaithua(i);
        }
        System.out.println("Tong giai thua bang "+sum);
    }
}
