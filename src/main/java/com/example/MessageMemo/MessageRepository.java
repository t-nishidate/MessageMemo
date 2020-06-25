//パッケージを定義している。
package com.example.MessageMemo;

//あらかじめ利用するパッケージをインポートしている。
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

//DBアクセスを行うクラスやインターフェースに付与するアノテーションである。
@Repository

//ここでは、エンティティのクラスとエンティティIDのクラス、 MessageEntity と String を指定します。
public interface MessageRepository extends CrudRepository<Message, String> {
	
//	データベースに送るクエリ文の指定を行うアノテーションである。valueには実際のクエリ文を書く。
//	また、nativeQueryはSQLを直接実行できる機能である。
	@Query(value = "SELECT COUNT(M_ID) FROM T_MESSAGE",nativeQuery = true)
	
//	countM_idという戻り値の型がint型(整数型)の公開メソッドである。
	public int countM_id();
}

