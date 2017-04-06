package ui.com.phenom001;
import java.io.File;
public class CreateDirectory {


		public class JavaCreateDirectoryExample
		{
	
		  {
		    File dir = new File("/home/bh/tmp/TestDirectory");
		    
		    // attempt to create the directory here
		    boolean successful = dir.mkdir();
		    if (successful)
		    {
		      // creating the directory succeeded
		      System.out.println("directory was created successfully");
		    }
		    else
		    {
		      // creating the directory failed
		      System.out.println("failed trying to create the directory");
		    }
		  }
		}
	}

