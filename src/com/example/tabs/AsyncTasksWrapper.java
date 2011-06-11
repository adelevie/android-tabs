package com.example.tabs;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.widget.TextView;
import com.example.tools.RestClient;
import com.example.tools.RestClient.RequestMethod;

public class AsyncTasksWrapper {
	Activity activity;
	
	public AsyncTasksWrapper(Activity a) {
		activity = a;
	}
	
	public void getUrl() {
		new AsyncGetUrl().execute();
	}
	
	
	private class AsyncGetUrl extends AsyncTask<Void, Void, Void> {
		private final ProgressDialog dialog = new ProgressDialog(activity);
		private String response;
		
		protected void onPreExecute() {
			this.dialog.setMessage("Loading...");
			this.dialog.show();
		}
	
		@Override
		protected Void doInBackground(Void... params) {
			String url = "http://free.worldweatheronline.com/feed/weather.ashx?q=16803&format=json&num_of_days=5&key=586dac13bc212929112804";
			RestClient client = new RestClient(url);
			
			try {
				client.Execute(RequestMethod.GET);
				response = client.getResponse();
			} catch (Exception e) {
				e.printStackTrace();
			}
	
			return null;
		}
		
	
		protected void onPostExecute(final Void unused) {
			this.dialog.dismiss();
			TextView textview = new TextView(activity);
	        textview.setText(response);
	        (activity).setContentView(textview);
		}
		
	}

}



