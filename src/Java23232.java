import java.awt.*;
import java.applet.Applet;
import java.util.*;

public class Java23232 extends Applet
{
	Rectangle done;
	int clickNumber;
	int clickk;
	int critNum;
	int num;
	Rectangle fTP, eFGP, aS, wP, b, s;
	double a, bb, c, d, e, f, g, h, i, j, k, l, m, n, o, p;
	boolean enough = true;
	ArrayList<String> round2west= new ArrayList();
	ArrayList<Double> round2westnumbers = new ArrayList();
	ArrayList<String> round2east= new ArrayList();
	ArrayList<Double> round2eastnumbers = new ArrayList();
	ArrayList<String> round3west = new ArrayList();
	ArrayList<Double> round3westnumbers = new ArrayList();
	ArrayList<String> round3east = new ArrayList();
	ArrayList<Double> round3eastnumbers = new ArrayList();
	ArrayList<String> round4west = new ArrayList();
	ArrayList<Double> round4westnumbers = new ArrayList();
	ArrayList<String> round4east = new ArrayList();
	ArrayList<Double> round4eastnumbers = new ArrayList();
	ArrayList<String> champion = new ArrayList();
	ArrayList<Double> championnumbers = new ArrayList();

	String criteria;
	HashMap <String, Double> Warriors = new HashMap<String, Double>();
	HashMap <String, Double> Clippers = new HashMap<String, Double>();
	HashMap <String, Double> Rockets = new HashMap<String, Double>();
	HashMap <String, Double> Jazz = new HashMap<String, Double>();
	HashMap <String, Double> TrailBlazers = new HashMap<String, Double>();
	HashMap <String, Double> Thunder = new HashMap<String, Double>();
	HashMap <String, Double> Nuggets = new HashMap<String, Double>();
	HashMap <String, Double> Spurs = new HashMap<String, Double>();
	HashMap <String, Double> Bucks = new HashMap<String, Double>();
	HashMap <String, Double> Pistons = new HashMap<String, Double>();
	HashMap <String, Double> Celtics = new HashMap<String, Double>();
	HashMap <String, Double> Pacers = new HashMap<String, Double>();
	HashMap <String, Double> Phil = new HashMap<String, Double>();
	HashMap <String, Double> Nets = new HashMap<String, Double>();
	HashMap <String, Double> Raptors = new HashMap<String, Double>();
	HashMap <String, Double> Magic = new HashMap<String, Double>();

	public void init()
	{
		done = new Rectangle(550,330,250,75);
		fTP = new Rectangle(50,100,190,190);
		eFGP = new Rectangle(270,100,190,190);
		aS = new Rectangle(490,100,190,190);
		wP = new Rectangle(710,100,190,190);
		b = new Rectangle(930,100,190,190);
		s = new Rectangle(1150,100,190,190);
		clickNumber = 0;
		clickk=0;
		criteria = "";
		critNum = 0;
		num=0;
		a = 0;
		bb = 0;
		c = 0;
		d = 0;
		e = 0;
		f = 0;
		g = 0;
		h = 0;
		i = 0;
		j = 0;
		k = 0;
		l = 0;
		m = 0;
		n = 0;
		o = 0;
		p = 0;
	}
	public void bracketFinal(String criteria){
		Bucks.put("offensive rating", 113.5);
		Bucks.put("defensive rating", 104.9);
		//Bucks.put("net rating", 8.6);
		Bucks.put("free throw percentage", 77.3);
		Bucks.put("effective fg percentage", 55.0);
		Bucks.put("all stars", 2.0);
		Bucks.put("win percentage", 73.2);
		Bucks.put("blocks", 5.9);
		Bucks.put("steals", 7.5);
		Pistons.put("offensive rating", 108.3);
		Pistons.put("defensive rating", 108.6);
		// Pistons.put("net rating", 8.6);
		Pistons.put("free throw percentage", 74.7);
		Pistons.put("effective fg percentage", 50.9);
		Pistons.put("all stars", 1.0);
		Pistons.put("win percentage", 50.0);
		Pistons.put("blocks", 4.0);
		Pistons.put("steals", 6.9);
		//Pistons.put("done", 0.0);
		Spurs.put("offensive rating", 112.2);
		Spurs.put("defensive rating", 110.5);
		//Spurs.put("net rating", 8.6);
		Spurs.put("free throw percentage", 81.9);
		Spurs.put("effective fg percentage", 55.0);
		Spurs.put("all stars", 1.0);
		Spurs.put("win percentage", 58.5);
		Spurs.put("blocks", 4.7);
		Spurs.put("steals", 6.1);
		//Spurs.put("done", 0.0);
		Nuggets.put("offensive rating", 112.1);
		Nuggets.put("defensive rating", 108.0);
		//Nuggets.put("net rating", 8.6);
		Nuggets.put("free throw percentage", 75.5);
		Nuggets.put("effective fg percentage", 52.7);
		Nuggets.put("all stars", 1.0);
		Nuggets.put("win percentage", 65.9);
		Nuggets.put("blocks", 4.4);
		Nuggets.put("steals", 7.7);
		//Nuggets.put("done", 0.0);
		Phil.put("offensive rating", 111.5);
		Phil.put("defensive rating", 108.9);
		//Phil.put("net rating", 8.6);
		Phil.put("free throw percentage", 77.1);
		Phil.put("effective fg percentage", 53.2);
		Phil.put("all stars", 2.0);
		Phil.put("win percentage", 62.2);
		Phil.put("blocks", 5.0);
		Phil.put("steals", 6.7);
		//Phil.put("done", 0.0);
		Raptors.put("offensive rating", 112.5);
		Raptors.put("defensive rating", 106.8);
		//Raptors.put("net rating", 8.6);
		Raptors.put("free throw percentage", 80.4);
		Raptors.put("effective fg percentage", 54.3);
		Raptors.put("all stars", 2.0);
		Raptors.put("win percentage", 70.7);
		Raptors.put("blocks", 5.3);
		Raptors.put("steals", 8.3);
		//Raptors.put("done", 0.0);
		Rockets.put("offensive rating", 114.8);
		Rockets.put("defensive rating", 110.1);
		//Rockets.put("net rating", 8.6);
		Rockets.put("free throw percentage", 79.1);
		Rockets.put("effective fg percentage", 54.2);
		Rockets.put("all stars", 1.0);
		Rockets.put("win percentage", 64.6);
		Rockets.put("blocks", 4.9);
		Rockets.put("steals", 8.5);
		//Rockets.put("done", 0.0);
		Warriors.put("offensive rating", 114.9);
		Warriors.put("defensive rating", 108.5);
		//Warriors.put("net rating", 8.6);
		Warriors.put("free throw percentage", 80.1);
		Warriors.put("effective fg percentage", 56.5);
		Warriors.put("all stars", 3.0);
		Warriors.put("win percentage", 69.5);
		Warriors.put("blocks", 6.4);
		Warriors.put("steals", 7.6);
		//Warriors.put("done", 0.0);
		TrailBlazers.put("offensive rating", 113.6);
		TrailBlazers.put("defensive rating", 109.5);
		//TrailBlazers.put("net rating", 8.6);
		TrailBlazers.put("free throw percentage", 81.4);
		TrailBlazers.put("effective fg percentage", 52.8);
		TrailBlazers.put("all stars", 1.0);
		TrailBlazers.put("win percentage", 64.6);
		TrailBlazers.put("blocks", 5.0);
		TrailBlazers.put("steals", 6.7);
		//TrailBlazers.put("done", 0.0);
		Celtics.put("offensive rating", 111.2);
		Celtics.put("defensive rating", 107.0);
		//Celtics.put("net rating", 8.6);
		Celtics.put("free throw percentage", 80.2);
		Celtics.put("effective fg percentage", 53.4);
		Celtics.put("all stars", 1.0);
		Celtics.put("win percentage", 59.8);
		Celtics.put("blocks", 5.3);
		Celtics.put("steals", 8.6);
		//Celtics.put("done", 0.0);
		Clippers.put("offensive rating", 111.3);
		Clippers.put("defensive rating", 110.3);
		//Clippers.put("net rating", 8.6);
		Clippers.put("free throw percentage", 79.2);
		Clippers.put("effective fg percentage", 52.9);
		Clippers.put("all stars", 0.0);
		Clippers.put("win percentage", 58.5);
		Clippers.put("blocks", 4.7);
		Clippers.put("steals", 6.1);
		//Clippers.put("done", 0.0);
		Jazz.put("offensive rating", 110.2);
		Jazz.put("defensive rating", 105.2);
		//Jazz.put("net rating", 8.6);
		Jazz.put("free throw percentage", 73.6);
		Jazz.put("effective fg percentage", 53.8);
		Jazz.put("all stars", 0.0);
		Jazz.put("win percentage", 61.0);
		Jazz.put("blocks", 5.9);
		Jazz.put("steals", 8.1);
		//Jazz.put("done", 0.0);
		Magic.put("offensive rating", 108.1);
		Magic.put("defensive rating", 107.5);
		//Magic.put("net rating", 8.6);
		Magic.put("free throw percentage", 78.2);
		Magic.put("effective fg percentage", 51.8);
		Magic.put("all stars", 1.0);
		Magic.put("win percentage", 51.2);
		Magic.put("blocks", 5.4);
		Magic.put("steals", 6.6);
		//Magic.put("done", 0.0);
		Nets.put("offensive rating", 108.8);
		Nets.put("defensive rating", 108.9);
		//Nets.put("net rating", 8.6);
		Nets.put("free throw percentage", 74.5);
		Nets.put("effective fg percentage", 51.0);
		Nets.put("all stars", 1.0);
		Nets.put("win percentage", 51.2);
		Nets.put("blocks", 4.1);
		Nets.put("steals", 6.6);
		//Nets.put("done", 0.0);
		Thunder.put("offensive rating", 109.8);
		Thunder.put("defensive rating", 106.4);
		//Thunder.put("net rating", 8.6);
		Thunder.put("free throw percentage", 71.3);
		Thunder.put("effective fg percentage", 51.4);
		Thunder.put("all stars", 2.0);
		Thunder.put("win percentage", 59.8);
		Thunder.put("blocks", 5.2);
		Thunder.put("steals", 9.3);
		//Thunder.put("done", 0.0);
		Pacers.put("offensive rating", 109.3);
		Pacers.put("defensive rating", 105.9);
		//Pacers.put("net rating", 8.6);
		Pacers.put("free throw percentage", 75.2);
		Pacers.put("effective fg percentage", 53.0);
		Pacers.put("all stars", 1.0);
		Pacers.put("win percentage", 58.5);
		Pacers.put("blocks", 4.9);
		Pacers.put("steals", 8.7);
		//Pacers.put("done", 0.0);
		String crit1 = "offensive rating";
		String crit2 = "defensive rating";
		String crit3 = "free throw percentage";
		String crit4 = "effective fg percentage";
		String crit5 = "all stars";
		String crit6 = "win percentage";
		String crit7 = "blocks";
		String crit8 = "steals";
		numberss(crit1);
		numberss(crit2);
		numberss(crit3);
		numberss(crit4);
		numberss(crit5);
		numberss(crit6);
		numberss(crit7);
		numberss(crit8);
		if (a > bb)
			round2west.add("Warriors");
		round2westnumbers.add(a);
		if (bb > a)
			round2west.add("Clippers");
		round2westnumbers.add(bb);
		if  (c > d)
			round2west.add("Rockets");
		round2westnumbers.add(c);
		if (d > c)
			round2west.add("Jazz");
		round2westnumbers.add(d);
		if  (e > f)
			round2west.add("Trail Blazers");
		round2westnumbers.add(e);
		if (f > e)
			round2west.add("Thunder");
		round2westnumbers.add(f);
		if (g > h)
			round2west.add("Nuggets");
		round2westnumbers.add(g);
		if (h > g)
			round2west.add("Spurs");
		round2westnumbers.add(h);
		if (i > j)
			round2east.add("Bucks");
		round2eastnumbers.add(i);
		if (j > i)
			round2east.add("Pistons");
		round2eastnumbers.add(j);
		if (k > l)
			round2east.add("Celtics");
		round2eastnumbers.add(k);
		if (l > k)
			round2east.add("Pacers");
		round2eastnumbers.add(l);
		if (m > n)
			round2east.add("76ers");
		round2eastnumbers.add(m);
		if (n > m)
			round2east.add("Nets");
		round2eastnumbers.add(n);
		if (o > p)
			round2east.add("Raptors");
		round2eastnumbers.add(o);
		if (p > o)
			round2east.add("Magic");
		round2eastnumbers.add(p);
		if(round2westnumbers.get(0) > round2westnumbers.get(1)){
			round3west.add(round2west.get(0));
			round3westnumbers.add(round2westnumbers.get(0));
		}
		if(round2westnumbers.get(1) > round2westnumbers.get(0)){
			round3west.add(round2west.get(1));
			round3westnumbers.add(round2westnumbers.get(1));
		}
		if(round2westnumbers.get(2) > round2westnumbers.get(3)){
			round3west.add(round2west.get(2));
			round3westnumbers.add(round2westnumbers.get(2));
		}
		if(round2westnumbers.get(3) > round2westnumbers.get(2)){
			round3west.add(round2west.get(3));
			round3westnumbers.add(round2westnumbers.get(3));
		}
		if(round2eastnumbers.get(0) > round2eastnumbers.get(1)){
			round3east.add(round2east.get(0));
			round3eastnumbers.add(round2eastnumbers.get(0));
		}
		if(round2eastnumbers.get(1) > round2eastnumbers.get(0)){
			round3east.add(round2east.get(1));
			round3eastnumbers.add(round2eastnumbers.get(1));
		}
		if(round2eastnumbers.get(2) > round2eastnumbers.get(3)){
			round3east.add(round2east.get(2));
			round3eastnumbers.add(round2eastnumbers.get(2));
		}
		if(round2eastnumbers.get(3) > round2eastnumbers.get(2)){
			round3east.add(round2east.get(3));
			round3eastnumbers.add(round2eastnumbers.get(3));
		}
		if(round3westnumbers.get(0) > round3westnumbers.get(1)){
			round4west.add(round3west.get(0));
			round4westnumbers.add(round3westnumbers.get(0));
		}
		if(round3westnumbers.get(1) > round3westnumbers.get(0)){
			round4west.add(round3west.get(1));
			round4westnumbers.add(round3westnumbers.get(1));
		}
		if(round3eastnumbers.get(0) > round3eastnumbers.get(1)){
			round4east.add(round3east.get(0));
			round4eastnumbers.add(round3eastnumbers.get(0));
		}
		if(round3eastnumbers.get(1) > round3eastnumbers.get(0)){
			round4east.add(round3east.get(1));
			round4eastnumbers.add(round3eastnumbers.get(1));
		}
		if(round4westnumbers.get(0)>round4eastnumbers.get(1)){
			champion.add(round4west.get(0));
			championnumbers.add(round4westnumbers.get(0));
		}
		if(round4eastnumbers.get(0)>round4westnumbers.get(1)){
			champion.add(round4east.get(0));
			championnumbers.add(round4eastnumbers.get(0));
		}

	}
	public void numberss(String crit1){
		if(criteria.contains(crit1)){
			a+= Warriors.get(crit1);
			bb+= Clippers.get(crit1);
			c+= Rockets.get(crit1);
			d+= Jazz.get(crit1);
			e+= TrailBlazers.get(crit1);
			f+= Thunder.get(crit1);
			g+= Nuggets.get(crit1);
			h+= Spurs.get(crit1);
			i+= Bucks.get(crit1);
			j+= Pistons.get(crit1);
			k+= Celtics.get(crit1);
			l+= Pacers.get(crit1);
			m+= Phil.get(crit1);
			n+= Nets.get(crit1);
			o+= Raptors.get(crit1);
			p+= Magic.get(crit1);
		}
	}
	public boolean mouseDown(Event e, int x, int y)
	{
		if(clickk>=0&&clickk<=7)
		{
			clickk++;
			if(done.inside(x,y))
				if(num>2) {
					clickk = 8;
				}
				else{
					enough = false;
				}
			if(fTP.inside(x,y))
				critNum = 1;
            /*freeThrowPercentage = true;
            criteria+="free throw percentage";
            */
			if(eFGP.inside(x,y))
				critNum = 2;
            /*effectiveFGPercentage = true;
            criteria+="effective fg percentage";*/
			if(aS.inside(x,y))
				critNum = 3;
            /*allStars = true;
            criteria+="all stars";
            */
			if(wP.inside(x,y))
				critNum = 4;/*
            winPercentage = true;
            criteria+="win percentage";
            */
			if(b.inside(x,y))
				critNum = 5; /*
            blocks = true;
            criteria+="blocks";
            */
			if(s.inside(x,y))
				critNum = 6; /*
            steals = true;
            criteria+="steals";
            */
			repaint();
			return true;
		}
		bracketFinal(criteria);
		if(criteria.length()>0&&clickk >7)
		{
			clickNumber++;
			repaint();
			return true;
		}
		return true;
	}
	public void paint(Graphics g)
	{
		g.setColor(new Color(100,200,150));
		g.fillRect(550,430,250,200);
		g.setColor(Color.black);
		g.setFont(new Font("Courier", Font.BOLD, 48));
		g.drawString("Click",600,485);
		g.drawString("to",645,535);
		g.drawString("Start!",590,585);

		switch (clickk)
		{
			case 1:
				g.setFont(new Font("Courier", Font.BOLD, 24));
				g.drawString("Pick at least 2 criteria that you want factored into your bracket. After clicking done, click 'Click to Start!' twice",30,700);
				g.setColor(new Color(100,200,150));
				g.fillRect(50,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Free",115,140);
				g.drawString("Throw",105,190);
				g.drawString("Percentage",57,240);
				g.setColor(new Color(100,200,150));
				g.fillRect(270,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Effective",287,140);
				g.drawString("FG",345,190);
				g.drawString("Percentage",277,240);
				g.setColor(new Color(100,200,150));
				g.fillRect(490,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 50));
				g.drawString("All",545,170);
				g.drawString("Stars",510,240);
				g.setColor(new Color(100,200,150));
				g.fillRect(710,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Win",780,170);
				g.drawString("Percentage",717,220);
				g.setColor(new Color(100,200,150));
				g.fillRect(930,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Blocks",970,195);
				g.setColor(new Color(100,200,150));
				g.fillRect(1150,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Steals",1190,195);
				g.setColor(new Color(100,200,150));
				g.fillRect(550,330,250,75);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 50));
				g.drawString("DONE",615,385);
				switch(critNum){
					case 1: criteria+= "free throw percentage"; num++; break;
					case 2: criteria+= "effective fg percentage"; num++; break;
					case 3: criteria+= "all stars"; num++;break;
					case 4: criteria+= "win percentage"; num++;break;
					case 5: criteria+= "blocks"; num++;break;
					case 6: criteria+= "steals"; num++;break;
				}
				if(!enough){
					g.drawString("Choose a second criteria.",200,780);
				}
				break;


			case 2:
				g.setFont(new Font("Courier", Font.BOLD, 24));
				g.drawString("Pick at least 2 criteria that you want factored into your bracket. After clicking done, click 'Click to Start!' twice",30,700);
				g.setColor(new Color(100,200,150));
				g.fillRect(50,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Free",115,140);
				g.drawString("Throw",105,190);
				g.drawString("Percentage",57,240);
				g.setColor(new Color(100,200,150));
				g.fillRect(270,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Effective",287,140);
				g.drawString("FG",345,190);
				g.drawString("Percentage",277,240);
				g.setColor(new Color(100,200,150));
				g.fillRect(490,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 50));
				g.drawString("All",545,170);
				g.drawString("Stars",510,240);
				g.setColor(new Color(100,200,150));
				g.fillRect(710,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Win",780,170);
				g.drawString("Percentage",717,220);
				g.setColor(new Color(100,200,150));
				g.fillRect(930,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Blocks",970,195);
				g.setColor(new Color(100,200,150));
				g.fillRect(1150,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Steals",1190,195);
				g.setColor(new Color(100,200,150));
				g.fillRect(550,330,250,75);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 50));
				g.drawString("DONE",615,385);
				switch(critNum){
					case 1: criteria+= "free throw percentage"; num++; break;
					case 2: criteria+= "effective fg percentage"; num++; break;
					case 3: criteria+= "all stars"; num++;break;
					case 4: criteria+= "win percentage"; num++;break;
					case 5: criteria+= "blocks"; num++;break;
					case 6: criteria+= "steals"; num++;break;
				}
				if(!enough){
					g.drawString("Choose a second criteria.",200,780);
				}
				break;
			case 3:
				g.setFont(new Font("Courier", Font.BOLD, 24));
				g.drawString("Pick at least 2 criteria that you want factored into your bracket. After clicking done, click 'Click to Start!' twice",30,700);
				g.setColor(new Color(100,200,150));
				g.fillRect(50,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Free",115,140);
				g.drawString("Throw",105,190);
				g.drawString("Percentage",57,240);
				g.setColor(new Color(100,200,150));
				g.fillRect(270,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Effective",287,140);
				g.drawString("FG",345,190);
				g.drawString("Percentage",277,240);
				g.setColor(new Color(100,200,150));
				g.fillRect(490,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 50));
				g.drawString("All",545,170);
				g.drawString("Stars",510,240);
				g.setColor(new Color(100,200,150));
				g.fillRect(710,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Win",780,170);
				g.drawString("Percentage",717,220);
				g.setColor(new Color(100,200,150));
				g.fillRect(930,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Blocks",970,195);
				g.setColor(new Color(100,200,150));
				g.fillRect(1150,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Steals",1190,195);
				g.setColor(new Color(100,200,150));
				g.fillRect(550,330,250,75);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 50));
				g.drawString("DONE",615,385);
				switch(critNum){
					case 1: criteria+= "free throw percentage"; num++; break;
					case 2: criteria+= "effective fg percentage"; num++; break;
					case 3: criteria+= "all stars"; num++;break;
					case 4: criteria+= "win percentage"; num++;break;
					case 5: criteria+= "blocks"; num++;break;
					case 6: criteria+= "steals"; num++;break;
				}
				if(!enough){
					g.drawString("Choose a second criteria.",200,780);
				}

			case 4:
				g.setFont(new Font("Courier", Font.BOLD, 24));
				g.drawString("Pick at least 2 criteria that you want factored into your bracket. After clicking done, click 'Click to Start!' twice",30,700);
				g.setColor(new Color(100,200,150));
				g.fillRect(50,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Free",115,140);
				g.drawString("Throw",105,190);
				g.drawString("Percentage",57,240);
				g.setColor(new Color(100,200,150));
				g.fillRect(270,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Effective",287,140);
				g.drawString("FG",345,190);
				g.drawString("Percentage",277,240);
				g.setColor(new Color(100,200,150));
				g.fillRect(490,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 50));
				g.drawString("All",545,170);
				g.drawString("Stars",510,240);
				g.setColor(new Color(100,200,150));
				g.fillRect(710,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Win",780,170);
				g.drawString("Percentage",717,220);
				g.setColor(new Color(100,200,150));
				g.fillRect(930,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Blocks",970,195);
				g.setColor(new Color(100,200,150));
				g.fillRect(1150,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Steals",1190,195);
				g.setColor(new Color(100,200,150));
				g.fillRect(550,330,250,75);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 50));
				g.drawString("DONE",615,385);
				switch(critNum){
					case 1: criteria+= "free throw percentage"; num++; break;
					case 2: criteria+= "effective fg percentage"; num++; break;
					case 3: criteria+= "all stars"; num++;break;
					case 4: criteria+= "win percentage"; num++;break;
					case 5: criteria+= "blocks"; num++;break;
					case 6: criteria+= "steals"; num++;break;
				}
				if(!enough){
					g.drawString("Choose a second criteria.",200,780);
				}

			case 5:
				g.setFont(new Font("Courier", Font.BOLD, 24));
				g.drawString("Pick at least 2 criteria that you want factored into your bracket. After clicking done, click 'Click to Start!' twice",30,700);
				g.setColor(new Color(100,200,150));
				g.fillRect(50,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Free",115,140);
				g.drawString("Throw",105,190);
				g.drawString("Percentage",57,240);
				g.setColor(new Color(100,200,150));
				g.fillRect(270,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Effective",287,140);
				g.drawString("FG",345,190);
				g.drawString("Percentage",277,240);
				g.setColor(new Color(100,200,150));
				g.fillRect(490,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 50));
				g.drawString("All",545,170);
				g.drawString("Stars",510,240);
				g.setColor(new Color(100,200,150));
				g.fillRect(710,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Win",780,170);
				g.drawString("Percentage",717,220);
				g.setColor(new Color(100,200,150));
				g.fillRect(930,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Blocks",970,195);
				g.setColor(new Color(100,200,150));
				g.fillRect(1150,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Steals",1190,195);
				g.setColor(new Color(100,200,150));
				g.fillRect(550,330,250,75);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 50));
				g.drawString("DONE",615,385);
				switch(critNum){
					case 1: criteria+= "free throw percentage"; num++; break;
					case 2: criteria+= "effective fg percentage"; num++; break;
					case 3: criteria+= "all stars"; num++;break;
					case 4: criteria+= "win percentage"; num++;break;
					case 5: criteria+= "blocks"; num++;break;
					case 6: criteria+= "steals"; num++;break;
				}
				if(!enough){
					g.drawString("Choose a second criteria.",200,780);
				}

			case 6:
				g.setFont(new Font("Courier", Font.BOLD, 24));
				g.drawString("Pick at least 2 criteria that you want factored into your bracket. After clicking done, click 'Click to Start!' twice",30,700);
				g.setColor(new Color(100,200,150));
				g.fillRect(50,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Free",115,140);
				g.drawString("Throw",105,190);
				g.drawString("Percentage",57,240);
				g.setColor(new Color(100,200,150));
				g.fillRect(270,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Effective",287,140);
				g.drawString("FG",345,190);
				g.drawString("Percentage",277,240);
				g.setColor(new Color(100,200,150));
				g.fillRect(490,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 50));
				g.drawString("All",545,170);
				g.drawString("Stars",510,240);
				g.setColor(new Color(100,200,150));
				g.fillRect(710,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Win",780,170);
				g.drawString("Percentage",717,220);
				g.setColor(new Color(100,200,150));
				g.fillRect(930,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Blocks",970,195);
				g.setColor(new Color(100,200,150));
				g.fillRect(1150,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Steals",1190,195);
				g.setColor(new Color(100,200,150));
				g.fillRect(550,330,250,75);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 50));
				g.drawString("DONE",615,385);
				switch(critNum){
					case 1: criteria+= "free throw percentage"; num++; break;
					case 2: criteria+= "effective fg percentage"; num++; break;
					case 3: criteria+= "all stars"; num++;break;
					case 4: criteria+= "win percentage"; num++;break;
					case 5: criteria+= "blocks"; num++;break;
					case 6: criteria+= "steals"; num++;break;
				}
				if(!enough){
					g.drawString("Choose a second criteria.",200,780);
				}

			case 7:
				g.setFont(new Font("Courier", Font.BOLD, 24));
				g.drawString("Pick at least 2 criteria that you want factored into your bracket. After clicking done, click 'Click to Start!' twice",30,700);
				g.setColor(new Color(100,200,150));
				g.fillRect(50,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Free",115,140);
				g.drawString("Throw",105,190);
				g.drawString("Percentage",57,240);
				g.setColor(new Color(100,200,150));
				g.fillRect(270,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Effective",287,140);
				g.drawString("FG",345,190);
				g.drawString("Percentage",277,240);
				g.setColor(new Color(100,200,150));
				g.fillRect(490,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 50));
				g.drawString("All",545,170);
				g.drawString("Stars",510,240);
				g.setColor(new Color(100,200,150));
				g.fillRect(710,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Win",780,170);
				g.drawString("Percentage",717,220);
				g.setColor(new Color(100,200,150));
				g.fillRect(930,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Blocks",970,195);
				g.setColor(new Color(100,200,150));
				g.fillRect(1150,100,190,190);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 30));
				g.drawString("Steals",1190,195);
				g.setColor(new Color(100,200,150));
				g.fillRect(550,330,250,75);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 50));
				g.drawString("DONE",615,385);
				switch(critNum){
					case 1: criteria+= "free throw percentage"; num++; break;
					case 2: criteria+= "effective fg percentage"; num++; break;
					case 3: criteria+= "all stars"; num++;break;
					case 4: criteria+= "win percentage"; num++;break;
					case 5: criteria+= "blocks"; num++;break;
					case 6: criteria+= "steals"; num++;break;
				}
				if(!enough){
					g.drawString("Choose a second criteria.",200,780);
				}

		}
		String round1west[]= {"Warriors", "Clippers", "Rockets", "Jazz", "Trail Blazers", "Thunder", "Nuggets", "Spurs"};
		String round1east[] = {"Bucks", "Pistons", "Celtics", "Pacers", "76ers", "Nets", "Raptors", "Magic"};

		switch (clickNumber)
		{
			case 1:
				g.setColor(new Color(100,200,150));
				for(int a= 50; a<=1175; a+=1125){
					for(int i = 0; i < 600; i+=75){
						g.fillRect(a,i+50,125,65);
						g.setColor(Color.black);
						g.drawRect(a,i+50,125,65);
						if(a == 50){
							g.setFont(new Font("Courier", Font.BOLD, 15));
							g.drawString(round1west[i/75],a+3,i+85);
						}
						if(a == 1175){
							g.setFont(new Font("Courier", Font.BOLD, 15));
							g.drawString(round1east[i/75],a+3,i+85);
						}
						g.setColor(new Color(100,200,150));
					}
				}
				break;
			case 2:
				g.setColor(new Color(100,200,150));
				for(int a= 50; a<=1175; a+=1125){
					for(int i = 0; i < 600; i+=75){
						g.fillRect(a,i+50,125,65);
						g.setColor(Color.black);
						g.drawRect(a,i+50,125,65);
						if(a == 50){
							g.setFont(new Font("Courier", Font.BOLD, 15));
							g.drawString(round1west[i/75],a+3,i+85);
						}
						if(a == 1175){
							g.setFont(new Font("Courier", Font.BOLD, 15));
							g.drawString(round1east[i/75],a+3,i+85);
						}
						g.setColor(new Color(100,200,150));
					}
				}
				int x=0;
				int y=0;
				for(int b=210; b<=1015; b+=805){
					for(int i = 0; i < 600; i+=150){
						g.setColor(new Color(100,200,150));
						g.fillRect(b,i+88,125,65);
						g.setColor(Color.black);
						g.drawRect(b,i+88,125,65);
						g.setFont(new Font("Courier", Font.BOLD, 15));
						if(b == 210){

							g.setFont(new Font("Courier", Font.BOLD, 15));
							g.drawString(round2west.get(x),b+8,i+88+35);
							x++;
						}
						if(b == 1015){
							g.setFont(new Font("Courier", Font.BOLD, 15));
							g.drawString(round2east.get(y),b+8,i+88+35);
							y++;
						}
						g.setColor(new Color(100,200,150));
					}
				}
				break;
			case 3:
				g.setColor(new Color(100,200,150));
				for(int a= 50; a<=1175; a+=1125){
					for(int i = 0; i < 600; i+=75){
						g.fillRect(a,i+50,125,65);
						g.setColor(Color.black);
						g.drawRect(a,i+50,125,65);
						if(a == 50){
							g.setFont(new Font("Courier", Font.BOLD, 15));
							g.drawString(round1west[i/75],a+3,i+85);
						}
						if(a == 1175){
							g.setFont(new Font("Courier", Font.BOLD, 15));
							g.drawString(round1east[i/75],a+3,i+85);
						}
						g.setColor(new Color(100,200,150));
					}
				}
				int hi=0;
				int bye=0;
				for(int b=210; b<=1015; b+=805){
					for(int i = 0; i < 600; i+=150){
						g.setColor(new Color(100,200,150));
						g.fillRect(b,i+88,125,65);
						g.setColor(Color.black);
						g.drawRect(b,i+88,125,65);
						g.setFont(new Font("Courier", Font.BOLD, 15));
						if(b == 210){

							g.setFont(new Font("Courier", Font.BOLD, 15));
							g.drawString(round2west.get(hi),b+8,i+88+35);
							hi++;
						}
						if(b == 1015){
							g.setFont(new Font("Courier", Font.BOLD, 15));
							g.drawString(round2east.get(bye),b+8,i+88+35);
							bye++;
						}
						g.setColor(new Color(100,200,150));
					}
				}
				int rana = 0;
				int janhvi = 0;
				for(int c = 370; c<=855; c+=485){
					for(int i = 0; i < 600; i+=300){
						g.setColor(new Color(100,200,150));
						g.fillRect(c,i+165,125,65);
						g.setColor(Color.black);
						g.drawRect(c,i+165,125,65);
						g.setFont(new Font("Courier", Font.BOLD, 15));
						if(c == 370){

							g.setFont(new Font("Courier", Font.BOLD, 15));
							g.drawString(round3west.get(rana),c+8,i+165+35);
							rana++;
						}
						if(c == 855){
							g.setFont(new Font("Courier", Font.BOLD, 15));
							g.drawString(round3east.get(janhvi),c+8,i+165+35);
							janhvi++;
						}
						g.setColor(new Color(100,200,150));

					}
				}
				break;
			case 4:
				g.setColor(new Color(100,200,150));
				for(int a= 50; a<=1175; a+=1125){
					for(int i = 0; i < 600; i+=75){
						g.fillRect(a,i+50,125,65);
						g.setColor(Color.black);
						g.drawRect(a,i+50,125,65);
						if(a == 50){
							g.setFont(new Font("Courier", Font.BOLD, 15));
							g.drawString(round1west[i/75],a+3,i+85);
						}
						if(a == 1175){
							g.setFont(new Font("Courier", Font.BOLD, 15));
							g.drawString(round1east[i/75],a+3,i+85);
						}
						g.setColor(new Color(100,200,150));
					}
				}
				int good=0;
				int morning=0;
				for(int b=210; b<=1015; b+=805){
					for(int i = 0; i < 600; i+=150){
						g.setColor(new Color(100,200,150));
						g.fillRect(b,i+88,125,65);
						g.setColor(Color.black);
						g.drawRect(b,i+88,125,65);
						g.setFont(new Font("Courier", Font.BOLD, 15));
						if(b == 210){

							g.setFont(new Font("Courier", Font.BOLD, 15));
							g.drawString(round2west.get(good),b+8,i+88+35);
							good++;
						}
						if(b == 1015){
							g.setFont(new Font("Courier", Font.BOLD, 15));
							g.drawString(round2east.get(morning),b+8,i+88+35);
							morning++;
						}
						g.setColor(new Color(100,200,150));
					}
				}
				int anika = 0;
				int neeha = 0;
				for(int c = 370; c<=855; c+=485){
					for(int i = 0; i < 600; i+=300){
						g.setColor(new Color(100,200,150));
						g.fillRect(c,i+165,125,65);
						g.setColor(Color.black);
						g.drawRect(c,i+165,125,65);
						g.setFont(new Font("Courier", Font.BOLD, 15));
						if(c == 370){

							g.setFont(new Font("Courier", Font.BOLD, 15));
							g.drawString(round3west.get(anika),c+8,i+165+35);
							anika++;
						}
						if(c == 855){
							g.setFont(new Font("Courier", Font.BOLD, 15));
							g.drawString(round3east.get(neeha),c+8,i+165+35);
							neeha++;
						}
						g.setColor(new Color(100,200,150));

					}
				}
				g.setColor(new Color(100,200,150));
				g.fillRect(530,313,125,65);
				g.setColor(Color.black);
				g.drawRect(530,313,125,65);
				g.drawString(round4west.get(0),530+3,313+35);
				g.setColor(new Color(100,200,150));
				g.fillRect(695,313,125,65);
				g.setColor(Color.black);
				g.drawRect(695,313,125,65);
				g.drawString(round4east.get(0),695+3,313+35);
				g.setColor(new Color(100,200,150));
				break;
			case 5:
				g.setColor(new Color(100,200,150));
				for(int a= 50; a<=1175; a+=1125){
					for(int i = 0; i < 600; i+=75){
						g.fillRect(a,i+50,125,65);
						g.setColor(Color.black);
						g.drawRect(a,i+50,125,65);
						if(a == 50){
							g.setFont(new Font("Courier", Font.BOLD, 15));
							g.drawString(round1west[i/75],a+3,i+85);
						}
						if(a == 1175){
							g.setFont(new Font("Courier", Font.BOLD, 15));
							g.drawString(round1east[i/75],a+3,i+85);
						}
						g.setColor(new Color(100,200,150));
					}
				}
				int how=0;
				int are=0;
				for(int b=210; b<=1015; b+=805){
					for(int i = 0; i < 600; i+=150){
						g.setColor(new Color(100,200,150));
						g.fillRect(b,i+88,125,65);
						g.setColor(Color.black);
						g.drawRect(b,i+88,125,65);
						g.setFont(new Font("Courier", Font.BOLD, 15));
						if(b == 210){

							g.setFont(new Font("Courier", Font.BOLD, 15));
							g.drawString(round2west.get(how),b+8,i+88+35);
							how++;
						}
						if(b == 1015){
							g.setFont(new Font("Courier", Font.BOLD, 15));
							g.drawString(round2east.get(are),b+8,i+88+35);
							are++;
						}
						g.setColor(new Color(100,200,150));
					}
				}
				int saloni = 0;
				int lauren = 0;
				for(int c = 370; c<=855; c+=485){
					for(int i = 0; i < 600; i+=300){
						g.setColor(new Color(100,200,150));
						g.fillRect(c,i+165,125,65);
						g.setColor(Color.black);
						g.drawRect(c,i+165,125,65);
						g.setFont(new Font("Courier", Font.BOLD, 15));
						if(c == 370){

							g.setFont(new Font("Courier", Font.BOLD, 15));
							g.drawString(round3west.get(saloni),c+8,i+165+35);
							saloni++;
						}
						if(c == 855){
							g.setFont(new Font("Courier", Font.BOLD, 15));
							g.drawString(round3east.get(lauren),c+8,i+165+35);
							lauren++;
						}
						g.setColor(new Color(100,200,150));
					}
				}
				g.setColor(new Color(100,200,150));
				g.fillRect(530,313,125,65);
				g.setColor(Color.black);
				g.drawRect(530,313,125,65);
				g.drawString(round4west.get(0),530+3,313+35);
				g.setColor(new Color(100,200,150));
				g.fillRect(695,313,125,65);
				g.setColor(Color.black);
				g.drawRect(695,313,125,65);
				g.drawString(round4east.get(0),695+3,313+35);
				g.setColor(new Color(100,200,150));
				g.fillRect(550,50,250,200);
				g.drawRect(550,50,250,200);
				g.setColor(Color.black);
				g.setFont(new Font("Courier", Font.BOLD, 48));
				g.drawString("Champion",560,100);
				g.setFont(new Font("Courier", Font.BOLD, 40));
				g.drawString(champion.get(0),570,200);
				g.setColor(Color.red);
				g.fillRect(550,215,250,3);
				g.setColor(Color.orange);
				g.fillRect(550,220,250,3);
				g.setColor(Color.yellow);
				g.fillRect(550,225,250,3);
				g.setColor(Color.green);
				g.fillRect(550,230,250,3);
				g.setColor(Color.cyan);
				g.fillRect(550,235,250,3);
				g.setColor(Color.blue);
				g.fillRect(550,240,250,3);
				g.setColor(Color.magenta);
				g.fillRect(550,245,250,3);
				g.setColor(Color.pink);
				g.fillRect(550,250,250,3);
				g.setFont(new Font("Courier", Font.BOLD, 24));
				g.drawString("Thanks for using our program! Hope your bracket turns out right! Good luck!",50,700);
				g.setFont(new Font("Courier", Font.BOLD, 14));
				g.drawString("(Please give us a 100)",100,730);
		}
	}
}