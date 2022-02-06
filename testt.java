public class testt {

    int filler;
    public testt(int temp) {
        filler = temp;
    }
    public int gimmie() {
        return filler;
    }


    public static void main(String[] args) {
        testt jeff = new testt(5);
        System.out.println(jeff.gimmie());
    }
    
}
