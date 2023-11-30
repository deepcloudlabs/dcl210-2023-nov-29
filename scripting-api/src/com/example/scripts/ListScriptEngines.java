package com.example.scripts;

import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;

public class ListScriptEngines {

	public static void main(String[] args) {
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        for (ScriptEngineFactory sef: 
        	scriptEngineManager.getEngineFactories())
        	System.err.println(sef.getEngineName());
	}

}
