
package commissionapp;


public class CommissionClass {
     private double commissionPercent; 
     private double totalSales; 
     private double commissionAmount;
     private double totalProfit;      

     
     /**
      * this is the constructor 
      * 
      * 
      * 
      * @param commissionPercent  Expressed in decimal form 15%  = .15
      * @param totalSales         Total sales price of item sold
      * 
      */
    public CommissionClass(double commissionPercent, double totalSales) {
        this.commissionPercent = commissionPercent;
        this.totalSales = totalSales;
       
        doCalculations();
    }
     
    /**
     * do calculations of Commission Amount and total Payment
     * 
     */
     
      
      private void doCalculations(){
         this.commissionAmount = commissionPercent * totalSales;
         this.totalProfit = totalSales - commissionAmount;
    }
    
   
    
      
   /**
    * String output when printing the instance variable
    * 
    * @return String
    */
    @Override
    public String toString() {

        String outputString;
        outputString = String.format("\n\n\nCommission Percent: %.2f%c\n", commissionPercent,'%');
        outputString += String.format("Total Sales: $%.2f \n" , totalSales);
        outputString += String.format("Commission Amount: $%.2f \n" , commissionAmount);
        outputString += String.format("Total Profit after commission paid: $%.2f \n" , totalProfit);

        return outputString;
    }

}
