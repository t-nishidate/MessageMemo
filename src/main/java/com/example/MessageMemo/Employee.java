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
@Table(name="M_EMPLOYEE")

//Employeeという公開クラスである。
public class Employee {
	
//	Entityクラス内で定義した主キーに付与するアノテーションである。
	@Id
	
//	Entityクラス内で定義したテーブルのカラム名に相当するメンバ変数に付与するアノテーションである。データ型や長さの指定ができる。
	@Column(name="E_NUM" ,nullable = false ,columnDefinition = "VARCHAR(5)")
	
//	e_numというString型(文字列型)の非公開フィールドである。
	private String e_num;
	
//	Entityクラス内で定義したテーブルのカラム名に相当するメンバ変数に付与するアノテーションである。データ型や長さの指定ができる。
	@Column(name="E_NAME" ,nullable = false ,columnDefinition = "VARCHAR(40)")
	
//	e_nameというString型(文字列型)の非公開フィールドである。
	private String e_name;
	
//	Entityクラス内で定義したテーブルのカラム名に相当するメンバ変数に付与するアノテーションである。データ型や長さの指定ができる。
	@Column(name="E_YEAR" ,nullable = false ,columnDefinition = "INT")
	
//	e_yearというint型(整数型)の非公開フィールドである。
	private int e_year;
	
//	Entityクラス内で定義したテーブルのカラム名に相当するメンバ変数に付与するアノテーションである。データ型や長さの指定ができる。
	@Column(name="DEPART_CD" ,columnDefinition = "CHAR(2)")
	
//	depart_cdというString型(文字列型)の非公開フィールドである。
	private String depart_cd;

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
	
//	getE_numという戻り値の型がString型(文字列型)で引数なしの公開メソッドである。戻り値としてe_numを返している。
	public String getE_num() {
		return e_num;
	}
	
//	setE_numという戻り値なしで、引数がString型(文字列型)の公開メソッドである。フィールドのe_numに引数を代入している。
	public void setE_num(String e_num) {
		this.e_num = e_num;
	}
	
//	getE_nameという戻り値の型がString型(文字列型)で引数なしの公開メソッドである。戻り値としてe_nameを返している。
	public String getE_name() {
		return e_name;
	}
	
//	setE_nameという戻り値なしで、引数がString型(文字列型)の公開メソッドである。フィールドのe_nameに引数を代入している。
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	
//	getE_yearという戻り値の型がint型(整数型)で引数なしの公開メソッドである。戻り値としてe_yearを返している。
	public int getE_year() {
		return e_year;
	}
	
//	setE_yearという戻り値なしで、引数がint型(整数型)の公開メソッドである。フィールドのe_yearに引数を代入している。
	public void setE_year(int e_year) {
		this.e_year = e_year;
	}
	
//	getDepart_cdという戻り値の型がString型(文字列型)で引数なしの公開メソッドである。戻り値としてdepart_cdを返している。
	public String getDepart_cd() {
		return depart_cd;
	}
	
//	setDepart_cdという戻り値なしで、引数がString型(文字列型)の公開メソッドである。フィールドのdepart_cdに引数を代入している。
	public void setDepart_cd(String depart_cd) {
		this.depart_cd = depart_cd;
	}

//	上記4つのメソッド(セッター)を1つにまとめたもの。
	public void setAll(  String e_num
						,String e_name
						,int e_year
						,String depart_cd
						) {
		this.e_num = e_num;
		this.e_name = e_name;
		this.e_year = e_year;
		this.depart_cd = depart_cd;
		
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
