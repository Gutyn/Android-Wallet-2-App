package piuk.blockchain.android.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class ConnectivityStatus {
	
	ConnectivityStatus() { ; }
	
	public static boolean hasConnectivity(Context ctx) {
		boolean ret = false;
		
 		ConnectivityManager cm = (ConnectivityManager)ctx.getSystemService(Context.CONNECTIVITY_SERVICE);
        if(cm != null) {
    		NetworkInfo neti = cm.getActiveNetworkInfo();
        	if(neti != null) {
                if(neti.getState() == NetworkInfo.State.CONNECTED) {
                	ret = true;
                }
        	}
    	}

        return ret;
	}

	public static boolean hasWiFi(Context ctx) {
		boolean ret = false;
		
 		ConnectivityManager cm = (ConnectivityManager)ctx.getSystemService(Context.CONNECTIVITY_SERVICE);
        if(cm != null) {
    	    if(cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI).isConnected()) {
    	        ret = true;
    	    }
    	}

        return ret;
	}

}
