var obj= { "firstName": "Lionel", "lastName": "Messi" };

var p1= JSON.parse(JSON.stringify(obj));

console.log(p1.firstName+" "+p1.lastName);

p1.lastName="Ronaldo";

console.log(p1.firstName+" "+p1.lastName);

console.log(p1.middleName);

p1.middleName= "Andres";

console.log(p1.middleName);