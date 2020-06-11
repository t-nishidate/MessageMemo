let hour = document.getElementById("hour");

document.createElement('option');
for(let i = 1; i <= 12; i++) {
	let option1 = document.createElement('option');
	option1.setAttribute('value', i);
	option1.innerHTML = i;
	hour.appendChild(option1);
}

let minute = document.getElementById("minute");

document.createElement('option');
for(let j = 0; j <= 59; j++) {
	let option2 = document.createElement('option');
	option2.setAttribute('value', j);
	option2.innerHTML = j;
	minute.appendChild(option2);
}

function setDate() {
	let today = new Date();
	let nowYear = today.getFullYear();
	let nowMonth = today.getMonth() + 1;
	let nowDay = today.getDate();
	
	document.getElementById("today_year").value = nowYear;
	document.getElementById("today_month").value = nowMonth;
	document.getElementById("today_day").value = nowDay;
}

document.getElementById("printing").onclick = function() {
	window.print();
}

function setOnly() {
	let memo = document.getElementById("memorandom");
	memo.readOnly = true;
}

function setTime() {
	let today = new Date();
	let nowHour = today.getHours();
	let nowMinute = today.getMinutes();
	
	if(nowHour >= 0 && nowHour <= 11) {
		if(nowHour == 0) {
			document.getElementById("hour").value = nowHour + 12;
		} else {
			document.getElementById("hour").value = nowHour;
		}
		let check_am = document.getElementById("radio_1");
		check_am.checked = true;
	} else {
		if(nowHour >= 13) {
			document.getElementById("hour").value = nowHour - 12;
		} else {
			document.getElementById("hour").value = nowHour;
		}
		let check_pm = document.getElementById("radio_2");
		check_pm.checked = true;
	}
	
	document.getElementById("minute").value = nowMinute;
}

function changeOnly1() {
	let memo = document.getElementById("memorandom");
	let check_message1 = document.getElementById("check1");
	
	if(check_message1.checked == true) {
		memo.readOnly = true;
		memo.value = "";
	}
}

function changeOnly2() {
	let memo = document.getElementById("memorandom");
	let check_message2 = document.getElementById("check2");
	if(check_message2.checked == true) {
		memo.readOnly = true;
		memo.value = "";
	}
}

function changeOnly3() {
	let memo = document.getElementById("memorandom");
	let check_message3 = document.getElementById("check3");
	
	if(check_message3.checked == true) {
		memo.readOnly = false;
		memo.required = true;
	} else {
		memo.readOnly = true;
		memo.required = false;
		memo.value = "";
	}
}

$(function(){
	$('input[type=checkbox]').on('click',function(){
		if ($(this).prop('checked')){
			$('input[type=checkbox]').prop('checked',false);
			$(this).prop('checked',true);
		}
	});
});

let checkedNum;

$('#regist').on('click',function() {
	checkedNum = $('.check:checked').length;
	if(checkedNum > 0) {
		$('#check_alert').text('');
		$('#regist_alert').text('');
		return true;
	} else {
		$('#check_alert').text('対応のいずれかにチェックしてください');
		$('#regist_alert').text('');
		return false;
	}
});






















