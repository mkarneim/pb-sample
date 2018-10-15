package sample;

public class Main {
  public static void main(String[] args) {
    Contact c = new ContactBuilder().withName("hello").build();
    System.out.println(c);
  }
}
