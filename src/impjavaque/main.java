package impjavaque;

public class main {
    public static void main(String[] args) {
        int no=1342;
        int ans = num(no);
        System.out.println(ans);

    }
    static int num(int n){
        if(n>1) {
            int rev = n%10;
            return num(n/10) + rev;
        }
        return 1;
    }
}
