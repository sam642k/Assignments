function find(){
    var n= document.getElementById("n").value;
    var sum=0;
    for(i=0;i<n;i++)
        sum+=Math.floor(Math.random() * 2);
    alert(sum/n);
}