/**mostly use char*/
public class Main3 {
    public static void main(String[] args) {
        //creare editor de text

        String text="Acesta este un exercitiu de testare pentru interviul din viitor";
        char[] charNou = new char[text.length()];
           charNou = text.toCharArray();

           int pozCaracter=0;
           int numRepetri=0;
           int numPrecedent=0;
           int savePozChar=0;
           do {
               for (int i = 0; i < text.length(); i++) {
                   if (charNou[pozCaracter] == charNou[i]) {
                       numRepetri = numRepetri + 1;
                   }
               }
               if (numRepetri>numPrecedent){
                   numPrecedent=numRepetri;
                   savePozChar=pozCaracter;
               }
               pozCaracter = pozCaracter + 1;
               numRepetri=0;
           }while (pozCaracter < charNou.length);
        System.out.println(charNou[savePozChar]);
    }
}
