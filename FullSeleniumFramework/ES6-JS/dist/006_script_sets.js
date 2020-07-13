// This is an example for Sets
// Sets will hold only unique values (only once) and will remove duplicates


window.onload = function (){
	
	console.log("--------------part 1-----------");

	var names = new Set();
	
	names.add("John").add("Mickel").add("Zed").add("John");			//Adding to the List
	
	console.log("The size of the names array is : " + names.size);	//Getting the size
	
	console.log("Checking for value in the List returning true/false: " + names.has("Zed"));
	
	console.log(names);
	
	names.delete("Zed");											//Deleting zed from the sets List
	
	console.log(names);		
	
	names.clear();													//Will clear delete the content of the List
	
	console.log(names);
	
	
	console.log("--------------part 2-----------");
	
	var codes = ['Shaun','Danny','Gilbert','Danny','Albert'];
	
	console.log("Array with duplicates: " + codes);
	
	var clearCodes = new Set(codes);								//Creating new set list and populating with the duplicated array
	
	console.log(clearCodes);
	
	codes = [...clearCodes];										//Using the spread operator to populate the array
	
	console.log("Array is clean of duplicates: " + codes);
}

