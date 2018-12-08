void setup() {
  size(600, 500);
  background(0, 238, 0);
}
void draw() {
  background(0, 238, 0);
  fill(255, 0, 0);
  stroke(255, 0, 0);
  ellipse(ballx,bally, 20, 20); 
  ballx-=ballspeedx;
bally-=ballspeedy;
if( ballx > width){ 
ballspeedx *= -1;
}
if( ballx < 0){ 
ballspeedx *= -1;
}
if( bally > height){ 
ballspeedy *= -1;
}
if( bally < 0){ 
ballspeedy *= -1;
}
}
int bally = 350;
int ballx = 200;
int ballspeedx =100;
int ballspeedy =100;