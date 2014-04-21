function init(){
  parent.document.getElementById('last').onclick=goToLastPage;
  parent.document.getElementById('index').onclick=goToIndexPage;
  parent.document.getElementById('next').onclick=goToNextPage;
}


function goToLastPage(){
	 var pageId = document.getElementById("pageId").value;
	 parent.document.getElementById('myFrame').src=getFileName(pageId,-1);
}

function goToIndexPage(){
	parent.document.getElementById('myFrame').src="index.htm";
}


function goToNextPage(){
	 var pageId = document.getElementById("pageId").value;
	 parent.document.getElementById('myFrame').src=getFileName(pageId,1);
}

function getFileName( pageId,  addNumber) {
	var i = parseInt(pageId);
		i+=addNumber;
		
	var name = null;
	if(i<=0){
		name = "index";
	}else if (i < 10) {
		name = "00" + i;
	} else if (i < 100) {
		name = "0" + i;
	} else if(i<325){
		name = i + "";
	} else {
		name = "index";
	}
	
	return name + ".htm";

}