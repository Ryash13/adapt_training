// 5.a

function add(x=10, y=20){
    return x+y;
}

console.log(add());
console.log(add(45,20));

// 5.b 

function userFriends(username, ...friends){
    for(let i in friends){
        console.log(username+" "+friends[i]);
        
    } 
}
userFriends('Yash','Hemant','Suraj','Harshit','Sachin');

// 5.c

function printCapitalNames(name1, name2, name3, name4, name5){
    console.log(name1.toUpperCase());
    console.log(name2.toUpperCase());
    console.log(name3.toUpperCase());
    console.log(name4.toUpperCase());
    console.log(name5.toUpperCase());
} 
let arr = ['john','karan','shravan','hritik','rohan'];
printCapitalNames(...arr);
