public class NounReform {
	public String[] makePlural(String[] nouns) {
		for (int i = 0; i < nouns.length; i++) {
			int ind=0;
			if(nouns[i].endsWith("s") || nouns[i].endsWith("z") || nouns[i].endsWith("x")
					|| nouns[i].endsWith("ch")|| nouns[i].endsWith("sh"))
			{
				nouns[i]+="es";    ind=1;
			}
			if(nouns[i].endsWith("ay") || nouns[i].endsWith("ey") || nouns[i].endsWith("iy")
					|| nouns[i].endsWith("oy")|| nouns[i].endsWith("uy"))
			{
				nouns[i]+="s";   ind=1;
			}
			if(nouns[i].endsWith("y") && !nouns[i].endsWith("ay") && !nouns[i].endsWith("ey")
					&& !nouns[i].endsWith("iy") && !nouns[i].endsWith("oy") && !nouns[i].endsWith("uy"))
			{
				nouns[i]=nouns[i].substring(0, nouns[i].length()-1);
				nouns[i]+="ies";    ind=1;
			}
			if(ind == 0)nouns[i]+="s";
		}
		return nouns;
	}
}
