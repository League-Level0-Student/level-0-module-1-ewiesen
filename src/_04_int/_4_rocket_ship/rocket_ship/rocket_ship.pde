int x = 400; 
int y = 600; 

void setup() {
    background(0, 0, 40); size(800, 800);

}

void draw() {
    fill(#DED9D9);
    ellipse(75,75,150,150);
    fill(#B9B8B8);
    ellipse(40,30,25,25);
    ellipse(80,110,50,50);

    fill(random(255), 0, 0);
    ellipse(x, y + 130, 90, 90);
    fill(248, 128, 0);
    ellipse(x, y + 115, 70, 70);
    fill(255, 153, 0);
    ellipse(x, y + 95, 35, 35);
    fill(100, 100, 100);
    triangle(x, y + 10, x + 50, y + 100, x - 50, y + 100);
    y-=3;
}
