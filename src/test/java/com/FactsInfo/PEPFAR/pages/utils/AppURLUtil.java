package com.FactsInfo.PEPFAR.pages.utils;

import org.apache.commons.lang3.StringUtils;
import net.serenitybdd.core.pages.PageObject;

public class AppURLUtil extends PageObject {

//	static String liveTestIndex = "https://ngtest.dfafacts.gov";
	static String liveTestIndex = "https://pepfar.dfafacts.gov/mechanisms/search";
	static String qaIndex = "https://ngtest.dfafacts.gov";
	static String demoIndex = "";
	static String preprod = "http://std2r02-preprod.fis.local/";
    //static String loginUrl = System.getProperty("LoginUrl", "http://localhost:1181");
	
	// Choose the URL to test against (localIndex, qaIndex, devIndex, demoIndex, or loginUrl)
	private static String baseIndex = qaIndex;	

	protected static String getIndex(final String envKey) {
		String index = AppURLUtil.baseIndex;
		String envIndex = System.getProperty(envKey);
		if(StringUtils.isNoneEmpty(envIndex) ) {
			index = envIndex;
		}
		System.out.println("index is " + index);
		return index;		
	}
	
	public static String getBaseIndex() {
		return getIndex("TARGET_HOST_BASE_URL");
	}
	
	public String dashboardURL() {
		String pathBuilder ="/dashboard";
		return getBaseIndex() + pathBuilder;
	}
	
	public String searchURL() {
		String pathBuilder ="/search?page=1";
		return getBaseIndex() + pathBuilder;
	}
	
	public String workflowURL(String tab) {
		String tabName = String.format(tab.toLowerCase().replace(" ", "-"));
		String pathBuilder = String.format("/workflow/assignments/%s?page=1", tabName);
		return getBaseIndex() + pathBuilder;
	}
	
	public String workflowURL(String tab, String item) {
		String tabName = String.format(tab.toLowerCase().replace(" ", "-"));
		String pathBuilder = String.format("/workflow/assignments/%s?active=%s&activeType=ASSIGNMENT&page=1", tabName, item);
		return getBaseIndex() + pathBuilder;
	}
	
	public String workflowDetailsURL(String tab, String item) {
		String tabName = String.format(tab.toLowerCase().replace(" ", "-"));
		String pathBuilder = String.format("/workflow/assignments/%s?active=%s&activeType=ASSIGNMENT&page=1&open=%s&openType=ASSIGNMENT", tabName, item, item);
		return getBaseIndex() + pathBuilder;
	}
	
	static String CapsFirst(String str) {
	    String[] words = str.split(" ");
	    StringBuilder ret = new StringBuilder();
	    for(int i = 0; i < words.length; i++) {
	        ret.append(Character.toUpperCase(words[i].charAt(0)));
	        ret.append(words[i].substring(1));
	        if(i < words.length - 1) {
	            ret.append(' ');
	        }
	    }
	    return ret.toString();
	}
}