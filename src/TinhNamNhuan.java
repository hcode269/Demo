public class TinhNamNhuan {
    public void TinhNamNhuan(int year){
        if (((year % 4 == 0 ) && (year % 100) == 0) || year % 400 ==0){
            System.out.println("Nam "+year + " la năm nhuận");
        } else
            System.out.println("Nam "+year + " la năm nhuận");
    }

    public static void main(String[] args) {
        TinhNamNhuan result = new TinhNamNhuan();
        result.TinhNamNhuan(1998);
    }
}
