package pl.katarzynawojtowicz.jacksontraining;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

public class JacksonTest {
	public static void main (String[] args) {
		Human me = new Human();
		me.setName("Katarzyna");
		me.setAge(25);
		
		List<String> education = new ArrayList<String>();
		education.add("pedagogics");
		education.add("informatics");
		me.setEducation(education); 
		
		List<Child> children = new ArrayList<Child>();
		Child wiki = new Child();
		wiki.setAge(2);
		wiki.setGender(Gender.FEMALE);
		wiki.setName("Wiktoria");
		children.add(wiki);
	
		me.setChildren(children);
		
		ObjectMapper mapper = new ObjectMapper();
		String json = null;
		try {
			json = mapper.writeValueAsString(me);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(json);
	}
}
