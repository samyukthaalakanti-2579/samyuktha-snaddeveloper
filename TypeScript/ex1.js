var firstName = "Samyuktha";
var lastname = "Alakanti"; // inferred type
var a1 = 100;
var result = true;
/*
let anyvalue;
anyvalue = 100;
anyvalue = "Samyuktha"
anyvalue = false;
anyvalue = {};
anyvalue.result = true;
anyvalue();
anyvalue = [];*/
var res; //union type
res = false;
res = 100;
//arrays
var a = [10, 20, "Samyuktha"]; //creating an array using array literal
var ab = [10, 20];
var a2;
a2 = ["Samyuktha", "Alakanti"];
var a3 = new Array(); //array creation using constuctor
var a4 = new Array();
var a5 = new Array();
var a6 = new Array();
function showName(myName) {
    console.log("My Name is", myName);
}
showName("Samyuktha");
showName("Alakanti");
function sum(a, b) {
    return a + b;
}
console.log(sum(10, 20));
var empObj = {
    firstName: 'Samyuktha',
    lastName: 'Alakanti'
};
console.log(empObj);
empObj.firstName = "Sahithi";
console.log(empObj);
// empObj = {};
var array = [10, 20, 30];
array[1] = 100;
console.log(array);
