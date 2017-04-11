package com.optus.orderdetails;

import org.apache.commons.text.StrBuilder;

public class StringUtil {

	public static String truncate(String fsInput, int fsSize)
	{
		String fsRetVal = null;
		int liHeaderSize = (fsSize / 2) - 10;
		int liFooterIndex = fsInput.length() - liHeaderSize - 10;
		StrBuilder lsbTruncatedText = new StrBuilder(120);
		if(fsInput != null)
		{
			if(fsInput.length() >= fsSize)
			{
				lsbTruncatedText.append(fsInput.substring(0, liHeaderSize));
				lsbTruncatedText.append("... (truncated) ...");
				lsbTruncatedText.append(fsInput.substring(liFooterIndex));
				fsRetVal = lsbTruncatedText.toString();
			}
		}
		return fsRetVal;
	}
	
	
}
