class check
{  
      String str = "GIRDARSH";
      check()
      {
            System.out.println(str);
            System.out.println(str.replace('g','G'));
            System.out.println(str.substring(2,6));
            System.out.println(str.lastIndexOf(5));
            System.out.println(str.strip());
            System.out.println(str.stripLeading());
            System.out.println(str.valueOf(3));
            System.out.println(str.repeat(7));
            System.out.println(str.repeat(3));
            System.out.println(str.length());
            System.out.println(str.indexOf(4));
            System.out.println(str.intern());
            System.out.println(str.toString());
            System.out.println(str.toUpperCase());
            System.out.println(str.toLowerCase());
            System.out.println(str.stripLeading());
            System.out.println(str.stripTrailing());
      }
}

class stringcheck
{ 
      static public void main(String asd[])
      {
            check obj = new check();
      }
}      