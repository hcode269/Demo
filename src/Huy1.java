public class Huy1 {
    public static void Huy122(int year){
        System.out.println("Huy sinh nam "+year);
    }
    public static int Namsinh(int year){
        return year + 6;
    }

    public static void main(String[] args) {
        Huy1.Huy122(1998);
        System.out.println(Huy1.Namsinh(1998));
    }
}
