## WAP to create an Echo server and client in java.
### Networking In java
The term network programming refers to writing programs that execute across multiple devices (computers), in which the devices are all connected to each other using a network.

In this, we discuss about Socket Programming
* Sockets provide the communication mechanism between two computers using TCP. A client program creates a socket on its end of the communication and attempts to connect that socket to a server.
* When the connection is made, the server creates a socket object on its end of the communication.
* The java.net.Socket class represents a socket, and the java.net.ServerSocket class provides a mechanism for the server program to listen for clients and establish connections with them.

Server Code:
```
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataInputStream;
class Server
{
	public static void main(String[] args) throws IOException
	{

		ServerSocket socketServer = new ServerSocket(5000);
		Socket s = socketServer.accept();
		DataInputStream dataInput = new DataInputStream(s.getInputStream());
		System.out.println("Echo from client: " + (String) dataInput.readUTF());
		socketServer.close();

	}
}
```

Client Code:
```
import java.io.IOException;
import java.net.Socket;
import java.io.DataOutputStream;
class Client
{
	public static void main(String[] args) throws IOException
	{
		Socket s = new Socket("localhost", 5000);
		DataOutputStream dataOutput = new DataOutputStream(s.getOutputStream());
		dataOutput.writeUTF("Helllo there ! General Kenobi");
		dataOutput.flush();
		dataOutput.close();
		s.close();
	}
}
```

## Draw a cricle, ellipse, traingle, hexagon, pentagon in different colors.
Here  we use graphics form java.awt.Graphics; package to draw different geometrical shapes using various constructors provied by the  graphics package of java.
Code:
```
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;
public class ShapesDraw extends JFrame{
    ShapesDraw(){
        setSize(1000,900);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void paint(Graphics g){
        g.drawOval(50,50,60,60);
        g.setColor(Color.PINK);
        g.fillOval(50,50,60,60);
        g.setColor(Color.YELLOW);
        g.fillPolygon(new int[]{190,120,110}, new int[]{190,200,110} ,3);
        g.setColor(Color.ORANGE);
        g.fillOval(300,350,100,60);
        g.setColor(Color.BLUE);
        g.fillPolygon(new int[]{90,160,200,160,90,50}, new int[]{200,220,270,350,350,270},6);
        g.setColor(Color.GREEN);
        g.fillPolygon(new int[]{90,160,200,160,90}, new int[]{400,400,470,550,550},5);
    }
    public static void main(String[] args) {
        new ShapesDraw();
    }
}

```