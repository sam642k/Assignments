function countOdd(a){
    var c=0;
    for(i=0;i<100;i++){
        if(a[i]%2)
            c++;
    }
    return c;
}

function countEven(a){
    var c=0;
    for(i=0;i<100;i++){
        if(a[i]%2==0)
            c++;
    }
    return c;
}

function sum(a){
    var s=0
    for(i=0;i<100;i++){
        s+=a[i];
    }
    return s;
}

x=[]
for(i=0;i<100;i++)
    x.push(Math.floor(Math.random() * 1000));
document.write("Largest Number is "+Math.max(...x));
document.write("<br><br>Smallest Numer is "+Math.min(...x));
 
var o=countOdd(x);
var e=countEven(x);

if(o>e)
    document.write("<br><br>There are more odd numbers with count: "+o)
else
    document.write("<br><br>There are more even numbers with count: "+e)

document.write("<br><br>The sum of numbers is "+sum(x)+" and average is "+(sum(x)/100));