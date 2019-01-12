import ddf.minim.*;  
Minim minim;
AudioSample sound;
PImage backgroundImage;
int paddleX = mouseX; 
int paddleY = mouseY;
void setup() {
  size(600, 500);
  background(0, 238, 0);
  minim = new Minim (this);
  backgroundImage = loadImage("BongoCat.jpg");
  sound = minim.loadSample("moo 4.wav", 128); 
}
void draw() {
    if (intersects(ballx,bally,mouseX,mouseY,50)) { 
    ballspeedx *=-1;  ballspeedy *=- 1;}
  image(backgroundImage, 0, 0, width, height);
  fill(255,0,0 );
  ellipse(mouseX,mouseY, 25,25);
 fill(238,232,170 );
   stroke(238,232,170);
  rect(mouseX-5, mouseY+10, 10, 20);
  
  fill(255, 0, 0);
  stroke(255, 0, 0);
  ellipse(ballx, bally, 20, 20); 
  ballx-=ballspeedx;
  bally-=ballspeedy;
  if ( ballx > width) { 
    ballspeedx *= -1;
  }
  if ( ballx < 0) { 
    ballspeedx *= -1;
  }
  if ( bally >  height) { 
    ballspeedy *= -1;
  }
  if ( bally < 0) { 
    ballspeedy *= -1;
    sound.trigger();

  }
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength && ballY < paddleY + paddleLength )
          return true;
     else 
          return false;
}

int bally = 350;
int ballx = 200;
int ballspeedx =10;
int ballspeedy =10;