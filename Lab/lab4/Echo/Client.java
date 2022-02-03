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