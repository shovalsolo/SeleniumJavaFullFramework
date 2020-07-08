'use strict';

// This is an example for default params and spread operator

console.log('default params');

function greet($greeting, $shalom = 'Shalom'){ 		// We have 2 types of default params one when we call the function and one from the header of the function 
	console.log($greeting);
	console.log($shalom);
}

greet('Hello');



console.log('---------------------------');


console.log('spread operator');

let args1 = [1,2,3];
let args2 = [4,5,6];

function test(){
	console.log('Arg1 are: '+args1, 'Arg2 are: '+args2);
}

test.apply(null, args1);									//This is in es5

test(...args1, ...args2);									//This is in es6 using the ...

