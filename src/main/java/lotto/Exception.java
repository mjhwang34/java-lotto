package lotto;

abstract public class Exception extends Throwable {
    public int checkNumeric(String input){
        int number;
        try{
            number = Integer.parseInt(input);
        }
        catch (NumberFormatException ex) {
            throw new IllegalArgumentException();
        }
        return number;
    }

    public void checkDivisible(int dividend, int divisor){
        int remainder = dividend % divisor;
        if(remainder!=0) throw new IllegalArgumentException();
    }
}
