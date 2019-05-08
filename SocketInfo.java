package chapter8;
import java.net.*;
import java.io.*;

public class SocketInfo {

  public static void main(String[] args) {
	  String host1[] = {"www.naver.com","www.google.com","www.oreilly.com"};
   // for (String host : args) {
	  for (String host : host1) {
//   for (int i = 0; !host[i].isEmpty(); i++) {
	  try {
        Socket theSocket = new Socket(host, 80);
        System.out.println("Connected to " + theSocket.getInetAddress() 
            + " on port "  + theSocket.getPort() + " from port " 
            + theSocket.getLocalPort() + " of " 
            + theSocket.getLocalAddress());
      }  catch (UnknownHostException ex) {
        System.err.println("I can't find " + host);
      } catch (SocketException ex) {
        System.err.println("Could not connect to " + host);
      } catch (IOException ex) {
        System.err.println(ex);
      }
    } 
  }
}