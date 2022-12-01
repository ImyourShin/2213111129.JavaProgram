import javax.swing.JOptionPane;

public class Example_403 {

	public static void main(String[] args) {
		String sentence = JOptionPane.showInputDialog("Input a sentence : ");
		while(!sentence.endsWith(".")){
			sentence = JOptionPane.showInputDialog("Input a sentence, again : ");
			
		}
		int spaceofWord=0;
		for(int i =0;i<sentence.length();i++){
			if(sentence.charAt(i)==' '){
				spaceofWord++;
			}
		}
		JOptionPane.showMessageDialog(null
				,"This sentence has "+spaceofWord+" spacebar."+
		       "\nThis sentence has "+(spaceofWord+1)+" word.");

	}

}
