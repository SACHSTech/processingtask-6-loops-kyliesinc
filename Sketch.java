import processing.core.PApplet;

public class Sketch extends PApplet {
  

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    //colour variable:
    int black = 0;
	  
	  //QUADRANT ONE
    
    stroke(black);
    //vertical lines
    for (int lineDown = 20; lineDown <= 180; lineDown += 20) {
      int lenlineDown = 200;
      line(black, lineDown, lenlineDown, lineDown);    // line (start x, start Y, end X, end Y)   
    }

    stroke(black);
    //horizontal lines
    for (int lineSide = 20; lineSide <= 180; lineSide +=20) {
      int lenlineSide = 200;
      line(lineSide, black, lineSide, lenlineSide);
    }

    //QUADRANT TWO

    for (int circleY = 20; circleY <= 200; circleY += 40) {
      for (int circleX = 220; circleX <= 400; circleX += 40) {
        fill(194, 0, 123);
        ellipse(circleX, circleY, 25, 25);
      }
    }

    //QUADRANT THREE

    for(int shading = black; shading <= 200; shading++)
    {
      stroke(shading);
      line(shading, 200, shading, 400);
    }
  
    //QUADRANT FOUR
    
    // Petals
    for (int angle = 0; angle < 360; angle += 45) {
      fill(237, 119, 0);
      stroke(black);
      strokeWeight((float)0.0025*height);

      pushMatrix();
      translate((width/2) +  width/4, (height/2) + height/4);
      rotate(radians(angle));
      ellipse(black, black, height/20, height/3);
      popMatrix();
    }

    //flower center
    fill(36, 102, 0);
    stroke(36, 102, 0);
    ellipse((width/2) + width/4, (height/2) + height/4, 40, 40);
  }
}