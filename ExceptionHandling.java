public class ExceptionHandling {
    
    public static void main(String[] args) {
        int i = 2;
        int j = 0;

        int nums[] = new int[5] ;
        String str = null ;

        try {
            j = 18/i ;
            System.out.println(str.length());
            System.out.println(nums[1]);        //2nd element 
            System.out.println(nums[5]);        //do not exist
        }
        //  catch (Exception e) {
        //     System.out.println("Something went wrong !!! \n"+e);
        // }
        catch(ArithmeticException e){
            System.out.println("Cannot Divide by 0 !!");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Out if Bound !!!");
        }
        catch(Exception e){                                     // Parent must be at bottom 
            System.out.println("Something wemt wrong, though not sure what !!!");
        }

        System.out.println(j);
        System.out.println("Bye !!");
    }
}
