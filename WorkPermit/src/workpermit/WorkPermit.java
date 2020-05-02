
package workpermit;


public class WorkPermit {


    public static void main(String[] args) {
      
        boolean isWorkPermitGood = true;
        boolena workPermitEnding = true;
        final int WORKPERMIT_OFFICAL_LENGTH =13;
        
        String workPermit = "XXX*000000-MA".toUpperCase();
        workPermitLength = workPermit.length();
        
        if(workPermitLength != WORKPERMIT_OFFICAL_LENGTH){
            System.out.println("Work Permit Does Not have the right length");
            System.exit(0);
        }
        
        if(!workPermit.endsWith("-MA"){
            System.out.println("Work Permit Does Not end in -MA");
            System.exit(0);
        }
        
        for(int i = 0; i<=9;  i++){
            
            switch(i)
                case 0:
                case 1:
                case 2:
                 Character.isLetter(workPermit.charAt(i))
                 break:
                case 3:
                  workPermit.charAt(i) == '*'; 
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:      
                  if(!Character.isDigit(workPermit.charAt(i))) 
                  
        }
        
        
    }
    
}
