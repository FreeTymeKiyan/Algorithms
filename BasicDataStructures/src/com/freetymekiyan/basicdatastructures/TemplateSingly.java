package com.freetymekiyan.basicdatastructures;

public class TemplateSingly<T> {
	
	private TemplateSingly<T> next;
	private T data;
	
	public TemplateSingly(T value) {
		data = value;
	}
	
	public TemplateSingly<T> next() {
		return next;
	}
	
	public T value() {
		return data;
	}
	
	public void setNext(TemplateSingly<T> elem) {
		next = elem;
	}
	
	public void setValue(T value) {
		data = value;
	}
}