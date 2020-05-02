/** ****************************************************************
 *
 *      Programmer: Gary Clifford
 *      Date 3/11/2020
 *
 *      Purpose: Create a class that calculates, tip, full meal cost
 *               and split of the bill based on bill amount, tip percentage
 *               and number of people to split the bill
 *
 *      Modfiication History
 *      --------------------
 *
 *      Programmer       Date           Modification
 *      ===============  =========      ====================================
 *      Gary Clifford    3/11/2020      initial code
 *
 *
 *
 *
 *
 ***************************************************************** */
package gratuityoop;

/**
 * This is a class that can be used to calculate tip, and amount based on
 * percentage, bill amount and split by
 *
 * @author Gary Clifford
 * @version 1.0 3/11/2020
 */
public class GratuityClass {

    /**
     *
     */
    private double gratuityPercentage;

    /**
     *
     */
    private double bill;

    /**
     *
     */
    private double totalBill;

    /**
     *
     */
    private double tipAmount;

    /**
     *
     */
    private int splitBillBy;

    /**
     *
     */
    private double splitAmount;

    /**
     * Constructor Does the calculations needed for desired output
     * if splitBillBy is 0 this is interpreted that splitBillBy should
     * be 1 and code makes that adjustment
     *
     * @param bill full bill amount from the waitstaff
     * @param gratuityPercentage Percentage for tip (enter .15 for 15%)
     * @param splitBillBy for the total bill with tip how should bill be split
     */
    public GratuityClass(double bill, double gratuityPercentage, int splitBillBy) {

        this.bill = bill;
        this.gratuityPercentage = gratuityPercentage;
        if (splitBillBy == 0){
            splitBillBy = 1;
        }
        this.splitBillBy = splitBillBy;

        doCalculations();

    }

    /**
     *
     */
    private void doCalculations() {

        this.tipAmount = (bill * gratuityPercentage);
        this.totalBill = (tipAmount + bill);
        this.splitAmount = totalBill / splitBillBy;
    }

    /**
     * override toString to output information
     *
     * @return String Total Bill and Split amount
     */
    @Override
    public String toString() {

        String answer;
        answer = String.format("\n\n\nGratuity Percentage: %.2f%c\n", gratuityPercentage, '%');
        answer += String.format("The bill: $%.2f\n", bill);
        answer += String.format("The tip is $%.2f\n", tipAmount);
        answer += String.format("The total bill is $%.2f\n", totalBill);
        answer += String.format("Total Bill Split by: %d\n", splitBillBy);
        answer += String.format("Cost per person: $%.2f \n\n", splitAmount);

        return answer;
    }

}
