
public class threeVariable {
    public static void main(String[] args) {
        {
            int a = 1, b = 1, c = 2;
            if ((a == b) && (a == c)) {
              System.out.println("No of distinct value = 0");
            } else if ((a == b) && (a != c) || (b == c) && (b != a)) {
              System.out.println("No of distinct value = 2");
            } else {
              System.out.println("No of distinct value = 3");
            }
          }
          

}
