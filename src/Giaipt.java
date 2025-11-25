import java.util.Scanner;

public class Giaipt {
    double a;
    double b;
    double c;
    public void Giaipt (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x: ");
        a = sc.nextDouble();
        System.out.println("Nhap y: ");
        b = sc.nextDouble();
        System.out.println("Nhap z: ");
        c = sc.nextDouble();
        if (a == 0 ){
            System.out.println("Nhap lai x. x khac 0: ");
            this.a = sc.nextDouble();
        }
        double delta = b*b - 4*a*c;
        if (delta < 0)
            System.out.println("Phuong trinh vo nghiem");
        else if (delta == 0 ){
            double x = -b/(2*a);
            System.out.println("Phuong trinh co nghiem kep : "+ x);
        } else {
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("Phuong trinh co 2 nghiem phan biet x1 = "+x1 + " va x2 : "+x2);
        }
    }

    public static void main(String[] args) {
        Giaipt giaipt = new Giaipt();
        giaipt.Giaipt();
    }

}
