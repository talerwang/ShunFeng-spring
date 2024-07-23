

$(function () {
    $("#registerBtn").click(function () {
        //表单数据以json的数据提交
        var formData = {

            username_reg: $("#username_reg").val(),
            password_reg: $("#password_reg").val(),
            password_repet: $("#password_repet").val()
        };

        $.ajax({
            url: "/maven_web01/RegisterServlet",
            type: "POST",
            data: formData,
            dataType: "text",
            success: function (response) {
                if(response === "success"){
                    new $.zui.Messager('提示消息：注册成功，请登录', {
                        type: 'success' // 定义颜色主题
                    }).show();
                    //直接切换显示登录dialog
                    $('#loginli').tab('show');

                     $("#username_reg").val("");
                     $("#password_reg").val("");
                     $("#password_repet").val("");

                }
                else{
                    new $.zui.Messager('提示消息：注册失败', {
                        type: 'error' // 定义颜色主题
                    }).show();
                }
            },
            error: function () {
                alert("error");
            }
        });
    });
});