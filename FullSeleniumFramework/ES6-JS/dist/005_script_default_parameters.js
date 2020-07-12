// This is an example for default parameters

window.onload = function (){
	
	console.log("--------------part 1-----------");
	
	function log(num = 10){				//default value of 10 if we will not sent a value to this function
		console.log(num);
	}
	log(5);								//Once we send a value the old value is replaced
	
	
	console.log("--------------part 2-----------");
	
	function logAgain(name = "Davis", belt = "Red", age = 6){			//default parameters
		console.log("My name is: "+ name + " my belt color is: "+ belt + " and my age is: " + age);
	}
	
	logAgain("Don" , "Green" , 10);										//new parameters
}

