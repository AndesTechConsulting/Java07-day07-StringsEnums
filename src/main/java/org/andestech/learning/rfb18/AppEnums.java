package org.andestech.learning.rfb18;

enum Accounts
{
    FirtstClass, SndClass, Stale, New, Old, Personal;
}


class Color{

    int r,g,b;


    public Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public String toString()
    {return "r:" + r + ",g:" + g + ",b:"+b; }
}

enum Colors
{
    Green(new Color(0,255,0)),
    Blue(new Color(0,0,255)),
    Red(new Color(255,0,0)),
    White(new Color(255,255,255)),
    Black(new Color(0,0,0));

    private Color color;
    private Colors(Color c)
    {
        color = c;
    }


    public Color getColor(){return color;}
}


public class AppEnums {

    private static void test(Accounts a)
    {
       switch (a)
       {
           case Personal:
               System.out.println("Ok. create some pers account");break;
           case Stale:
               System.out.println("Block account.."); break;

           case New:
               System.out.println("Create new account.."); break;
           default:


       }
    }

    public static void main(String[] args)
    {

        test(Accounts.Personal);
        test(Accounts.New);

        Colors color;

        color = Colors.Green;
        System.out.println(color.getColor().g);

        for (Colors c2: Colors.values()  )
        {
            System.out.printf("%10s --> %s\n", c2, c2.getColor());
        }

    }
}
