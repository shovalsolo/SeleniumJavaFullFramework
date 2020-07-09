'use strict';

// This is an example for let and const

var a = 'Test1';
var b = 'Test2';

console.log(a);
console.log(b);

function testVar() {
	var a = 30;
	if (true) {
		var a = 50;
		console.log(a);
	}
	console.log(a);
}

function testLet() {
	var b = 30; //the b var is valid only in this area and is equal to 50
	console.log("b is equal in this area to:" + b);
	if (true) {
		var _b = 50; //the b var is valid only in this area and is equal to 50
		console.log("b is equal in this area to:" + _b);
	}
	console.log("b is equal in this area to:" + b);
}

testVar();
testLet();

for (var i = 0; i < 10; i++) {
	console.log(i);
}

console.log("This is out side of the for loop: " + i);

for (var j = 0; j < 10; j++) {
	console.log(j);
}

//console.log("This is out side of the for loop: "+ j); // When using let inside the for loop j is not allowed out side 

console.log("--------------------------------------------------");

var colors = []; //creating an colors array

colors.push('red'); //inserting string in to the array
colors.push('blue');

console.log(colors);