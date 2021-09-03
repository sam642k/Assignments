"use strict";
function isAmstrong(x) {
    let s = x.toString();
    let sum = 0;
    for (let r of s) {
        sum += Number(r) * Number(r) * Number(r);
    }
    if (sum == x)
        return true;
    return false;
}
var n = 0;
function reset() {
    n = 0;
}
function* getNextAmstrong() {
    for (let i = n; i >= 0; i++) {
        if (isAmstrong(i)) {
            yield i;
        }
        if (i >= 1000)
            throw console.error("exceeded 1000");
    }
}
let gen = getNextAmstrong();
console.log(gen.next());
console.log(gen.next());
console.log(gen.next());
console.log(gen.next());
console.log(gen.next());
console.log(gen.next());
console.log(gen.next());
//# sourceMappingURL=test.js.map