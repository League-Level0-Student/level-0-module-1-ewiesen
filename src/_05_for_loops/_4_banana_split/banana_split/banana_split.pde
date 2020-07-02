void setup() {
  size(500,310);
  background(#D677BB);
  
}
void draw() {
  int xPos = 185;
  int yPos = 200;
  textSize(30);
  for (int i = 0; i < 3; i++) {
  text("ice cream", xPos, yPos);
  yPos-=50;
  }
  text("banana", xPos, 250);
}
