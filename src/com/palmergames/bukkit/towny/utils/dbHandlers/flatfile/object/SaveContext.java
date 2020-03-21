package com.palmergames.bukkit.towny.utils.dbHandlers.flatfile.object;

import com.palmergames.bukkit.towny.utils.dbHandlers.flatfile.DatabaseHandler;
import com.palmergames.bukkit.towny.utils.dbHandlers.sql.object.SQLData;

public class SaveContext<T> {
	
	DatabaseHandler handler;
	
	public SaveContext(DatabaseHandler handler) {
		this.handler = handler;
	}

	public String toFileString(T obj, Class<T> type) {
		return handler.toFileString(obj, type);
	}

	public SQLData<T> toSQL(T obj, Class<T> type) {
		return handler.toSQL(obj, type);
	}
	
}