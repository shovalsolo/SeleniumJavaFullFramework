// This is an example for Generators is a type of a list method that is iterating on array or list
// yield - is a command for the generator to pause the iteration


window.onload = function (){
	
	console.log("--------------part 1-----regular function------");
	
	
	function colorGen(){			//regular function not a generator
	
		console.log('Green');
		console.log('Red');
		console.log('Blue');
		console.log('Black');
		console.log('Gray');
	}
	
	colorGen();
	
	console.log("--------------part 2-----Generator-function------");
	
	function* gen(){				//Generator-function
		
		yield console.log('reen');	//yield in this step will pause the iteration in this stage
		yield console.log('ed');
		yield console.log('lue');
		yield console.log('ray');
		yield console.log('all done');
	}
	
	var myGen =  gen();
	myGen.next();					//Will iterating on the list and print it
	myGen.next();					//This will run it again after the yield
	myGen.next();					//This will run it again after the yield
	myGen.next();					//This will run it again after the yield
	myGen.next();					//This will run it again after the yield
	
	
	console.log("--------------part 3-----Generator-function------");
	
	function* generator(){				//Generator-function
		
		yield "reen";					//yield in this step will pause the iteration in this stage
		yield "ed";
		return "all done";
	}
	
	var myGenerator =  generator();
	
	console.log(myGenerator.next());			//This will print the value and if the list is done returning true/false {value: "reen", done: false}
	myGenerator.next();							//This will run it again after the yield
	console.log(myGenerator.next());			//This will run it again after the yield
	
	
	console.log("--------------part 4-----Generator-function------");
	
	function* generat(){					//Generator-function
		
		var x = yield "reen";				//yield in this step will pause the iteration in this stage
		var y = yield "ed";
		var z = yield "all done"
		return x + y + z;					//will return after adiing the params
	}
	
	var myGenerat =  generat();
	
	console.log(myGenerat.next(10));		//This will print the value and if the list is done returning true/false {value: "reen", done: false}
	console.log(myGenerat.next(5));			//This will run it again after the yield and will pass a param to y
	console.log(myGenerat.next(7));			//This will run it again after the yield
}

