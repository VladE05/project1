����   B J  sample/Main  javafx/application/Application <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lsample/Main; start (Ljavafx/stage/Stage;)V 
Exceptions  java/lang/Exception
    java/lang/Object   getClass ()Ljava/lang/Class;  sample.fxml
    java/lang/Class    getResource "(Ljava/lang/String;)Ljava/net/URL;
 " $ # javafx/fxml/FXMLLoader % & load "(Ljava/net/URL;)Ljava/lang/Object; ( javafx/scene/Parent * 
Calculator
 , . - javafx/stage/Stage / 0 setTitle (Ljava/lang/String;)V 2 javafx/scene/Scene
 1 4  5 (Ljavafx/scene/Parent;)V
 , 7 8 9 setScene (Ljavafx/scene/Scene;)V
 , ; <  show primaryStage Ljavafx/stage/Stage; root Ljavafx/scene/Parent; main ([Ljava/lang/String;)V
  D E B launch args [Ljava/lang/String; 
SourceFile 	Main.java !               /     *� �    
       	                          u     '*� � � !� 'M+)� ++� 1Y,� 3� 6+� :�    
            "  &          '       ' = >    ? @  	 A B     3     *� C�    
   
               F G    H    I