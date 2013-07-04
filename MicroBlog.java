import static org.junit.Assert.*;
import org.junit.Test;

public class MicroBlog {
	public boolean sendMessage(String x){
		if (!(x.isEmpty())&&(x.length() < 11)){
			String y = x; // записываем строчку в блог, need BD
			return true;
		}
		else
			return false;
	}
}
