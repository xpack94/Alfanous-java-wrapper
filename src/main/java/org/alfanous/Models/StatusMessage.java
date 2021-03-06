package org.alfanous.Models;

public class StatusMessage {
	String msg;
	int code;

	public StatusMessage(String msg, int code) {
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String toString() {
		return "msg = " + this.msg + "; code = " + this.code;
	}
}
