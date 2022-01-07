import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
class MergeFiles{
	private static void write(String filename,BufferedWriter writer) throws IOException{
		BufferedReader file = new BufferedReader(new FileReader(filename));
		String line = file.readLine();
		while (line != null){
			writer.write(line+"\n");
			line = file.readLine();
		}
		file.close();
	}
	public static void main(String[] args){
		try{
			BufferedWriter writer = new BufferedWriter(new FileWriter("file3.txt"));
			write("file1.txt",writer);
			write("file2.txt",writer);
			writer.flush();
			writer.close();
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
}