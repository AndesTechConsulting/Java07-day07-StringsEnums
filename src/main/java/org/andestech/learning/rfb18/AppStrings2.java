package org.andestech.learning.rfb18;


import java.util.Locale;

public class AppStrings2 {

    public static void main(String[] args)
    {

     //   System.out.printf(new Locale("us"),"first: %.3f, second %.3f ",12.222, -1000.0);

     String out = String.format(new Locale("us"),"first: %+10.3f, second %+10.3f ", 12.222, -1000.0);
// out -> ,,,,,
     System.out.println(out);

     //-----------------------------
        StringBuffer sbb = new StringBuffer();
        StringBuilder sb = new StringBuilder("AAA");
        sb.append(12);
        sb.append('q');
        sb.append("DADADA");
        sb.insert(5, "xxxx");

        sb.delete(2,4);

        System.out.println(sb);




    }

}
