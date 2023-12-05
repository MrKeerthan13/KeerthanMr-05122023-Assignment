package ultilites;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class utlitypulldoc {
 public void main() throws IOException {
	 FileReader fr = new FileReader(("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
	 Properties P = new Properties();
	 P.load(fr);
	 
 }
}
