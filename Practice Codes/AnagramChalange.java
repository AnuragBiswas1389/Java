
package anagramchalange;


public class AnagramChalange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a = "helhlo";
        String b = "hghelo";
        
        
        int frq=0, frq2=0;
        int len = a.length();
        char A[] = new char[len];
        char B[]= new char [len];
        char chkd[] = new char[len];
        
       A=a.toCharArray();
       B=b.toCharArray();
       
       
       
       for(int c=0; c<len; c++){
           //code to check if prisent
           for(int g=0; g<len; g++){
               if(Character.compare(chkd[g], A[0])!=0){
                   
               }
           }
           //code to check the no of frequency
           for(int v =0; v<len; v++){
               if(Character.compare(A[c], A[v])==0){
                   frq++;
               }
           }
          System.out.println(frq);
          frq=0;
       }
    
}
}
