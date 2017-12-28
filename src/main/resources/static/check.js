
    function check () {
        var username = document.getElementById('ussername').value;
        var userlen = username.length;
        var passlen = document.getElementById('password').value.length;
        var realname = document.getElementById('realname').value;
        var reallen = realname.length;
        var phone = document.getElementById('phone').value;
        var phonelen = pho.length;
        if(username===null||userlen===0){
            alter("用户名不能为空！");
            return false;
        }
        if (username!=null) {
            if (!/^\w+$/.text(username)) {
                alert("输入字符不合法！");
            }
        }

        if(passlen===0){
            alter("密码不能为空！");
        }
        else if(passlen>0&&passlen<6){
            alert("密码长度至少为六位！")
        }

        if(realname===null||reallen===0){
            alter("姓名不能为空！");
            return false;
        }

        if(phone===null||phonelen===0){
            alter("手机号不能为空！");
            return false;
        }
        else if(phonelen>0&&phonelen<11||phonelen>11){
            alter("手机号长度为11位！");
            return false;
        }
        else if(phonelen===11){
            if(!/^[0-9]+$/.test(phone) ){
                alter("输入手机号字符不合法！");
                return false;
            }
        }
        return true;
    }
document.getElementById('submit').onclick = function (e) {
        return check();
}
