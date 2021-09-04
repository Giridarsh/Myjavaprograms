import java.util.*;
public class GFG1
{
    public static void main(String[] args)
    {
        String encoded = "WW91ciBDb2RIIGZvciBMZXQncyBEZWNvZGUgY29udGVzdCBpczogQzhINDUx";
        System.out.println("Encoded String:\n"+ encoded);
        byte[] actualByte = Base64.getDecoder().decode(encoded);
        String actualString = new String(actualByte);
        System.out.println("actual String:\n"+ actualString);
    }
}