public class subsetsss {
    public static void findSubsets(String str,String ans,int i){
          //base case
          if(i == str.length()){
            if(ans.length()==0){
            System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
          }//if you give the some of the mistakes 

          


          //yes choice
          findSubsets(str,ans+str.charAt(i),i+1);
          //choice 
          findSubsets(str,ans,i+1);  
    }
    public static void main (String args[]){
        String str ="abc";
        findSubsets(str,"",0);
    }
    
}
