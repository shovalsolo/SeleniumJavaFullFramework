'use strict';

// This is an example for string and number methods


console.log('-------------Part 1---strings-----------');

let theString = 'Hello, My name is John';
let str = ' Graaaaaavy ';


//startsWith();								//This method will return true/false when the string starts with a specific string
//startsWith();								//This method will return true/false when the string ends with a specific string
//includes();								//This method will return true/false when the string includes a specific string
//repeat();									//This method will a string with the number you want


console.log('the string starts with Hello?: '+ theString.startsWith('Hello'));			//startsWith
console.log('the string ends with John?: '+ theString.endsWith('John'));				//endsWith
console.log('the string includes My?: '+ theString.includes('My'));						//includes
console.log('the string includes JavaScript?: '+ theString.includes('JavaScript'));		//includes
console.log('the string will repeat: '+ str.repeat(5));									//repeat


console.log('---------------Part 2-----numbers--------');


console.log(0xFF);					//Equal 255 convert from Hexadecimal  
console.log(0b101011);				//Equal 43 convert from binary
console.log(0o543);					//Equal 355 convert from octal

console.log('Will check if 3 is isFinite '+Number.isFinite(3));		//isFinite is a function that will check if the param is a number
console.log('Will check if NaN is isFinite '+Number.isFinite(NaN));	//isFinite is a function that will check if the param is a number

console.log('Will check if NaN is NaN '+ Number.isNaN(NaN));		//isNaN is a function that will check if the param is a NaN
console.log('Will check if 4 is  '+Number.isNaN(4));				//isNaN is a function that will check if the param is a NaN

console.log('Will check if 4 is Integer '+Number.isInteger(4));		//isInteger is a function that will check if the param is an Integer
console.log('Will check if NaN is Integer '+Number.isInteger(NaN));	//isInteger is a function that will check if the param is an Integer