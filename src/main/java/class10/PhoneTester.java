package class10;

public class PhoneTester {
    public static void main(String[] args) {
        Phone iphone = new Phone();
        iphone.Name="Iphone 15 pro max";
        iphone.Color="It has 7 different color";
        iphone.Price="Price is very cheap, just $1300. every one can buy it";
        System.out.println(iphone.Name);
        System.out.println(iphone.Color);
        System.out.println(iphone.Price);
        iphone.qualityOfCamera();
        iphone.battery();
    }
}
