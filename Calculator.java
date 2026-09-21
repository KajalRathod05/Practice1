public class Calculator {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("sum of a and b is: " + (a + b));
        System.out.println("Multiplication of a and b is: " + multiply(a , b));
    }

    public int multiply(int a,int b){
        return a*b;
    }
}
