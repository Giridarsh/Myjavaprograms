class check
{
      StringBuilder str = new StringBuilder("WELCOME");
      check()
      {
            System.out.println(str.append("JAVA"));
            System.out.println(str.insert(1,"JAVA"));
            System.out.println(str.replace(1,3,"JAVA"));
            System.out.println(str.delete(1,3));
            System.out.println(str.append("JAVA IS A PROGRAMMING LANGUAGE"));
            System.out.println(str.capacity());
            System.out.println(str.reverse());
            System.out.println(str.charAt(3));
            System.out.println(str.setLength(6));
            System.out.println(str.length());
            System.out.println(str.trimToSize());
            System.out.println(str.codePointAt(8));
      }
}

class buildercheck
{
      static public void main(String asd[])
      {
            check obj = new check();
      }
}
           