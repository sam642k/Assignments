"use strict";
const convert = (names) => {
    let objs = [];
    for (let x in names) {
        console.log(x);
        objs.push({ name: names[x], length: names[x].length });
    }
    return objs;
};
let names = ['Tom', 'Ivan', 'Jerry'];
console.log(convert(names));
//# sourceMappingURL=test.js.map