package edu.cmu.mse.project2.data;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

import org.jboss.soa.esb.message.Attachment;
import org.jboss.soa.esb.message.Body;
import org.jboss.soa.esb.message.Context;
import org.jboss.soa.esb.message.Fault;
import org.jboss.soa.esb.message.Header;
import org.jboss.soa.esb.message.Message;
import org.jboss.soa.esb.message.Properties;

public class ModelRequestResponse implements Message{
	
	private String requestid;
	private String responseid;
	private ArrayList<String> models;
	@Override
	public Message copy() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Attachment getAttachment() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Body getBody() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Context getContext() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Fault getFault() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Header getHeader() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Properties getProperties() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public URI getType() {
		// TODO Auto-generated method stub
		return null;
	}

}