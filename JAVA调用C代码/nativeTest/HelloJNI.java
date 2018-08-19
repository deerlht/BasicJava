
public class HelloJNI {
  native void printHello();
  native void printString(String str);

  static{ System.loadLibrary("HelloJNI"); }

  public static void main(String args[]){
    HelloJNI myJNI = new HelloJNI();
    myJNI.printHello();
    myJNI.printString("Hello World from printString fun");
  }
}
