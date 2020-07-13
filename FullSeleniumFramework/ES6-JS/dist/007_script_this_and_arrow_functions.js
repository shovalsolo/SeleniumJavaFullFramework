// This is an example for this and Arrow Functions


window.onload = function (){
	
	console.log("--------------part 1-----------");
	
	var fish1 = {
			name: 'Gil',
			swim1(x){
				var _this = this;
				window.setInterval(function(){
					if(x>0){
						console.log(_this.name + ' is swimming in the lake');
						x--;
					}
				},1000)
				
			}
			
	};
	
	fish1.swim1(5);

	console.log("--------------part 2-----------");
	
	var fish2 = {
			name: 'David',
			swim2(x){
				var _this = this;
				window.setInterval(() => {
					if(x>0){
						console.log(this.name + ' is diving in the lake');
						x--;
					}
				},1000)
				
			}
			
	};
	
	fish2.swim2(7);
}

