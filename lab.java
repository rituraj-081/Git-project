
public class DotProduct {
 
  public static void main(String[] args) {
 
    double[] a = {5,8,0};
    double[] b = {6,-3,2};
 
    System.out.println(dotProduct(a, b));
  }
 
  public static double dotProduct(double[] a, double[] b) {
    double sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i] * b[i];
    }
    return sum;
  }
}
