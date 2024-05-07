package com.helper;

import java.io.IOException;

public class Data_Reader_Manager {

	/*
	 *Double ton Design Pattern:
	 *
	 * 		1. One Private Constructor
	 * 
	 * 		2. One Static Method
	 * 
	 * 		3. One Normal Method
	 * 
	 * 
	 */
	
	private Data_Reader dr;
	
	private static Data_Reader_Manager drm;
	
	private Data_Reader_Manager() {

		
	
	}
	
	public static Data_Reader_Manager getInstanceDRM() {
		
		if(drm == null ) {

			drm = new Data_Reader_Manager();
			
		}
		
		return drm;
		
	}
	
	public Data_Reader getInstanceDR() throws IOException {
		
		if(dr == null) {

			dr = new Data_Reader();
			
		}
		
		return dr;
		
	}
	

}
