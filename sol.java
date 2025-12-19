import java.util.Arrays;

public class sol {

    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12} ;

        // moveZeroes(nums) ;

      //   System.out.println(strStr("sadbutsad", "sad"));


      //   ListNode head = new ListNode(1);
      //   head.next = new ListNode(2);
      //   head.next.next = new ListNode(3);
      //   head.next.next.next = new ListNode(4);
      //   head.next.next.next.next = new ListNode(5);

      //   System.out.println(middleNode(head));

        System.out.println(isPalindrome(1221));
    }

    public int areaOfMaxDiagonal(int[][] dimensions) {
        double longdia = Integer.MIN_VALUE ;
        int idx = 0 ;
        int maxArea ;
        for (int i = 0; i < dimensions.length; i++) {
            int lensq = dimensions[i][0] * dimensions[i][0] ;       //length square
            int widsq = dimensions[i][1] * dimensions[i][1] ;       // width square
            double dia = Math.sqrt(lensq + widsq) ;

            if (dia > longdia) {
                longdia = dia ;
                idx = i ;
                
            }

        }
        return dimensions[idx][0]*dimensions[idx][1] ;
    }

    public static String lcsubString(String[] strs){
        // int shortest = strs[0].length();
        // String check = null ;

        // for (String string : strs) {
        //     if (string.length() < shortest) {
        //         shortest = string.length();
        //         check = string;
        //     }
        // }

        // StringBuffer ans = new StringBuffer();
        // for(int i=0 ; i<strs.length ; i++){
        //     for(int j=0; j<shortest ;j++){
        //         if (check.charAt(j) == strs[i].charAt(j)) {
        //             ans.append(j);
        //         }
        //         else{
        //             return "";
        //         }
        //     }
        // }
        // return ans.toString();
            
        int idx = 0 ;
        Arrays.sort(strs);
        for(int i=0; i<strs[0].length(); i++){
            if (strs[0].charAt(i) == strs[strs.length-1].charAt(i)) {
                idx++;
            }   
            else{
                break;
            }
        }
        return strs[0].substring(0, idx);
    }


    public static boolean isPalindrome(int x){
        int org = x;
        int sz = 0;
        int y = x; 
        if(x<0) return false;
        while (y != 0 ) {
            y = y/10 ;
            sz++;
        }
        int palin = 0;
        for(int i=0 ; i<sz ; i++){
            palin = palin*10 + x%10 ;
            x=x/10;
        }
        if (palin != org) {
            return false;
        }
        return true;
    }


  public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode newList = new ListNode(0) ;
        ListNode currLN = newList ; 


        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                currLN.next = list1;
                list1 = list1.next ;
            }else{
                currLN.next = list2;
                list2 = list2.next;
            }
            currLN = currLN.next;
        }    
        if (list1 != null) {
            currLN.next = list1 ;
            list1 = list1.next ; 
        }
        if (list2 != null) {
            currLN.next = list2 ;
            list2 = list2.next;
        }
        return newList;
  }
  
  
  public boolean validPalindrome(String s) {
        int l = s.length();
        for(int i=0; i<=l/2; i++){
            if (s.charAt(i) != s.charAt(l-1-i)) {
                return false ;
            }
        }     
        return true ;
  }  
  

    public static void moveZeroes(int[] nums) {
        int insPos = 0 ;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            if (nums[i] != 0) {
                nums[insPos] = nums[i] ;
                insPos ++;    
            }
        }    
        while(insPos < nums.length){
            nums[insPos++] = 0 ;
            System.out.println(nums[insPos]);
        }
    }
}
