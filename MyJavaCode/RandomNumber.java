//package ui.com.phenom001;

import java.util.UUID;
//import java.util.*;
import java.lang.ProcessBuilder;
import java.io.File;
public class RandomNumber {

	public static String vagrant_init() {
		// TODO Auto-generated method stub
		// String stringObj = null;
	      UUID uid = UUID.randomUUID();
		  File fileObj1=new File("/opt/vagrant_test/"+uid.toString());
		  fileObj1.mkdirs();
		System.out.println("Directory_Created");
		return "/opt/vagrant_test/"+uid.toString();
	}
	public static void vagrantMethod2() throws Exception //throws Exception
	{
		File new_directory=new File(vagrant_init());
		ProcessBuilder pbObject=new ProcessBuilder().inheritIO();
		//inheritIO();
		//"/opt/vagrant_test","up","--providervirtualbox");
		pbObject.directory(new_directory);
		pbObject.command("/opt/vagrant/bin/vagrant","init","bento/centos-7.3");
		pbObject.start();
		System.out.println(new_directory);
		ProcessBuilder pbObj2=new ProcessBuilder().inheritIO();
		pbObj2.directory(new_directory);
		pbObj2.command("/opt/vagrant/bin/vagrant","up","--Virtualbox");
		

		long startTime = System.nanoTime();
		while ((System.nanoTime()-startTime)<=2*60*NANOSEC_PER_SEC){
			pbObj2.command("/opt/vagrant/bin/vagrant","up");
		}
		//"/opt/vagrant_test","up","vagrant"
		pbObj2.start();
		//System.out.println("Completed"+pbObj2);
		//pbObj2.(5);
	}
	
public static void main(String[] args) throws Exception{
	vagrantMethod2();
//	System.out.agprintln("Printed Application");
}		
	}
