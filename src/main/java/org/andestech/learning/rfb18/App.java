package org.andestech.learning.rfb18;


import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App
{
    private static String toUpperFirst(String data)
    {
       data = data.trim();
       String s1 = data.substring(0,1).toUpperCase();
       //s1 = s1.toUpperCase();

       String res = s1 + data.substring(1).toLowerCase();

       return res;
    }

    public static void main( String[] args )
    {

     String st = "  akjhd;Паста;kjhsda,,, ВВdas, Рисewrewr,werwer,222,555";
     String uname = "  BasiL";

        System.out.println("[" + uname + "]");

     uname = uname.trim().toUpperCase();
        System.out.println("[" + uname + "]");
        System.out.println("ABC".substring(0,1));
        uname = toUpperFirst(uname);
        System.out.println("[" + uname + "]");

     //--------------------------------------------

       //1
       char[] ch1 = uname.toCharArray();

       //2
       char[] ch2 = new char[uname.length()];
       ch2 = uname.toCharArray();

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

     //-------------------------- split

      String[] arr1 =  st.split(",|;");
      for(String a: arr1) System.out.println("[" +a + "]");


      System.out.println("---------------------------");
     // regexp;
      String pattern1 = "^data.*";
        pattern1 = ".*\\(data\\d{4}$";

      String phone = "(xxx)-xx-xxx-xxx";
      String phonePattern = "^\\(\\d{3}\\)-\\d{2}-\\d{3}-\\d{3}$";

      Pattern pat = Pattern.compile(pattern1);

      Matcher m =    pat.matcher("qweqewqwe (data4564");

       System.out.println(m.matches());

        System.out.println(
                "jashdgjhagdjh11".matches("\\d{2}$"));
        System.out.println("Phone matches: " +
                "(222)-00-123-678".matches(phonePattern));

      /// find

       // Pattern pat2 = Pattern.compile("[A-Za-z]{3}\\d{2}");
        Pattern pat2 = Pattern.compile("\\w{3}\\d{2}");
        Matcher m2 =    pat2.matcher(" Abs12 ,jdhAAAA23 Hgf23, U8 UUU43");

        while(m2.find())
        {
            System.out.println("i: " + m2.start() +
                    ", data: " + m2.group());

        }

    }
}
