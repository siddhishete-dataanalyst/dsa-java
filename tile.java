
import java.util.stream.Stream;

public class tile {
    public static int tilingProblem(int n){//2xn(floor size)
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //kaam
        //vertical choice
        int fnm1= tilingProblem(n-1);

    //horizontal choice 
    int fnm2=tilingProblem(n-2);
    int totWays =  fnm1 + fnm2;
    return totWays;
    }

public static void removeDuplicates(String str,int idx,StringBuilder newStr,boolean map[]){
if(idx == str.length()){
    System.out.println(newStr);
    return;

}
//kaam
char currChar =str.charAt(idx);
 if(map[currChar-'a']==true){
    //duplicate
    removeDuplicates(str,idx+1,newStr,map);

 }else{
    map[currChar-'a']=true;
    removeDuplicates(str,idx+1,newStr.append(currChar),map);
 }
}

public static int friendsParing(int n){
    if(n==1|| n==2){
        return n;
    }
    //choice
    //single
    int fnm1 =friendsParing(n-1);
    //pair
    int fnm2 =friendsParing(n-2);
    int pairWays=(n-1)*fnm2;
    //totWays
    int totWays =fnm1 +pairWays;
    return totWays;
    //    if(n==1||n==2){
    //     return n;
    //    }
  //  return friendsParing (n-1)+(n-1)* friendsParing(n-2);
}
  public static void printBinStrings(int n,int lastPlace,StringBuilder str ){
//basecase
if(n ==0){
    System.out.println(str);
    return;
}

    //kaam
    // if(lastPlace == 0){
    //    printBinStrings(n-1,0,str.append("0"));
    //    printBinStrings (n-1,1,str.append("1"));
    // }else{
    //     printBinstrings(n-1,0,str.append("0"));

    // }
    printBinStrings(n-1 ,0, str+"0");
    if(lastPlace == 0){
        printBinStrings(n-1,1, str+"1");
    }

    }
  
    public static void main(String[] args) {
       printBinStrings(3,0,""); 
    }
}
