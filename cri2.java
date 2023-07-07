import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

public class cri2 extends Frame implements ActionListener{
Label ft1name,ft2name;	
	
Label ft1p1, ft1p2, ft1p3, ft1p4, ft1p5,ft1p6,ft1p7,ft1p8,ft1p9,ft1p10,ft1p11;
TextField         ft1f0, ft1f1,ft1f2,ft1f3;
		
Label f2t2p1,f2t2p2,f2t2p3,f2t2p4,f2t2p5,f2t2p6,f2t2p7,f2t2p8,f2t2p9,f2t2p10,f2t2p11;
TextField        f2t2f0, f2t2f1,f2t2f2,f2t2f3;

TextField fr,fw,fr2,fw2;				
		
Label l1t1, l2t1,l3t1,l4t1,l5t1;
Label vs;
Label l1t2,l2t2, l3t2,l4t2,l5t2;
Label t1in,t2in;
Label t1,t2,slash,slash2;
Label name,dis,r,b,sr,name2,dis2,r2,b2,sr2;
Label ballno,overno;
int balln=1,overn=0;
int truns=0,twickets=0;
int truns2=0,twickets2=0;
int textras=0, twb=0, tbies=0, tnb=0;
int textras2=0, twb2=0, tbies2=0, tnb2=0;

Label p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11, pp1,pp2,pp3,pp4,pp5,pp6,pp7,pp8,pp9,pp10,pp11;

Label tname,pname;
TextField fnames;
Button submit,reset;
Label over,ball,choices;
Label runs,bies,nb,wb;
Button s1,s2,s3,s4,bowled,rout,stump,lbw,caught;
TextField fruns,fbies,fnb,fwb;

Label dp1,dp2,dp3,dp4,dp5,dp6,dp7,dp8,dp9,dp10,dp11,dp12,dp13,dp14,dp15,dp16,dp17,dp18,dp19,dp20,dp21,dp22;
Label rp1,rp2,rp3,rp4,rp5,rp6,rp7,rp8,rp9,rp10,rp11,rp12,rp13,rp14,rp15,rp16,rp17,rp18,rp19,rp20,rp21,rp22;
int pr1=0,pr2=0,pr3=0,pr4=0,pr5=0,pr6=0,pr7=0,pr8=0,pr9=0,pr10=0,pr11=0,pr12=0,pr13=0,pr14=0,pr15=0,pr16=0,pr17=0,pr18=0,pr19=0,pr20=0,pr21=0;
Label bp1,bp2,bp3,bp4,bp5,bp6,bp7,bp8,bp9,bp10,bp11,bp12,bp13,bp14,bp15,bp16,bp17,bp18,bp19,bp20,bp21;
int pb1=0,pb2=0,pb3=0,pb4=0,pb5=0,pb6=0,pb7=0,pb8=0,pb9=0,pb10=0,pb11=0,pb12=0,pb13=0,pb14=0,pb15=0,pb16=0,pb17=0,pb18=0,pb19=0,pb20=0,pb21=0;
Label ts1,ts2,ts3,ts4,ts5,ts6,ts7,ts8,ts9,ts10,ts11,ts12,ts13,ts14,ts15,ts16,ts17,ts18,ts19,ts20;
float   st1,st2,st3,st4,st5,st6,st7,st8,st9,st10,st11,st12,st13,st14,st15,st16,st17,st18,st19,st20;

int counter=0;
    cri2(){
  
ts1=new Label("");
	  ts1.setBounds(340,157,40,30);
	  ts1.setBackground(new Color(154,185,85,255));
	  add(ts1);
ts2=new Label("");
	  ts2.setBounds(340,187,40,30);
	  ts2.setBackground(new Color(251,229,200,255));
	  add(ts2);
ts3=new Label("");
	  ts3.setBounds(340,217,40,30);
	  ts3.setBackground(new Color(251,229,200,255));
	  add(ts3);
ts4=new Label("");
	  ts4.setBounds(340,247,40,30);
	  ts4.setBackground(new Color(251,229,200,255));
	  add(ts4);
ts5=new Label("");
	  ts5.setBounds(340,277,40,30);
	  ts5.setBackground(new Color(251,229,200,255));
	  add(ts5);
ts6=new Label("");
	  ts6.setBounds(340,307,40,30);
	  ts6.setBackground(new Color(117,126,133,255));
	  add(ts6);
ts7=new Label("");
	  ts7.setBounds(340,337,40,30);
	  ts7.setBackground(new Color(117,126,133,255));
	  add(ts7);
ts8=new Label("");
	  ts8.setBounds(340,367,40,30);
	  ts8.setBackground(new Color(117,126,133,255));
	  add(ts8);
ts9=new Label("");
	  ts9.setBounds(340,397,40,30);
	  ts9.setBackground(new Color(117,126,133,255));
	  add(ts9);
ts10=new Label("");
	  ts10.setBounds(340,427,40,30);
	  ts10.setBackground(new Color(117,126,133,255));
	  add(ts10);

ts11=new Label("");
	  ts11.setBounds(760,157,40,30);
	  ts11.setBackground(new Color(251,211,176,255));
	  add(ts11);
ts12=new Label("");
	  ts12.setBounds(760,187,40,30);
	  ts12.setBackground(new Color(251,211,176,255));
	  add(ts12);
ts13=new Label("");
	  ts13.setBounds(760,217,40,30);
	  ts13.setBackground(new Color(251,211,176,255));
	  add(ts13);
ts14=new Label("");
	  ts14.setBounds(760,247,40,30);
	  ts14.setBackground(new Color(251,211,176,255));
	  add(ts14);
ts15=new Label("");
	  ts15.setBounds(760,277,40,30);
	  ts15.setBackground(new Color(117,126,133,255));
	  add(ts15);
ts16=new Label("");
	  ts16.setBounds(760,307,40,30);
	  ts16.setBackground(new Color(154,185,85,255));
	  add(ts16);
ts17=new Label("");
	  ts17.setBounds(760,337,40,30);
	  ts17.setBackground(new Color(154,185,85,255));
	  add(ts17);	 
ts18=new Label("");
	  ts18.setBounds(760,367,40,30);
	  ts18.setBackground(new Color(154,185,85,255));
	  add(ts18);
ts19=new Label("");
	  ts19.setBounds(760,397,40,30);
	  ts19.setBackground(new Color(154,185,85,255));
	  add(ts19);
ts20=new Label("");
	  ts20.setBounds(760,427,40,30);
	  ts20.setBackground(new Color(183,30,26,255));
	  add(ts20);
  
bp1=new Label("");
	  bp1.setBounds(300,157,30,30);
	  bp1.setBackground(new Color(154,185,85,255));
	  add(bp1);
bp2=new Label("");
	  bp2.setBounds(300,187,30,30);
	  bp2.setBackground(new Color(154,185,85,255));
	  add(bp2);
bp3=new Label("");
	  bp3.setBounds(300,217,30,30);
	  bp3.setBackground(new Color(251,229,200,255));
	  add(bp3);
bp4=new Label("");
	  bp4.setBounds(300,247,30,30);
	  bp4.setBackground(new Color(251,229,200,255));
	  add(bp4);
bp5=new Label("");
	  bp5.setBounds(300,277,30,30);
	  bp5.setBackground(new Color(251,229,200,255));
	  add(bp5);
bp6=new Label("");
	  bp6.setBounds(300,307,30,30);
	  bp6.setBackground(new Color(154,185,85,255));
	  add(bp6);
bp7=new Label("");
	  bp7.setBounds(300,337,30,30);
	  bp7.setBackground(new Color(154,185,85,255));
	  add(bp7);
bp8=new Label("");
	  bp8.setBounds(300,367,30,30);
	  bp8.setBackground(new Color(154,185,85,255));
	  add(bp8);
bp9=new Label("");
	  bp9.setBounds(300,397,30,30);
	  bp9.setBackground(new Color(117,126,133,255));
	  add(bp9);
bp10=new Label("");
	  bp10.setBounds(300,427,30,30);
	  bp10.setBackground(new Color(117,126,133,255));
	  add(bp10);

bp12=new Label("");
	  bp12.setBounds(720,157,30,30);
	  bp12.setBackground(new Color(251,211,176,255));
	  add(bp12);
bp13=new Label("");
	  bp13.setBounds(720,187,30,30);
	  bp13.setBackground(new Color(251,211,176,255));
	  add(bp13);
bp14=new Label("");
	  bp14.setBounds(720,217,30,30);
	  bp14.setBackground(new Color(251,211,176,255));
	  add(bp14);
bp15=new Label("");
	  bp15.setBounds(720,247,30,30);
	  bp15.setBackground(new Color(251,211,176,255));
	  add(bp15);
bp16=new Label("");
	  bp16.setBounds(720,277,30,30);
	  bp16.setBackground(new Color(251,211,176,255));
	  add(bp16);
bp17=new Label("");
	  bp17.setBounds(720,307,30,30);
	  bp17.setBackground(new Color(251,211,176,255));
	  add(bp17);
bp18=new Label("");
	  bp18.setBounds(720,337,30,30);
	  bp18.setBackground(new Color(117,126,133,255));
	  add(bp18);	 
bp19=new Label("");
	  bp19.setBounds(720,367,30,30);
	  bp19.setBackground(new Color(154,185,85,255));
	  add(bp19);
bp20=new Label("");
	  bp20.setBounds(720,397,30,30);
	  bp20.setBackground(new Color(154,185,85,255));
	  add(bp20);
bp21=new Label("");
	  bp21.setBounds(720,427,30,30);
	  bp21.setBackground(new Color(154,185,85,255));
	  add(bp21);	  

dp1=new Label("",Label.CENTER);
	  dp1.setBounds(195,157,60,30);
	  dp1.setBackground(new Color(154,185,85,255));
	  add(dp1);
dp2=new Label("",Label.CENTER);
	  dp2.setBounds(195,187,60,30);
	  dp2.setBackground(new Color(154,185,85,255));
	  add(dp2);
dp3=new Label("",Label.CENTER);
	  dp3.setBounds(195,217,60,30);
	  dp3.setBackground(new Color(154,185,85,255));
	  add(dp3);
dp4=new Label("",Label.CENTER);
	  dp4.setBounds(195,247,60,30);
	  dp4.setBackground(new Color(154,185,85,255));
	  add(dp4);
dp5=new Label("",Label.CENTER);
	  dp5.setBounds(195,277,60,30);
	  dp5.setBackground(new Color(154,185,85,255));
	  add(dp5);
dp6=new Label("",Label.CENTER);
	  dp6.setBounds(195,307,60,30);
	  dp6.setBackground(new Color(154,185,85,255));
	  add(dp6);
dp7=new Label("",Label.CENTER);
	  dp7.setBounds(195,337,60,30);
	  dp7.setBackground(new Color(154,185,85,255));
	  add(dp7);
dp8=new Label("",Label.CENTER);
	  dp8.setBounds(195,367,60,30);
	  dp8.setBackground(new Color(154,185,85,255));
	  add(dp8);
dp9=new Label("",Label.CENTER);
	  dp9.setBounds(195,397,60,30);
	  dp9.setBackground(new Color(154,185,85,255));
	  add(dp9);
dp10=new Label("",Label.CENTER);
	  dp10.setBounds(195,427,60,30);
	  dp10.setBackground(new Color(154,185,85,255));
	  add(dp10);
dp11=new Label("",Label.CENTER);
	  dp11.setBounds(195,457,60,30);
	  dp11.setBackground(new Color(154,185,85,255));
	  add(dp11);
dp12=new Label("",Label.CENTER);
	  dp12.setBounds(615,157,60,30);
	  dp12.setBackground(new Color(251,211,176,255));
	  add(dp12);
dp13=new Label("",Label.CENTER);
	  dp13.setBounds(615,187,60,30);
	  dp13.setBackground(new Color(251,211,176,255));
	  add(dp13);
dp14=new Label("",Label.CENTER);
	  dp14.setBounds(615,217,60,30);
	  dp14.setBackground(new Color(251,211,176,255));
	  add(dp14);
dp15=new Label("",Label.CENTER);
	  dp15.setBounds(615,247,60,30);
	  dp15.setBackground(new Color(251,211,176,255));
	  add(dp15);
dp16=new Label("",Label.CENTER);
	  dp16.setBounds(615,277,60,30);
	  dp16.setBackground(new Color(251,211,176,255));
	  add(dp16);
dp17=new Label("",Label.CENTER);
	  dp17.setBounds(615,307,60,30);
	  dp17.setBackground(new Color(251,211,176,255));
	  add(dp17);
dp18=new Label("",Label.CENTER);
	  dp18.setBounds(615,337,60,30);
	  dp18.setBackground(new Color(251,211,176,255));
	  add(dp18);	 
dp19=new Label("",Label.CENTER);
	  dp19.setBounds(615,367,60,30);
	  dp19.setBackground(new Color(251,211,176,255));
	  add(dp19);
dp20=new Label("",Label.CENTER);
	  dp20.setBounds(615,397,60,30);
	  dp20.setBackground(new Color(117,126,133,255));
	  add(dp20);
dp21=new Label("",Label.CENTER);
	  dp21.setBounds(615,427,60,30);
	  dp21.setBackground(new Color(117,126,133,255));
	  add(dp21);
dp22=new Label("",Label.CENTER);
	  dp22.setBounds(615,457,60,30);
	  dp22.setBackground(new Color(154,185,85,255));
	  add(dp22);	 
	   
rp1=new Label("");
	  rp1.setBounds(260,157,30,30);
	  rp1.setBackground(new Color(154,185,85,255));
	  add(rp1);
rp2=new Label("");
	  rp2.setBounds(260,187,30,30);
	  rp2.setBackground(new Color(154,185,85,255));
	  add(rp2);
rp3=new Label("");
	  rp3.setBounds(260,217,30,30);
	  rp3.setBackground(new Color(154,185,85,255));
	  add(rp3);
rp4=new Label("");
	  rp4.setBounds(260,247,30,30);
	  rp4.setBackground(new Color(154,185,85,255));
	  add(rp4);
rp5=new Label("");
	  rp5.setBounds(260,277,30,30);
	  rp5.setBackground(new Color(154,185,85,255));
	  add(rp5);
rp6=new Label("");
	  rp6.setBounds(260,307,30,30);
	  rp6.setBackground(new Color(154,185,85,255));
	  add(rp6);
rp7=new Label("");
	  rp7.setBounds(260,337,30,30);
	  rp7.setBackground(new Color(154,185,85,255));
	  add(rp7);
rp8=new Label("");
	  rp8.setBounds(260,367,30,30);
	  rp8.setBackground(new Color(154,185,85,255));
	  add(rp8);
rp9=new Label("");
	  rp9.setBounds(260,397,30,30);
	  rp9.setBackground(new Color(154,185,85,255));
	  add(rp9);
rp10=new Label("");
	  rp10.setBounds(260,427,30,30);
	  rp10.setBackground(new Color(154,185,85,255));
	  add(rp10);
rp11=new Label("");
	  rp11.setBounds(260,457,30,30);
	  rp11.setBackground(new Color(117,126,133,255));
	  add(rp11);
rp12=new Label("");
	  rp12.setBounds(680,157,30,30);
	  rp12.setBackground(new Color(251,211,176,255));
	  add(rp12);
rp13=new Label("");
	  rp13.setBounds(680,187,30,30);
	  rp13.setBackground(new Color(251,211,176,255));
	  add(rp13);
rp14=new Label("");
	  rp14.setBounds(680,217,30,30);
	  rp14.setBackground(new Color(251,211,176,255));
	  add(rp14);
rp15=new Label("");
	  rp15.setBounds(680,247,30,30);
	  rp15.setBackground(new Color(251,211,176,255));
	  add(rp15);
rp16=new Label("");
	  rp16.setBounds(680,277,30,30);
	  rp16.setBackground(new Color(251,211,176,255));
	  add(rp16);
rp17=new Label("");
	  rp17.setBounds(680,307,30,30);
	  rp17.setBackground(new Color(251,211,176,255));
	  add(rp17);
rp18=new Label("");
	  rp18.setBounds(680,337,30,30);
	  rp18.setBackground(new Color(251,211,176,255));
	  add(rp18);	 
rp19=new Label("");
	  rp19.setBounds(680,367,30,30);
	  rp19.setBackground(new Color(117,126,133,255));
	  add(rp19);
rp20=new Label("");
	  rp20.setBounds(680,397,30,30);
	  rp20.setBackground(new Color(154,185,85,255));
	  add(rp20);
rp21=new Label("");
	  rp21.setBounds(680,427,30,30);
	  rp21.setBackground(new Color(154,185,85,255));
	  add(rp21);
rp22=new Label("");
	  rp22.setBounds(680,457,30,30);
	  rp22.setBackground(new Color(154,185,85,255));
	  add(rp22);	   
	  


	   //input section
	   tname=new Label("Team Name",Label.CENTER);
       tname.setBounds(985,120,100,30);
	   tname.setBackground(new Color(67,88,28,255));
       add(tname);
	   //input field
	   fnames=new TextField(" ");
	   fnames.setBounds(970,155,120,40);
	   add(fnames);
	   //input buttons
	   submit=new Button("Submit");
	   submit.setBounds(970,195,60,25);
	   add(submit);
	   reset=new Button("Reset");
	   reset.setBounds(1030,195,60,25);
	   add(reset);
	   //current balls
	   over=new Label("Current over:");
	  over.setBounds(970,240,75,20);
	  over.setBackground(new Color(118,144,54,255));
	  add(over);
	  ball=new Label("Current ball:");
	  ball.setBounds(970,270,70,20);
	  ball.setBackground(new Color(111,144,40,255));
	  add(ball);
	  ballno=new Label(null,Label.CENTER);
	  ballno.setBounds(1050,270,30,20);
	  ballno.setBackground(new Color(111,144,40,255));
	   add(ballno);
	   overno=new Label(null,Label.CENTER);
	   overno.setBounds(1050,240,30,20);
	   overno.setBackground(new Color(118,144,54,255));
	  add(overno);
	  choices=new Label("Possibilities",Label.CENTER);
	  choices.setBounds(1000,320,100,20);
	  choices.setBackground(new Color(125,159,50,255));
	  add(choices);
	  runs=new Label("RUNS:");
	  runs.setBounds(970,350,50,20);
	  runs.setBackground(new Color(125,159,50,255));
	  add(runs);
	  wb=new Label("WIDE BALL:");
	  wb.setBounds(970,380,70,20);
	  wb.setBackground(new Color(125,159,50,255));
	  add(wb);
	  nb=new Label("NO BALL:");
	  nb.setBounds(970,410,60,20);
	  nb.setBackground(new Color(94,24,26,255));
	  add(nb);
      bies=new Label("BIES:");
	  bies.setBounds(970,440,40,20);
	  bies.setBackground(new Color(94,24,26,255));
	  add(bies);
	  fruns=new TextField(" ");
	  fruns.setBounds(1045,350,40,30);
	  add(fruns);
	  fwb=new TextField(" ");
	  fwb.setBounds(1045,380,40,30);
	  add(fwb);
	  fnb=new TextField(" ");
	  fnb.setBounds(1045,410,40,30);
	  add(fnb);
	  fbies=new TextField(" ");
	  fbies.setBounds(1045,440,40,30);
	  add(fbies);
	  s1=new Button("Add");
	  s1.setBounds(1080,350,40,30);
	  add(s1);
	    s2=new Button("Add");
	  s2.setBounds(1080,380,40,30);
	  add(s2);
	    s3=new Button("Add");
	  s3.setBounds(1080,410,40,30);
	  add(s3);
	    s4=new Button("Add");
	  s4.setBounds(1080,440,40,30);
	  add(s4);
	  bowled=new Button("Bowled");
	  bowled.setBounds(1000,480,70,30);
	  add(bowled);
	   rout=new Button("Run out");
	  rout.setBounds(1000,510,70,30);
	  add(rout);
	   caught=new Button("Caught");
	  caught.setBounds(1000,540,70,30);
	  add(caught);
	   stump=new Button("Stump");
	  stump.setBounds(1000,570,70,30);
	  add(stump);
	   lbw=new Button("LBW");
	  lbw.setBounds(1000,600,70,30);
	  add(lbw);
	  
	   //For team names
	   ft1name=new Label(null,Label.CENTER);
	   ft2name=new Label(null,Label.CENTER);
	   
	   //bound set for names
	   ft1name.setBounds(210,40,155,30);
	   ft1name.setBackground(new Color(132,158,53,255));
	   ft2name.setBounds(460,40,155,30);
	   ft2name.setBackground(new Color(255,225,189,255));
		
		//Add names fields
		add(ft1name);
		add(ft2name);
		
		//add vs label
		vs=new Label("VS");
		vs.setBounds(395,40,40,40);
		vs.setBackground(new Color(132,158,53,255));
		add(vs);
		
		t1in=new Label("Team 1 Innings");
		t1in.setBounds(80,80,150,30);
		t1in.setBackground(new Color(184,201,94,255));
		add(t1in);
		
		t2in=new Label("Team 2 Innings");
		t2in.setBounds(500,80,150,30);
		t2in.setBackground(new Color(251,211,176,255));
		add(t2in);
		
		//player numbering label
		p1=new Label("1.");
		p1.setBounds(55,160,20,20);
		p1.setBackground(new Color(222,243,123,255));
		add(p1);
		p2=new Label("2.");
		p2.setBounds(55,190,20,20);
		p2.setBackground(new Color(222,243,123,255));
		add(p2);
		p3=new Label("3.");
		p3.setBounds(55,220,20,20);
		p3.setBackground(new Color(222,243,123,255));
		add(p3);
		p4=new Label("4.");
		p4.setBounds(55,250,20,20);
		p4.setBackground(new Color(222,243,123,255));
		add(p4);
		p5=new Label("5.");
		p5.setBounds(55,280,20,20);
		p5.setBackground(new Color(222,243,123,255));
		add(p5);
		p6=new Label("6.");
		p6.setBounds(55,310,20,20);
		p6.setBackground(new Color(222,243,123,255));
		add(p6);
		p7=new Label("7.");
		p7.setBounds(55,340,20,20);
		p7.setBackground(new Color(222,243,123,255));
		add(p7);
		p8=new Label("8.");
		p8.setBounds(55,370,20,20);
		p8.setBackground(new Color(222,243,123,255));
		add(p8);
		p9=new Label("9.");
		p9.setBounds(55,400,20,20);
		p9.setBackground(new Color(222,243,123,255));
		add(p9);
		p10=new Label("10.");
		p10.setBounds(55,430,20,20);
		p10.setBackground(new Color(222,243,123,255));
		add(p10);
		p11=new Label("11.");
		p11.setBounds(55,460,20,20);
		p11.setBackground(new Color(222,243,123,255));
		add(p11);
		pp1=new Label("1.");
		pp1.setBounds(475,160,20,20);
		pp1.setBackground(new Color(251,211,176,255));
		add(pp1);
		pp2=new Label("2.");
		pp2.setBounds(475,190,20,20);
		pp2.setBackground(new Color(251,211,176,255));
		add(pp2);
		pp3=new Label("3.");
		pp3.setBounds(475,220,20,20);
		pp3.setBackground(new Color(251,211,176,255));
		add(pp3);
		pp4=new Label("4.");
		pp4.setBounds(475,250,20,20);
		pp4.setBackground(new Color(251,211,176,255));
		add(pp4);
		pp5=new Label("5.");
		pp5.setBounds(475,280,20,20);
		pp5.setBackground(new Color(251,211,176,255));
		add(pp5);
		pp6=new Label("6.");
		pp6.setBounds(475,310,20,20);
		pp6.setBackground(new Color(251,211,176,255));
		add(pp6);
		pp7=new Label("7.");
		pp7.setBounds(475,340,20,20);
		pp7.setBackground(new Color(117,126,133,255));
		add(pp7);
		pp8=new Label("8.");
		pp8.setBounds(475,370,20,20);
		pp8.setBackground(new Color(117,126,133,255));
		add(pp8);
		pp9=new Label("9.");
		pp9.setBounds(475,400,20,20);
		pp9.setBackground(new Color(117,126,133,255));
		add(pp9);
		pp10=new Label("10.");
		pp10.setBounds(475,430,20,20);
		pp10.setBackground(new Color(117,126,133,255));
		add(pp10);
		pp11=new Label("11.");
		pp11.setBounds(475,460,20,20);
		pp11.setBackground(new Color(117,126,133,255));
		add(pp11);
		
		//labels of statistics
		name=new Label("NAME",Label.CENTER);
		name.setBounds(80,130,50,20);
		name.setBackground(new Color(222,243,123,255));
		add(name);
		dis=new Label("Dismissal",Label.CENTER);
		dis.setBounds(195,130,60,20);
		dis.setBackground(new Color(154,185,85,255));
		add(dis);
		r=new Label("Runs",Label.CENTER);
		r.setBounds(260,130,30,20);
		r.setBackground(new Color(154,185,85,255));
		add(r);
		b=new Label("Balls",Label.CENTER);
		b.setBounds(300,130,30,20);
		b.setBackground(new Color(154,185,85,255));
		add(b);
	
		sr=new Label("S/R",Label.CENTER);
		sr.setBounds(340,130,40,20);
		sr.setBackground(new Color(154,185,85,255));
		add(sr);
		
		name2=new Label("NAME",Label.CENTER);
		name2.setBounds(500,130,50,20);
		name2.setBackground(new Color(251,211,176,255));
		add(name2);
		dis2=new Label("Dismissal",Label.CENTER);
		dis2.setBounds(615,130,60,20);
		dis2.setBackground(new Color(251,211,176,255));
		add(dis2);
		r2=new Label("Runs",Label.CENTER);
		r2.setBounds(680,130,30,20);
		r2.setBackground(new Color(251,211,176,255));
		add(r2);
		b2=new Label("Balls",Label.CENTER);
		b2.setBounds(720,130,30,20);
		b2.setBackground(new Color(251,211,176,255));
		add(b2);
		
		sr2=new Label("S/R",Label.CENTER);
		sr2.setBounds(760,130,40,20);
		sr2.setBackground(new Color(251,211,176,255));
		add(sr2);
		
		// For score and wickets
		t1=new Label("Team 1:",Label.CENTER);
		t1.setBounds(180,615,60,30);
		t1.setBackground(new Color(117,126,133,255));
		add(t1);
		t2=new Label("Team 2:",Label.CENTER);
		t2.setBounds(610,615,60,30);
		t2.setBackground(new Color(222,243,123,255));
		add(t2);
		fr=new TextField(" ");
        fr.setBounds(250,615,40,30);
		add(fr);
		slash=new Label("/",Label.CENTER);
		slash.setBounds(295,615,10,30);
		slash.setBackground(new Color(117,126,133,255));
		add(slash);
		fw=new TextField(" ");
        fw.setBounds(310,615,30,30);
		add(fw);
		
		fr2=new TextField(" ");
        fr2.setBounds(680,615,40,30);
		add(fr2);
		slash2=new Label("/",Label.CENTER);
		slash2.setBounds(725,615,10,30);
		slash2.setBackground(new Color(222,243,123,255));
		add(slash2);
		fw2=new TextField(" ");
        fw2.setBounds(740,615,30,30);
		add(fw2);
		
		
		// For Team 1 Text Field
       
        ft1p1=new Label(" ");
        ft1p2=new Label(" ");
        ft1p3=new Label(" ");
        ft1p4=new Label(" ");
        ft1p5=new Label(" ");
        ft1p6=new Label(" ");
        ft1p7=new Label(" ");
        ft1p8=new Label(" ");
        ft1p9=new Label(" ");
        ft1p10=new Label(" ");
        ft1p11=new Label(" ");
        ft1f0=new TextField( );
        ft1f1=new TextField( );
        ft1f2=new TextField( );
        ft1f3=new TextField( );
        // set bounds text field Team 1
       
        ft1p1.setBounds(80, 157, 100, 25);
		ft1p1.setBackground(new Color(222,243,123,255));
        ft1p2.setBounds(80, 187, 100, 25);
		ft1p2.setBackground(new Color(222,243,123,255));
        ft1p3.setBounds(80, 217, 100, 25);
		ft1p3.setBackground(new Color(222,243,123,255));
        ft1p4.setBounds(80, 247, 100, 25);
		ft1p4.setBackground(new Color(222,243,123,255));
        ft1p5.setBounds(80, 277, 100, 25);
		ft1p5.setBackground(new Color(222,243,123,255));
        ft1p6.setBounds(80, 307, 100, 25);
		ft1p6.setBackground(new Color(222,243,123,255));
        ft1p7.setBounds(80, 337, 100, 25);
		ft1p7.setBackground(new Color(222,243,123,255));
        ft1p8.setBounds(80, 367, 100, 25);
		ft1p8.setBackground(new Color(222,243,123,255));
        ft1p9.setBounds(80, 397, 100, 25);
		ft1p9.setBackground(new Color(222,243,123,255));
        ft1p10.setBounds(80, 427, 100, 25);
		ft1p10.setBackground(new Color(222,243,123,255));
        ft1p11.setBounds(80, 457, 100, 25);
		ft1p11.setBackground(new Color(222,243,123,255));
        ft1f0.setBounds(110, 560, 40, 30);
        ft1f1.setBounds(150, 560, 40, 30);
        ft1f2.setBounds(190, 560, 40, 30);
        ft1f3.setBounds(230, 560, 40, 30);
        // for Team 2 Text Field
       
        f2t2p1=new Label(" ");
        f2t2p2=new Label(" ");
        f2t2p3=new Label(" ");
        f2t2p4=new Label(" ");
        f2t2p5=new Label(" ");
        f2t2p6=new Label(" ");
        f2t2p7=new Label(" ");
        f2t2p8=new Label(" ");
        f2t2p9=new Label(" ");
        f2t2p10=new Label(" ");
        f2t2p11=new Label(" ");
         f2t2f0=new TextField( );
         f2t2f1=new TextField( );
         f2t2f2=new TextField( );
         f2t2f3=new TextField( );
        // set bounds text field team 2
       
        f2t2p1.setBounds(500, 157, 100, 25);
		f2t2p1.setBackground(new Color(251,211,176,255));
        f2t2p2.setBounds(500, 187, 100, 25);
		f2t2p2.setBackground(new Color(251,211,176,255));
        f2t2p3.setBounds(500, 217, 100, 25);
		f2t2p3.setBackground(new Color(251,211,176,255));
        f2t2p4.setBounds(500, 247, 100, 25);
		f2t2p4.setBackground(new Color(251,211,176,255));
        f2t2p5.setBounds(500, 277, 100, 25);
		f2t2p5.setBackground(new Color(251,211,176,255));
        f2t2p6.setBounds(500, 307, 100, 25);
		f2t2p6.setBackground(new Color(251,211,176,255));
        f2t2p7.setBounds(500, 337, 100, 25);
		f2t2p7.setBackground(new Color(251,211,176,255));
        f2t2p8.setBounds(500, 367, 100, 25);
		f2t2p8.setBackground(new Color(117,126,133,255));
        f2t2p9.setBounds(500, 397, 100, 25);
		f2t2p9.setBackground(new Color(117,126,133,255));
        f2t2p10.setBounds(500,427, 100, 25);
		f2t2p10.setBackground(new Color(117,126,133,255));
        f2t2p11.setBounds(500, 457, 100, 25);
		f2t2p11.setBackground(new Color(117,126,133,255));
        f2t2f0.setBounds(530, 560, 40, 30);
        f2t2f1.setBounds(570, 560, 40, 30);
        f2t2f2.setBounds(610, 560, 40, 30);
        f2t2f3.setBounds(650, 560, 40, 30);
        // Label team 1
       
        l1t1=new Label("Extras:",Label.CENTER);
        l2t1=new Label("Total");
        l3t1=new Label("WB");
        l4t1=new Label("Bies");
        l5t1=new Label("NB");
       
        // Bounds of label team 1
       
        l1t1.setBounds(55, 560, 50, 30);
		l1t1.setBackground(new Color(222,243,123,255));
        l2t1.setBounds(110, 530, 40, 30);
		l2t1.setBackground(new Color(222,243,123,255));
        l3t1.setBounds(150, 530, 40, 30);
		l3t1.setBackground(new Color(117,126,133,255));
        l4t1.setBounds(190, 530, 40, 30);
		l4t1.setBackground(new Color(117,126,133,255));
        l5t1.setBounds(230, 530, 40, 30);
		l5t1.setBackground(new Color(117,126,133,255));
       
       
        // Label team 2
        l1t2=new Label("Extras:",Label.CENTER);
        l2t2=new Label("Total");
        l3t2=new Label("WB");
        l4t2=new Label("Bies");
        l5t2=new Label("NB");
       
        //Bounds of Label team 2
        l1t2.setBounds(475, 560, 50, 30);
		l1t2.setBackground(new Color(154,185,85,255));
        l2t2.setBounds(530, 530, 40, 30);
		l2t2.setBackground(new Color(154,185,85,255));
        l3t2.setBounds(570, 530, 40, 30);
		l3t2.setBackground(new Color(154,185,85,255));
        l4t2.setBounds(610, 530, 40, 30);
		l4t2.setBackground(new Color(154,185,85,255));
        l5t2.setBounds(650, 530, 40, 30);
		l5t2.setBackground(new Color(154,185,85,255));
         
        

       submit.addActionListener(this);
       
       
        // add text field team 1
       
        add(ft1p1);
        add(ft1p2);
        add(ft1p3);
        add(ft1p4);
        add(ft1p5);
        add(ft1p6);
        add(ft1p7);
        add(ft1p8);
        add(ft1p9);
        add(ft1p10);
        add(ft1p11);
        add(ft1f0);
        add(ft1f1);
        add(ft1f2);
        add(ft1f3);
       
       
       
       
        //add text field team 2
        add(f2t2p1);
        add(f2t2p2);
        add(f2t2p3);
        add(f2t2p4);
        add(f2t2p5);
        add(f2t2p6);
        add(f2t2p7);
        add(f2t2p8);
        add(f2t2p9);
        add(f2t2p10);
        add(f2t2p11);
        add(f2t2f0);
        add(f2t2f1);
        add(f2t2f2);
        add(f2t2f3);
       
        add(l1t1);
        add(l2t1);
        add(l3t1);
        add(l4t1);
        add(l5t1);
       
        add(l1t2);
        add(l2t2);
        add(l3t2);
        add(l4t2);
        add(l5t2);
       
	  JLabel background;
       ImageIcon img=new ImageIcon("back.jpg");
	   background = new JLabel("",img,JLabel.CENTER);
	   background.setBounds(0,0,1200,670);
	   add(background); 
	   
	   
       submit.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
       counter++;
if(counter==1){
ft1name.setText(fnames.getText());
fnames.setText(null);
}
else if(counter==2){
	ft2name.setText(fnames.getText());
fnames.setText(null);
}
else if(counter==3){
	ft1p1.setText(fnames.getText());
fnames.setText(null);
}
else if(counter==4){
	ft1p2.setText(fnames.getText());
fnames.setText(null);
}
else if(counter==5){
	ft1p3.setText(fnames.getText());
fnames.setText(null);
}
else if(counter==6){
	ft1p4.setText(fnames.getText());
fnames.setText(null);
}
else if(counter==7){
	ft1p5.setText(fnames.getText());
fnames.setText(null);
}
else if(counter==8){
	ft1p6.setText(fnames.getText());
fnames.setText(null);
}
else if(counter==9){
	ft1p7.setText(fnames.getText());
fnames.setText(null);
}
else if(counter==10){
	ft1p8.setText(fnames.getText());
fnames.setText(null);
}
else if(counter==11){
	ft1p9.setText(fnames.getText());
fnames.setText(null);
}
else if(counter==12){
	ft1p10.setText(fnames.getText());
fnames.setText(null);
}
else if(counter==13){
	ft1p11.setText(fnames.getText());
fnames.setText(null);
}
else if(counter==14){
	f2t2p1.setText(fnames.getText());
fnames.setText(null);
}
else if(counter==15){
	f2t2p2.setText(fnames.getText());
fnames.setText(null);
}
else if(counter==16){
	f2t2p3.setText(fnames.getText());
fnames.setText(null);
}
else if(counter==17){
	f2t2p4.setText(fnames.getText());
fnames.setText(null);
}
else if(counter==18){
	f2t2p5.setText(fnames.getText());
fnames.setText(null);
}
else if(counter==19){
	f2t2p6.setText(fnames.getText());
fnames.setText(null);
}
 else if(counter==20){
	f2t2p7.setText(fnames.getText());
fnames.setText(null);
}
else if(counter==21){
	f2t2p8.setText(fnames.getText());
fnames.setText(null);
}
else if(counter==22){
	f2t2p9.setText(fnames.getText());
fnames.setText(null);
}
else if(counter==23){
	f2t2p10.setText(fnames.getText());
fnames.setText(null);
}
else if(counter==24){
	f2t2p11.setText(fnames.getText());
fnames.setText(null);
}
else{
	fnames.setText(null);
	
}
}
});

 reset.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
	fnames.setText(null);
	ft1name.setText(null);
	ft2name.setText(null);
	ft1p1.setText(null);
	ft1p2.setText(null);
	ft1p3.setText(null);
	ft1p4.setText(null);
	ft1p5.setText(null);
	ft1p6.setText(null);
	ft1p7.setText(null);
	ft1p8.setText(null);
	ft1p9.setText(null);
	ft1p10.setText(null);
	ft1p11.setText(null);
	f2t2p1.setText(null);
	f2t2p2.setText(null);
	f2t2p3.setText(null);
	f2t2p4.setText(null);
	f2t2p5.setText(null);
	f2t2p6.setText(null);
	f2t2p7.setText(null);
	f2t2p8.setText(null);
	f2t2p9.setText(null);
	f2t2p10.setText(null);
	f2t2p11.setText(null);
    cri2 obj2=new cri2();
	
	   }
 });
 
 ballno.setText(""+balln);
	overno.setText(""+overn);
      fw.setText(""+twickets);
	    fr.setText(""+truns);
		  fw2.setText(""+twickets2);
		    fr2.setText(""+truns2);
			 ft1f0.setText(""+textras);
			   ft1f1.setText(""+twb);
			     ft1f2.setText(""+tbies);
				   ft1f3.setText(""+tnb);
 f2t2f0.setText(""+textras2);
			   f2t2f1.setText(""+twb2);
			     f2t2f2.setText(""+tbies2);
				   f2t2f3.setText(""+tnb2);
				   
				 
       s1.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
		
		
		
		
	  
		
	balln=balln+1;
	if(balln==7){
		overn=overn+1;
		balln=1;
		   }
		   
			   
	ballno.setText(""+balln);
	overno.setText(""+overn);
	
	   if(twickets<10){
       String inputruns=fruns.getText();
       int v=Integer.parseInt(inputruns.trim());
       String totalruns=fr.getText();
	   int v2=Integer.parseInt(totalruns.trim()); 
	   String x=String.valueOf(v+v2);
	   fr.setText(x);
       if(twickets==0){
		   pb1=pb1+1;
		 bp1.setText(""+pb1);
		String curruns=fruns.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr1=pr1+cr;
	   rp1.setText(""+pr1);
       	fruns.setText(null); 
		
		
		String srr=rp1.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp1.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st1=((str*100)/stb);
		ts1.setText(""+st1);
	}   
	    if(twickets==1){
			pb2=pb2+1;
		 bp2.setText(""+pb2);
		String curruns=fruns.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr2=pr2+cr;
	   rp2.setText(""+pr2);
       	fruns.setText(null);
      		
			String srr=rp2.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp2.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st2=((str*100)/stb);
		ts2.setText(""+st2);
	}   
	 if(twickets==2){
		 pb3=pb3+1;
		 bp3.setText(""+pb3);
		String curruns=fruns.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr3=pr3+cr;
	   rp3.setText(""+pr3);
       	fruns.setText(null); 

      String srr=rp3.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp3.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st3=((str*100)/stb);
		ts3.setText(""+st3);
	}   
	 if(twickets==3){
pb4=pb4+1;
		 bp4.setText(""+pb4);	
	String curruns=fruns.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr4=pr4+cr;
	   rp4.setText(""+pr4);
       	fruns.setText(null); 

     String srr=rp4.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp4.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st4=((str*100)/stb);
		ts4.setText(""+st4);
	}   
	 if(twickets==4){
		 pb5=pb5+1;
		 bp5.setText(""+pb5);
		String curruns=fruns.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr5=pr5+cr;
	   rp5.setText(""+pr5);
       	fruns.setText(null);
		
		String srr=rp5.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp5.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st5=((str*100)/stb);
		ts5.setText(""+st5);
	}   
	 if(twickets==5){
		 pb6=pb6+1;
		 bp6.setText(""+pb6);
		String curruns=fruns.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr6=pr6+cr;
	   rp6.setText(""+pr6);
       	fruns.setText(null); 

     String srr=rp6.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp6.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st6=((str*100)/stb);
		ts6.setText(""+st6);
	}   
	 if(twickets==6){
		 pb7=pb7+1;
		 bp7.setText(""+pb7);
		String curruns=fruns.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr7=pr7+cr;
	   rp7.setText(""+pr7);
       	fruns.setText(null); 
	
	String srr=rp7.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp7.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st7=((str*100)/stb);
		ts7.setText(""+st7);
	}   
	 if(twickets==7){
		 pb8=pb8+1;
		 bp8.setText(""+pb8);
		String curruns=fruns.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr8=pr8+cr;
	   rp8.setText(""+pr8);
       	fruns.setText(null); 

     String srr=rp8.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp8.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st8=((str*100)/stb);
		ts8.setText(""+st8);
	}   
	 if(twickets==8){
		 pb9=pb9+1;
		 bp9.setText(""+pb9);
		String curruns=fruns.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr9=pr9+cr;
	   rp9.setText(""+pr9);
       	fruns.setText(null); 
	
	String srr=rp9.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp9.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st9=((str*100)/stb);
		ts9.setText(""+st9);
	}   
	 if(twickets==9){
		 pb10=pb10+1;
		 bp10.setText(""+pb10);
		String curruns=fruns.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr10=pr10+cr;
	   rp10.setText(""+pr10);
       	fruns.setText(null); 
	
	String srr=rp10.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp10.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st10=((str*100)/stb);
		ts10.setText(""+st10);
	}   
	   }
	   if(twickets==10){
	if(twickets2<11){
	
       String inputruns=fruns.getText();
       int v=Integer.parseInt(inputruns.trim());
       String totalruns=fr2.getText();
	   int v2=Integer.parseInt(totalruns.trim()); 
	   String x=String.valueOf(v+v2);
	   fr2.setText(x);
	   
	   if(twickets2==0){
		   pb11=pb11+1;
		 bp11.setText(""+pb11);
		String curruns=fruns.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr11=pr11+cr;
	   rp11.setText(""+pr11);
       	fruns.setText(null); 
       
	  
	}   
	    if(twickets2==1){
			pb12=pb12+1;
		 bp12.setText(""+pb12);
		String curruns=fruns.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr12=pr12+cr;
	   rp12.setText(""+pr12);
       	fruns.setText(null); 
	
	String srr=rp12.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp12.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st11=((str*100)/stb);
		ts11.setText(""+st11);
	}   
	 if(twickets2==2){
		 pb13=pb13+1;
		 bp13.setText(""+pb13);
		String curruns=fruns.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr13=pr13+cr;
	   rp13.setText(""+pr13);
       	fruns.setText(null); 
	
	String srr=rp13.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp13.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st12=((str*100)/stb);
		ts12.setText(""+st12);
	}   
	 if(twickets2==3){
		 pb14=pb14+1;
		 bp14.setText(""+pb14);
		String curruns=fruns.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr14=pr14+cr;
	   rp14.setText(""+pr14);
       	fruns.setText(null); 
	
	String srr=rp14.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp14.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st13=((str*100)/stb);
		ts13.setText(""+st13);
	}   
	 if(twickets2==4){
		 pb15=pb15+1;
		 bp15.setText(""+pb15);
		String curruns=fruns.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr15=pr15+cr;
	   rp15.setText(""+pr15);
       	fruns.setText(null); 
	
	String srr=rp15.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp15.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st14=((str*100)/stb);
		ts14.setText(""+st14);
	}   
	 if(twickets2==5){
		 pb16=pb16+1;
		 bp16.setText(""+pb16);
		String curruns=fruns.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr16=pr16+cr;
	   rp16.setText(""+pr16);
       	fruns.setText(null); 
	
	String srr=rp16.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp16.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st15=((str*100)/stb);
		ts15.setText(""+st15);
	}   
	 if(twickets2==6){
		 pb17=pb17+1;
		 bp17.setText(""+pb17);
		String curruns=fruns.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr17=pr17+cr;
	   rp17.setText(""+pr17);
       	fruns.setText(null); 
	
	String srr=rp17.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp17.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st16=((str*100)/stb);
		ts16.setText(""+st16);
	}   
	 if(twickets2==7){
		 pb18=pb18+1;
		 bp18.setText(""+pb18);
		String curruns=fruns.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr18=pr18+cr;
	   rp18.setText(""+pr18);
       	fruns.setText(null); 
	
	String srr=rp18.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp18.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st17=((str*100)/stb);
		ts17.setText(""+st17);
	}   
	 if(twickets2==8){
		 pb19=pb19+1;
		 bp19.setText(""+pb19);
		String curruns=fruns.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr19=pr19+cr;
	   rp19.setText(""+pr19);
       	fruns.setText(null); 

      String srr=rp19.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp19.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st18=((str*100)/stb);
		ts18.setText(""+st18);
	}   
	 if(twickets2==9){
		 pb20=pb20+1;
		 bp20.setText(""+pb20);
		String curruns=fruns.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr20=pr20+cr;
	   rp20.setText(""+pr20);
       	fruns.setText(null); 
     
	 String srr=rp20.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp20.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st19=((str*100)/stb);
		ts19.setText(""+st19);
	}   
	if(twickets2==10){
		pb21=pb21+1;
		 bp21.setText(""+pb21);
		String curruns=fruns.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr21=pr21+cr;
	   rp21.setText(""+pr21);
       	fruns.setText(null); 
	 String srr=rp21.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp21.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st20=((str*100)/stb);
		ts20.setText(""+st20);
	}   
	   }
	   }
	   
	}
});
 
   s2.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
  if(twickets<10){
       String inputruns=fwb.getText();
       int v=Integer.parseInt(inputruns.trim());
       String totalruns=fr.getText();
	   int v2=Integer.parseInt(totalruns.trim()); 
	   String x=String.valueOf(v+v2);
	   fr.setText(x);
	   fwb.setText(null);
	   
	   twb=twb+1;
	   textras=textras+1;
	   ft1f0.setText(""+textras);
	   ft1f1.setText(""+twb);
	   
	   }
	   if(twickets==10){
	if(twickets2<11){
       String inputruns=fwb.getText();
       int v=Integer.parseInt(inputruns.trim());
       String totalruns=fr2.getText();
	   int v2=Integer.parseInt(totalruns.trim()); 
	   String x=String.valueOf(v+v2);
	   fr2.setText(x);
	   fwb.setText(null);
	   
	     twb2=twb2+1;
	   textras2=textras2+1;
	   f2t2f0.setText(""+textras2);
	   f2t2f1.setText(""+twb2);
	   }
	}
   }
   });
   
   s3.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
  if(twickets<10){
       String inputruns=fnb.getText();
       int v=Integer.parseInt(inputruns.trim());
       String totalruns=fr.getText();
	   int v2=Integer.parseInt(totalruns.trim()); 
	   String x=String.valueOf(v+v2);
	   fr.setText(x);
	    if(twickets==0){
		String curruns=fnb.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr1=pr1+cr;
	   pr1=pr1-1;
	   rp1.setText(""+pr1);
       	fnb.setText(null); 
		
		String srr=rp1.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp1.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st1=((str*100)/stb);
		ts1.setText(""+st1);
	}   
	    if(twickets==1){
		String curruns=fnb.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr2=pr2+cr;
	   pr2=pr2-1;
	   rp2.setText(""+pr2);
       	fnb.setText(null); 
		
		String srr=rp2.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp2.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st2=((str*100)/stb);
		ts2.setText(""+st2);
	}   
	 if(twickets==2){
		String curruns=fnb.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr3=pr3+cr;
	   pr3=pr3-1;
	   rp3.setText(""+pr3);
       	fnb.setText(null); 
		
		 String srr=rp3.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp3.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st3=((str*100)/stb);
		ts3.setText(""+st3);
	}   
	 if(twickets==3){
		String curruns=fnb.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr4=pr4+cr;
	   pr4=pr4-1;
	   rp4.setText(""+pr4);
       	fnb.setText(null); 
		
		 String srr=rp4.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp4.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st4=((str*100)/stb);
		ts4.setText(""+st4);
	}   
	 if(twickets==4){
		String curruns=fnb.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr5=pr5+cr;
	    pr5=pr5-1;
	   rp5.setText(""+pr5);
       	fnb.setText(null); 
		
		 String srr=rp5.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp5.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st5=((str*100)/stb);
		ts5.setText(""+st5);
	}   
	 if(twickets==5){
		String curruns=fnb.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr6=pr6+cr;
	    pr6=pr6-1;
	   rp6.setText(""+pr6);
       	fnb.setText(null); 
		
		 String srr=rp6.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp6.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st6=((str*100)/stb);
		ts6.setText(""+st6);
	}   
	 if(twickets==6){
		String curruns=fnb.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr7=pr7+cr;
	    pr7=pr7-1;
	   rp7.setText(""+pr7);
       	fnb.setText(null);

 String srr=rp7.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp7.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st7=((str*100)/stb);
		ts7.setText(""+st7);		
	}   
	 if(twickets==7){
		String curruns=fnb.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr8=pr8+cr;
	    pr8=pr8-1;
	   rp8.setText(""+pr8);
       	fnb.setText(null); 
	
	 String srr=rp8.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp8.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st8=((str*100)/stb);
		ts8.setText(""+st8);
	}   
	 if(twickets==8){
		String curruns=fnb.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr9=pr9+cr;
	    pr9=pr9-1;
	   rp9.setText(""+pr9);
       	fnb.setText(null);

 String srr=rp9.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp9.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st9=((str*100)/stb);
		ts9.setText(""+st9);		
	}   
	 if(twickets==9){
		String curruns=fnb.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr10=pr10+cr;
	    pr10=pr10-1;
	   rp10.setText(""+pr10);
       	fnb.setText(null); 
	
	 String srr=rp10.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp10.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st10=((str*100)/stb);
		ts10.setText(""+st10);
	} 
	   
	   tnb=tnb+1;
	   textras=textras+1;
	   ft1f0.setText(""+textras);
	   ft1f3.setText(""+tnb);
	   }
	   if(twickets==10){
	if(twickets2<11){
	
       String inputruns=fnb.getText();
       int v=Integer.parseInt(inputruns.trim());
       String totalruns=fr2.getText();
	   int v2=Integer.parseInt(totalruns.trim()); 
	   String x=String.valueOf(v+v2);
	   fr2.setText(x);
	   if(twickets2==0){
		String curruns=fnb.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr11=pr11+cr;
	   pr11=pr11-1;
	   rp11.setText(""+pr11);
       	fnb.setText(null); 
	}   
	    if(twickets2==1){
		String curruns=fnb.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr12=pr12+cr;
	   pr12=pr12-1;
	   rp12.setText(""+pr12);
       	fnb.setText(null); 
		
		String srr=rp12.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp12.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st11=((str*100)/stb);
		ts11.setText(""+st11);
	}   
	 if(twickets2==2){
		String curruns=fnb.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr13=pr13+cr;
	   pr13=pr13-1;
	   rp13.setText(""+pr13);
       	fnb.setText(null); 
		
		String srr=rp13.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp13.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st12=((str*100)/stb);
		ts12.setText(""+st12);
	}   
	 if(twickets2==3){
		String curruns=fnb.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr14=pr14+cr;
	   pr14=pr14-1;
	   rp14.setText(""+pr14);
       	fnb.setText(null);

String srr=rp14.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp14.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st13=((str*100)/stb);
		ts13.setText(""+st13);		
	}   
	 if(twickets2==4){
		String curruns=fnb.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr15=pr15+cr;
	    pr15=pr15-1;
	   rp15.setText(""+pr15);
       	fnb.setText(null); 
	
	String srr=rp15.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp15.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st14=((str*100)/stb);
		ts14.setText(""+st14);
	}   
	 if(twickets2==5){
		String curruns=fnb.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr16=pr16+cr;
	    pr16=pr16-1;
	   rp16.setText(""+pr16);
       	fnb.setText(null); 
	
	String srr=rp16.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp16.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st15=((str*100)/stb);
		ts15.setText(""+st15);
	}   
	 if(twickets2==6){
		String curruns=fnb.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr17=pr17+cr;
	   pr17=pr17-1;
	   rp17.setText(""+pr17);
       	fnb.setText(null);

String srr=rp17.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp17.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st16=((str*100)/stb);
		ts16.setText(""+st16);		
	}   
	 if(twickets2==7){
		String curruns=fnb.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr18=pr18+cr;
	   pr18=pr18-1;
	   rp18.setText(""+pr18);
       	fnb.setText(null); 
	
	String srr=rp18.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp18.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st17=((str*100)/stb);
		ts17.setText(""+st17);
	}   
	 if(twickets2==8){
		String curruns=fnb.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr19=pr19+cr;
	   pr19=pr19-1;
	   rp19.setText(""+pr19);
       	fnb.setText(null); 
	
	String srr=rp19.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp19.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st18=((str*100)/stb);
		ts18.setText(""+st18);
	}   
	 if(twickets2==9){
		String curruns=fnb.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr20=pr20+cr;
	   pr20=pr20-1;
	   rp20.setText(""+pr20);
       	fnb.setText(null);

String srr=rp20.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp20.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st19=((str*100)/stb);
		ts19.setText(""+st19);		
	} 
	 if(twickets2==10){
		String curruns=fnb.getText();
       int cr=Integer.parseInt(curruns.trim());
       pr21=pr21+cr;
	   pr21=pr21-1;
	   rp21.setText(""+pr21);
       	fnb.setText(null);

String srr=rp21.getText();
	   int str=Integer.parseInt(srr.trim()); 
		String srb=bp21.getText();
	   int stb=Integer.parseInt(srb.trim()); 
	   st20=((str*100)/stb);
		ts20.setText(""+st20);		
	} 
	   
	    tnb2=tnb2+1;
	   textras2=textras2+1;
	   f2t2f0.setText(""+textras2);
	   f2t2f3.setText(""+tnb2);
	   }
	}
   }
   });
 
 
  s4.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
	balln=balln+1;
	if(balln==7){
		overn=overn+1;
		balln=1;
		
	}
	ballno.setText(""+balln);
	overno.setText(""+overn);
	
	if(twickets<10){
       String inputruns=fbies.getText();
       int v=Integer.parseInt(inputruns.trim());
       String totalruns=fr.getText();
	   int v2=Integer.parseInt(totalruns.trim()); 
	   String x=String.valueOf(v+v2);
	   fr.setText(x);
	   fbies.setText(null);
	   
	    tbies=tbies+1;
	   textras=textras+1;
	   ft1f0.setText(""+textras);
	   ft1f2.setText(""+tbies);
	   }
	   if(twickets==10){
	if(twickets2<11){
	
       String inputruns=fbies.getText();
       int v=Integer.parseInt(inputruns.trim());
       String totalruns=fr2.getText();
	   int v2=Integer.parseInt(totalruns.trim()); 
	   String x=String.valueOf(v+v2);
	   fr2.setText(x);
	   fbies.setText(null);
	
       tbies2=tbies2+1;
	   textras2=textras2+1;
	   f2t2f0.setText(""+textras2);
	   f2t2f2.setText(""+tbies2);
	}
	}
	}
});
 
  bowled.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
	  balln=balln+1;
	if(balln==7){
		overn=overn+1;
		balln=1;
		
	}
	ballno.setText(""+balln);
	overno.setText(""+overn);
	
	if(twickets<10){
		twickets=twickets+1;
	fw.setText(""+twickets);
	String currentwicket=fw.getText();
       int w1=Integer.parseInt(currentwicket.trim());
	   if(w1==1){
		   dp1.setText("Bowled");
	   }
	   if(w1==2){
		   dp2.setText("Bowled");
	   }
	   if(w1==3){
		   dp3.setText("Bowled");
	   }
	   if(w1==4){
		   dp4.setText("Bowled");
	   }
	   if(w1==5){
		   dp5.setText("Bowled");
	   }
	   if(w1==6){
		   dp6.setText("Bowled");
	   }
	   if(w1==7){
		   dp7.setText("Bowled");
	   }
	   if(w1==8){
		   dp8.setText("Bowled");
	   }
	   if(w1==9){
		   dp9.setText("Bowled");
	   }
	   if(w1==10){
		   dp10.setText("Bowled");
	   }
	}
	if(twickets==10){
	if(twickets2<11){
	fw2.setText(""+twickets2);
	twickets2=twickets2+1;
	
	
      String currentwicket2=fw2.getText();
       int w2=Integer.parseInt(currentwicket2.trim());
	if(w2==1){
		   dp12.setText("Bowled");
	   }
	   if(w2==2){
		   dp13.setText("Bowled");
	   }
	   if(w2==3){
		   dp14.setText("Bowled");
	   }
	   if(w2==4){
		   dp15.setText("Bowled");
	   }
	   if(w2==5){
		   dp16.setText("Bowled");
	   }
	   if(w2==6){
		   dp17.setText("Bowled");
	   }
	   if(w2==7){
		   dp18.setText("Bowled");
	   }
	   if(w2==8){
		   dp19.setText("Bowled");
	   }
	   if(w2==9){
		   dp20.setText("Bowled");
	   }
	   if(w2==10){
		   dp21.setText("Bowled");
	   }
	
	}}  
	  if(twickets==10){
		  String totalruns=fr2.getText();
	   int v2=Integer.parseInt(totalruns.trim());
	   if(v2==0){
		  overn=0;
		  balln=1;
		  ballno.setText(""+balln);
	      overno.setText(""+overn);
	   }
	  }
	  if(twickets==10 && twickets2==11){
		  String team1=fr.getText();
       int t1r=Integer.parseInt(team1.trim());
	   String team2=fr2.getText();
       int t2r=Integer.parseInt(team2.trim());
		  if(t1r>t2r){
			  team1 obj=new team1();
		  }
		  if(t2r>t1r){
			  team2 obj=new team2();
		  }
	  }
	  }
  });
 
 rout.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
	  balln=balln+1;
	if(balln==7){
		overn=overn+1;
		balln=1;
		
	}
	ballno.setText(""+balln);
	overno.setText(""+overn);
	
	if(twickets<10){
		twickets=twickets+1;
	fw.setText(""+twickets);
	
	String currentwicket=fw.getText();
       int w1=Integer.parseInt(currentwicket.trim());
	   if(w1==1){
		   dp1.setText("Run Out");
	   }
	   if(w1==2){
		   dp2.setText("Run Out");
	   }
	   if(w1==3){
		   dp3.setText("Run Out");
	   }
	   if(w1==4){
		   dp4.setText("Run Out");
	   }
	   if(w1==5){
		   dp5.setText("Run Out");
	   }
	   if(w1==6){
		   dp6.setText("Run Out");
	   }
	   if(w1==7){
		   dp7.setText("Run Out");
	   }
	   if(w1==8){
		   dp8.setText("Run Out");
	   }
	   if(w1==9){
		   dp9.setText("Run Out");
	   }
	   if(w1==10){
		   dp10.setText("Run Out");
	   }
	}
	if(twickets==10){
		if(twickets2<11){
	fw2.setText(""+twickets2);
	twickets2=twickets2+1;
	String currentwicket2=fw2.getText();
       int w2=Integer.parseInt(currentwicket2.trim());
	if(w2==1){
		   dp12.setText("Run Out");
	   }
	   if(w2==2){
		   dp13.setText("Run Out");
	   }
	   if(w2==3){
		   dp14.setText("Run Out");
	   }
	   if(w2==4){
		   dp15.setText("Run Out");
	   }
	   if(w2==5){
		   dp16.setText("Run Out");
	   }
	   if(w2==6){
		   dp17.setText("Run Out");
	   }
	   if(w2==7){
		   dp18.setText("Run Out");
	   }
	   if(w2==8){
		   dp19.setText("Run Out");
	   }
	   if(w2==9){
		   dp20.setText("Run Out");
	   }
	   if(w2==10){
		   dp21.setText("Run Out");
	   }
	
	}
	}
	if(twickets==10){
		  String totalruns=fr2.getText();
	   int v2=Integer.parseInt(totalruns.trim());
	   if(v2==0){
		  overn=0;
		  balln=1;
		  ballno.setText(""+balln);
	      overno.setText(""+overn);
	   }
	  }
	    if(twickets==10 && twickets2==11){
		  String team1=fr.getText();
       int t1r=Integer.parseInt(team1.trim());
	   String team2=fr2.getText();
       int t2r=Integer.parseInt(team2.trim());
		  if(t1r>t2r){
			  team1 obj=new team1();
		  }
		  if(t2r>t1r){
			  team2 obj=new team2();
		  }
	  }
	  }
  });
  stump.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
	  balln=balln+1;
	if(balln==7){
		overn=overn+1;
		balln=1;
		
	}
	ballno.setText(""+balln);
	overno.setText(""+overn);
	
		if(twickets<10){
		twickets=twickets+1;
	fw.setText(""+twickets);
	String currentwicket=fw.getText();
       int w1=Integer.parseInt(currentwicket.trim());
	   if(w1==1){
		   dp1.setText("Stumps");
	   }
	   if(w1==2){
		   dp2.setText("Stumps");
	   }
	   if(w1==3){
		   dp3.setText("Stumps");
	   }
	   if(w1==4){
		   dp4.setText("Stumps");
	   }
	   if(w1==5){
		   dp5.setText("Stumps");
	   }
	   if(w1==6){
		   dp6.setText("Stumps");
	   }
	   if(w1==7){
		   dp7.setText("Stumps");
	   }
	   if(w1==8){
		   dp8.setText("Stumps");
	   }
	   if(w1==9){
		   dp9.setText("Stumps");
	   }
	   if(w1==10){
		   dp10.setText("Stumps");
	   }
	}
	if(twickets==10){
		if(twickets2<11){
	fw2.setText(""+twickets2);
		twickets2=twickets2+1;
		String currentwicket2=fw2.getText();
       int w2=Integer.parseInt(currentwicket2.trim());
	if(w2==1){
		   dp12.setText("Stumps");
	   }
	   if(w2==2){
		   dp13.setText("Stumps");
	   }
	   if(w2==3){
		   dp14.setText("Stumps");
	   }
	   if(w2==4){
		   dp15.setText("Stumps");
	   }
	   if(w2==5){
		   dp16.setText("Stumps");
	   }
	   if(w2==6){
		   dp17.setText("Stumps");
	   }
	   if(w2==7){
		   dp18.setText("Stumps");
	   }
	   if(w2==8){
		   dp19.setText("Stumps");
	   }
	   if(w2==9){
		   dp20.setText("Stumps");
	   }
	   if(w2==10){
		   dp21.setText("Stumps");
	   }
		}
	}
	if(twickets==10){
		  String totalruns=fr2.getText();
	   int v2=Integer.parseInt(totalruns.trim());
	   if(v2==0){
		  overn=0;
		  balln=1;
		  ballno.setText(""+balln);
	      overno.setText(""+overn);
	   }
	  }
	    if(twickets==10 && twickets2==11){
		  String team1=fr.getText();
       int t1r=Integer.parseInt(team1.trim());
	   String team2=fr2.getText();
       int t2r=Integer.parseInt(team2.trim());
		  if(t1r>t2r){
			  team1 obj=new team1();
		  }
		  if(t2r>t1r){
			  team2 obj=new team2();
		  }
	  }
	  }
  });
  lbw.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
	  balln=balln+1;
	if(balln==7){
		overn=overn+1;
		balln=1;
		
	}
	ballno.setText(""+balln);
	overno.setText(""+overn);
	
		if(twickets<10){
		twickets=twickets+1;
	fw.setText(""+twickets);
	String currentwicket=fw.getText();
       int w1=Integer.parseInt(currentwicket.trim());
	   if(w1==1){
		   dp1.setText("Lbw");
	   }
	   if(w1==2){
		   dp2.setText("Lbw");
	   }
	   if(w1==3){
		   dp3.setText("Lbw");
	   }
	   if(w1==4){
		   dp4.setText("Lbw");
	   }
	   if(w1==5){
		   dp5.setText("Lbw");
	   }
	   if(w1==6){
		   dp6.setText("Lbw");
	   }
	   if(w1==7){
		   dp7.setText("Lbw");
	   }
	   if(w1==8){
		   dp8.setText("Lbw");
	   }
	   if(w1==9){
		   dp9.setText("Lbw");
	   }
	   if(w1==10){
		   dp10.setText("Lbw");
	   }
	}
	if(twickets==10){
		if(twickets2<11){
	fw2.setText(""+twickets2);
		twickets2=twickets2+1;
		String currentwicket2=fw2.getText();
       int w2=Integer.parseInt(currentwicket2.trim());
	if(w2==1){
		   dp12.setText("Lbw");
	   }
	   if(w2==2){
		   dp13.setText("Lbw");
	   }
	   if(w2==3){
		   dp14.setText("Lbw");
	   }
	   if(w2==4){
		   dp15.setText("Lbw");
	   }
	   if(w2==5){
		   dp16.setText("Lbw");
	   }
	   if(w2==6){
		   dp17.setText("Lbw");
	   }
	   if(w2==7){
		   dp18.setText("Lbw");
	   }
	   if(w2==8){
		   dp19.setText("Lbw");
	   }
	   if(w2==9){
		   dp20.setText("Lbw");
	   }
	   if(w2==10){
		   dp21.setText("Lbw");
	   }
		}
	}
	 if(twickets==10){
		  String totalruns=fr2.getText();
	   int v2=Integer.parseInt(totalruns.trim());
	   if(v2==0){
		  overn=0;
		  balln=1;
		  ballno.setText(""+balln);
	      overno.setText(""+overn);
	   }
	  }
	    if(twickets==10 && twickets2==11){
		  String team1=fr.getText();
       int t1r=Integer.parseInt(team1.trim());
	   String team2=fr2.getText();
       int t2r=Integer.parseInt(team2.trim());
		  if(t1r>t2r){
			  team1 obj=new team1();
		  }
		  if(t2r>t1r){
			  team2 obj=new team2();
		  }
	  }
	 }
  });
  caught.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
	  balln=balln+1;
	if(balln==7){
		overn=overn+1;
		balln=1;
		
	}
	ballno.setText(""+balln);
	overno.setText(""+overn);
	
		if(twickets<10){
		twickets=twickets+1;
	fw.setText(""+twickets);
	String currentwicket=fw.getText();
       int w1=Integer.parseInt(currentwicket.trim());
	   if(w1==1){
		   dp1.setText("Caught");
	   }
	   if(w1==2){
		   dp2.setText("Caught");
	   }
	   if(w1==3){
		   dp3.setText("Caught");
	   }
	   if(w1==4){
		   dp4.setText("Caught");
	   }
	   if(w1==5){
		   dp5.setText("Caught");
	   }
	   if(w1==6){
		   dp6.setText("Caught");
	   }
	   if(w1==7){
		   dp7.setText("Caught");
	   }
	   if(w1==8){
		   dp8.setText("Caught");
	   }
	   if(w1==9){
		   dp9.setText("Caught");
	   }
	   if(w1==10){
		   dp10.setText("Caught");
	   }
	}
	if(twickets==10){
		if(twickets2<11){
	fw2.setText(""+twickets2);
		twickets2=twickets2+1;
		String currentwicket2=fw2.getText();
       int w2=Integer.parseInt(currentwicket2.trim());
	if(w2==1){
		   dp12.setText("Caught");
	   }
	   if(w2==2){
		   dp13.setText("Caught");
	   }
	   if(w2==3){
		   dp14.setText("Caught");
	   }
	   if(w2==4){
		   dp15.setText("Caught");
	   }
	   if(w2==5){
		   dp16.setText("Caught");
	   }
	   if(w2==6){
		   dp17.setText("Caught");
	   }
	   if(w2==7){
		   dp18.setText("Caught");
	   }
	   if(w2==8){
		   dp19.setText("Caught");
	   }
	   if(w2==9){
		   dp20.setText("Caught");
	   }
	   if(w2==10){
		   dp21.setText("Caught");
	   }
		}
	}
	if(twickets==10){
		  String totalruns=fr2.getText();
	   int v2=Integer.parseInt(totalruns.trim());
	   if(v2==0){
		  overn=0;
		  balln=1;
		  ballno.setText(""+balln);
	      overno.setText(""+overn);
	   }
	  }
	    if(twickets==10 && twickets2==11){
		  String team1=fr.getText();
       int t1r=Integer.parseInt(team1.trim());
	   String team2=fr2.getText();
       int t2r=Integer.parseInt(team2.trim());
		  if(t1r>t2r){
			  team1 obj=new team1();
		  }
		  if(t2r>t1r){
			  team2 obj=new team2();
		  }
	  }
	  }
  });
  
 
 
  
  
 Toolkit kit = getToolkit(); 
    Dimension wndSize = kit.getScreenSize();
    setBounds(wndSize.width / 40, wndSize.height / 40, wndSize.width / 2, wndSize.height / 2); // Size
   
setSize(1200,670);
setLayout(null);
setTitle("Cricket scoreboard simulator");
setVisible(true);

Font myfont=new Font("Courier",Font.BOLD,30);
vs.setFont(myfont);

Font myfont1=new Font("Courier",Font.BOLD,20);
t1in.setFont(myfont1);
t2in.setFont(myfont1);
fw.setFont(myfont1);
fw2.setFont(myfont1);
fr.setFont(myfont1);
fr2.setFont(myfont1);

Font myfont2=new Font("Courier",Font.BOLD,12);
l1t1.setFont(myfont2);
l1t2.setFont(myfont2);
t1.setFont(myfont2);
t2.setFont(myfont2);
Font myfont3=new Font("Courier",Font.BOLD,15);
tname.setFont(myfont3);
choices.setFont(myfont3);
ft1f0.setFont(myfont3);
ft1f1.setFont(myfont3);
ft1f2.setFont(myfont3);
ft1f3.setFont(myfont3);
f2t2f0.setFont(myfont3);
f2t2f1.setFont(myfont3);
f2t2f2.setFont(myfont3);
f2t2f3.setFont(myfont3);


Font myfont4=new Font("Courier",Font.BOLD,20);
ft1name.setFont(myfont4);
ft2name.setFont(myfont4);

 
	   

addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent e){
		dispose();
	}
});
}

public void actionPerformed(ActionEvent e){
	
	
}




public static void main(String arg[]){

cri2 obj=new cri2();



}


}