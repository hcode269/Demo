import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Mời nhập tuổi: ");

        int tuoi = sc.nextInt();
        System.out.println("Tuoi cua ban la: "+ tuoi);
        CustomerService customer = new Huy();
        customer.smit("Nam");
    }
}