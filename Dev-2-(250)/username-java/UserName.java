public class UserName {
	public static String newMember(String[] existingNames, String newName) {
		String ans=newName;
		for (int i = 0; i < existingNames.length; i++) {
			int temp =0;
			for (int j = 0; j < existingNames.length; j++) {
				if(existingNames[j].equals(newName)) temp =1;
			}
			if(temp == 0){return newName;}
			if(temp==1)
			{newName=ans+String.valueOf(i+1);}
		}
	return newName;
	}
}
