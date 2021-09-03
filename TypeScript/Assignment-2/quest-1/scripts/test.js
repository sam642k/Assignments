"use strict";
class Fibonacci {
    constructor() {
        this.prevNo = 0;
        this.currNo = 1;
    }
    next() {
        const nextNo = this.prevNo + this.currNo;
        this.prevNo = this.currNo;
        this.currNo = nextNo;
        return nextNo;
    }
}
let fib = new Fibonacci();
console.log(fib.next());
console.log(fib.next());
console.log(fib.next());
console.log(fib.next());
//# sourceMappingURL=test.js.map