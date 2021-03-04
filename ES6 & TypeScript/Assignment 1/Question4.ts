var array = ["John Cena", "The Rock", "The Undertaker"];

function conversionOfArray(array){
let len = array.length;
let newArray = [];
for(let i of array){
    let object = {
        name: i,
        length: i.length
    }
    newArray.push(obj); 
}
return newArray;
}

console.log(conversionOfArray(newArray));
