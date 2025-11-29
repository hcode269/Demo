import java.util.Scanner;

public class Giaiptbac2 {
    //Viết chương trình giải ptb2 dùng hàm :
    // 1 . Tìm nghiệm của ptb2 với : a = 1, b= 2, c = 3
    // 2. Tìm nghiệm của ptb2 với : a = 1, b= 2, c = 1
    // 3. Tìm nghiệm của ptb2 với : a = 1, b= 2, c = -3
    public static void giaiptbac2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a= ");
        int a = sc.nextInt();
        System.out.print("Nhập số b= ");
        int b = sc.nextInt();
        System.out.print("Nhập số c= ");
        int c = sc.nextInt();
        if ( a == 0){
            int x = -c/b;
        } else {
            int delta = b*b - 4*a*c;
            if (delta < 0 ){
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0){
                System.out.println("Phương trình có nghiệm kép x1 = x2 = " + -b/(2*a));
            } else {
                double x1 = (-b + Math.sqrt(delta))/(2*a);
                double x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.println("Phương trình có nghiệm x1 = "+x1);
                System.out.println("Phương trình có nghiệm x2 = "+x2);
            }
        }
    }
    public static void main(String[] args) {
        Giaiptbac2.giaiptbac2();
    }

}
