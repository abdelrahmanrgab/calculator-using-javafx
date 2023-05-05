package javafxapplication12;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JavaFXApplication12 extends Application {
            double old ;
            String x  ;
            int y ;
            double sum =12345;
@Override
    public void start(Stage primaryStage) {
    TextArea T = new TextArea();
    Label history = new Label();
    Label Rhistory = new Label("  Σ  -- history --");


    Button B1 = new Button(" 1         ");
    Button B2 = new Button(" 2         ");
    Button B3 = new Button(" 3         ");
    Button B4 = new Button(" 4         "); 
    Button B5 = new Button(" 5         ");
    Button B6 = new Button(" 6         ");
    Button B7 = new Button(" 7         ");
    Button B8 = new Button(" 8         ");
    Button B9 = new Button(" 9         ");
    Button B0 = new Button(" 0         ");
    Button comma = new Button("     ,      ");
    Button plus = new Button("    +      ");
    Button minus = new Button("    -       ");
    Button multiple = new Button("     ×     ");
    Button divide = new Button("     ÷     ");
    Button cos = new Button(" cos(x)   ");
    Button sin = new Button(" sin(x)   ");
    Button tan = new Button(" tan(x)   ");
    Button sqrt = new Button("   √[x]  ");
    Button power = new Button("      ^    ");
    Button modulo = new Button("      %    ");
    Button exponential = new Button("      e    ");
    Button log = new Button("   log(x)  ");
    Button absolute = new Button("  |  []  |  ");                                                                                                                                                                                      
    Button pi = new Button("    π      ");
    Button clear = new Button("    C      ");                                                                                                                             
    Button equal = new Button("  ＝       ");
    Button ans = new Button(" ans      ");
    Button off = new Button("    off    ");
    Button delete = new Button("     ←    ");
    Button asin = new Button("sin-1(x) ");
    Button acos = new Button("cos-1(x) ");
    Button atan = new Button("tan-1(x) ");    
    Button ln = new Button("   ln(x)   ");
    Button sqrt3 = new Button("   ∛[x]   ");

        B0.setStyle("-fx-text-fill: #A52A2A");                                                                                                                                                                                                                                                 
        B1.setStyle("-fx-text-fill: #A52A2A");
        B2.setStyle("-fx-text-fill: #A52A2A");
        B3.setStyle("-fx-text-fill: #A52A2A");
        B4.setStyle("-fx-text-fill: #A52A2A");
        B5.setStyle("-fx-text-fill: #A52A2A");
        B6.setStyle("-fx-text-fill: #A52A2A");
        B7.setStyle("-fx-text-fill: #A52A2A");
        B8.setStyle("-fx-text-fill: #A52A2A");
        B9.setStyle("-fx-text-fill: #A52A2A");
        comma.setStyle("-fx-text-fill: #A52A2A");
       
        off.setStyle("-fx-text-fill: #B22222");

        plus.setStyle("-fx-text-fill: #0000FF");
        minus.setStyle("-fx-text-fill: #0000FF");
        divide.setStyle("-fx-text-fill: #0000FF");
        equal.setStyle("-fx-text-fill: #0000FF");
        multiple.setStyle("-fx-text-fill: #0000FF");
        modulo.setStyle("-fx-text-fill: #0000FF");
        pi.setStyle("-fx-text-fill: #0000FF");
        ans.setStyle("-fx-text-fill: #0000FF");
        delete.setStyle("-fx-text-fill: #2E8B57");
        clear.setStyle("-fx-text-fill: #2E8B57");
        power.setStyle("-fx-text-fill: #0000FF");

        cos.setStyle("-fx-text-fill: #2E8B57");
        sin.setStyle("-fx-text-fill: #2E8B57");
        tan.setStyle("-fx-text-fill: #2E8B57");
        acos.setStyle("-fx-text-fill: #2E8B57");
        asin.setStyle("-fx-text-fill: #2E8B57");
        atan.setStyle("-fx-text-fill: #2E8B57");

        log.setStyle("-fx-text-fill: #2E8B57");
        ln.setStyle("-fx-text-fill: #2E8B57");                                                                                                                                                                         
        exponential.setStyle("-fx-text-fill: #2E8B57");
        absolute.setStyle("-fx-text-fill: #2E8B57");
        sqrt.setStyle("-fx-text-fill: #2E8B57");
        sqrt3.setStyle("-fx-text-fill: #2E8B57");
        
        Rhistory.setStyle("-fx-text-fill: #D2691E");
        
    asin.setOnAction((ActionEvent e)->{
y = 13 ;

 history.setText(T.getText());           
           
         
           T.clear();   
 
         }); acos.setOnAction((ActionEvent e)->{
y = 14 ;

 history.setText(T.getText());           
           
         
           T.clear();   
 
         }); atan.setOnAction((ActionEvent e)->{
y = 15 ;

 history.setText(T.getText());           
           
         
           T.clear();   
 
         });
         
          ln.setOnAction((ActionEvent e)->{
y = 16 ;

 history.setText(T.getText());           
           
         
           T.clear();   
 
         });
         
         sqrt3.setOnAction((ActionEvent e)->{
y = 17 ;

 history.setText(T.getText());           
           
         
           T.clear();   
 
         });

   delete.setOnAction((ActionEvent e)->{
T.setText(T.getText().substring(0,T.getText().length()-1));
     }); 
off.setOnAction((ActionEvent e)->{
   primaryStage.hide();

     });
   clear.setOnAction((ActionEvent e)->{
         
T.setText("");   

     });
   exponential.setOnAction((ActionEvent e)->{
         
T.setText(T.getText() + "2.718");   

     });
pi.setOnAction((ActionEvent e)->{
         
T.setText(T.getText() + "3.14");   

     });

    B1.setOnAction((ActionEvent e)->{

     T.setText(T.getText() + "1");   

 
    });
       
       B2.setOnAction((ActionEvent e)->{
         
T.setText(T.getText() + "2");   

     });
        
       
        B3.setOnAction((ActionEvent e)->{

     T.setText(T.getText() + "3");   

 
    });
        B4.setOnAction((ActionEvent e)->{

     T.setText(T.getText() + "4");   

 
    }); 
        B5.setOnAction((ActionEvent e)->{

     T.setText(T.getText() + "5");   

 
    }); 
        B6.setOnAction((ActionEvent e)->{

     T.setText(T.getText() + "6");   

 
    });
        B7.setOnAction((ActionEvent e)->{

     T.setText(T.getText() + "7");   

 
    }); 
        B8.setOnAction((ActionEvent e)->{

     T.setText(T.getText() + "8");   

 
    });
     
        B9.setOnAction((ActionEvent e)->{

     T.setText(T.getText() + "9");   

 
    });
        B0.setOnAction((ActionEvent e)->{

     T.setText(T.getText() + "0");   

 
    });
        comma.setOnAction((ActionEvent e)->{

     T.setText(T.getText() + ".");   

 
    });
       
        ans.setOnAction((ActionEvent e)->{

     T.setText(history.getText() );   

 
    });
         cos.setOnAction((ActionEvent e)->{
y = 5 ;

 history.setText(T.getText());           
           
         
           T.clear();   
 
         });
         
         log.setOnAction((ActionEvent e)->{
y = 12 ;

 history.setText(T.getText());           
           
         
           T.clear();   
 
         });
          sin.setOnAction((ActionEvent e)->{
y = 6 ;

 history.setText(T.getText());           
           
         
           T.clear();   
 
         });
           tan.setOnAction((ActionEvent e)->{
y = 7 ;

 history.setText(T.getText());           
           
         
           T.clear();   
 
         });
           sqrt.setOnAction((ActionEvent e)->{
y = 8 ;

 history.setText(T.getText());           
           
         
           T.clear();   
 
         });
           
           
          
       plus.setOnAction((ActionEvent e)->{
y = 1 ;
 if (T.getText().isEmpty()){
      T.setText(history.getText());
           
           
 }
 else{
    history.setText(T.getText());
           
           T.clear();   
 }
   
         
     });
        power.setOnAction((ActionEvent e)->{
y = 9 ;
 if (T.getText().isEmpty()){
      T.setText(history.getText());
           
           
 }
 else{
    history.setText(T.getText());
           
           T.clear();   
 }
   
         
     });
       minus.setOnAction((ActionEvent e)->{
y = 2 ;

          if (T.getText().isEmpty()){
      T.setText(history.getText());
           
           
 }
 else{
    history.setText(T.getText());
           
           T.clear();   
 }

     });
            multiple.setOnAction((ActionEvent e)->{
y = 3 ;

          if (T.getText().isEmpty()){
      T.setText(history.getText());
           
           
 }
 else{
    history.setText(T.getText());
           
           T.clear();   
 }

     });
       
        divide.setOnAction((ActionEvent e)->{
y = 4 ;

          if (T.getText().isEmpty()){
      T.setText(history.getText());
           
           
 }
 else{
    history.setText(T.getText());
           
           T.clear();   
 }

     });
        modulo.setOnAction((ActionEvent e)->{
y = 10 ;

          if (T.getText().isEmpty()){
      T.setText(history.getText());
           
           
 }
 else{
    history.setText(T.getText());
           
           T.clear();   
 }

     });
         absolute.setOnAction((ActionEvent e)->{
y = 11 ;

 history.setText(T.getText());           
           
         
           T.clear();   
 
         });
         
   
       equal.setOnAction((ActionEvent e)->{
  if ( y ==1) {
           sum = Double.parseDouble(history.getText()) + Double.parseDouble(T.getText()) ; 
            x = String.valueOf(sum);
            T.setText(x) ;
            
            
  }
  if ( y ==2){
            sum = Double.parseDouble(history.getText()) - Double.parseDouble(T.getText()) ; 
            x = String.valueOf(sum);
            T.setText(x) ;
              history.setText(T.getText());

                   }
   if ( y ==3){
            sum = Double.parseDouble(history.getText()) * Double.parseDouble(T.getText()) ; 
            x = String.valueOf(sum);
            T.setText(x) ;
              history.setText(T.getText());

                   } 
   if ( y ==4){
            sum = Double.parseDouble(history.getText()) / Double.parseDouble(T.getText()) ; 
            x = String.valueOf(sum);
            T.setText(x) ;
              history.setText(T.getText());

                   }
   if ( y ==5){
            sum = Math.cos(Math.toRadians(Double.parseDouble(history.getText())));
                       x = String.valueOf(sum);

            T.setText(x) ;
              history.setText(T.getText());

                   }
    if ( y ==6){
            sum = Math.sin(Math.toRadians(Double.parseDouble(history.getText())));
                       x = String.valueOf(sum);

            T.setText(x) ;
              history.setText(T.getText());

                   }
     if ( y ==7){
            sum = Math.tan(Math.toRadians(Double.parseDouble(history.getText())));
                       x = String.valueOf(sum);

            T.setText(x) ;
              history.setText(T.getText());

                   }
      if ( y ==8){
            sum = Math.sqrt(Double.parseDouble(history.getText()));
                       x = String.valueOf(sum);

            T.setText(x) ;
              history.setText(T.getText());

                   }
      if ( y ==9){
            sum = Math.pow(Double.parseDouble(history.getText()),Double.parseDouble(T.getText()));
                       x = String.valueOf(sum);

            T.setText(x) ;
              history.setText(T.getText());

                   }
         if ( y ==10){
sum = Double.parseDouble(history.getText()) % Double.parseDouble(T.getText()) ;                      
x = String.valueOf(sum);

            T.setText(x) ;
              history.setText(T.getText());

                   }
          if ( y ==11){
sum = Math.abs(Double.parseDouble(history.getText() )) ;                  
x = String.valueOf(sum);

            T.setText(x) ;
              history.setText(T.getText());

                   }
      if ( y ==12){
sum = Math.log10(Double.parseDouble(history.getText() )) ;                  
x = String.valueOf(sum);

            T.setText(x) ;
              history.setText(T.getText());

                   }
       if ( y ==13){
sum = Math.toDegrees(Math.asin(Double.parseDouble(history.getText() ))) ;                  
x = String.valueOf(sum);

            T.setText(x) ;
              history.setText(T.getText());

                   }
          
    if ( y ==14){
sum = Math.toDegrees(Math.acos(Double.parseDouble(history.getText() ))) ;                  
x = String.valueOf(sum);

            T.setText(x) ;
              history.setText(T.getText());

                   }
    if ( y ==15){
sum = Math.toDegrees(Math.atan(Double.parseDouble(history.getText() ))) ;                  
x = String.valueOf(sum);

            T.setText(x) ;
              history.setText(T.getText());

                   }
        if ( y ==16){
sum = Math.log1p(Double.parseDouble(history.getText() )) ;                  
x = String.valueOf(sum);

            T.setText(x) ;
              history.setText(T.getText());

                   }
         if ( y ==17){
sum = Math.ceil(Math.pow(Double.parseDouble(history.getText() ),1.0/3)) ;                  
x = String.valueOf(sum);

            T.setText(x) ;
              history.setText(T.getText());

                   }
          
          });
       GridPane p = new GridPane() ;
        p.setAlignment(Pos.CENTER );
    
        
        p.add(acos, 0, 1);
        p.add(asin, 1, 1);
        p.add(atan, 2, 1);
        p.add(ln, 3, 1);
        p.add(exponential, 4, 1);
        
        p.add(cos, 0, 2);
        p.add(sin, 1, 2);
        p.add(tan, 2, 2);
        p.add(log, 3, 2);
        p.add(delete, 4, 2);

        p.add(absolute, 0, 3);
        p.add(sqrt, 1, 3);
        p.add(sqrt3, 2, 3);
        p.add(off, 3, 3);
        p.add(clear, 4, 3);
        
        p.add(B8, 0, 4);
        p.add(B9, 1, 4);
        p.add(B7, 2, 4);   
        p.add(divide, 3, 4);
        p.add(multiple, 4, 4);

        p.add(B4, 0, 5);
        p.add(B5, 1, 5);
        p.add(B6, 2, 5);
        p.add(power, 3, 5);
        p.add(minus, 4, 5);
        
        p.add(B1, 0, 6);
        p.add(B2, 1, 6);
        p.add(B3, 2, 6);
        p.add(modulo, 3, 6);
        p.add(plus, 4, 6);   
        
        p.add(B0, 0, 7);
        p.add(comma, 1, 7);
        p.add(ans, 2, 7);
        p.add(pi, 3, 7);
        p.add(equal, 4, 7);
        p.setVgap(10);

        GridPane x = new GridPane();

        x.add(Rhistory, 0, 0);


        x.add(history, 0, 1);
        x.add(T, 0, 2);

        

         BorderPane y = new BorderPane();
         y.setCenter(p);
         y.setTop(x);
                 

        
        Scene a = new Scene(y , 350 , 150);
        primaryStage.setScene(a);
        primaryStage.setResizable(false);
        primaryStage.setTitle("CALCULATOR");
        primaryStage.setMinHeight(510);
        primaryStage.setMaxWidth(340);   
        primaryStage.show();
        primaryStage.centerOnScreen();
        
        
    }

       public static void main(String[] args) {
        launch(args);
    }
    
}