public class Tinhtongcuagiaithua {
    // Tinh tong giai thua S = 1! + 2! + ..+ 10!
    public int giaithua(){
       int fact = 1;
       int sum = 0;
       for (int i =1; i<=10; i++){
           fact *= i;
           sum +=fact;
       }
       return sum;
    }

    public static void main(String[] args) {
        Tinhtongcuagiaithua tong = new Tinhtongcuagiaithua();
        System.out.println(tong.giaithua());
    }
}
