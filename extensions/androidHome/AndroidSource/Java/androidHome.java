package ${YYAndroidPackageName};

//Import Game Maker classes
import ${YYAndroidPackageName}.RunnerActivity;

public class androidHome
{
	public void android_minimize()
	{			
		RunnerActivity.CurrentActivity.moveTaskToBack(true);
	}
}