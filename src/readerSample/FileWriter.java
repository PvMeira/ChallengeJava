package readerSample;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileWriter {
	
	
	
public void FileWriter() throws IOException{
	OutPutStringBuilder out=new OutPutStringBuilder();
	  String fileSave =  out.createFile().toString();
	  String localSave = (System.getProperty("user.home") + File.separator + "data" + File.separator + "out\\");
	  Files.write(new File(localSave + "flat_file_name" + ".done.dat").toPath(), fileSave.getBytes());
	
}


}
