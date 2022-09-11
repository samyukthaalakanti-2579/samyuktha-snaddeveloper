export {}
let firstName: String = "Samyuktha";
let lastname = "Alakanti";// inferred type
let a1: number = 100;
let result: boolean = true;
/*
let anyvalue;
anyvalue = 100;
anyvalue = "Samyuktha"
anyvalue = false;
anyvalue = {};
anyvalue.result = true;
anyvalue();
anyvalue = [];*/



let res:boolean | number; //union type
res = false;
res = 100;

//arrays
let a = [10,20,"Samyuktha"];//creating an array using array literal
let ab: number[] = [10,20];
let a2: String[];
a2 = ["Samyuktha","Alakanti"];

let a3: number[] = new Array();//array creation using constuctor
let a4 = new Array();
let a5 = new Array<number | Boolean>();
let a6: any[] = new Array<any>();

function showName(myName: String):void{
    console.log("My Name is",myName);

}
showName("Samyuktha");
showName("Alakanti");

function sum(a: number, b: number){
    return a + b;
}
console.log(sum(10,20));

const empObj={
    firstName: 'Samyuktha',
    lastName: 'Alakanti'
};
console.log(empObj);
empObj.firstName = "Sahithi";
console.log(empObj);
// empObj = {};

const array =[10,20,30];
array[1] = 100;
console.log(array);
