import java.io.BufferedReader;    
import java.io.IOException;    
import java.io.InputStream;    
import java.io.InputStreamReader;    

public class Demo {
    public String getCommand(String[] args){
		return args[3];
	}
    public void runCommand(String cmd){
        try    
         {    
            //执行命令    
             Process p = Runtime.getRuntime().exec(cmd);    
            //取得命令结果的输出流    
             InputStream fis=p.getInputStream();    
            //用一个读输出流类去读    
             InputStreamReader isr=new InputStreamReader(fis);    
            //用缓冲器读行    
             BufferedReader br=new BufferedReader(isr);    
             String line=null;    
            //直到读完为止    
            while((line=br.readLine())!=null)    
             {    
                 System.out.println(line);    
             }    
         }    
        catch (IOException e)    
         {    
             e.printStackTrace();    
         }    		
	}
	public static void main(String[] args){
		Demo demo = new Demo();
		if(args.length==4){
			String s = demo.getCommand(args);
			demo.runCommand(s);
		}
	}
}
