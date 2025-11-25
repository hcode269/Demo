import java.util.Scanner;

public class Quy {
    public void QuyMay() {
        int month;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao thang ban can nhap: ");
            month = sc.nextInt();
            if (month > 0 && month < 13) {
                break;
            }
        }
        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("Thang " + month + " thuoc quy 1");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Thang "+ month + " thuoc quy 2");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Thang "+month + " thuoc quy 3");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Thang "+ month + " thuoc quy 4");
                break;
        }
    }

    public static void main(String[] args) {
        Quy quy = new Quy();
        quy.QuyMay();
    }

}
