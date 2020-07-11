// This is an example for let

window.onload = function (){
	
	console.log("--------------part 1-----------");
	var x =10;
	
	if(x > 5){														//If that is checking if x is bigger than 5
		let x = 5;													//you can use x only in the if because it is declared with let 
		console.log("X is equal to: "+ x + " in side of the if");	// x is equal to 5
	}
	
	console.log("X is equal to: "+ x + " out side of the if");		// x is equal to 10
	
	console.log("---------------part 2-----------");
	
	
	var items = document.getElementsByTagName("li");				//This will get all the li items and store them in items param
	
	for(let x = 0 ; x < items.length ; x++){						//using let and it will be valid only in the for loop
		
		items[x].onclick = function(){								//This will add a click event to every li on the page
			
			console.log(x);
			
		}
	}
}

