//��ʼ�� ��A��ǩ����¼�
	function init(){
		var aNodes = document.getElementsByTagName("A");
		
		//Ϊ���е�a��ǩ�ڵ����һ������¼�
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
	//��Ŀ��ڵ�����ڵ�
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
	//��ʾͼƬ
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
						//div.style.visibility="hidden";//����
						div.style.display="none";//����	
						removeElement(div);
						};
						
	 }
	}
	//ɾ���ڵ�
	function removeElement(_element){
			 var _parentElement = _element.parentNode;
			 if(_parentElement){
					_parentElement.removeChild(_element);
			 }
	}
	
	
	
	
	//�����Ƿ�Ϊ����
	function isNumber(input) {
		var isNumber = /^\d+(\.\d+)?$/;
		if(isNumber.test(input)){
			return true;
		}
		return false;
	}


//����
	function search(){
		var searchWords=document.getElementById("searchWord").value;
		var searchButton=document.getElementById("searchButton");
		window.demo.clickOnAndroid(searchWords);
		
	}
	//�����ؼ���
	function getSearchWords(){
		//var words=window.demo2.getSearchWords();
		var words="��";
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
	
	//�ÿո����ֲ��Ҷ�ؼ��� Ҳ���÷��ŵ�
	function highword(nWord)
	{ 
		
		var array = nWord.split(" "); 
		
		for(var i=0;i<array.length;i++)
		{ 
			HighLight(array[i]);
		} 
	} 
	
	//��ת��ָ��λ��
	function getLocation(){
	var location=window.demo2.getLocation();

	if(location!=null){
		alert("!=null location��"+location);
		var a =document.createElement("A");
		a.href="#"+location;
		var aNode =document.getElementsByName(location)[0];
		
		insertAfter(a,aNode);
		a.click();
		}
	
	}
	
	
	
	
	
	
