import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
class MergeAlternatively{
	public static void main(String[] args){
		try{
			BufferedReader file1 = new BufferedReader(new FileReader("file1.txt"));
			BufferedReader file2 = new BufferedReader(new FileReader("file2.txt"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("file3.txt"));
			String line1 = file1.readLine();
			String line2 = file2.readLine();
			while(line1 != null || line2 != null){
				if(line1 != null){
					writer.write(line1+"\n");
				}
				if(line2 != null){
					writer.write(line2+"\n");
				}
				line1 = file1.readLine();
				line2 = file2.readLine();
			}
			writer.flush();
			writer.close();
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
}