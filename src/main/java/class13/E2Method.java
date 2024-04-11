package class13;

public class E2Method {

    int addArray(int [] arr){
        int sum=0;
        for (int i =0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        E2Method e2 = new E2Method();
        int [] ar={10,20,30};
        int result = e2.addArray(ar);
        System.out.println(result);
    }
}
