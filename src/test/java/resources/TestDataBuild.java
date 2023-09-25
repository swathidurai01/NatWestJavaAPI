package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddObject;

public class TestDataBuild {

	
	
	public AddObject addObjectPayLoad(String name, String cpumodel, String harddisksize)
	{
		AddObject p =new AddObject();
		p.setName(name);
		p.setYear(2019);
		p.setPrice(1849.99);
		p.setCpuModel(cpumodel);
		p.setHardDiskSize(harddisksize);
		
		return p;
	}
	
	public String deleteObjectPayload(String ObjectId)
	{
		return "{\r\n    \"id\":\""+ObjectId+"\"\r\n}";
	}
}
