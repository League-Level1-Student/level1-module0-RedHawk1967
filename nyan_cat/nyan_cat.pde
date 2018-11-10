
PImage pictureOfRecord; 
void setup(){
size(600,600); 
pictureOfRecord= loadImage("nyan cat.jpg"); 
pictureOfRecord.resize(height,width);
}
void draw() { 
image(pictureOfRecord, 0,0); }