public class TrappedRainWater {
    
    public static int trappedrainwater(int height[]){
        //Calculate Left max boundary - Array       - helper array
        int leftmax[] = new int[height.length] ;
        leftmax[0] = height[0] ; //since there is nothing to its left
        for(int i =1 ; i<height.length ; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]) ;

        }

        //Calculate Right max boundary - Array       - helper array
        int rightmax[] = new int[height.length] ;
        rightmax[height.length - 1] = height[height.length - 1] ;
        for(int i = height.length - 2 ; i>= 0  ; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]) ;
        }

        int trappedwater = 0 ;
        //loop
        for(int i=0 ; i<height.length ; i++){
            // WaterLevel = min(LeftMax Boundary , RightMax Boundary)
            int WaterLevel = Math.min(leftmax[i], rightmax[i]) ;
      
            // Trapped Water = Water Level - Height[i] 
            trappedwater += WaterLevel - height[i] ;     // tpw = tpw + wtl - ht[i];            
        }

    return trappedwater ; 
    }

    public static void main (String args[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println( trappedrainwater(height)) ;
    }
}
