public class strings2 {
    
    public static void main(String args[]){
        String s1 = "Tony Stark" ;
        String s2 = "Tony Stark" ;
        String s3 = new String("Tony Stark") ;

        if(s1 == s2){
            System.out.println("Strings are equal.");
        }else{
            System.out.println("Strings are not equal !!");
        }

        if(s1 ==s3){
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal !!");
        }

        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal !!");
        }


        String str = "HelloWorld" ;
        System.out.println(substring(str, 0, 5));   //manual 
        System.out.println(str.substring(0,5));  //auto

        String fruits[] = {"apple","mango","banana","guava"};
        Lexicographic(fruits);
    
    
        StringBuilder sb = new StringBuilder("");    //TC = O(26)
        for(char ch='a' ; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());


        String lowercase = "hlo i am aditya deshmukh" ;
        System.out.println(ToUppercase(lowercase));

    
        String tocompr = "aaabbbbccddd" ;
        System.out.println(compress(tocompr));
    


    
    
    
    }



    public static String substring(String str , int si , int ei){
        String substr = "" ;
        for(int i=si ; i<ei ; i++){
            substr+= str.charAt(i) ;
        }
        return substr ;
    }

    //Lexicographic order
    public static void Lexicographic(String fruits[]){      // TC = O(x*n)
        String largest = fruits[0] ;
        for(int i=1; i<fruits.length ; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i] ;
            }
        }
        System.out.println("The Fruit with largest value : "+largest);
    }

    public static String ToUppercase(String str){              //TC = O(n)
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0)) ;
        sb.append(ch) ;
    
        for(int i=1 ; i<str.length() ; i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++ ;
                sb.append(Character.toUpperCase(str.charAt(i))) ;
            } else {
                sb.append(str.charAt(i)) ;
            }
        }
        
        return sb.toString() ;
    }

    public static String compress(String str){
        StringBuilder newstr = new StringBuilder("");

        for(int i=0 ; i<str.length() ; i++){
            Integer count = 1 ;
            while(i < str.length()-1  && str.charAt(i) == str.charAt(i+1) ){
                count++ ;
                i++ ;
            }
            newstr.append(str.charAt(i));
            if(count>1 ){
                newstr.append(count.toString()) ;
            }
        }
        return newstr.toString() ;
    }


}
