package com.whayer.wx.wechat.util;

import com.whayer.wx.wechat.vo.AccessToken;

public class Constant {

	public static String APPID = "wx1fa5a2f6ba043f0c"; //"wxe6d4623ad9018e7e";
	public static String APPSECRET = "ac9a32235b65545cbb08764f5b3a631a"; //"b371c2eb4c348828367ab949ee7d4f39";
	public static String TOKEN = "scskss";
	public static String NOTIFY = "http://duyu.ngrok.cc/verify";
	public static AccessToken ACCESS_TOKEN = null;
	
	//小程序原始id
	public static String ORIGINALID = "gh_af6d9f826816";
	
	//access_token地址
	public static String ACCESS_TOKEN_URL =  "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
	//创建门店地址
	public static String BATCHADD = "https://api.weixin.qq.com/card/location/batchadd?access_token=TOKEN";
	//上传logo地址
	public static String UPLOADING = "https://api.weixin.qq.com/cgi-bin/media/uploadimg?access_token=ACCESS_TOKEN";
}