
package pkgfinal;


public class Validator {
    
    
      public static boolean testPhone (String phoneValue)
    {
        int digitCount = 0;
        int dashCount = 0;
        int parenCount = 0;
        
        final int PHONE_DASHES = 1;
        final int PHONE_LENGTH = 13;
        final int PHONE_DIGITS = 10;
        final int PHONE_PAREN = 2;
        
        if (phoneValue.length() != PHONE_LENGTH)
            return false;
        
        for(int i = 0; i <= phoneValue.length() - 1; i++)
        {
            switch(i)
            {
                case 1:
                case 2:
                case 3: 
                case 5:
                case 6:
                case 7:
                case 9:
                case 10:
                case 11:
                case 12:
                    if (Character.isDigit(phoneValue.charAt(i)))
                        digitCount++;
                    break;
                case 0:
                    if ((phoneValue.charAt(i) == '('))
                        parenCount++;
                case 4:
                    if ((phoneValue.charAt(i) == ')'))
                        parenCount++;
                case 8:
                    if (phoneValue.charAt(i) == '-')
                        dashCount++;
            }
        }
        
        if ((dashCount == PHONE_DASHES) && (digitCount == PHONE_DIGITS) &&
                (parenCount == PHONE_PAREN))
            return true;
        else
            return false;
        
    } // testPhone
     
     
// ****************************************************************   
    
     
     public static boolean testPassword (String passwordValue)
    {
        final int ACCEPTABLE_PW_LENGTH = 8;
        boolean bpassword = false;
        
        boolean bupperCase = false;
        boolean blowerCase = false;
        boolean bdigit = false;
        boolean bspecialChar = false;
        
        if (passwordValue.length() < ACCEPTABLE_PW_LENGTH)
            return false;
        
        for (int i = 0; i <= passwordValue.length() - 1; i++)
        {
            if (Character.isDigit(passwordValue.charAt(i)))
                bdigit = true;
            else if (Character.isLowerCase(passwordValue.charAt(i)))
                blowerCase = true;
            else if (Character.isUpperCase(passwordValue.charAt(i)))
                bupperCase = true;
            else
            {
                if (bspecialChar == false)
                {
                    switch ((passwordValue.charAt(i)))
                    {
                        case '!':
                        case '@':
                        case '#':
                        case '$':
                        case '%':
                        case '^':
                        case '&':
                        case '*':
                            bspecialChar = true;
                            break;
                    }
                }
            }
        }
        
        if (bupperCase && blowerCase && bdigit && bspecialChar)
            bpassword = true;
        else
            bpassword = false;
        
        return bpassword;
        
    } // testPassword
    
    
// ****************************************************************
    
    
     public static boolean testState (String stateValue)
    {
        boolean validState;
        
        String testState = stateValue.toUpperCase();
        
        switch (testState)
        {
            case "ME":
            case "MA":
            case "VT":
            case "CT":
            case "RI":
            case "NH":
                validState = true;
                break;
                
            default:
                validState = false;
        }
        
        return validState;
        
    } // testState
    
    
// ****************************************************************
    
    
     public static boolean testEmail (String emailValue)
    {
        String testEmail = emailValue.toLowerCase();
        
        if (testEmail.contains("@"))
                {
                    if (emailValue.endsWith(".com"))
                        return true;
                    
                    else if (emailValue.endsWith(".edu"))
                        return true;
                    
                    else if (emailValue.endsWith(".nl"))
                        return true;
                    
                    else if (emailValue.endsWith(".uk"))
                        return true;
                    
                    else
                        return false;
                }
        else
            return false;
        
    } // testEmail
    
    
// ****************************************************************
    
    
     public static boolean testSSN (String ssnValue)
    {
        
        int digitCount = 0;
        int dashCount = 0;
        
        final int SSN_DASHES = 2;
        final int SSN_LENGTH = 11;
        final int SSN_DIGITS = 9;
        
        if (ssnValue.length() != SSN_LENGTH)
            return false;
        
        for(int i = 0; i <= ssnValue.length() - 1; i++)
        {
            switch(i)
            {
                case 0:
                case 1:
                case 2:
                case 4: 
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    if (Character.isDigit(ssnValue.charAt(i)))
                        digitCount++;
                    break;
                    
                case 3:
                case 6:
                    if ((ssnValue.charAt(i) == '-'))
                        dashCount++;
            }
        }
        
        if ((dashCount == SSN_DASHES) && (digitCount == SSN_DIGITS))
            return true;
        else
            return false;
        
    } // testSSN
    
}
