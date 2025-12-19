public class TowerOfHanoi {
    public static void main(String args[]){
        int n=4;
        toh(n, 'A', 'C', 'B');
    }

    public static void toh(int n, char src, char dest, char help){
        if(n==1){
            System.out.println("Move disk "+n+" from "+src+" to "+dest);
            return ;
        }
        toh(n-1, src, help, dest);
        System.out.println("Move disk "+n+" from "+src+" to "+dest);
        toh(n-1, help, dest, src);
    }
}
