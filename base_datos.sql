��- -   M y S Q L   d u m p   1 0 . 1 3     D i s t r i b   8 . 0 . 3 1 ,   f o r   W i n 6 4   ( x 8 6 _ 6 4 )  
 - -  
 - -   H o s t :   s q l 9 . f r e e s q l d a t a b a s e . c o m         D a t a b a s e :   s q l x x x x x x x  
 - -   - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  
 - -   S e r v e r   v e r s i o n 	 5 . 5 . 6 2 - 0 u b u n t u 0 . 1 4 . 0 4 . 1  
  
 / * ! 4 0 1 0 1   S E T   @ O L D _ C H A R A C T E R _ S E T _ C L I E N T = @ @ C H A R A C T E R _ S E T _ C L I E N T   * / ;  
 / * ! 4 0 1 0 1   S E T   @ O L D _ C H A R A C T E R _ S E T _ R E S U L T S = @ @ C H A R A C T E R _ S E T _ R E S U L T S   * / ;  
 / * ! 4 0 1 0 1   S E T   @ O L D _ C O L L A T I O N _ C O N N E C T I O N = @ @ C O L L A T I O N _ C O N N E C T I O N   * / ;  
 / * ! 5 0 5 0 3   S E T   N A M E S   u t f 8 m b 4   * / ;  
 / * ! 4 0 1 0 3   S E T   @ O L D _ T I M E _ Z O N E = @ @ T I M E _ Z O N E   * / ;  
 / * ! 4 0 1 0 3   S E T   T I M E _ Z O N E = ' + 0 0 : 0 0 '   * / ;  
 / * ! 4 0 0 1 4   S E T   @ O L D _ U N I Q U E _ C H E C K S = @ @ U N I Q U E _ C H E C K S ,   U N I Q U E _ C H E C K S = 0   * / ;  
 / * ! 4 0 0 1 4   S E T   @ O L D _ F O R E I G N _ K E Y _ C H E C K S = @ @ F O R E I G N _ K E Y _ C H E C K S ,   F O R E I G N _ K E Y _ C H E C K S = 0   * / ;  
 / * ! 4 0 1 0 1   S E T   @ O L D _ S Q L _ M O D E = @ @ S Q L _ M O D E ,   S Q L _ M O D E = ' N O _ A U T O _ V A L U E _ O N _ Z E R O '   * / ;  
 / * ! 4 0 1 1 1   S E T   @ O L D _ S Q L _ N O T E S = @ @ S Q L _ N O T E S ,   S Q L _ N O T E S = 0   * / ;  
  
 - -  
 - -   T a b l e   s t r u c t u r e   f o r   t a b l e   ` A s i s t e n c i a `  
 - -  
  
 D R O P   T A B L E   I F   E X I S T S   ` A s i s t e n c i a ` ;  
 / * ! 4 0 1 0 1   S E T   @ s a v e d _ c s _ c l i e n t           =   @ @ c h a r a c t e r _ s e t _ c l i e n t   * / ;  
 / * ! 5 0 5 0 3   S E T   c h a r a c t e r _ s e t _ c l i e n t   =   u t f 8 m b 4   * / ;  
 C R E A T E   T A B L E   ` A s i s t e n c i a `   (  
     ` i d E m p l e a d o `   v a r c h a r ( 6 )   N O T   N U L L   D E F A U L T   ' ' ,  
     ` f e c h a `   d a t e   N O T   N U L L ,  
     ` h o r a E n t r a d a `   t i m e   D E F A U L T   N U L L ,  
     ` h o r a S a l i d a `   t i m e   D E F A U L T   N U L L ,  
     ` o b s e r v a c i o n `   v a r c h a r ( 1 2 0 )   D E F A U L T   N U L L ,  
     ` m o n t o `   f l o a t ( 5 , 2 )   D E F A U L T   N U L L ,  
     P R I M A R Y   K E Y   ( ` i d E m p l e a d o ` , ` f e c h a ` ) ,  
     C O N S T R A I N T   ` i d E m p l e a d o A s i s `   F O R E I G N   K E Y   ( ` i d E m p l e a d o ` )   R E F E R E N C E S   ` E m p l e a d o `   ( ` i d ` )  
 )   E N G I N E = I n n o D B   D E F A U L T   C H A R S E T = l a t i n 1 ;  
 / * ! 4 0 1 0 1   S E T   c h a r a c t e r _ s e t _ c l i e n t   =   @ s a v e d _ c s _ c l i e n t   * / ;  
  
 - -  
 - -   T a b l e   s t r u c t u r e   f o r   t a b l e   ` D e t a l l e V e n t a `  
 - -  
  
 D R O P   T A B L E   I F   E X I S T S   ` D e t a l l e V e n t a ` ;  
 / * ! 4 0 1 0 1   S E T   @ s a v e d _ c s _ c l i e n t           =   @ @ c h a r a c t e r _ s e t _ c l i e n t   * / ;  
 / * ! 5 0 5 0 3   S E T   c h a r a c t e r _ s e t _ c l i e n t   =   u t f 8 m b 4   * / ;  
 C R E A T E   T A B L E   ` D e t a l l e V e n t a `   (  
     ` i d P r o d u c t o `   i n t ( 2 0 )   N O T   N U L L   D E F A U L T   ' 0 ' ,  
     ` i d V e n t a `   i n t ( 2 0 )   N O T   N U L L   D E F A U L T   ' 0 ' ,  
     ` c a n t i d a d `   i n t ( 1 0 )   D E F A U L T   N U L L ,  
     ` p r e c i o `   d e c i m a l ( 7 , 2 )   D E F A U L T   N U L L ,  
     ` t o t a l `   d e c i m a l ( 7 , 2 )   D E F A U L T   N U L L ,  
     P R I M A R Y   K E Y   ( ` i d P r o d u c t o ` , ` i d V e n t a ` ) ,  
     K E Y   ` i d V `   ( ` i d V e n t a ` ) ,  
     C O N S T R A I N T   ` i d P `   F O R E I G N   K E Y   ( ` i d P r o d u c t o ` )   R E F E R E N C E S   ` p r o d u c t o `   ( ` i d ` ) ,  
     C O N S T R A I N T   ` i d V `   F O R E I G N   K E Y   ( ` i d V e n t a ` )   R E F E R E N C E S   ` V e n t a `   ( ` i d ` )   O N   D E L E T E   C A S C A D E   O N   U P D A T E   C A S C A D E  
 )   E N G I N E = I n n o D B   D E F A U L T   C H A R S E T = l a t i n 1 ;  
 / * ! 4 0 1 0 1   S E T   c h a r a c t e r _ s e t _ c l i e n t   =   @ s a v e d _ c s _ c l i e n t   * / ;  
  
 - -  
 - -   T a b l e   s t r u c t u r e   f o r   t a b l e   ` E m p l e a d o `  
 - -  
  
 D R O P   T A B L E   I F   E X I S T S   ` E m p l e a d o ` ;  
 / * ! 4 0 1 0 1   S E T   @ s a v e d _ c s _ c l i e n t           =   @ @ c h a r a c t e r _ s e t _ c l i e n t   * / ;  
 / * ! 5 0 5 0 3   S E T   c h a r a c t e r _ s e t _ c l i e n t   =   u t f 8 m b 4   * / ;  
 C R E A T E   T A B L E   ` E m p l e a d o `   (  
     ` i d `   v a r c h a r ( 6 )   N O T   N U L L ,  
     ` n o m b r e `   v a r c h a r ( 1 2 0 )   D E F A U L T   N U L L ,  
     ` d i r e c c i o n `   v a r c h a r ( 1 0 0 )   D E F A U L T   N U L L ,  
     ` n u m e r o T e l e f o n o `   v a r c h a r ( 1 0 )   D E F A U L T   N U L L ,  
     ` p u e s t o `   v a r c h a r ( 1 5 )   D E F A U L T   N U L L ,  
     ` s e x o `   v a r c h a r ( 1 5 )   D E F A U L T   N U L L ,  
     ` p a g o P o r H o r a `   f l o a t ( 5 , 2 )   D E F A U L T   N U L L ,  
     P R I M A R Y   K E Y   ( ` i d ` )  
 )   E N G I N E = I n n o D B   D E F A U L T   C H A R S E T = l a t i n 1 ;  
 / * ! 4 0 1 0 1   S E T   c h a r a c t e r _ s e t _ c l i e n t   =   @ s a v e d _ c s _ c l i e n t   * / ;  
  
 - -  
 - -   T a b l e   s t r u c t u r e   f o r   t a b l e   ` N o m i n a `  
 - -  
  
 D R O P   T A B L E   I F   E X I S T S   ` N o m i n a ` ;  
 / * ! 4 0 1 0 1   S E T   @ s a v e d _ c s _ c l i e n t           =   @ @ c h a r a c t e r _ s e t _ c l i e n t   * / ;  
 / * ! 5 0 5 0 3   S E T   c h a r a c t e r _ s e t _ c l i e n t   =   u t f 8 m b 4   * / ;  
 C R E A T E   T A B L E   ` N o m i n a `   (  
     ` p a g o P o r H o r a `   f l o a t ( 5 , 2 )   D E F A U L T   N U L L ,  
     ` h o r a s T r a b a j a d a s `   t i m e   D E F A U L T   N U L L ,  
     ` h o r a s E x t r a s `   t i m e   D E F A U L T   N U L L ,  
     ` i d E m p l e a d o `   v a r c h a r ( 6 )   N O T   N U L L   D E F A U L T   ' ' ,  
     ` f e c h a P a g o `   d a t e   N O T   N U L L   D E F A U L T   ' 0 0 0 0 - 0 0 - 0 0 ' ,  
     P R I M A R Y   K E Y   ( ` i d E m p l e a d o ` , ` f e c h a P a g o ` ) ,  
     C O N S T R A I N T   ` i d E m p l e a d o N o m i `   F O R E I G N   K E Y   ( ` i d E m p l e a d o ` )   R E F E R E N C E S   ` E m p l e a d o `   ( ` i d ` )  
 )   E N G I N E = I n n o D B   D E F A U L T   C H A R S E T = l a t i n 1 ;  
 / * ! 4 0 1 0 1   S E T   c h a r a c t e r _ s e t _ c l i e n t   =   @ s a v e d _ c s _ c l i e n t   * / ;  
  
 - -  
 - -   T a b l e   s t r u c t u r e   f o r   t a b l e   ` V e n t a `  
 - -  
  
 D R O P   T A B L E   I F   E X I S T S   ` V e n t a ` ;  
 / * ! 4 0 1 0 1   S E T   @ s a v e d _ c s _ c l i e n t           =   @ @ c h a r a c t e r _ s e t _ c l i e n t   * / ;  
 / * ! 5 0 5 0 3   S E T   c h a r a c t e r _ s e t _ c l i e n t   =   u t f 8 m b 4   * / ;  
 C R E A T E   T A B L E   ` V e n t a `   (  
     ` i d `   i n t ( 1 1 )   N O T   N U L L   A U T O _ I N C R E M E N T ,  
     ` f e c h a `   d a t e   D E F A U L T   N U L L ,  
     ` p r e c i o T o t a l `   d e c i m a l ( 7 , 2 )   D E F A U L T   N U L L ,  
     P R I M A R Y   K E Y   ( ` i d ` )  
 )   E N G I N E = I n n o D B   A U T O _ I N C R E M E N T = 9 7 3   D E F A U L T   C H A R S E T = l a t i n 1 ;  
 / * ! 4 0 1 0 1   S E T   c h a r a c t e r _ s e t _ c l i e n t   =   @ s a v e d _ c s _ c l i e n t   * / ;  
  
 - -  
 - -   T a b l e   s t r u c t u r e   f o r   t a b l e   ` p r o d u c t o `  
 - -  
  
 D R O P   T A B L E   I F   E X I S T S   ` p r o d u c t o ` ;  
 / * ! 4 0 1 0 1   S E T   @ s a v e d _ c s _ c l i e n t           =   @ @ c h a r a c t e r _ s e t _ c l i e n t   * / ;  
 / * ! 5 0 5 0 3   S E T   c h a r a c t e r _ s e t _ c l i e n t   =   u t f 8 m b 4   * / ;  
 C R E A T E   T A B L E   ` p r o d u c t o `   (  
     ` i d `   i n t ( 2 0 )   N O T   N U L L ,  
     ` d e s c r i p c i o n `   v a r c h a r ( 1 0 0 )   D E F A U L T   N U L L ,  
     ` p r e c i o `   f l o a t ( 7 , 2 )   D E F A U L T   N U L L ,  
     ` s t o c k `   i n t ( 4 )   D E F A U L T   N U L L ,  
     ` i d P r o v e e d o r `   v a r c h a r ( 1 0 )   D E F A U L T   N U L L ,  
     P R I M A R Y   K E Y   ( ` i d ` ) ,  
     K E Y   ` i d P r o v e e d o r `   ( ` i d P r o v e e d o r ` ) ,  
     C O N S T R A I N T   ` i d P r o v e e d o r `   F O R E I G N   K E Y   ( ` i d P r o v e e d o r ` )   R E F E R E N C E S   ` p r o v e e d o r `   ( ` i d ` )  
 )   E N G I N E = I n n o D B   D E F A U L T   C H A R S E T = l a t i n 1 ;  
 / * ! 4 0 1 0 1   S E T   c h a r a c t e r _ s e t _ c l i e n t   =   @ s a v e d _ c s _ c l i e n t   * / ;  
  
 - -  
 - -   T a b l e   s t r u c t u r e   f o r   t a b l e   ` p r o v e e d o r `  
 - -  
  
 D R O P   T A B L E   I F   E X I S T S   ` p r o v e e d o r ` ;  
 / * ! 4 0 1 0 1   S E T   @ s a v e d _ c s _ c l i e n t           =   @ @ c h a r a c t e r _ s e t _ c l i e n t   * / ;  
 / * ! 5 0 5 0 3   S E T   c h a r a c t e r _ s e t _ c l i e n t   =   u t f 8 m b 4   * / ;  
 C R E A T E   T A B L E   ` p r o v e e d o r `   (  
     ` i d `   v a r c h a r ( 1 0 )   N O T   N U L L ,  
     ` n o m b r e `   v a r c h a r ( 5 0 )   N O T   N U L L ,  
     ` t e l e f o n o `   v a r c h a r ( 1 5 )   D E F A U L T   N U L L ,  
     ` e m p r e s a `   v a r c h a r ( 5 0 )   D E F A U L T   N U L L ,  
     P R I M A R Y   K E Y   ( ` i d ` )  
 )   E N G I N E = I n n o D B   D E F A U L T   C H A R S E T = l a t i n 1 ;  
 / * ! 4 0 1 0 1   S E T   c h a r a c t e r _ s e t _ c l i e n t   =   @ s a v e d _ c s _ c l i e n t   * / ;  
 / * ! 4 0 1 0 3   S E T   T I M E _ Z O N E = @ O L D _ T I M E _ Z O N E   * / ;  
  
 / * ! 4 0 1 0 1   S E T   S Q L _ M O D E = @ O L D _ S Q L _ M O D E   * / ;  
 / * ! 4 0 0 1 4   S E T   F O R E I G N _ K E Y _ C H E C K S = @ O L D _ F O R E I G N _ K E Y _ C H E C K S   * / ;  
 / * ! 4 0 0 1 4   S E T   U N I Q U E _ C H E C K S = @ O L D _ U N I Q U E _ C H E C K S   * / ;  
 / * ! 4 0 1 0 1   S E T   C H A R A C T E R _ S E T _ C L I E N T = @ O L D _ C H A R A C T E R _ S E T _ C L I E N T   * / ;  
 / * ! 4 0 1 0 1   S E T   C H A R A C T E R _ S E T _ R E S U L T S = @ O L D _ C H A R A C T E R _ S E T _ R E S U L T S   * / ;  
 / * ! 4 0 1 0 1   S E T   C O L L A T I O N _ C O N N E C T I O N = @ O L D _ C O L L A T I O N _ C O N N E C T I O N   * / ;  
 / * ! 4 0 1 1 1   S E T   S Q L _ N O T E S = @ O L D _ S Q L _ N O T E S   * / ;  
  
 - -   D u m p   c o m p l e t e d   o n   2 0 2 2 - 1 2 - 0 2   1 5 : 1 9 : 1 1  
 
