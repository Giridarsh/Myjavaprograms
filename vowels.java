import java.io.*;

class consvowel
{
      DataInputStream d = new DataInputStream(System.in);
      consvowel()
      {
            try
            {
                  System.out.println("Enter a character :");
                  char ch=(char)(d.read());
                  if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' ')
                  {
                        System.out.println("Given character is an vowel");
                  }
                  else
                  {
                        System.out.println("Given character is a consonant");
                  }
            } catch(Exception e) {}
      }
}
public class vowels
{
      public static void main(String asd[])
      {
             consvowel obj = new consvowel();
      }     
}