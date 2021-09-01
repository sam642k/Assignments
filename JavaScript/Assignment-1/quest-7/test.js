function find(){
    var amt= document.getElementById("n").value;
    var cur= document.getElementById("currency").value;
    var res;
    if(cur=="Indian Rupee")
        res=amt*74.28;
    else if(cur=="Japanese Yen")
        res=amt*109.14;
    else if(cur=="Euro")
        res=amt*0.84;
    else
        res=amt*0.72;
    alert("The amount is "+res+" "+cur);
}