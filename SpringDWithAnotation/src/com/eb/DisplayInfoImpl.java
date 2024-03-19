package com.eb;

//5.0.1 context spring lib
import org.springframework.stereotype.Service;
//5.0.1 context spring lib

@Service
public class DisplayInfoImpl implements DisplayInfo {

	@Override
	public String disp(String name) {
		// TODO Auto-generated method stub
		return "Hello Good AFternoon,"+name;
	}

}
