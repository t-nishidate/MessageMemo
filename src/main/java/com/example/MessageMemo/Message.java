//パッケージを定義している。
package com.example.MessageMemo;

//あらかじめ利用するパッケージをインポートしている。
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//データベースのテーブルやクエリの結果に対応しているアノテーションである。
@Entity

//Entityクラスに、プライマリテーブルを指定するアノテーションである。テーブル名を指定できる。
@Table(name="T_MESSAGE")

//Customerという公開クラスである。
public class Message {
	
//	Entityクラス内で定義した主キーに付与するアノテーションである。
	@Id
	
//	Entityクラス内で定義したテーブルのカラム名に相当するメンバ変数に付与するアノテーションである。データ型や長さの指定ができる。
	@Column(name="M_ID" ,nullable = false ,columnDefinition = "INT")
	
//	m_idというint型(整数型)の非公開フィールドである。
	private int m_id;
	
//	Entityクラス内で定義したテーブルのカラム名に相当するメンバ変数に付与するアノテーションである。データ型や長さの指定ができる。
	@Column(name="TO_NAME" ,nullable = false ,columnDefinition = "VARCHAR(40)")
	
//	to_nameというString型(文字列型)の非公開フィールドである。
	private String to_name;
	
//	Entityクラス内で定義したテーブルのカラム名に相当するメンバ変数に付与するアノテーションである。データ型や長さの指定ができる。
	@Column(name="RECEIVER_CD" ,nullable = false, columnDefinition = "VARCHAR(5)")
	
//	receiver_cdというString型(文字列型)の非公開フィールドである。
	private String receiver_cd;
	
//	Entityクラス内で定義したテーブルのカラム名に相当するメンバ変数に付与するアノテーションである。データ型や長さの指定ができる。
	@Column(name="RECEIV_TIME" ,nullable = false, columnDefinition = "datetime")
	
//	receiv_timeというTimestamp型(日付・時刻型)の非公開フィールドである。
	private Timestamp receiv_time;

//	Entityクラス内で定義したテーブルのカラム名に相当するメンバ変数に付与するアノテーションである。データ型や長さの指定ができる。
	@Column(name="CUSTMER_CD" ,columnDefinition = "VARCHAR(4)")
	
//	custmer_cdというString型(文字列型)の非公開フィールドである。
	private String custmer_cd;

//	Entityクラス内で定義したテーブルのカラム名に相当するメンバ変数に付与するアノテーションである。データ型や長さの指定ができる。
	@Column(name="SENDER" ,nullable = false, columnDefinition = "VARCHAR(40)")
	
//	senderというString型(文字列型)の非公開フィールドである。
	private String sender;

//	Entityクラス内で定義したテーブルのカラム名に相当するメンバ変数に付与するアノテーションである。データ型や長さの指定ができる。
	@Column(name="MESSAGE_CD" ,nullable = false, columnDefinition = "CHAR(1)")
	
//	message_cdというString型(文字列型)の非公開フィールドである。
	private String message_cd;

//	Entityクラス内で定義したテーブルのカラム名に相当するメンバ変数に付与するアノテーションである。データ型や長さの指定ができる。
	@Column(name="MEMO" ,columnDefinition = "VARCHAR(256)")
	
//	memoというString型(文字列型)の非公開フィールドである。
	private String memo;
	
//	Entityクラス内で定義したテーブルのカラム名に相当するメンバ変数に付与するアノテーションである。データ型や長さの指定ができる。
	@Column(name="UPDATE_DATE" ,columnDefinition = "datetime")
	
//	update_dateというTimestamp型(日付・時刻型)の非公開フィールドである。
	private Timestamp update_date;

//	Entityクラス内で定義したテーブルのカラム名に相当するメンバ変数に付与するアノテーションである。データ型や長さの指定ができる。
	@Column(name="UPDATE_USER" ,columnDefinition = "VARCHAR(40)")
	
//	update_userというString型(文字列型)の非公開フィールドである。
	private String update_user;

//	Entityクラス内で定義したテーブルのカラム名に相当するメンバ変数に付与するアノテーションである。データ型や長さの指定ができる。
	@Column(name="CREATE_DATE" ,columnDefinition = "datetime")
	
//	create_dateというTimestamp型(日付・時刻型)の非公開フィールドである。
	private Timestamp create_date;

//	Entityクラス内で定義したテーブルのカラム名に相当するメンバ変数に付与するアノテーションである。データ型や長さの指定ができる。
	@Column(name="CREATE_USER" ,columnDefinition = "VARCHAR(40)")
	
//	create_userというString型(文字列型)の非公開フィールドである。
	private String create_user;
	
//	getM_idという戻り値の型がint型(整数型)で引数なしの公開メソッドである。戻り値としてm_idを返している。
	public int getM_id() {
		return m_id;
	}
	
//	setM_idという戻り値なしで、引数がint型(整数型)の公開メソッドである。フィールドのm_idに引数を代入している。
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	
//	getTo_nameという戻り値の型がString型(文字列型)で引数なしの公開メソッドである。戻り値としてto_nameを返している。
	public String getTo_name() {
		return to_name;
	}
	
//	setTo_nameという戻り値なしで、引数がString型(文字列型)の公開メソッドである。フィールドのto_nameに引数を代入している。
	public void setTo_name(String to_name) {
		this.to_name = to_name;
	}
	
//	getReceiver_cdという戻り値の型がString型(文字列型)で引数なしの公開メソッドである。戻り値としてreceiver_cdを返している。
	public String getReceiver_cd() {
		return receiver_cd;
	}
	
//	setReceiver_cdという戻り値なしで、引数がString型(文字列型)の公開メソッドである。フィールドのreceiver_cdに引数を代入している。
	public void setReceiver_cd(String receiver_cd) {
		this.receiver_cd = receiver_cd;
	}
	
//	getReceiv_timeという戻り値の型がTimestamp型(日付・時刻型)で引数なしの公開メソッドである。戻り値としてreceiv_timeを返している。
	public Timestamp getReceiv_time() {
		return receiv_time;
	}
	
//	setReceiv_timeという戻り値なしで、引数がTimestamp型(日付・時刻型)の公開メソッドである。フィールドのreceiv_timeに引数を代入している。
	public void setReceiv_time(Timestamp receiv_time) {
		this.receiv_time = receiv_time;
	}
	
//	getCustmer_cdという戻り値の型がString型(文字列型)で引数なしの公開メソッドである。戻り値としてcustmer_cdを返している。
	public String getCustmer_cd() {
		return custmer_cd;
	}
	
//	setCustmer_cdという戻り値なしで、引数がString型(文字列型)の公開メソッドである。フィールドのcustmer_cdに引数を代入している。
	public void setCustmer_cd(String custmer_cd) {
		this.custmer_cd = custmer_cd;
	}
	
//	getSenderという戻り値の型がString型(文字列型)で引数なしの公開メソッドである。戻り値としてsenderを返している。
	public String getSender() {
		return sender;
	}
	
//	setSenderという戻り値なしで、引数がString型(文字列型)の公開メソッドである。フィールドのsenderに引数を代入している。
	public void setSender(String sender) {
		this.sender = sender;
	}
	
//	getMessage_cdという戻り値の型がString型(文字列型)で引数なしの公開メソッドである。戻り値としてmessage_cdを返している。
	public String getMessage_cd() {
		return message_cd;
	}
	
//	setMessage_cdという戻り値なしで、引数がString型(文字列型)の公開メソッドである。フィールドのmessage_cdに引数を代入している。
	public void setMessage_cd(String message_cd) {
		this.message_cd = message_cd;
	}
	
//	getMemoという戻り値の型がString型(文字列型)で引数なしの公開メソッドである。戻り値としてmemoを返している。
	public String getMemo() {
		return memo;
	}
	
//	setMemoという戻り値なしで、引数がString型(文字列型)の公開メソッドである。フィールドのmemoに引数を代入している。
	public void setMemo(String memo) {
		this.memo = memo;
	}

//	上記8つのメソッド(セッター)を1つにまとめたもの。
	public void setAll(  int m_id
						,String to_name
						,String receiver_cd
						,String custmer_cd
						,String sender
						,String message_cd
						,String memo
						) {
		this.m_id = m_id;
		this.to_name = to_name;
		this.receiver_cd = receiver_cd;
		this.custmer_cd = custmer_cd;
		this.sender = sender;
		this.message_cd = message_cd;
		this.memo = memo;
		
	}
	
	
//	getCreate_dateという戻り値の型がTimestamp型(日付・時刻型)で引数なしの公開メソッドである。戻り値としてcreate_dateを返している。
	public Timestamp getCreate_date() {
		return create_date;
	}
	
//	setCreate_dateという戻り値なしで、引数がTimestamp型(日付・時刻型)の公開メソッドである。フィールドのcreate_dateに引数を代入している。
	public void setCreate_date(Timestamp create_date) {
		this.create_date = create_date;
	}
	
//	getCreate_userという戻り値の型がString型(文字列型)で引数なしの公開メソッドである。戻り値としてcreate_userを返している。
	public String getCreate_user() {
		return create_user;
	}
	
//	setCreate_userという戻り値なしで、引数がString型(文字列型)の公開メソッドである。フィールドのcreate_userに引数を代入している。
	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}
	
//	getUpdate_dateという戻り値の型がTimestamp型(日付・時刻型)で引数なしの公開メソッドである。戻り値としてupdate_dateを返している。
	public Timestamp getUpdate_date() {
		return update_date;
	}
	
//	setUpdate_dateという戻り値なしで、引数がTimestamp型(日付・時刻型)の公開メソッドである。フィールドのupdate_dateに引数を代入している。
	public void setUpdate_date(Timestamp update_date) {
		this.update_date = update_date;
	}
	
//	getUpdate_userという戻り値の型がString型(文字列型)で引数なしの公開メソッドである。戻り値としてupdate_userを返している。
	public String getUpdate_user() {
		return update_user;
	}
	
//	setUpdate_userという戻り値なしで、引数がString型(文字列型)の公開メソッドである。フィールドのupdate_userに引数を代入している。
	public void setUpdate_user(String update_user) {
		this.update_user = update_user;
	}

}

