public class Tinhchieucaocannang {
    double height;
    double weight;
    public Tinhchieucaocannang(double height, double weight){
        this.height = height;
        this.weight = weight;
        double BMI = (double) weight/(height*height);
        if (BMI<15){
            System.out.println("Than hinh qua gay");
        } else if(BMI<=16){
            System.out.println("Than hinh gay");
        } else if(BMI < 18.5){
            System.out.println("Than hinh hoi gay");
        } else if(BMI <25){
            System.out.println("Than hinh binh thuong");
        } else if (BMI <30){
            System.out.println("Than hinh hoi beo");
        } else if (BMI <35){
            System.out.println("Than hinh beo");
        } else {
            System.out.println("Than hinh qua beo");
        }
    }

    public static void main(String[] args) {
        Tinhchieucaocannang result = new Tinhchieucaocannang(1.78,75);
    }
}
