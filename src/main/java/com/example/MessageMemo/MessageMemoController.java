//パッケージを定義している。
package com.example.MessageMemo;

//あらかじめ利用するパッケージをインポートしている。
import java.sql.Timestamp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException; 

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
	
	@Autowired
	
	private MessageRepository rep;
	
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
	public String addNewMessage(    @RequestParam String to_name
								  , @RequestParam String receiver_cd
								  , @RequestParam String custmer_cd
								  , @RequestParam String sender
								  , @RequestParam String message_cd
								  , @RequestParam String memo
								  , HttpServletRequest request
								  , Model model) throws ParseException {
		
//		Messageクラス型のmessageAddDataというインスタンスを生成している。
		Message messageAddData = new Message();
		
		int cnt = rep.countM_id();
		int m_id = 0;
		
		if(cnt == 0) {
			m_id = 1;
		} else {
			m_id = cnt + 1;
		}
		
//		Message.javaで定義されているsetAllメソッドを呼び出し、
//		フォームに入力した要素を"メッセージID","宛先者氏名","受電者コード","受電日時","顧客コード","発信者","メッセージコード","メモ"にそれぞれ設定している。
		messageAddData.setAll(m_id,to_name,receiver_cd,custmer_cd,sender,message_cd,memo);
		
		try {
			String[] receiv_time = request.getParameterValues("receiv_time[]");
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/ddhh:mm");
			
			if(receiv_time[3].equals("AM")) {
				String str = receiv_time[0] + "/" +  receiv_time[1] + "/" + receiv_time[2] + receiv_time[4] + ":" + receiv_time[5];
				
				Date date = sdf.parse(str);
				
				Timestamp ts = new Timestamp(date.getTime());
				
				messageAddData.setReceiv_time(ts);
			} else {
				int pm_time = Integer.parseInt(receiv_time[4]) + 12;
				
				String change_time = String.valueOf(pm_time);
				
				String str = receiv_time[0] + "/" +  receiv_time[1] + "/" + receiv_time[2] + change_time + ":" + receiv_time[5];
				
				Date date = sdf.parse(str);
				
				Timestamp ts = new Timestamp(date.getTime());
				
				messageAddData.setReceiv_time(ts);
			}
		} catch(NullPointerException e) {
			System.out.println("例外が発生しました");
		}
		
//		Timestampクラス型のtimestampというインスタンスを生成している。
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		
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
		
		model.addAttribute("msg", to_name + "さん宛てのメッセージを登録しました");
		
		Iterable<Customer> customerList = customerRepository.findAll();
		
		model.addAttribute("customerlist", customerList);
		
		Iterable<Employee> employeeList = employeeRepository.findAll();
		
		model.addAttribute("employeelist", employeeList);
		
		return "m_memo";
	}

}
