void setup() {
    size(500, 500);
}
void draw() {
    background(#FFFFFF);
    noStroke();
    fill(#F52C2C);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#479B2F);
    rect(176, 103, 12, 32);
    if(mousePressed){     
    fill(#FFFFFF);
     ellipse(75,200, 25, 25);
    }
    
}
