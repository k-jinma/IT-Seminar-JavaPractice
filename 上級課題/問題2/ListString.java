package toi2;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ListString {

	private ArrayList<String> ar;

	public void readLine(String str) {
		ar = new ArrayList<String>();
		String path = "C:\\Users\\user\\Documents\\JavaBasic\\java_basic\\ensyu3\\toi1\\";
		File file = new File( path + str );

		try {
			FileReader fr = new FileReader( file );
			BufferedReader br = new BufferedReader( fr );
			String line;
			while( (line = br.readLine()) != null ) {
				ar.add( line );
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public ArrayList<String> getLine(){
		return ar;
	}

}
