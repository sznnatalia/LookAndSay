

package lookandsay;

/**
 *
 * @author Nati
 */
public class LookAndSay {

    
    public static void main(String[] args) {
        String szam ="1";
        
        for (int i = 0; i < 8; i++) {
            
        
        int szamlalo = 0;
        int darab = 1;
        String eredmeny="";
        
        while(szamlalo< szam.length()){
            
            
            if((szamlalo+1)<szam.length() && szam.charAt(szamlalo)==szam.charAt(szamlalo+1)){
                darab ++;
                szamlalo++;
            } else{
                eredmeny += darab+""+szam.charAt(szamlalo);
                darab=1;
                szamlalo++;
            }
            
            
        }
        
        System.out.println(eredmeny);
        szam = eredmeny;
        }
    }

}
