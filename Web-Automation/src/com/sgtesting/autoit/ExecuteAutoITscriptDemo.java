package com.sgtesting.autoit;

public class ExecuteAutoITscriptDemo {

	public static void main(String[] args) {
		executefile();

	}
	private static void executefile()
	{
		try
		{
			String filename="E:\\Autoit\\sampletestscript.exe";
			//Runtime.getRuntime().exec(filename);
			Runtime obj=Runtime.getRuntime();
			obj.exec(filename);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
