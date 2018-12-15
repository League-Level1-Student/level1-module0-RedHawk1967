import ddf.minim.*;  
Minim minim;
AudioSample sound;
PImage backgroundImage;
int paddlex = 300; 
int paddley = 475;
void setup() {
  size(600, 500);
  background(0, 238, 0);
  minim = new Minim (this);
  backgroundImage = loadImage("BongoCat.jpg");
  sound = minim.loadSample("moo 4.wav", 128);
}
void draw() {
    image(backgroundImage, 0, 0, width, height);
  fill(255,0,0 );
  ellipse(paddlex,paddley, 25,25);
 fill(238,232,170 );
   stroke(238,232,170);
  rect(295, 485, 10, 10);
  
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
  if ( bally > height) { 
    ballspeedy *= -1;
  }
  if ( bally < 0) { 
    ballspeedy *= -1;
    //sound.trigger();

  }
}

int bally = 350;
int ballx = 200;
int ballspeedx =10;
int ballspeedy =10;