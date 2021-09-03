"use strict";
const order = {
    id: 101,
    title: "Avengers",
    price: 54000,
    printOrder: function () {
        console.log(this.id, this.title, this.price);
    },
    getPrice: function () {
        return this.price;
    }
};
const obj = Object.assign({}, order);
console.log(order);
console.log(obj);
//# sourceMappingURL=test.js.map