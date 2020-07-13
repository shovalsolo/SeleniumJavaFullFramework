// This is an example for spread operator helps to spread the parameters to individual components

window.onload = function (){
	
	console.log("--------------part 1-----------");
	
	var meats = ["Ham","Salami","Bacon"];
	
	console.log(...meats);
	
	console.log("--------------part 2-----------");
	
	var nums1 = [1,2,3];
	var nums2 = [...nums1,4,5,6];		//Using the spread operator ... to add the nums1 array to nums2 array, will not create an array in an array
	
	console.log(nums2);
	
	
	console.log("--------------part 3-----------");
	
	var nums = [3,5,7];
	
	function addNums(a,b,c){
		
		
		console.log("The total of a + b + c is: ");
		console.log(a+b+c);
		
	}
	
	addNums(...nums);					//Using the spread operator ... when calling the function it will spread the values for the func params
}

