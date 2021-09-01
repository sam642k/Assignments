function latin(s){
    var a= s.split(" ");
    for(i=0;i<a.length;i++){
        var l=a[i][0]+"ay";
        a[i]=a[i].slice(1)+l;
    }
    return a.join(" ");
}

document.write(latin("The quick brown fox"));