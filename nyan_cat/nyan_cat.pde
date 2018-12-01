import ddf.minim.*;
PImage pictureOfRecord; 
void setup() {
  size(600, 600);
  minim = new Minim(this);
  song = minim.loadFile("cat.mp3", 512);
  song.play();
  pictureOfRecord= loadImage("nyan cat.jpg"); 
  pictureOfRecord.resize(height, width);
}
Minim minim;  
AudioPlayer song;
void draw() { 
  rotateImage(pictureOfRecord,angle);
  if (mousePressed) {
   song.play();



angle++;
 }else{ 
song.pause();

 
 }
 
  image(pictureOfRecord, 0, 0);
}
void rotateImage(PImage image, int amountToRotate) {
  translate(width/2, height/2);
  rotate(amountToRotate*TWO_PI/360);
  translate(-image.width/2, -image.height/2);
}
int angle = 0;