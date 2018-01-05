package pl.katarzynawojtowicz.filetraining;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WritingStringToFile {
	private static String myString = "This\nis\nmy\nString\nin\nWriting\nString\nTo\nFile\nClass";

	public static void main(String[] args) {
		
		try {
			FileOutputStream sourceFile = new FileOutputStream("MyString.txt");
			ObjectOutputStream so = new ObjectOutputStream(sourceFile);
			so.writeObject(myString);
			so.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		FileInputStream sourceFile = null;
		try {
			sourceFile = new FileInputStream("MyString.txt");
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		ObjectInputStream os = null;
		try {
			os = new ObjectInputStream(sourceFile);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Object obj = null;
		try {
			obj = os.readObject();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String text = (String) obj;
		if (text.equals(myString)) {
			System.out.println("The same");
		}
		else {
			System.out.println("Not the same");
		}
		
		
	}
}
