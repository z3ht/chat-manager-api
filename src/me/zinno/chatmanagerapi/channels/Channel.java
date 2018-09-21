package me.zinno.chatmanagerapi.channels;

import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;
import java.util.List;

public class Channel {
	
	private Plugin plugin;
	private List<Listener> channelListeners = new ArrayList<>();
	
	private String channelName;
	
	public Channel(Plugin plugin, String channelName, Listener... channelListeners) {
		this.plugin = plugin;
		this.channelName = channelName;
		for(Listener listener : channelListeners)
			addChannelListener(listener);
	}
	
	public void delChannelListener(Listener channelListener) {
		HandlerList.unregisterAll(channelListener);
	}
	
	public void addChannelListener(Listener channelListener) {
		channelListeners.add(channelListener);
		plugin.getServer().getPluginManager().registerEvents(channelListener, plugin);
	}
	
	public void delChannel() {
		for(Listener channelListener : channelListeners)
			delChannelListener(channelListener);
	}
	
}
