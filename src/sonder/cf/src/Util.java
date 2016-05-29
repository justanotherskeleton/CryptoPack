package sonder.cf.src;

import java.io.File;
import java.util.ArrayList;

public class Util {
	
	public static void getFiles(File folder, ArrayList<File> fill) {
		File[] fs = folder.listFiles();
		for(File f : fs) {
			if(f.isDirectory()) {
				getFiles(f, fill);
			} else if(f.isFile()) {
				fill.add(f);
			}
		}
	}

}
