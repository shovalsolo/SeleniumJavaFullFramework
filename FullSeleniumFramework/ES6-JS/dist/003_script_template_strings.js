// This is an example for template strings we have to use `` backticks  
// `` backticks does not ignore line brake 

window.onload = function (){
	
	console.log("--------------part 1-----------");
	
	var temp = `Hello,
	
	 
	 my name is ryu`;													//`` backticks does not ignore line brake and it will add it
	
	console.log(temp);
	
	
	console.log("--------------part 2-----------");						//Same function without backticks
	
	
	function logOld(name , age){
		console.log("My name is: " + name + " and My age is: " + age);
	}
	
	logOld("Dan", 64);
	
	
	
	console.log("--------------part 3-----------");						//Same function with backticks
	
	
	function logNew(name , age){
		console.log(`My name is: ${name} and My age is: ${age}`);
	}
	
	logNew("Gil", 46);

}

