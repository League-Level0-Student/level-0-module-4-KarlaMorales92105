int x = 330;
int y = 205;

PImage face;
void setup() {
  face = loadImage("face.jpg");
  
  size(800,600);
  face.resize(width,height);
  
}


void draw() {
  background(face);

if(mousePressed){
  println(mouseX, mouseY);
 }
fill(255,255,255);
ellipse(330,205,150,150);
ellipse(560,185,150,150);
if(mouseX< 289){
 x=289;
}
else if(mouseX>389){
 x=389; 
}
else{
x=mouseX;
}
 if(mouseY< 140){
  y = 140;
 }
 else if(mouseY> 240){
  y = 240;
 }
else{
  y = mouseY;
 }

fill(0,0,0);
ellipse(x,y,50,50);
fill(0,0,0);
ellipse(x+230,y-20,50, 50);

 
 

 }
