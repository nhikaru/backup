//問１

for(var a=1;a<=5;a++){
    for(var b=1;b<=5;b++){
        document.write("★");
    }
    document.write("<br>");
}
document.write("<br><br>");
//2
for(var c=1;c<=5;c++){
    for(var d=1;d<=5;d++){
       var star=(c+d)%2==0?'★':'☆';
        document.write(star);
    }
    document.write("<br>");
}

document.write("<br><br>");

var e=1;
while(e<=25){
    if(e%2==0){
        document.write("☆");
    }else{
        document.write("★");
    }
    if(e%5==0){
        document.write("<br>");
    }
    e++;
}

document.write("<br><br>");

for(var f=1;f<=5;f++){
    for(var g=1;g<=5;g++){
        if(f==g){
            document.write("☆");
        }else{
            document.write("★");
        }
    }document.write("<br>");
}

document.write("<br><br>");

for(var h=1;h<=5;h++){
    for(var i=1;i<=h;i++){
       document.write("★");
        }document.write("<br>");
    }

document.write("<br><br>");

for(var j=1;j<=5;j++){
    for(var k=1;k<=j;k++){
        if(k==j){
            document.write("☆");
        }else{
            document.write("★");
        }
    }document.write("<br>");
}
