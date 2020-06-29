//パッケージを定義している。
package com.example.MessageMemo;

//あらかじめ利用するパッケージをインポートしている。
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;

//データベースのテーブルやクエリの結果に対応しているアノテーションである。
@Entity

//Historyという公開クラスである。
public class History {
	
//	Entityクラス内で定義した主キーに付与するアノテーションである。
	@Id
	
//	m_idというint型(整数型)の非公開フィールドである。
	private int m_id;
	
//	receiv_timeというTimestamp型(日付・時刻型)の非公開フィールドである。
	private Timestamp receiv_time;
	
//	to_nameというString型(文字列型)の非公開フィールドである。
	private String to_name;
	
//	c_nameというString型(文字列型)の非公開フィールドである。
	private String c_name;
	
//	senderというString型(文字列型)の非公開フィールドである。
	private String sender;
	
//	message_cdというString型(文字列型)の非公開フィールドである。
	private int message_cd;
	
//	e_nameというString型(文字列型)の非公開フィールドである。
	private String e_name;
	
//	getM_idという戻り値の型がint型(整数型)で引数なしの公開メソッドである。戻り値としてm_idを返している。
	public int getM_id() {
		return m_id;
	}
	
//	setM_idという戻り値なしで、引数がint型(整数型)の公開メソッドである。フィールドのm_idに引数を代入している。
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	
//	getReceiv_timeという戻り値の型がTimestamp型(日付・時刻型)で引数なしの公開メソッドである。戻り値としてreceiv_timeを返している。
	public Timestamp getReceiv_time() {
		return receiv_time;
	}
	
//	setReceiv_timeという戻り値なしで、引数がTimestamp型(日付・時刻型)の公開メソッドである。フィールドのreceiv_timeに引数を代入している。
	public void setReceiv_time(Timestamp receiv_time) {
		this.receiv_time = receiv_time;
	}
	
//	getTo_nameという戻り値の型がString型(文字列型)で引数なしの公開メソッドである。戻り値としてto_nameを返している。
	public String getTo_name() {
		return to_name;
	}
	
//	setTo_nameという戻り値なしで、引数がString型(文字列型)の公開メソッドである。フィールドのto_nameに引数を代入している。
	public void setTo_name(String to_name) {
		this.to_name = to_name;
	}
	
//	getC_nameという戻り値の型がString型(文字列型)で引数なしの公開メソッドである。戻り値としてc_nameを返している。
	public String getC_name() {
		return c_name;
	}
	
//	setC_nameという戻り値なしで、引数がString型(文字列型)の公開メソッドである。フィールドのc_nameに引数を代入している。
	public void setC_name(String c_name) {
		this.c_name = c_name;
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
	public int getMessage_cd() {
		return message_cd;
	}
	
//	setMessage_cdという戻り値なしで、引数がString型(文字列型)の公開メソッドである。フィールドのmessage_cdに引数を代入している。
	public void setMessage_cd(int message_cd) {
		this.message_cd = message_cd;
	}
	
//	getE_nameという戻り値の型がString型(文字列型)で引数なしの公開メソッドである。戻り値としてe_nameを返している。
	public String getE_name() {
		return e_name;
	}
	
//	setE_nameという戻り値なしで、引数がString型(文字列型)の公開メソッドである。フィールドのe_nameに引数を代入している。
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	
	public void setAll(int m_id,
					   String to_name,
					   String c_name,
					   String sender,
					   int message_cd,
					   String e_name
					   ) {
		this.m_id = m_id;
		this.to_name = to_name;
		this.c_name = c_name;
		this.sender = sender;
		this.message_cd = message_cd;
		this.e_name = e_name;
	}
}
