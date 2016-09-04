package nwe;

import java.util.List;

import javax.swing.SwingWorker;

public class Worker extends SwingWorker<String,String> {

	@Override
	protected String doInBackground() throws Exception {
		
		for(int i=0;i<10;i++)
		{
			publish(String.valueOf(i));
			Thread.sleep(1000);
		}
		return null;
	}
	
	protected void process(List<String>item)
	{
		new Text_A_Frame().j1.append(item+"\n");
	}

}
