package net.bbrooker.minespace.util;

import net.minecraft.util.ChatMessageComponent;

public class EntityUtils {

	public static String getDroidSittingMessage(boolean isSitting)
	{
		return isSitting ? "Stay here droid" : "Follow me droid";
	}
}
