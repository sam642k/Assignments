"use strict";
function add(a = 5, b = 10) {
    return a + b;
}
console.log(add());
console.log(add(10));
console.log(add(40, 20));
function userFriends(username, ...friends) {
    console.log("User: " + username);
    console.log("Friends: " + friends);
}
userFriends("Tony", "Steve", "Thor", "Bruce");
function printCapitalNames(...names) {
    for (let i in names) {
        console.log(names[i].toUpperCase());
    }
}
const names = ["Tony", "Steve", "Thor", "Bruce"];
printCapitalNames(...names);
//# sourceMappingURL=test.js.map