function validate() {
	// body...

	var x = document.getElementById('password').value;
	var y = document.getElementById('confirm_password').value;
	if (x==""){
		alert("Please Enter required fields");
		return false;
	}
	else if (!(x===y)){
		alert("Password dont match");
		return false;
		x="";
		y="";
	}
	else{
		alert("password matched");
		return true;
	}
}

function validateCon(e) {
	// body...
	if (!(e.which>=48 && e.which<=57)){
		e.preventDefault();
	}

}

function validateDate() {

	var date= new Date();

	var year = date.getFullYear();
	var month = date.getMonth()+1;
	var dd = date.getDate();
	var y = year-18;
	if(month<10){
		month='0'+month;
	}

	if(dd<10){
		dd=0+""+dd;
	}

	var y = year-18;

	document.getElementById('dob').max=y+"-"+month+"-"+dd;

}

education=['Graduation','Post-Graduation'];
specific=[['B.Tech CSE','B.Tech ME','B.Tech EEE','B.Tech IT','BCA','BSc'],['M.Tech CSE','M.Tech ME','M.Tech EEE','M.Tech IT', 'MBA','MSc']]

function gradedu() {
	// body...
	var edu = document.getElementById('Education');
	for (i=0;i<education.length;i++){
		var ele = document.createElement('option');
		ele.text = education[i];
		edu.add(ele,i+1);
	}

}

function stream() {
	// body...
	var edu = document.getElementById('Education');
	var selectedIdx = edu.selectedIndex;
	var stream = document.getElementById('specific');
	stream.innerText=null;
	var i =0;
	var ele = document.createElement('option');
	ele.text = "--Select--";
	stream.add(ele,)
	for (i=0;i<specific[selectedIdx-1].length;i++){
		var spe = document.createElement('option');
		spe.text = specific[selectedIdx-1][i];
		stream.add(spe,i+1);
	}
}