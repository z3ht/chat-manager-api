package me.zinno.chatmanagerapi.managers;

import me.zinno.chatmanagerapi.channels.Channel;

import java.util.HashSet;
import java.util.Set;

public class ChatManager {
	
	public Set<Channel> channelList = new HashSet<>();
	
	public void addChannel(Channel channel) {
		channelList.add(channel);
	}
	
	public void delChannel(Channel channel) {
		channel.delChannel();
		channelList.remove(channel);
	}

}
