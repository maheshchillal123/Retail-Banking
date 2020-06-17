package com.bean;

public class Transfer {
	private int cust_id;
	private int acc_id;
	private String acc_type;
	private int before_balance;
	private int after_balance;
	private int trans_balance;
	private String trans_date;
	private String src_acc_type;
	private String trg_acc_type;
	private String trans_id;
	private String trans_type;
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public int getAcc_id() {
		return acc_id;
	}
	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}
	public String getAcc_type() {
		return acc_type;
	}
	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}
	public int getBefore_balance() {
		return before_balance;
	}
	public void setBefore_balance(int before_balance) {
		this.before_balance = before_balance;
	}
	public int getAfter_balance() {
		return after_balance;
	}
	public void setAfter_balance(int after_balance) {
		this.after_balance = after_balance;
	}
	
	public int getTrans_balance() {
		return trans_balance;
	}
	public void setTrans_balance(int trans_balance) {
		this.trans_balance = trans_balance;
	}
	public String getTrans_date() {
		return trans_date;
	}
	public void setTrans_date(String trans_date) {
		this.trans_date = trans_date;
	}
	public String getSrc_acc_type() {
		return src_acc_type;
	}
	public void setSrc_acc_type(String src_acc_type) {
		this.src_acc_type = src_acc_type;
	}
	public String getTrg_acc_type() {
		return trg_acc_type;
	}
	public void setTrg_acc_type(String trg_acc_type) {
		this.trg_acc_type = trg_acc_type;
	}
	public String getTrans_id() {
		return trans_id;
	}
	public void setTrans_id(String trans_id) {
		this.trans_id = trans_id;
	}
	public String getTrans_type() {
		return trans_type;
	}
	public void setTrans_type(String trans_type) {
		this.trans_type = trans_type;
	}
	
	
}
