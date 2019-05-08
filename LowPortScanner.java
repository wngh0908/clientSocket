package chapter8;

import java.net.*;
import java.io.*;

public class LowPortScanner {

  public static void main(String[] args) {
    

    for (int i = 1; i < 1024; i++) {
      try {
        Socket s = new Socket("localhost", i);
        System.out.println("There is a server on port " + i + " of localhost");
        s.close();
      } catch (UnknownHostException ex) {
        System.err.println(ex);
        break;
      } catch (IOException ex) {
        // must not be a server on this port
      }
    }
  }
}