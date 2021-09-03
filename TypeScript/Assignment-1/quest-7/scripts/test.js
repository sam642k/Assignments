"use strict";
const names = ["Tony", "Steve", "Thor", "Bruce"];
let [, , x] = names;
console.log(x);
const org = {
    oName: "Avengers",
    address: {
        city: "New York",
        pin: 54846
    }
};
let { address: { pin } } = org;
console.log(pin);
//# sourceMappingURL=test.js.map