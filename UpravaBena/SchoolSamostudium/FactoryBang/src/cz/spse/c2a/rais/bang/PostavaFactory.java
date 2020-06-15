package cz.spse.c2a.rais.bang;

public class PostavaFactory {
	public static Postava getPostava(String name) {
			Postava p=null;
			switch(name) {
			case "Tommy":
				p=new Tommy(100);
				break;
			case "Sarah":
				p=new Sarah(30);
				break;
			case "SergioMorello":
				p=new Paulie(100);
				break;
			case "Frank":
				p=new Frank(100);
				break;
			case "Paulie":
				p=new Paulie(100);
				break;
			case "CivilPeople":
				p=new CivilPeople(30);
				break;
			
			default:
				p=new Tommy(1);
				break;
			}
			return p;
	}
	}

