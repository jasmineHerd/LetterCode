
package business;

/**
 *
 * @author jasmineherd
 */
public class LetterCodeLogic {
    public static String Encode(String msg){
        String result = "";
        String m = msg.toUpperCase();
        char c;
        //ascii
        for( int i = 0; i < m.length();i++){
            c = m.charAt(i);
            int x = c;
            //ascii space = 32
            if (x == 32){
                x =0;
            }else{
                x = x - 64; //A=65->1,B = 66->2
                if (x <1 || x >26){
                    //unknown character
                    x =99;
                }
            }
            result = result + String.valueOf(x)+ " ";
        }//for
        
        return result;
    }
    public static String Decode(String msg){
   
        //String result = "";//must parse Strings such as "1,2,3,4,5"
        //SPLIT METHOD-SPLITS AT COMMA!
        String[] nums = msg.split(",");
        
        String result = "";
        Character myChar;
        int[] x = new int[nums.length];
        //convert string input to integer
        
        for(int i =0;i<nums.length;i++){
              x[i] = Integer.valueOf(nums[i]); 

              if(x[i]==0){
                  myChar = 32;
              }else if(x[i]<1 || x[i]>26){
                  myChar = 63;
              }else{              
             x[i] = x[i]+64;
             myChar = (char)x[i];}
            // if(x[i] <1 || x[i] >26){
                 //unknown characters = ?
                 
                 
            // }
             result= result + String.valueOf(myChar);
  
        }
              
        
        //if integer <1 or >26  NO
        
        //if integer == 0 " ___space___"
        
        
        //integer variable + 64 == Capital Ascii variable
        
        return result ;
    }
    
}
