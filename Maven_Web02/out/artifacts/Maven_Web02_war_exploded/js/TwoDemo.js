var orders = [];
var currentPage = 1;
var pageSize = 3;
//每页开始的下标
var startNum ;
var totalPage
var obj;
$(function (){

    getData();
//button绑定 绑定 click点击事件触发执行的函数
    $("#prev").on('click',prevClick);
    $("#next").on('click',nextClick);





});
function  renderTable (obj)
{
    var tbody = $("#OrderTable tbody");
    tbody.empty();

    $.each(obj, function (index, data) {
        var row = '<tr>'+
        '    <td>'+data.orderId+'</td>'+
            '<td>'+data.orderDate+'</td>'+
            '<td>'+data.totalPrice+'</td>'+
            '<td>'+data.username+'</td>'+
            '<td>'+data.userPhone+'</td>'+
            '<td>'+data.sendCity+data.sendAddressLine1+data.sendAddressLine2+'</td>'+
            '<td>'+data.reciverCity+data.reciverAddressLine1+data.reciverAddressLine2+'</td>'+
            '<tr/>'
        tbody.append(row);
    })


}
function renderPageination() {
    totalPage = Math.ceil(obj.count / pageSize);

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

function prevClick(){
    totalPage = Math.ceil(obj.count / pageSize);
    if (currentPage > 1) {
        currentPage--;
    }
    getData();

}
function nextClick(){
    totalPage = Math.ceil(obj.count / pageSize);
    if (currentPage < totalPage) {
        currentPage++;
    }
    getData();

}

function getData() {
    startNum = (currentPage - 1) * pageSize;

    var formData = {

        limit: pageSize,
        offset: startNum,

    };

    $.ajax({
        url: "/maven_web01/getDateServlet",
        type: "POST",
        data: formData,
        dataType: "text",
        success: function (response) {
            console.log(formData)
            // alert(response);

            //解开json格式
            obj = $.parseJSON(response);

            //obj.count;
            renderTable(obj.orderList);
            renderPageination();


        },
        error: function () {
            console.log(formData)
            alert("error");
        }
    })
}