//元のコード
function totalPriceA(price, tax=1.08, haiso=400){
    return(price+haiso)*tax ;
}
document.write(totalPriceA(300)+"<br>");
document.write(totalPriceA(450)+"<br>");


//小数丸めバージョン
function totalPriceB(price, tax=1.08, haiso=400){
    return((price+haiso)*tax).toFixed() ;
}
document.write(totalPriceB(300)+"<br>");
document.write(totalPriceB(450)+"<br>");