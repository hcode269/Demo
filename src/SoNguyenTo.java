import java.util.Scanner;

public class SoNguyenTo {
    //Viết chương trình nhập nhập số nguyên a> 0 từ bàn phím
    //Cho biết đó có phải số ng tố
    //( số ng tố là số >1, và chỉ chia hết cho 1 và chính nó )
    //Kết thúc chương trình hỏi người dùng: Bạn có muốn tiếp tục sử dụng
    //phần mềm không? Nếu chọn không thì thoát ctrinh

    public void soNguyenTo(){
       while (true) {
           Scanner sc = new Scanner(System.in);
           System.out.print("Nhập số nguyên a>0 : ");
           int a = sc.nextInt();
           // Biến đếm số ước
           int count = 0;
           for (int i = 1; i <= a; i++) {
               if (a % i == 0) {
                   count++;
               }
           }
           if (count == 2) {
               System.out.println(a + " là số nguyên tố");
           } else {
               System.out.println(a + " không là số nguyên tố");
           }

           sc.nextLine();
           // Confirm
           System.out.print("Ban có muốn tiếp tục chương trình không? Yes:1; No:0. Chọn :");
           int y = sc.nextInt();
           if (y == 0) {
               break;
           }
       }
    }

    public static void main(String[] args) {
        SoNguyenTo x =new SoNguyenTo();
        x.soNguyenTo();
    }
}
