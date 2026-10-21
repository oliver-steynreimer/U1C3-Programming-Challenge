public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    private String calcModel;
    private int idNumber;

    public Solution(String model, int id) {
        calcModel = model;
        idNumber = id;
    }

    public Solution(int id) {
        calcModel = "TI-84";
        idNumber = id;
    }

    public String getCalcModel() {
        String type = calcModel;
        return type;
    }

    public void setCalcModel(String newModel) {
        calcModel = newModel;
    }

    public int getIdNumber() {
        int idNum = idNumber;
        return idNum;
    }

    public void setIdNumber(int newId) {
        idNumber = newId;
    }

    public void incrementId() {
        idNumber++;
    }

    public double add(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    public double subtract(double num1, double num2) {
        double difference = num1 - num2;
        return difference;
    }

    public double multiply(double num1, double num2) {
        double product = num1 * num2;
        return product;
    }

    public int quotient(int num1, int num2) {
        int result = num1/num2;
        return result;
    }

    public int remainder(int num1, int num2) {
        int remain = num1 % num2;
        return remain;
    }

    public String divisionResult(int num1, int num2) {
        int result = quotient(num1,num2);
        int remain = remainder(num1,num2);
        String output = result + " R " + remain;
        return output;
    }

    public String coordinatePair(int x, int y) {
        String output = "(" + x + ", " + y + ")";
        return output;
    }

    public int average(int num1, int num2) {
        double sum = num1 + num2;
        int result = (int) (sum/2 +.5);
        return result;
    }

    public String info() {
        String facts = "This calculator is a model " + calcModel + " with id " + idNumber;
        return facts;
    }

}
