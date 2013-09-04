package com.mogu.webplugin;

import java.io.File;

import org.jivesoftware.openfire.XMPPServer;
import org.jivesoftware.openfire.container.Plugin;
import org.jivesoftware.openfire.container.PluginManager;

public class WebServerLogin implements Plugin {

	private XMPPServer server;
	
	@Override
	public void destroyPlugin() {
		// TODO Auto-generated method stub
		System.out.println("服务器停止，销毁插件！");
	}

	@Override
	public void initializePlugin(PluginManager arg0, File arg1) {
		// TODO Auto-generated method stub
		server=XMPPServer.getInstance();
	}

}
