package calculatorConundrum;

class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        int answer = 0;
        if(operation == null){
            throw new IllegalArgumentException("Operation cannot be null");
        }
        // switch statement cannot handle null >> NullPointerException
        switch(operation){
            case "+":
                answer = addition(operand1, operand2);
                break;
            case "*":
                answer = multiplication(operand1, operand2);
                break;
            case "/":
                answer = division(operand1, operand2);
                break;
            case "":
                throw new IllegalArgumentException("Operation cannot be empty");
                // No need break; if there is throw ...
            default:
                throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }
        return Integer.toString(operand1) + " " + operation + " " + Integer.toString(operand2) + " = " + Integer.toString(answer);
    }

    public int addition(int operand1, int operand2){
        return operand1 + operand2;
    }

    public int multiplication(int operand1, int operand2){
        return operand1 * operand2;
    }

    public int division(int operand1, int operand2){
        int answer = 0;
        try{
            answer = operand1 / operand2;
        } catch(ArithmeticException e){ // ArithmeticException is a type of exception
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }
        return answer;
    }
}
