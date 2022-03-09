package com.balbo.mailsender.model;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

public class Mail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String username;
    private String to;
    private String subject;
    private String text;
    private File file;
    private Date sendDate;

    private Mail() {
    	
    }
	
    
}
