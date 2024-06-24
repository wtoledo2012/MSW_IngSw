package ec.edu.ups.tddwto.calculator;

public class Calculadora {
    private int ans;
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public Object additionTwoInt(int i, int j) {
        return i+j;
    }
    public int subtractionTwoInt(int i, int j) {
        return i-j;
    }
    public int multiplicationTwoInt(int i, int j) {
        try {
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return i*j;
    }
    public int divisionTwoInt(int i, int j) {
        return i/j;
    }
    public void setAns(int i) {
        this.ans = i;
    }
    public int getAns(int i) {
        return this.ans;
    }
}