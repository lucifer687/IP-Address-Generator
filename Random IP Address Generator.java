import java.util.Random;

public class RandomIP {
  public static void main(String[] args) {
    // Generate a random IP address
    Random rand = new Random();
    int ip1 = rand.nextInt(256);
    int ip2 = rand.nextInt(256);
    int ip3 = rand.nextInt(256);
    int ip4 = rand.nextInt(256);
    String ipAddress = ip1 + "." + ip2 + "." + ip3 + "." + ip4;
    System.out.println("Random IP address: " + ipAddress);
  }
}