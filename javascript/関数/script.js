//問１
function menseki(hankei,π){
    return"半径"+hankei+"cmの円の面積は"+hankei*hankei*π+"です";
}
document.write(menseki(5,3.14));
document.write("<br>");
document.write(menseki(7,3.14));
document.write("<br>");
document.write(menseki(10,3.14));
document.write("<br>");

document.write("<br><br>");
//問2
function goukei(otona,kodomo){
    return otona*500+kodomo*200+"円です。";
}
document.write("Aグループの合計金額は"+goukei(2,4));
document.write("<br>");
document.write("Bグループの合計金額は"+goukei(1,5));
document.write("<br>");
document.write("Cグループの合計金額は"+goukei(3,7));
document.write("<br>");

document.write("<br><br>");