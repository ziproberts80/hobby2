package alists;

import java.util.ArrayList;
import java.util.Iterator;


public class ALists {

    /*
  *    To format all the code in NetBeans, press Alt + Shift + F. 
  *    If you want to indent lines, select the lines and press Alt + Shift + right arrow key,
  *    and to unindent, press Alt + Shift + left arrow key.
     */
    public static void main(String[] args) {

        ArrayList<String> family = new ArrayList<String>();

        family.add("Ted");
        family.add("Garnet");
        family.add("Margurite");
        family.add(2, "Arthur");

        System.out.println(family);
        
        
        System.out.print("\n\n********** Sort *******************************\n\n");
        
  
        System.out.print("\n\n********** Enhanced For *******************************\n\n");

        for (String s : family) {
            System.out.println(s);
        }

        System.out.print("\n\n**********Regular For *******************************\n\n");

        for (int i = 0; i < family.size(); i++) {
            System.out.println(family.get(i));
        }

       System.out.print("\n\n************* Iterator ****************************\n\n");

       
       String str;
       Iterator e = family.iterator();
       
       while (e.hasNext()){
            str = (String)e.next();
            System.out.println(str);
       }
        
    }//m

}//c
