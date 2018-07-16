
package business;

/**
 *
 * @author jasmineherd
 */
public class LetterCodeLogic {
    public static String Encode(String msg,int Offset){
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
                if(Offset!=0 ){
              
                x = ((x - 64)+Offset)%26; }
                else{
                    x = (x-64);
                }

                  if(Offset !=0 && x==0){
                    x= 26;
                }else if( x<1 ||x>26){
                    x =99;
                }
            }
            result = result + String.valueOf(x)+ " ";
        }//for
        
        return result;
    }
    public static String Decode(String msg,int Offset){
   
        //SPLIT METHOD-SPLITS AT COMMA!
        String[] nums = msg.split(",");
        for(int j=0;j<nums.length;j++){
           nums[j] = nums[j].trim();
        }
       
        String result = "";
        int x;
        char c;
        int y;
        
        
        
        
        for(int i=0;i<nums.length;i++){
            try{
                //////////////////////
                x = (Integer.parseInt(nums[i]));
                if(x==0){
                    c = ' ';
                }                           
                else if(x<1||x>26)
                 {
                    c='?';
                }  
                   //else if(Offset!=0){
                    
                      //x = (x+64)%26;
                    //  x = (x+64)+Offset%90;
                     // x = ((x+64)-(Offset))%26;
                            
                   // c =(char)x;}
                   
                     //if z ??
                     //to upper?
                     //ascii 65-90 A-Z
                     
                     
                     
                
                    
                    else{
                    x =(x+64);
                  c= (char)x; }       

                ////////////////////
                
   //1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26
                
                
                
                
              
           }
            
            
            
            
            
            
            
            
            catch(NumberFormatException e){
                c = '?';// char use single 'charvalue' 
            }
            result +=c;
        }
        
        return result;     
    }
//else ';
       /*  
        MY ATTEMPT BEFORE CLASS LECUTRE...too complicated      
        Character myChar;
        int[] x = new int[nums.length];
        //convert string input to integer
        //unknown == '?'              
        for(int i =0;i<nums.length;i++){
              x[i] = Integer.valueOf(nums[i]); 

              if(x[i]==0){
                  myChar = 32;
              }else if(x[i]<1 || x[i]>26){
                  myChar = 63;
              }else{              
             x[i] +=64;
             myChar = (char)x[i];   }
    result= result + String.valueOf(myChar);
        }*/
              

    
               
       

    
}




