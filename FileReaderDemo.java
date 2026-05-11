import java.io.*;
class FileReaderDemo{
    public static void main(String args[]){
	File f=null;
	FileReader fr=null;
	FileWriter fw=null;
	try{
	    //Risky Code
	    f=new File("abc.txt");
	    fr=new FileReader(f);
	    fw=new FileWriter("xyz.txt");
	    int ch;
	    while((ch=fr.read())!=-1){
		//System.out.print((char)ch);
		fw.write(ch);
	    }
	    fr.close();
	    fw.close();
	}
	catch(Exception e){
	    //Handling Code
	    System.out.println(e);
	}
	finally{
	    //Cleaning Code
	}
	System.out.println("Program completed Successfully");
    }
}