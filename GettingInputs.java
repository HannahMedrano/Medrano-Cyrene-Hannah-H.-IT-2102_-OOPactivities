
import javax.swing.JOptionPane;
public class GettingInputs{
    public static void main (String[]args){
    String year,genre, album, title, artist;

    year = JOptionPane.showInputDialog("Enter the year:");
    genre = JOptionPane.showInputDialog("Enter the genre:");
    album = JOptionPane.showInputDialog("Enter the album:");
    title = JOptionPane.showInputDialog("Enter the song title:");
    artist = JOptionPane.showInputDialog("Enter the song artist:");

    String songdetails = "Year Released:" + year +  "\n" + "Genre:" + genre + "\n" + "Album:" + album + "\n"+ "Title:" + title + "\n" +"Artist:" + artist;
    JOptionPane.showMessageDialog(null, songdetails, "SONG DETAILS", JOptionPane. INFORMATION_MESSAGE);

    }
}
