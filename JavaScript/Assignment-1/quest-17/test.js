function rotate(a, k){
    for(i=0; i<k; i++){
        a.push(a.shift());
    }
    return a;
}

var a=[4,9,3,2,4,7,6,5];
document.write(rotate(a,4));