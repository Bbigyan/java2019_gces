import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
class ListFiles{
	public static void main(String[] args) throws IOException{
		File file = new File("C:\\Users\\Dell\\Desktop");
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("List.txt"));
		File fileList[] = file.listFiles(File::isFile);
		for(File fileObj : fileList){
			bufferedWriter.write(fileObj.getName()+"\n");
			System.out.println(fileObj.getName());
			System.out.println(fileObj.isDirectory());
		}
		bufferedWriter.flush();
		bufferedWriter.close();
	}
}