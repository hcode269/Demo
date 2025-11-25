import java.util.Scanner;

public class Timkiem {
    public void timtheo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi bam so de chon \n" +
                "1. tim theo theo ten \n" +
                "2. tim kiem theo ten tac gia \n" +
                "3. tim kiem theo nha san xuat \n" +
                "4. tim kiem theo tieu de");
        int stt = sc.nextInt();
        switch (stt){
            case 1:
                System.out.println("tim theo theo ten");
                break;
            case 2:
                System.out.println("tim kiem theo ten tac gia");
                break;
            case 3:
                System.out.println("tim kiem theo nha san xuat");
                break;
            case 4:
                System.out.println("tim kiem theo tieu de");
                break;
            default:
                System.out.println("Lua chon cua ban khong hop le");
                break;
        }
    }

    public static void main(String[] args) {
        Timkiem result = new Timkiem();
        result.timtheo();
    }
}
