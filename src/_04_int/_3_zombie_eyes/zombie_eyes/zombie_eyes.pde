PImage face;
void setup() {
face = loadImage("zombieEyes.png");
size(500, 500);
face.resize(500, 500);
}
void draw() {
image(face, 0, 0);
fill(mouseY/2, mouseX/2, (mouseY+mouseX)/4);
ellipse(209, 125, 20, 20);
ellipse(312, 130, 20, 20);
}
