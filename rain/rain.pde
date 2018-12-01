int score;

void checkCatch(int x) {
  if (x > mouseX && x < mouseX+100)
    score++;
  else if (score > 0) 
    score--;
  println("Your score is now: " + score);
}
int randomNumber = (int) random(width);
int y = 0;
void setup() {
  size(600, 600);
}
void draw() {
  background(66, 66, 66);
  fill(0, 0, 255);
  stroke(36, 127, 51);
  ellipse(randomNumber, y, 66, 66);
  rect(mouseX, 550, 100, 100);
  y+= 10; 
  if (y == 600) {
    y = 0;
checkCatch(randomNumber);  
    randomNumber = (int) random(width);
 
}
  fill(255, 0, 0);
  textSize(16);
  text("Score: " + score, 20, 20);

}