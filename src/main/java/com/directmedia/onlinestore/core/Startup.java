package com.directmedia.onlinestore.core;

import java.util.HashSet;
import com.directmedia.onlinestore.core.entity.Artist;
import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.Work;

public class Startup {

	public static void main(String[] args) {
		
		Catalogue.listOfWorks = new HashSet<Work>();
		Catalogue.listOfWorks.add(new Work("Un combat", 1998, new Artist("Bruce Lee")));
		Catalogue.listOfWorks.add(new Work("Chasse à l'homme", 2000, new Artist("Jean Claude")));
		Catalogue.listOfWorks.add(new Work("Body guard", 1997, new Artist("Jet Li")));
		
		Object[] obj = Catalogue.listOfWorks.toArray();
		
		for(Object ob : obj) {
			System.out.println(ob.toString());
		}
	}

}
