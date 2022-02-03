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