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
	@Query(value = "SELECT COUNT(M_ID) FROM T_MESSAGE",nativeQuery = true)
	public int countM_id();
}

