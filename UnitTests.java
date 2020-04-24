public class UnitTests {
    public static void main(String[]args){
        multiplyTest();
        divideTest();
        calculateTest();
    }

    public static void multiplyTest(){
        MiniCalculator mult = new MiniCalculator();
        mult.multiply(5);
        if(mult.calculate() != 5){
            System.out.println("FAILED MULTIPLY FIVE");
        }
        else{
            System.out.println("SUCCESS MULTIPLY FIVE");
        }
    }

    public static void divideTest(){
        MiniCalculator div = new MiniCalculator();
        div.divide(5);
        if(div.calculate() != 0 ){
            System.out.println("FAILED DIVIDE FIVE");
        }
        else{
            System.out.println("SUCCESS DIVIDE FIVE");
        }
    }

    public static void calculateTest() {
        MiniCalculator calc = new MiniCalculator();
        if(calc.calculate() != 1){
            System.out.println("FAILED CALCULATE ONE");
        }
        else{
            System.out.println("SUCCESS CALCULATE ONE");
        }

    }
}

