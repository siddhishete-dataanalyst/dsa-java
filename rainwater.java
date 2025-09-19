public class rainwater {
    public static int trappedRainwater(int heigth[]){
        int n = heigth.length;
        //calcuate left max boundary - array
          int leftMax[]= new int[n];
          leftMax[0] = height[0];
          for(int i=1; i<height.length; i++){
            leftMax[i]=Math.max(height[i], leftMax[i=1]);

          }
          //calculate right max boundary - array 
          int rightMax[]= new int[n];
          rightMax[n-1 ]= heigth [n-1];
          for(int)
          //loop
          //waterLevel = min(leftmax bound ,rightmax bound)
          //trapped water = waterLevel - height[i]

    }
    public static void main (String args[]){
        int height[] ={ 4,2,0,6,3,2,5};

    }
    
}
