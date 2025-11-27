//  Tìm những số chia hết cho 3 từ 10 đến 50
public class Timsochiahetcho3 {
    public static void findnumber(){
        for (int i =11; i<=50; i++){
            if(i % 3 == 0){
                System.out.println("Số chia hết cho 3 là "+i);
            }
        }
    }
    public static void main(String[] args) {
        Timsochiahetcho3.findnumber();
    }
}
