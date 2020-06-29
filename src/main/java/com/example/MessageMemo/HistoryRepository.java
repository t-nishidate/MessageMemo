//パッケージを定義している。
package com.example.MessageMemo;

//あらかじめ利用するパッケージをインポートしている。
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

//DBアクセスを行うクラスやインターフェースに付与するアノテーションである。
@Repository

//ここでは、エンティティのクラスとエンティティIDのクラス、HistoryEntityとStringを指定します。
public interface HistoryRepository extends CrudRepository<History, Integer> {
	
//	データベースに送るクエリ文の指定を行うアノテーションである。valueには実際のクエリ文を書く。
//	また、nativeQueryはSQLを直接実行できる機能である。
	@Query(value = "SELECT T_MESSAGE.M_ID as m_id,"
				 + "T_MESSAGE.RECEIV_TIME as receiv_time,"
				 + "T_MESSAGE.TO_NAME as to_name,"
				 + "M_CUSTOMER.C_NAME as c_name,"
				 + "T_MESSAGE.SENDER as sender,"
				 + "T_MESSAGE.MESSAGE_CD as message_cd,"
				 + "M_EMPLOYEE.E_NAME as e_name"
				 + "FROM T_MESSAGE"
				 + "LEFT JOIN M_CUSTOMER"
				 + "ON T_MESSAGE.CUSTMER_CD = M_CUSTOMER.C_CD"
				 + "LEFT JOIN M_EMPLOYEE"
				 + "ON T_MESSAGE.RECEIVER_CD = M_EMPLOYEE.E_NUM", nativeQuery = true)
	
	List<History> plusTable();
}
