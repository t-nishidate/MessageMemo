document.getElementById("printing").onclick = function() {
	window.print();
}

window.onload = function() {
	let row = scr_tbl.rows.length;
	
	if(row > 15) {
		let scr = document.getElementById("scroll_table");
		
		scr.style.overflowY = "scroll";
		scr.style.height = 735.6 + "px";
	}
}