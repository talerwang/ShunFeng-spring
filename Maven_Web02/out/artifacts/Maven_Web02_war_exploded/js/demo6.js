
//当前页
       var currentPage = 1;
       //每页显示数量
       var pageSize = 3;

       //渲染显示表格内容
       function renderTable() {
       	var startIndex = (currentPage - 1) * pageSize;
       	var endIndex = startIndex + pageSize;

       	//利用slice设定一个区间，抓取数据，获得当前显示数据
       	var data = admins.slice(startIndex, endIndex);

       	var $tbody = $("#adminTable tbody");
       	$tbody.empty();

       	$.each(data, function(index, acco) {
       		//创建tr标签
       		var $tr = $("<tr></tr>");
       		$tr.append("<td>" + admin.adminId + "</td>");
       		$tr.append("<td>" + admin.adminName + "</td>");
            $tr.append("<td>" + admin.role.roleId + "</td>");
       		$tr.append("<td>" + admin.role.createTime + "</td>");
       		$tr.append("<td>" + admin.role.updateTime + "</td>");
       		$tbody.append($tr);
       	})
       }

       function renderPageination() {
       	var totalPage = Math.ceil(accos.length / pageSize);
       	if (currentPage > 1) {
       		$(".prev").show()
       	} else {
       		$(".prev").hide()
       	}
       	if (currentPage < totalPage) {
       		$(".next").show()
       	} else {
       		$(".next").hide()
       	}
       }
       $(document).on("click", ".prev", function() {
       	var totalPage = Math.ceil(admins.length / pageSize);
       	if (currentPage > 1) {
       		currentPage--;
       	}
       	renderTable();
       	renderPageination();
       });
       $(document).on("click", ".next", function() {
       	var totalPage = Math.ceil(admins.length / pageSize);
       	if (currentPage < totalPage) {
       		currentPage++;
       	}
       	renderTable();
       	renderPageination();
       });
       $(function() {
       	renderTable();
       	renderPageination();
       })
