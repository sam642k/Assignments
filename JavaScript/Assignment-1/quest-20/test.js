var form= document.forms.myform;
var msg= document.getElementById("msg");

function valid(){
    if(form.name.value==''){
        msg.innerHTML="Please enter a Name";
    }

    if(form.email.value==''){
        msg.innerHTML="Please enter an Email";
    }

    if(form.address.value==''){
        msg.innerHTML="Please enter an Address";
    }

    else{
        document.getElementById("summary").removeAttribute("disabled");
        msg.innerHTM="Registerations successfull";
    }
};

function calculate(){
    list=[];
    var markedCheckbox = document.querySelectorAll('input[type="checkbox"]:checked');
    for (var checkbox of markedCheckbox) 
        list.push(checkbox.value);
    noTopp= list.length;
    var delFee=0;
    if(form.type.value=="delivery")
        delFee=5;
    var tip= 1 + (Number(document.forms.myform.tip.value.slice(0,-1)))/100.0;

    return (10 + 1.5 * noTopp + delFee)*tip;
}

function create(){
    var table= document.createElement("table");

    var tr= document.createElement("tr");
    var td= document.createElement("td");
    td.innerHTML="Name";
    tr.appendChild(td);
    var td= document.createElement("td");
    td.innerHTML= form.name.value;
    tr.appendChild(td);
    table.appendChild(tr);

    var tr= document.createElement("tr");
    var td= document.createElement("td");
    td.innerHTML="Email";
    tr.appendChild(td);
    var td= document.createElement("td");
    td.innerHTML= form.email.value;
    tr.appendChild(td);
    table.appendChild(tr);

    
    var tr= document.createElement("tr");
    var td= document.createElement("td");
    td.innerHTML="Toppings";
    tr.appendChild(td);
    var td= document.createElement("td");
    var markedCheckbox = document.querySelectorAll('input[type="checkbox"]:checked');
    for (var checkbox of markedCheckbox) 
        td.append(checkbox.value + ', ');
    tr.appendChild(td);
    table.appendChild(tr);

    var tr= document.createElement("tr");
    var td= document.createElement("td");
    td.innerHTML="Order Type";
    tr.appendChild(td);
    var td= document.createElement("td");
    td.innerHTML= form.type.value;
    tr.appendChild(td);
    table.appendChild(tr);

    var tr= document.createElement("tr");
    var td= document.createElement("td");
    td.innerHTML="Tip";
    tr.appendChild(td);
    var td= document.createElement("td");
    td.innerHTML= form.tip.value;
    tr.appendChild(td);
    table.appendChild(tr);

    var tr= document.createElement("tr");
    var td= document.createElement("td");
    td.innerHTML="Addresse";
    tr.appendChild(td);
    var td= document.createElement("td");
    td.innerHTML= form.address.value;
    tr.appendChild(td);
    table.appendChild(tr);

    var tr= document.createElement("tr");
    var td= document.createElement("td");
    td.innerHTML="Total Price";
    tr.appendChild(td);
    var td= document.createElement("td");
    td.innerHTML= calculate();
    tr.appendChild(td);
    table.appendChild(tr);

    
    document.getElementsByTagName("body")[0].appendChild(table);
}
