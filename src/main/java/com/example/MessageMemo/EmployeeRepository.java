//パッケージを定義している。
package com.example.MessageMemo;

//あらかじめ利用するパッケージをインポートしている。
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//DBアクセスを行うクラスやインターフェースに付与するアノテーションである。
@Repository

//ここでは、エンティティのクラスとエンティティIDのクラス、 EmployeeEntity と String を指定します。
public interface EmployeeRepository extends CrudRepository<Employee, String> {
	
}
