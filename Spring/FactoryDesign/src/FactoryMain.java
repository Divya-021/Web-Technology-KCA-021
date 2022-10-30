import com.phone.*;
public class FactoryMain {
public static void main(String args[])
{
	OperatingSystemFactory osf= new OperatingSystemFactory();
	//OS obj= new Android();
	OS obj=osf.getInstance("open");
	obj.spec();
}
}
