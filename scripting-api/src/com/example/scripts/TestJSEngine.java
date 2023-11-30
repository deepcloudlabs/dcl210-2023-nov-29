package com.example.scripts;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import javax.script.Compilable;
import javax.script.CompiledScript;
import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import com.example.service.Calculator;

public class TestJSEngine {

	public static void main(String[] args) throws ScriptException {
		ScriptEngineManager sem = new ScriptEngineManager();
		ScriptEngine jsEngine = sem.getEngineByName("ECMAScript");
		InputStream is = TestJSEngine.class.getResourceAsStream("/scripts/my.js");
		Reader reader = new InputStreamReader(is);
		CompiledScript cs = ((Compilable) jsEngine).compile(reader);
		cs.eval();
		Calculator calc = ((Invocable) jsEngine).getInterface(Calculator.class);
		System.err.println(calc.add(2., 5.));
		System.err.println(calc.getClass());
	}

}
