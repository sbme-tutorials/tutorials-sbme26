class Drop{
  
  int min_z = 0;
  
  float x = random(0, width);
  float y = random(-500, -5);
  float z = random(0, 20);
  
  float size = map(z, min_z, 20, 0, 10);
  float speed_y = map(z, min_z, 20, 0, 10);;
  
  
   void move(){
    this.y += this.speed_y;
    if(this.y > height){
      this.y = random(-500, -50);
    }
    
  }
  void show(){
    stroke(138, 43, 226);
    line(this.x, this.y, this.x, this.y+this.size);
  }

}
