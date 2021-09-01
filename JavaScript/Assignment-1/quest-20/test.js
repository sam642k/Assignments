var form= document.forms.myform;
var msg= document.getElementById("msg");

form.onsubmit= function(){
    if(form.name.value==''){
        msg.innerHTML="Please enter a Name";
        return false;
    }

    if(form.email.value==''){
        msg.innerHTML="Please enter an Email";
        return false;
    }

    if(form.address.value==''){
        msg.innerHTML="Please enter an Address";
        return false;
    }
};