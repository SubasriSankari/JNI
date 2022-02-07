import java.io.*;

public class SetFilePermission{
	public native String cFileCall(String filename);
	
	static{
		System.loadLibrary("CFileCall");
	}
	public static void main(String[] args){
		SetFilePermission obj = new SetFilePermission();
		File file = new File("hello.c");
		System.out.println("File has "+file.canExecute());
		try{
			obj.cFileCall("hello.c");
		}catch(NullPointerException e){
			System.out.println("caught NullPointerException");
		}
		
	}
}