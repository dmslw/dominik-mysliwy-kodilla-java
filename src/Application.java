class Application
{
    public static void main(String[] args) {

        Calculator simpleCalculator = new Calculator();

        int result = simpleCalculator.addAToB(5, 5);
        System.out.println(result);
    }
}