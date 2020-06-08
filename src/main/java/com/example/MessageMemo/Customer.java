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
@Table(name="M_CUSTOMER")

//Customerという公開クラスである。
public class Customer {
	
//	Entityクラス内で定義した主キーに付与するアノテーションである。
	@Id
	
//	Entityクラス内で定義したテーブルのカラム名に相当するメンバ変数に付与するアノテーションである。データ型や長さの指定ができる。
	@Column(name="C_CD" ,nullable = false ,columnDefinition = "VARCHAR(4)")
	
//	c_numというString型(文字列型)の非公開フィールドである。
	private String c_num;
	
//	Entityクラス内で定義したテーブルのカラム名に相当するメンバ変数に付与するアノテーションである。データ型や長さの指定ができる。
	@Column(name="C_NAME" ,nullable = false ,columnDefinition = "VARCHAR(100)")
	
//	c_nameというString型(文字列型)の非公開フィールドである。
	private String c_name;
	
//	Entityクラス内で定義したテーブルのカラム名に相当するメンバ変数に付与するアノテーションである。データ型や長さの指定ができる。
	@Column(name="ADDRESS" ,columnDefinition = "VARCHAR(256)")
	
//	addressというString型(文字列型)の非公開フィールドである。
	private String address;
	
//	Entityクラス内で定義したテーブルのカラム名に相当するメンバ変数に付与するアノテーションである。データ型や長さの指定ができる。
	@Column(name="TEL" ,columnDefinition = "VARCHAR(11)")
	
//	telというString型(文字列型)の非公開フィールドである。
	private String tel;

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
	
//	getC_numという戻り値の型がString型(文字列型)で引数なしの公開メソッドである。戻り値としてc_numを返している。
	public String getC_num() {
		return c_num;
	}
	
//	setC_numという戻り値なしで、引数がString型(文字列型)の公開メソッドである。フィールドのc_numに引数を代入している。
	public void setC_num(String c_num) {
		this.c_num = c_num;
	}
	
//	getC_nameという戻り値の型がString型(文字列型)で引数なしの公開メソッドである。戻り値としてc_nameを返している。
	public String getC_name() {
		return c_name;
	}
	
//	setC_nameという戻り値なしで、引数がString型(文字列型)の公開メソッドである。フィールドのc_nameに引数を代入している。
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	
//	getAddressという戻り値の型がString型(文字列型)で引数なしの公開メソッドである。戻り値としてaddressを返している。
	public String getAddress() {
		return address;
	}
	
//	setAddressという戻り値なしで、引数がString型(文字列型)の公開メソッドである。フィールドのaddressに引数を代入している。
	public void setAddress(String address) {
		this.address = address;
	}
	
//	getTelという戻り値の型がString型(文字列型)で引数なしの公開メソッドである。戻り値としてTelを返している。
	public String getTel() {
		return tel;
	}
	
//	setTelという戻り値なしで、引数がString型(文字列型)の公開メソッドである。フィールドのtelに引数を代入している。
	public void setTel(String tel) {
		this.tel = tel;
	}

//	上記4つのメソッド(セッター)を1つにまとめたもの。
	public void setAll(  String c_num
						,String c_name
						,String address
						,String tel
						) {
		this.c_num = c_num;
		this.c_name = c_name;
		this.address = address;
		this.tel = tel;
		
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
