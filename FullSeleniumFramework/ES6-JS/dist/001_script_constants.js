// This is an example for constants

window.onload = function (){
	
	const pi =3.142 ;					//A value that we cannot change
	//pi = 10;							//Cannot change pi because it is an constant
	console.log("Pi equals: "+pi);
	
	function calcArea(r){				//This function is getting the radius and printing the calculation 
		console.log("The area is: " +pi * r * r);
	}
	
	calcArea(5);						//Calling the calcArea
}

