"use strict";
let circle = {
    name: "circle",
    print: function () {
        console.log(this);
    }
};
let employee = {
    name: "employee",
    print: function () {
        console.log(this);
    }
};
function printAll(...objs) {
    for (let x of objs) {
        x.print();
    }
}
printAll(circle, employee);
//# sourceMappingURL=test.js.map