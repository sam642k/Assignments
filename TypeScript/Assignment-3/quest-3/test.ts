interface Printable{
    name: string;
    print(): any;
}

let circle: Printable={
    name: "circle",
    print: function () {
        console.log(this)
    }
}

let employee: Printable={
    name: "employee",
    print: function() {
        console.log(this);
    }
}

function printAll(...objs: any){
    for(let x of objs){
        x.print();
    }
}

printAll(circle, employee);