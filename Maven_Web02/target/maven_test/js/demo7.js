var admins = [
            {"adminId":1,"adminName":"admin","createTime":"2021-10-14 15:59:55",
                "role":{"createTime":"2021-10-14 15:46:00","roleId":2,"roleName":"管理员",
                    "status":1,"updateTime":"2021-10-14 15:46:00"},
                "roleId":2,"status":1,"updateTime":"2021-10-14 15:59:55"},                
            {"adminId":2,"adminName":"jenny","createTime":"2021-10-14 15:59:55",
                "role":{"createTime":"2021-10-14 15:46:00","roleId":3,"roleName":"票务员",
                    "status":1,"updateTime":"2021-10-14 15:46:00"},
                "roleId":3,"status":1,"updateTime":"2021-10-14 15:59:55"},        
            {"adminId":3,"adminName":"brown","createTime":"2021-10-14 15:59:55",
                "role":{"createTime":"2021-10-14 15:46:00","roleId":1,"roleName":"运维人员",
                    "status":1,"updateTime":"2021-10-14 15:46:00"},
                "roleId":1,"status":1,"updateTime":"2021-10-14 15:59:55"},
            {"adminId":4,"adminName":"mayun","createTime":"2021-10-31 11:36:08",
                "role":{"createTime":"2021-10-14 15:46:00","roleId":1,"roleName":"运维人员",
                    "status":0,"updateTime":"2021-10-14 15:46:00"},
                "roleId":1,"status":1,"updateTime":"2021-10-31 11:36:08"},
            {"adminId":5,"adminName":"mahuateng","createTime":"2021-10-31 11:36:08",
                "role":{"createTime":"2021-10-14 15:46:00","roleId":2,"roleName":"管理员",
                    "status":1,"updateTime":"2021-10-14 15:46:00"},
                "roleId":2,"status":1,"updateTime":"2021-10-31 11:36:08"},
            {"adminId":6,"adminName":"leijun","createTime":"2021-10-31 11:36:08",
                "role":{"createTime":"2021-10-14 15:46:00","roleId":3,"roleName":"票务员",
                    "status":1,"updateTime":"2021-10-14 15:46:00"},
                "roleId":3,"status":1,"updateTime":"2021-10-31 11:36:08"},
            {"adminId":7,"adminName":"qiao","createTime":"2021-10-31 11:36:08",
                "role":{"createTime":"2021-10-14 15:46:00","roleId":3,"roleName":"票务员",
                    "status":0,"updateTime":"2021-10-14 15:46:00"},
                "roleId":3,"status":1,"updateTime":"2021-10-31 11:36:08"},
            {"adminId":8,"adminName":"maliao","createTime":"2021-10-31 11:36:08",
                "role":{"createTime":"2021-10-14 15:46:00","roleId":2,"roleName":"管理员",
                    "status":1,"updateTime":"2021-10-14 15:46:00"},
                "roleId":2,"status":1,"updateTime":"2021-10-31 11:36:08"},
            {"adminId":9,"adminName":"bu","createTime":"2021-10-31 11:36:08",
                "role":{"createTime":"2021-10-14 15:46:00","roleId":3,"roleName":"票务员",
                    "status":1,"updateTime":"2021-10-14 15:46:00"},
                "roleId":3,"status":1,"updateTime":"2021-10-31 11:36:08"}
        ];


window.onload=function()
{
	var inputNode;
	var tabNode = document.createElement('table');
	tabNode.border=1;
	tabNode.width=1000;
	//tabNode.style.height = auto;
	
	for(var i=0 ; i< admins.length;i++)
	{
		var trNode = tabNode.insertRow(i);
		trNode.insertCell(0).innerHTML = admins[i].adminId;
		trNode.insertCell(1).innerHTML = admins[i].adminName;
		trNode.insertCell(2).innerHTML = admins[i].role.roleName;
		
		if(admins[i].status==0)
		{
			trNode.insertCell(2).innerHTML="无效";
		}
		else{
			trNode.insertCell(2).innerHTML="有效";
		}
		var tdNode = trNode.insertCell(3);
		
		var inputNode1 = document.createElement('input');
		
		inputNode1.type= "button";
		inputNode1.value="删除";
		
		inputNode1.onclick=function()
		{
			del(this)
		}
		
		var inputNode2 = document.createElement('input');
		
		inputNode2.type= "button";
		inputNode2.value="修改";
		
		inputNode2.onclick=function()
		{
			showPopup(this)
		}
		tdNode.appendChild(inputNode1);
		tdNode.appendChild(inputNode2);
		
	}
	
	document.body.append(tabNode);
}

function del(node){
	var tdNode = node.parentNode;
	var trNode = tdNode.parentNode;
	trNode.remove();
}
//修改 
function showPopup(node){
	var popup =  document.getElementById("popup");
	popup.style.display="block";
	inputNode=node;
	
}

function closePopup()
{
	var popup =  document.getElementById("popup");
	popup.style.display="none";
	
	var nameVal = document.getElementById("name").value;
	var idenVal = document.getElementById("iden").value;
	
	
	// 找父级兄弟标签
	 var tdNode = inputNode.parentNode;
	 var td1 = tdNode.previousElementSibling;
	 td1.previousElementSibling.innerHTML=idenVal;
	 td1.previousElementSibling.previousElementSibling.innerHTML=nameVal;
	 }























// window.onload = function()
// {
// 	// 使用html dom已经封装好的函数
// 	var tabNode = document.createElement('table');
// 	tabNode.width=300;
// 	tabNode.border=1;
	
// 	tabNode.createCaption().innerHTML="人员表";
	
// 	var theadNode = tabNode.createTHead();
// 	var trNode = theadNode.insertRow(0);
	
// 	trNode.insertCell(0).innerHTML ="姓名";
// 	trNode.insertCell(1).innerHTML ="性别";
// 	trNode.insertCell(2).innerHTML ="年龄";
	
	
	
// 	document.body.appendChild(tabNode);
// }











// window.onload = function(){
// 	var tabNode = document.getElementsByTagName('table')[0];
	
// 	var tbody = tabNode.tBodies[0];
	
// 	var tdNode = tabNode.rows[1].cells[0];
	 
// 	 alert(tdNode.innerHTML);
	
		
// 	}








// 创建标签工作
// window.onload = function(){
	
// 	//定义table标签
// 	var tabNode = document.createElement('table');
// 	tabNode.width=300;
// 	tabNode.border=1;
// 	//定义caption标签
// 	var capNode = document.createElement('caption');
// 	//定义caption文本
// 	var capText = document.createTextNode("人员表");
// 	//定义thead标签
// 	var headNode = document.createElement('thead');
// 	//定义tr标签
// 	var tr0 = document.createElement('tr');
// 	//定义th标签
// 	var th0 = document.createElement('th');
// 	//创建姓名列
// 	th0.appendChild(document.createTextNode("姓名"));
// 	//创建性别列
// 	var th1 = document.createElement('th');
// 	th1.appendChild(document.createTextNode("性别"));
// 	//创建年龄列
// 	var th2 = document.createElement('th');
// 	th2.appendChild(document.createTextNode("年龄"));
// 	//定义tr1标签
// 	var tr1 = document.createElement('tr');
	
	
// 	//创建姓名01
// 	var name01 = document.createElement('name01');
// 	th0.appendChild(name01);
// 	name01.appendChild(document.createTextNode('张三'));
	
	
// 	capNode.appendChild(capText);
// 	tabNode.appendChild(capNode);
	
// 	tr0.appendChild(th0);
// 	tr0.appendChild(th1);
// 	tr0.appendChild(th2);
	
	
// 	headNode.appendChild(tr0);
// 	headNode.appendChild(tr1);
// 	tabNode.appendChild(headNode);
	
// 	document.body.appendChild(tabNode);
// }