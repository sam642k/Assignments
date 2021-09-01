var a=[1,2,3,4,5,6,7,8,9,10];
var fsum=0, wsum=0; dsum=0;
for(i=0; i<a.length; i++)
    fsum+=a[i];
var i=0;
while(i<a.length){
    wsum+=a[i];
    i++;
}

i=0;
do{
    dsum+=a[i];
    i++;
}while(i<a.length);

if(fsum==wsum && fsum==dsum)
    document.write("The sum of numbers in array calculated by using three differnet loops is equal: "+fsum);