final int DROP_COUNT = 1000; 
 Drop[] drops = new Drop[DROP_COUNT]; 

void setup(){
  size(400, 400);
  
  for(int i =0; i < drops.length; i++){
    drops[i] = new Drop();
  }
}

void draw(){
  background(230, 230, 250);
  
  for(Drop d : drops){
      d.show();
      d.move();
  }
}
