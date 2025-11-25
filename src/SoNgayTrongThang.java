import java.util.Scanner;

public class SoNgayTrongThang {
    public static void SoNgayTrongThang(int month){
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("Thang " + month + " co 31 ngay.");
                break;
            case 2:
                Scanner sc = new Scanner(System.in);
                System.out.println("Nhap nam sinh: ");
                int year = sc.nextInt();
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                    System.out.println("Thang 2 nam " + year + " co 29 ngay");
                } else {
                    System.out.println("Thang 2 nam " + year + " co 28 ngay");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang " + month + " co 30 ngay.");
                break;
            default:
                System.out.println("Thang "+ month + " khong ton tai");
        }

    }

    public static void main(String[] args) {
        SoNgayTrongThang.SoNgayTrongThang(2);
    }
}
