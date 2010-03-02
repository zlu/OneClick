package zlu.opensource.oneclick;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.telephony.gsm.SmsManager;

public class OneClick extends Activity {
	
	private String googleVoiceNumber = "16508983130";
	private String myNumber = "14084978571";
	private String hdogNumber = "14156700462";
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		sendMessage(getApplicationContext(), hdogNumber, "Le H-Dog, I'm coming");
	}

	public void sendMessage(Context context, String recipient, String message) {
		SmsManager smsManager = SmsManager.getDefault();
		smsManager.sendTextMessage(recipient, null, message, null, null);
	}

}