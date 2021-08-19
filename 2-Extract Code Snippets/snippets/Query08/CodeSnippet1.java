import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Signature;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;

public class CodeSnippet1 {
   private static String Encrypt(String strTarget, int place) {
      // TODO Auto-generated method stub
      if (place==strTarget.length()) {
          return strTarget;
      }
      if (strTarget.charAt(place) != ' ')
      {
          char a = strTarget.charAt(place);
          int b = (int) a;
          b = strTarget.charAt(place)-4;
          a = (char) b;
          if ( b<70 && b>64)
          {
              b = strTarget.charAt(place)+26;
              a = (char) b;
          }
          return Encrypt(strTarget.substring(0,place)+a+strTarget.substring(place+1,strTarget.length()),place+1);
      }
      return null;
   }
}
