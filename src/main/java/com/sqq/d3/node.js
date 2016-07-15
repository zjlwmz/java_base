var idNo = "341225199813052314";
var birthDay = idNo.substr(6, 4) - 0 + 18 + '/' + idNo.substr(10, 2) + '/' + idNo.substr(12, 2);
var t = new Date();
var now = new Date(Date.parse(t.getFullYear() + '/' + (t.getMonth() + 1) + '/' + (t.getDay() + 1)));
if (isNaN(Date.parse(birthDay))) {
    console.log('时间转换出错');
}
var birthDate = new Date(Date.parse(birthDay));
console.log(idNo.length);
console.log(birthDate);
console.log(now >= birthDate);
