package oopconcept;

public class FunctionBasic {

    public static void main(String[] args) {
        FunctionBasic fb=new FunctionBasic();

        int addition =fb.add(2,3);
        int subtraction = fb.subtract(3,6);
        int multiplication = fb.multiply(5,6);

        System.out.println("Result of addition="+ addition);
        System.out.println("Result of subtraction="+ subtraction);
        System.out.println("Result of multiplication="+ multiplication);

    }
public int add(int a,int b) {
    int result = a+b;
    return result;
}

    public int subtract(int a,int b) {
        int result = a-b;
        return result;
    }

    public int multiply(int a,int b) {
        int result = a*b;
        return result;
    }


}
