import javafx.application.Application; 
import javafx.scene.*; 
import javafx.scene.shape.Line; 
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.geometry.Point2D; 
import javafx.scene.text.*;
import java.util.*;  

public class DrawingLine extends Application{ 
   @Override
   public void start(Stage stage) { 

      Pane pane = new Pane();
      Line line = new Line(); 
      ArrayList<Vertex> list = new ArrayList<Vertex>();
      ArrayList<Edge> elist = new ArrayList<Edge>();
      
      Vertex v = new Vertex(200, 510);
      Vertex start = v;
      
      Vertex goal = new Vertex(1000, 50);
      list.add(goal);
      
      Circle c1 = new Circle(start.getX(), start.getY(), 5);
      c1.setFill(Color.BLUE);
      Circle c2 = new Circle(goal.getX(), goal.getY(), 5);
      c2.setFill(Color.BLUE);
      

      Polygon polygon = new Polygon();  
       

      polygon.getPoints().addAll(new Double[]{ 
         200.0, 310.0, 
         330.0, 340.0, 
         400.0, 150.0, 
         315.0, 20.0,
         180.0, 160.0
      }); 
      polygon.setFill(Color.TRANSPARENT);
      polygon.setStroke(Color.BLACK);
      
      Edge e = new Edge(200,310,330,340);
      elist.add(e);
      e = new Edge(330,340,400,150);
      elist.add(e);
      e = new Edge(400,150,315,20);
      elist.add(e);
      e = new Edge(315,20,180,160);
      elist.add(e);
      e = new Edge(180,160,200,310);
      elist.add(e);
      
      v = new Vertex(200, 310);
      v.nadd(3);
      v.nadd(4);
      list.add(v);
      v = new Vertex(330, 340);
      v.nadd(4);
      v.nadd(5);
      list.add(v);
      v = new Vertex(400, 150);
      v.nadd(1);
      v.nadd(5);
      list.add(v);
      v = new Vertex(315, 20);
      v.nadd(1);
      v.nadd(2);
      list.add(v);
      v = new Vertex(180, 160);
      v.nadd(2);
      v.nadd(3);
      list.add(v);
      
      Polygon polygon2 = new Polygon();  
       
      polygon2.getPoints().addAll(new Double[]{ 
         225.0, 575.0, 
         590.0, 575.0, 
         590.0, 420.0,
         225.0, 420.0
      }); 
      polygon2.setFill(Color.TRANSPARENT);
      polygon2.setStroke(Color.BLACK);
      
      e = new Edge(225,575,590,575);
      elist.add(e);
      e = new Edge(590,575,590,420);
      elist.add(e);
      e = new Edge(590,420,225,420);
      elist.add(e);
      e = new Edge(225,420,225,575);
      elist.add(e);
      
      v = new Vertex(225, 575);
      v.nadd(8);
      list.add(v);
      v = new Vertex(590, 575);
      v.nadd(9);
      list.add(v);
      v = new Vertex(590, 420);
      v.nadd(6);
      list.add(v);
      v = new Vertex(225, 420);
      v.nadd(7);
      list.add(v);
      
      Polygon polygon3 = new Polygon(); 
      
      polygon3.getPoints().addAll(new Double[]{        
          790.0, 535.0, 
          860.0, 580.0, 
          935.0, 535.0,          
          935.0, 410.0, 
          870.0, 345.0,                   
          790.0, 410.0, 
      });
      polygon3.setFill(Color.TRANSPARENT);
      polygon3.setStroke(Color.BLACK);
      
      e = new Edge(790,535,860,580);
      elist.add(e);
      e = new Edge(860,580,935,535);
      elist.add(e);
      e = new Edge(935,535,935,410);
      elist.add(e);
      e = new Edge(935,410,870,345);
      elist.add(e);
      e = new Edge(870,345,790,410);
      elist.add(e);
      e = new Edge(790,410,790,535);
      elist.add(e);
      
      v = new Vertex(790, 535);
      v.nadd(12);
      v.nadd(13);
      v.nadd(14);
      list.add(v);
      v = new Vertex(860, 580);
      v.nadd(13);
      v.nadd(14);
      v.nadd(15);
      list.add(v);
      v = new Vertex(935, 535);
      v.nadd(10);
      v.nadd(14);
      v.nadd(15);
      list.add(v);
      v = new Vertex(935, 410);
      v.nadd(10);
      v.nadd(11);
      v.nadd(15);
      list.add(v);
      v = new Vertex(870, 345);
      v.nadd(10);
      v.nadd(11);
      v.nadd(12);
      list.add(v);
      v = new Vertex(790, 410);
      v.nadd(11);
      v.nadd(12);
      v.nadd(13);
      list.add(v);
      
      Polygon polygon4 = new Polygon();
      
      polygon4.getPoints().addAll(new Double[]{ 
         405.0, 350.0, 
         515.0, 350.0, 
         455.0, 135.0,  
      }); 
      polygon4.setFill(Color.TRANSPARENT);
      polygon4.setStroke(Color.BLACK);
      
      e = new Edge(405,350,515,350);
      elist.add(e);
      e = new Edge(515,350,455,135);
      elist.add(e);
      e = new Edge(455,135,405,350);
      elist.add(e);
      
      v = new Vertex(405, 350);
      list.add(v);
      v = new Vertex(515, 350);
      list.add(v);
      v = new Vertex(455, 135);
      list.add(v);
      
      Polygon polygon5 = new Polygon();
      
      polygon5.getPoints().addAll(new Double[]{ 
         645.0, 500.0, 
         715.0, 400.0, 
         610.0, 275.0, 
      });
      polygon5.setFill(Color.TRANSPARENT);
      polygon5.setStroke(Color.BLACK);
      
      e = new Edge(645,500,715,400);
      elist.add(e);
      e = new Edge(715,400,610,275);
      elist.add(e);
      e = new Edge(610,275,645,500);
      elist.add(e);
      
      v = new Vertex(645, 500);
      list.add(v);
      v = new Vertex(715, 400);
      list.add(v);
      v = new Vertex(610, 275);
      list.add(v);
      
      Polygon polygon6 = new Polygon();
      
      polygon6.getPoints().addAll(new Double[]{ 
         520.0, 200.0, 
         680.0, 110.0, 
         610.0, 25.0, 
         520.0, 35.0, 
      });
      polygon6.setFill(Color.TRANSPARENT);
      polygon6.setStroke(Color.BLACK);
      
      e = new Edge(520,200,680,110);
      elist.add(e);
      e = new Edge(680,110,610,25);
      elist.add(e);
      e = new Edge(610,25,520,35);
      elist.add(e);
      e = new Edge(520,35,520,200);
      elist.add(e);
      
      v = new Vertex(520, 200);
      v.nadd(24);
      list.add(v);
      v = new Vertex(680, 110);
      v.nadd(25);
      list.add(v);
      v = new Vertex(610, 25);
      v.nadd(22);
      list.add(v);
      v = new Vertex(520, 35);
      v.nadd(23);
      list.add(v);
      
      Polygon polygon7 = new Polygon();
      
      polygon7.getPoints().addAll(new Double[]{ 
         700.0, 325.0, 
         850.0, 325.0, 
         850.0, 40.0, 
         700.0, 40.0, 
      });
      polygon7.setFill(Color.TRANSPARENT);
      polygon7.setStroke(Color.BLACK);
      
      e = new Edge(700,325,850,325);
      elist.add(e);
      e = new Edge(850,325,850,40);
      elist.add(e);
      e = new Edge(850,40,700,40);
      elist.add(e);
      e = new Edge(700,40,700,325);
      elist.add(e);
      
      v = new Vertex(700, 325);
      v.nadd(28);
      list.add(v);
      v = new Vertex(850, 325);
      v.nadd(29);
      list.add(v);
      v = new Vertex(850, 40);
      v.nadd(26);
      list.add(v);
      v = new Vertex(700, 40);
      v.nadd(27);
      list.add(v);
      
      Polygon polygon8 = new Polygon();
      
      polygon8.getPoints().addAll(new Double[]{ 
         950.0, 360.0, 
         975.0, 100.0, 
         925.0, 40.0, 
         870.0, 75.0, 
      });
      polygon8.setFill(Color.TRANSPARENT);
      polygon8.setStroke(Color.BLACK);
      
      e = new Edge(950,360,975,100);
      elist.add(e);
      e = new Edge(975,100,925,40);
      elist.add(e);
      e = new Edge(925,40,870,75);
      elist.add(e);
      e = new Edge(870,75,950,360);
      elist.add(e);
      
      v = new Vertex(950, 360);
      v.nadd(32);
      list.add(v);
      v = new Vertex(975, 100);
      v.nadd(33);
      list.add(v);
      v = new Vertex(925, 40);
      v.nadd(30);
      list.add(v);
      v = new Vertex(870, 75);
      v.nadd(31);
      list.add(v);
      
      //list.add(goal);
      //Creating a Group
      //Group root = new Group(polygon5, polygon, polygon2, polygon3, polygon4); 
      pane.getChildren().addAll(polygon, polygon2, polygon3, polygon4, polygon5,
      polygon6, polygon7, polygon8);
      
      ArrayList<Vertex> list2 = new ArrayList<Vertex>();
      list2 = list;
  
      ArrayList <Double> h = new ArrayList<Double>();
      for(int i=0; i<list.size(); i++)
      {
          Vertex temp = list.get(i);
          h.add(goal.distance(temp.getX(), temp.getY()));
          double temp2 = h.get(i);
          temp2 = temp2;
      }
      
      Vertex current = start;
      int count = 0;
      double dis = 0;
      ArrayList <Integer> visited = new ArrayList<Integer>();
      int tempi=0;
      //while(true){
      while(true){
      ArrayList<Vertex> acc = new ArrayList<Vertex>();
      ArrayList <Double> f = new ArrayList<Double>();
      ArrayList <Double> g = new ArrayList<Double>();
      for(int i=0; i<list.size(); i++)
      {
          int skip = 0;
          for(int j=0; j<visited.size(); j++)
          {
              if(i==visited.get(j))
              {
                  skip = 1;
                  break;
              }
          }
          if(skip==1)
          {
              continue;
          }
          Vertex next = list.get(i);
          int inter = 0;
          boolean check = false;
          for(int j=0; j<elist.size(); j++)
          {
              Edge temp = elist.get(j);
              inter = intersect(current.getX(), current.getY(),
                      next.getX(), next.getY(), temp.getX1(), temp.getY1(),
                      temp.getX2(), temp.getY2());
              if(inter==1)
              {
                  break;
              }
              check = current.poly(i);
          }
          if(inter == 0 && check == false)
          {
              g.add(current.distance(next.getX(), next.getY()));
              double value = h.get(i);
              double value2 = g.get(g.size()-1);
              if(value2==0)
              {
                  continue;
              }
              double sum = value*1.2 + value2 + dis;
              f.add(sum);
              acc.add(next);
              current.access(i, sum);
          }
      }
      int asize = acc.size();
      asize=asize;
      double small = f.get(0);
      double dis2 = 0;
      int index = 0;
      for(int i=0; i<f.size(); i++)
      {
          double small2 = f.get(i);
          if(small2<small)
          {
              small = f.get(i);
              index = i;
          }
      }
      Vertex next2 = acc.get(index);
      int tindex = index;
      double skipper = 10000;
      while(true){
      for(int i=0; i<list.size(); i++)
      {
          Vertex temp = list.get(i);
          if(next2.comp(temp.getX(), temp.getY())==true)
          {
              visited.add(i);
              break;
          }
      }
      ArrayList<Vertex> acc2 = new ArrayList<Vertex>();
      ArrayList <Double> f2 = new ArrayList<Double>();
      ArrayList <Double> g2 = new ArrayList<Double>();
      for(int i=0; i<list.size(); i++)
      {
          int skip = 0;
          for(int j=0; j<visited.size(); j++)
          {
              if(i==visited.get(j))
              {
                  skip = 1;
                  break;
              }
          }
          if(skip==1)
          {
              continue;
          }
          Vertex next = list.get(i);
          int inter = 0;
          boolean check = false;
          for(int j=0; j<elist.size(); j++)
          {
              Edge temp = elist.get(j);
              inter = intersect(next2.getX(), next2.getY(),
                      next.getX(), next.getY(), temp.getX1(), temp.getY1(),
                      temp.getX2(), temp.getY2());
              if(inter==1)
              {
                  break;
              }
              check = next2.poly(i);
          }
          if(inter == 0 && check == false)
          {
              g2.add(next2.distance(next.getX(), next.getY()));
              double value = h.get(i);
              if(value==0)
              {
                  value=value;
              }
              double value2 = g2.get(g2.size()-1);
              if(value2==0)
              {
                  continue;
              }
              double sum = value*1.2 + value2 + dis;
              if(dis2!=0)
              {
                  sum = sum + dis2;
              }
              f2.add(sum);
              acc2.add(next);
              //current.access(i, sum);
          }
      }
      double small3 = f2.get(0);
      int index2 = 0;
      for(int i=0; i<f2.size(); i++)
      {
          double small2 = f2.get(i);
          if(small2<small3)
          {
              small3 = f2.get(i);
              index2 = i;
          }
      }
      int skip2 = 0;
      if(skipper!=10000)
      {
          if(small3<skipper)
          {
              visited.remove(visited.size()-1);
              break;
          }
          else
          {
              visited.remove(visited.size()-1);
              index = tindex;
              break;
          }
      }
      for(int i=0; i<f.size(); i++)
      {
          if(tindex==i)
          {
              continue;
          }
          double small2 = f.get(i);
          if(small2<=small3)
          {
              skipper = small3;
              small3 = f.get(i);
              index = i;
              skip2 = 1;
              //dis2 = g.get(i);
              break;
          }
      }
      visited.remove(visited.size()-1);
      next2 = acc.get(index);
      if(skip2 == 0)
      {
          break;
      }
      }
      Vertex next = acc.get(index);
      dis = dis + g.get(index);
      line = new Line();
      line.setStartX(current.getX()); 
      line.setStartY(current.getY()); 
      line.setEndX(next.getX()); 
      line.setEndY(next.getY());
      line.setStroke(Color.RED);
      pane.getChildren().addAll(line);

          for(int i=0; i<list.size(); i++)
          {
              Vertex temp = list.get(i);
              if(next.comp(temp.getX(), temp.getY())==true)
              {
                  visited.add(i);
                  break;
              }
          }
      current = next;
      if(current.comp(goal.getX(), goal.getY())==true)
      {
          break;
      }
      }
      
      int n = start.ideal();
      n = n;
      //}
      /*int finish = 0;
      Vertex current = start;
      while(finish<33)
      {
          ArrayList <Double> d = new ArrayList<Double>();
          int size = list.size();
          for(int i=0; i<list.size(); i++)
          {
              Vertex temp = list.get(i);
              d.add(current.distance(temp.getX(), temp.getY()));
          }
          int index = 1;
          double small = 2683.3;
          for(int i=0; i<list.size(); i++)
          {
              Vertex next = list.get(i);
              double small2 = d.get(i)+h.get(i);
              if(small2 <= small)
              {
                  int inter = 0;
                  for(int j=0; j<elist.size(); j++)
                  {
                      Edge temp = elist.get(j);
                      if(j==7)
                      {
                          j=j;
                        }
                      inter = intersect(current.getX(), current.getY(),
                      next.getX(), next.getY(), temp.getX1(), temp.getY1(),
                      temp.getX2(), temp.getY2());
                      if(inter==1)
                      {
                          break;
                      }
                  }
                  if(inter==1)
                  {
                      continue;
                  }
                  small = small2;
                  index = i;
              }
          }
          Vertex next = list.get(index);
          line = new Line();
          line.setStartX(current.getX()); 
          line.setStartY(current.getY()); 
          line.setEndX(next.getX()); 
          line.setEndY(next.getY());
          line.setStroke(Color.RED);
          pane.getChildren().addAll(line);
          list.remove(index);
          h.remove(index);
          d.remove(index);
          current = next;
          if(current.comp(goal.getX(), goal.getY())==true)
          {
              break;
          }
          finish++;
      }*/
      
      Text t1 = new Text();
      t1.setFont(new Font(30));
      t1.setWrappingWidth(200);
      t1.setTextAlignment(TextAlignment.JUSTIFY);
      t1.setText("S");
      t1.setX(start.getX()-35);
      t1.setY(start.getY()+10);
      
      Text t2 = new Text();
      t2.setFont(new Font(30));
      t2.setWrappingWidth(200);
      t2.setTextAlignment(TextAlignment.JUSTIFY);
      t2.setText("G");
      t2.setX(goal.getX()+20);
      t2.setY(goal.getY()+10);
      
      pane.getChildren().addAll(c1, c2, t1, t2);
      Scene scene = new Scene(pane, 1200, 600); 
         
      stage.setTitle("Assignment 1"); 
         
      stage.setScene(scene); 
         
      stage.show(); 
   }
    int intersect(double x1, double y1, double x2, double y2, double x3, double y3,
    double x4, double y4)
    {
        y1=600-y1;
        y2=600-y2;
        y3=600-y3;
        y4=600-y4;
        double c1=x2-x1;
        double c2=x4-x3;
        if(c1==0&&c2==0)
        {
            return 0;
        }
        if(c1==0)
        {
            double m = (y4-y3)/(x4-x3);
            double b = y3-(x3*m);
                if(x4>x3)
                {
                    if(x1>x3&&x1<x4)
                    {
                        double y = m*x1+b;
                        if(y4>y3)
                        {
                            if(y>y3&&y<y4)
                            {
                                if(y2>y1)
                                {
                                    if(y>y1&&y<y2)
                                    {
                                        return 1;
                                    }
                                    else
                                    {
                                        return 0;
                                    }
                                }
                                else
                                {
                                    if(y<y1&&y>y2)
                                    {
                                        return 1;
                                    }   
                                    else
                                    {
                                        return 0;
                                    }
                                }
                            }
                            else
                            {
                                return 0;
                            }
                        }
                        else
                        {
                            if(y<y3&&y>y4)
                            {
                                if(y2>y1)
                                {
                                    if(y>y1&&y<y2)
                                    {
                                        return 1;
                                    }
                                    else
                                    {
                                        return 0;
                                    }
                                }
                                else
                                {
                                    if(y<y1&&y>y2)
                                    {
                                        return 1;
                                    }   
                                    else
                                    {
                                        return 0;
                                    }
                                }
                            }
                            else
                            {
                                return 0;
                            }
                        }
                    }
                    else
                    {
                        return 0;
                    }
                }
                else
                {
                    if(x1<x3&&x1>x4)
                    {
                        double y = m*x1+b;
                        if(y4>y3)
                        {
                            if(y>y3&&y<y4)
                            {
                                if(y2>y1)
                                {
                                    if(y>y1&&y<y2)
                                    {
                                        return 1;
                                    }
                                    else
                                    {
                                        return 0;
                                    }
                                }
                                else
                                {
                                    if(y<y1&&y>y2)
                                    {
                                        return 1;
                                    }   
                                    else
                                    {
                                        return 0;
                                    }
                                }
                            }
                            else
                            {
                                return 0;
                            }
                        }
                        else
                        {
                            if(y<y3&&y>y4)
                            {
                                if(y2>y1)
                                {
                                    if(y>y1&&y<y2)
                                    {
                                        return 1;
                                    }
                                    else
                                    {
                                        return 0;
                                    }
                                }
                                else
                                {
                                    if(y<y1&&y>y2)
                                    {
                                        return 1;
                                    }   
                                    else
                                    {
                                        return 0;
                                    }
                                }
                            }
                            else
                            {
                                return 0;
                            }
                        }
                    }
                    else
                    {
                        return 0;
                    }
                }
        }
        if(c2==0)
        {
            double m = (y2-y1)/(x2-x1);
            double b = y1-(x1*m);
                if(x2>x1)
                {
                    if(x3>x1&&x3<x2)
                    {
                        double y = (m*x3+b);
                        if(y2>y1)
                        {
                            if(y>y1&&y<y2)
                            {
                                if(y4>y3)
                                {
                                    if(y>y3&&y<y4)
                                    {
                                        return 1;
                                    }
                                    else
                                    {
                                        return 0;
                                    }
                                }
                                else
                                {
                                    if(y<y3&&y>y4)
                                    {
                                        return 1;
                                    }   
                                    else
                                    {
                                        return 0;
                                    }
                                }
                            }
                            else
                            {
                                return 0;
                            }
                        }
                        else
                        {
                            if(y<y1&&y>y2)
                            {
                                if(y4>y3)
                                {
                                    if(y>y3&&y<y4)
                                    {
                                        return 1;
                                    }
                                    else
                                    {
                                        return 0;
                                    }
                                }
                                else
                                {
                                    if(y<y3&&y>y4)
                                    {
                                        return 1;
                                    }   
                                    else
                                    {
                                        return 0;
                                    }
                                }
                            }
                            else
                            {
                                return 0;
                            }
                        }
                    }
                    else
                    {
                        return 0;
                    }
                }
                else
                {
                    if(x3<x1&&x3>x2)
                    {
                        double y = (m*x3+b);
                        if(y2>y1)
                        {
                            if(y>y1&&y<y2)
                            {
                                if(y4>y3)
                                {
                                    if(y>y3&&y<y4)
                                    {
                                        return 1;
                                    }
                                    else
                                    {
                                        return 0;
                                    }
                                }
                                else
                                {
                                    if(y<y3&&y>y4)
                                    {
                                        return 1;
                                    }   
                                    else
                                    {
                                        return 0;
                                    }
                                }
                            }
                            else
                            {
                                return 0;
                            }
                        }
                        else
                        {
                            if(y<y1&&y>y2)
                            {
                                if(y4>y3)
                                {
                                    if(y>y3&&y<y4)
                                    {
                                        return 1;
                                    }
                                    else
                                    {
                                        return 0;
                                    }
                                }
                                else
                                {
                                    if(y<y3&&y>y4)
                                    {
                                        return 1;
                                    }   
                                    else
                                    {
                                        return 0;
                                    }
                                }
                            }
                            else
                            {
                                return 0;
                            }
                        }
                    }
                    else
                    {
                        return 0;
                    }
                }
        }
        double m1 = (y2-y1)/(x2-x1);
        double m2 = (y4-y3)/(x4-x3);
        if(x1==330)
        {
            x1=x1;
        }
        if(m1==m2)
        {
            return 0;
        }
        if((y2-y1)==0)
        {
            m1=0;
        }
        if((y4-y3)==0)
        {
            if(x1==330)
            {
                x1=x1;
            }
            m2=0;
        }
        double b1 = y1-(x1*m1);
        double b2 = y3-(x3*m2);
        double xx = Math.round((b2-b1)/(m1-m2));
        if(x2>x1)
        {
            if(xx>x1&&xx<x2)
            {
                if(x4>x3)
                {
                    if(xx>x3&&xx<x4)
                    {
                        return 1;
                    }
                    else
                    {
                        return 0;
                    }
                }
                else
                {
                    if(xx<x3&&xx>x4)
                    {
                        return 1;
                    }
                    else
                    {
                        return 0;
                    }
                }
            }
            else
            {
                return 0;
            }
        }
        else
        {
            if(xx<x1&&xx>x2)
            {
                if(x4>x3)
                {
                    if(xx>x3&&xx<x4)
                    {
                        return 1;
                    }
                    else
                    {
                        return 0;
                    }
                }
                else
                {
                    if(xx<x3&&xx>x4)
                    {
                        return 1;
                    }
                    else
                    {
                        return 0;
                    }
                }
            }
            else
            {
                return 0;
            }
        }
    }
   public static void main(String args[]){ 
      launch(args); 
   } 
}
class Vertex
{
    private double x, y;
    ArrayList <Integer> nadj = new ArrayList<Integer>();
    ArrayList <Integer> v = new ArrayList<Integer>();
    ArrayList <Double> f = new ArrayList<Double>();
    Vertex(double xx, double yy)
    {
        x = xx;
        y = yy;
    }
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    public boolean comp(double ax, double ay)
    {
        if(x == ax && y == ay)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public double distance(double x2, double y2)
    {
        double temp1 = x2 - x;
        temp1 = temp1*temp1;
        double temp2 = y2 - y;
        temp2 = temp2*temp2;
        double temp3 = temp1 + temp2;
        double sum = Math.sqrt(temp3);
        return sum;
    }
    public void nadd(int n)
    {
        nadj.add(n);
    }
    public boolean poly(int n)
    {
        for(int i=0; i<nadj.size(); i++)
        {
            if(nadj.get(i)==n)
            {
                return true;
            }
        }
        return false;
    }
    public void access(int a, double b)
    {
        v.add(a);
        f.add(b);
    }
    public ArrayList<Integer> getV()
    {
        return v;
    }
    public ArrayList<Double> getF()
    {
        return f;
    }
    public int ideal()
    {
        double small = f.get(0);
        int index = 0;
        for(int i=1; i<v.size(); i++)
        {
            double small2 = f.get(i);
            if(small2<small)
            {
                small = small2;
                index = i;
            }
        }
        int ver = v.get(index);
        return ver;
    }
}
class Edge
{
    private double x1, y1, x2, y2;
    Edge(double xx1, double yy1, double xx2, double yy2)
    {
        x1 = xx1;
        y1 = yy1;
        x2 = xx2;
        y2 = yy2;
    }
    double getX1()
    {
        return x1;
    }
    double getY1()
    {
        return y1;
    }
    double getX2()
    {
        return x2;
    }
    double getY2()
    {
        return y2;
    }
}
