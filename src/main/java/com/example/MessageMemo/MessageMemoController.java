//パッケージを定義している。
package com.example.MessageMemo;

//あらかじめ利用するパッケージをインポートしている。
import java.sql.Timestamp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
//import java.text.SimpleDateFormat;

//画面遷移の制御や主となる処理を実行するクラスに付与するアノテーションである。
@Controller

//MessageMemoControllerという公開クラスである。
public class MessageMemoController {
	
//	@Component(@Controller ,@Service ,@Repositoryのこと)があるクラスの中から、該当するものを探し出すアノテーションである。
	@Autowired
	
//	customerRepositoryというCustomerRepositoryクラス型の非公開フィールドである。
	private CustomerRepository customerRepository;
	
//	@Component(@Controller ,@Service ,@Repositoryのこと)があるクラスの中から、該当するものを探し出すアノテーションである。
	@Autowired
	
//	employeeRepositoryというEmployeeRepositoryクラス型の非公開フィールドである。
	private EmployeeRepository employeeRepository;
	
//	@Component(@Controller ,@Service ,@Repositoryのこと)があるクラスの中から、該当するものを探し出すアノテーションである。
	@Autowired
	
//	messageRepositoryというMessageRepositoryクラス型の非公開フィールドである。
	private MessageRepository messageRepository;
	
//	クライアントからのリクエストに対してマッピングを行うアノテーションである。特定のURLを指定する。
	@RequestMapping("/msgmemo/inputForm")
    
//	m_memoという戻り値の型がString型(文字列型)の公開メソッドである。戻り値としてHTMLファイルを返している。
	public String m_memo(Model model) {
		
		Iterable<Customer> customerList = customerRepository.findAll();
		
		model.addAttribute("customerlist", customerList);
		
		Iterable<Employee> employeeList = employeeRepository.findAll();
		
		model.addAttribute("employeelist", employeeList);
		
		// 伝言メモ画面を表示する。
        return "m_memo";
    }
	
//	@RequestMappingのPOSTリクエスト用のアノテーションである。ページのパスを指定することができる。DB登録処理を行う。
	@PostMapping(path="/msgmemo/inputForm")
	
//	addNewMesasgeという戻り値の型がString型(文字列型)の公開メソッドである。
//	引数はString型のto_name、String型のreceiver_cd、Timestamp型のreceiv_time
//	String型のcustmer_cd、String型のsender、String型のmessage_cd、String型のmemoの8つである。
	public @ResponseBody String addNewMessage(    @RequestParam String to_name
												, @RequestParam String receiver_cd
												, @RequestParam String receiv_time
												, @RequestParam String custmer_cd
												, @RequestParam String sender
												, @RequestParam String message_cd
												, @RequestParam String memo) {
		
//		Messageクラス型のmessageAddDataというインスタンスを生成している。
		Message messageAddData = new Message();
		
//		Message.javaで定義されているsetAllメソッドを呼び出し、
//		フォームに入力した要素を"メッセージID","宛先者氏名","受電者コード","受電日時","顧客コード","発信者","メッセージコード","メモ"にそれぞれ設定している。
		messageAddData.setAll(to_name,receiver_cd,custmer_cd,sender,message_cd,memo);
		
//		Timestampクラス型のtimestampというインスタンスを生成している。
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		
		System.out.println(receiv_time);
		
		messageAddData.setReceiv_time(timestamp);
		
//		更新日時にシステム日時を設定している。
		messageAddData.setCreate_date(timestamp);
		
//		更新者に"springuser"を設定している。
		messageAddData.setCreate_user("springuser");
		
//		作成日時にシステム日時を設定している。
		messageAddData.setUpdate_date(timestamp);
		
//		作成者に"springuser"を設定している。
		messageAddData.setUpdate_user("springuser");
		
//		CrudRepository.javaで定義されているsaveメソッドを呼び出している。
		messageRepository.save(messageAddData);
		
		return "m_memo.html";
	}

}
