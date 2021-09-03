function getUsers(room: any){
    for(let msg of room.values()){
        for(let [name] of msg.entries())
            console.log(name);
    }
}
function getMessages(room: any){
    for(let msg of room.values()){
        for(let [name, message] of msg.entries())
            console.log(name+" => "+message);
    }
}

//messages of room1
let r1msg1= new Map();
r1msg1.set("Tony", "Hello Guys!! lets go kill Thanos");
let r1msg2= new Map();
r1msg2.set("Steve", "Yeah okayyy.. But where's Thor??");
let r1msg3= new Map();
r1msg3.set("Thor", "I have already left.. You guys should catch up");
let r1msg4= new Map();
r1msg4.set("Tony", "Jarvis!!!");
let r1msg5= new Map();
r1msg5.set("Steve", "Assemble");

let room1= new Set();
room1.add(r1msg1).add(r1msg2).add(r1msg3).add(r1msg4).add(r1msg5);

//msgs of room2
let r2msg1= new Map();
r2msg1.set("Law", "Hello Guys!! lets go kill Kaido");
let r2msg2= new Map();
r2msg2.set("Sanji", "Yeah okayyy.. But where's Luffy and Zoro??");
let r2msg3= new Map();
r2msg3.set("Zoro", "We have already left.. You guys should catch up");
let r2msg4= new Map();
r2msg4.set("Nami", "Luffy!! dont let zoro get lost");
let r2msg5= new Map();
r2msg5.set("Law", "Why did I make them my allies");

let room2= new Set();
room1.add(r2msg1).add(r2msg2).add(r2msg3).add(r2msg4).add(r2msg5);


let rooms= new Set();
rooms.add(room1).add(room2);


getUsers(room1);

getMessages(room1);

getUsers(room2);

getMessages(room2);