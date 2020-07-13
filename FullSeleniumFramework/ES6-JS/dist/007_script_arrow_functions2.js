// This is an example for Arrow Functions


window.onload = function (){
	
	console.log("--------------part 1-----------");
	
	var greeting1 = function(){																	//ES5 code
		console.log("Hi all ES5");
	};
	
	greeting1();
	
	
	console.log("--------------part 2-----------");
	
	var greeting2 = () => {																		//ES6 code using fat arrow =>
		console.log("Hi all ES6 fat arrow =>");
	};
	
	greeting2();
	
	
	console.log("--------------part 3-----------");
	
	var greeting3 = () => console.log("Hi all ES6 fat arrow => no use of {} only one line");	//ES6 code using fat arrow =>
		
	
	greeting3();
	
	
	console.log("--------------part 4-----------");
	
	var greeting4 = name => console.log(`Hi all and also to ${name} ES6 fat arrow =>`);			//ES6 code using fat arrow => when we have only one param no need for ()
		
	greeting4('Tuna');
	
	
	console.log("--------------part 5-----------");
	
	var greeting5 = (name) => {																	//ES6 code using fat arrow => when we have only one param no need for () same as above
		console.log(`Hi all and also to ${name} ES6 fat arrow =>`);
	};
	greeting5('Fish');

}

