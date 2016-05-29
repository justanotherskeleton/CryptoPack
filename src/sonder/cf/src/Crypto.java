package sonder.cf.src;

import java.io.File;
import java.util.ArrayList;

public class Crypto {
	
	//Zips files, then encrypts
	public void encryptFiles(File source, File output, String key) {
		Log.write("Encryption operation on " + source.getAbsolutePath());
		Log.write("Destination is " + output.getAbsolutePath());
		
		if(source.isDirectory()) {
			ArrayList<File> files = new ArrayList<File>();
			Util.getFiles(source, files);
			Log.write(files.size() + " files queued for encryption!");
		} else if(source.isFile()) {
			
		}
	}
	
	public void decryptFiles(File source, File output, String key) {
		
	}

}
