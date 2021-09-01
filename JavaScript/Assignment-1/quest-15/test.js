function bubble(a){
    for(i=0; i<20-1; i++){
        for(j=0; j<20-i-1; j++){
            if(a[j]>a[j+1]){
                a[j]=a[j]+a[j+1];
                a[j+1]=a[j]-a[j+1];
                a[j]=a[j]-a[j+1];
            }
        }
    }
    return a;
}

x=[];
for(i=0;i<20;i++)
    x.push(Math.floor(Math.random() * 100));

document.write("Array before sorting: "+x);
document.write("<br><br>Array after sorting: "+bubble(x));