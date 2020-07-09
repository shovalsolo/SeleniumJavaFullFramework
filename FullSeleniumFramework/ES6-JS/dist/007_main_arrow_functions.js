'use strict';

// This is an example for arrow functions

console.log('------------arrow functions-------------');

function Prefixer(prefix){
	
	this.prefix = prefix;
}

Prefixer.prototype.prefixArray = function(arr){
	
	return arr.map((x) => {
		console.log(this.prefix + x);
	});
}


let pre = new Prefixer('Hello ');
pre.prefixArray(['Brad' , 'Jeff']);


console.log('-----------arrow functions example------------');

let add1 = function(a , b){										//Same function with the word function
	
	let sum = a + b;
	console.log('Sum is equal to: ' +sum);
	return false;
}

add1(3,2);														//Calling the function




let add2 = (a , b) =>{											//Same function with the arrow => function
	
	let sum = a + b;
	console.log('Sum is equal to: ' +sum);
	return false;
}

add2(10,2);														//Calling the function