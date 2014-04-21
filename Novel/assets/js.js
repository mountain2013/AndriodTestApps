//初始化 给A标签添加事件
	function init(){
		var aNodes = document.getElementsByTagName("A");
		
		//为所有的a标签节点添加一个点击事件
		for(var i = 0; i < aNodes.length; i++) {
			var aNode = aNodes[i];	
			var id=aNode.name;
				if(isNumber(id)){	
						aNode.href="javascript:openPic("+id+");";
				}
		}
		
		//getLocation();
		
		//getSearchWords();
	}
	//在目标节点后插入节点
	function insertAfter(newEl, targetEl)
			{
				var parentEl = targetEl.parentNode;
				if(parentEl.lastChild == targetEl)
				{
					parentEl.appendChild(newEl);
				}else
				{
					parentEl.insertBefore(newEl,targetEl.nextSibling);
				}            
			}
	//显示图片
	function openPic(id){
					var checkDiv=document.getElementById(id+"_");
					if(checkDiv==null){
					var temp =parseInt(id);; 
					var div =document.createElement("DIV");
					div.id=id;
					div.align="center";
					var pic =document.createElement("img");
					pic.id=id+"_";
					pic.src="pic/p"+temp+".jpg";
					
					div.appendChild(pic);
					var aNode =document.getElementsByName(id);
					
					insertAfter(div,aNode[0]);	
					pic.onclick=function(){
						//closeDiv(id);
						//div.style.visibility="hidden";//隐藏
						div.style.display="none";//隐藏	
						removeElement(div);
						};
						
	 }
	}
	//删除节点
	function removeElement(_element){
			 var _parentElement = _element.parentNode;
			 if(_parentElement){
					_parentElement.removeChild(_element);
			 }
	}
	
	
	
	
	//检验是否为数字
	function isNumber(input) {
		var isNumber = /^\d+(\.\d+)?$/;
		if(isNumber.test(input)){
			return true;
		}
		return false;
	}


//搜索
	function search(){
		var searchWords=document.getElementById("searchWord").value;
		var searchButton=document.getElementById("searchButton");
		window.demo.clickOnAndroid(searchWords);
		
	}
	//高亮关键字
	function getSearchWords(){
		//var words=window.demo2.getSearchWords();
		var words="鼻";
		if(words!=null){
			HighLight(words);
			}
		
	}
	
	function HighLight(nWord)
	{ 
		if(nWord!=''){ 
		
			var keyword = document.body.createTextRange(); 
			
			while(keyword.findText(nWord))
			{ 
				keyword.pasteHTML("<span style='color:red;'>" + keyword.text + "</span>"); 
				
				keyword.moveStart('character',1); 
			} 
		} 
	} 
	
	//用空格区分查找多关键字 也可用符号等
	function highword(nWord)
	{ 
		
		var array = nWord.split(" "); 
		
		for(var i=0;i<array.length;i++)
		{ 
			HighLight(array[i]);
		} 
	} 
	
	//跳转到指定位置
	function getLocation(){
	var location=window.demo2.getLocation();

	if(location!=null){
		alert("!=null location："+location);
		var a =document.createElement("A");
		a.href="#"+location;
		var aNode =document.getElementsByName(location)[0];
		
		insertAfter(a,aNode);
		a.click();
		}
	
	}
	
	
	
	
	
	
