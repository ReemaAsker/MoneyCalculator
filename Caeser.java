
package algorithms;

public class Caeser {
    static String letters [] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

    static int lettervalue(String letter){
        for(int p=0 ;p<26 ; ++p)
            if(letters[p].equalsIgnoreCase(letter))
                return p;
        return 0;
    }
    static String PlainText(String cipherText,int key){
        String Ptext="";
        int index=0;
        for(int i=0 ;i< cipherText.length() ; ++i){
            if((cipherText.charAt(i)+"").equals(" ")){
                Ptext+=" ";
                continue;
            }
            index = (26+lettervalue(cipherText.charAt(i)+"")-key)%26;
            Ptext+= letters[index];
            
        }
        return Ptext;
    }
    
    static void bruteForce(String cipherText){
        for(int key=1 ; key<26 ; ++key)
            System.out.println("key = " + key +" " +PlainText(cipherText,key));
    }
    
    static String cipherText(String palinText,int key){
        String Ctext="";
        int index=0;
        for(int i=0 ;i< palinText.length() ; ++i){
            if((palinText.charAt(i)+"").equals(" ")){
                Ctext+=" ";
                continue;
            }
            index = (lettervalue(palinText.charAt(i)+"")+key)%26;
            Ctext+= letters[index];
            
        }
        return Ctext;
    }
    public static void main(String[]args){
       //bruteForce("PHHW PH DIWHU WRJD SDUWB");
        System.out.println(cipherText("hello world",3));
      // bruteForce("Reema Ali Asker");
        //System.out.println(PlainText("Reema Ali Asker",3));

       //meet me after toga party
    }
// bruteForce("PHHW PH DIWHU WRJD SDUWB");
       // System.out.println(PlainText("sxpybwkdsyx",3));



}
