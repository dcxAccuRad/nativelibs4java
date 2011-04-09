package com.nativelibs4java.mono.bridj;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : mono/metadata/debug-mono-symfile.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("mono") 
public class MonoDebugLocalVar extends StructObject {
	public MonoDebugLocalVar() {
		super();
	}
	public MonoDebugLocalVar(Pointer pointer) {
		super(pointer);
	}
	/// C type : char*
	@Field(0) 
	public Pointer<Byte > name() {
		return this.io.getPointerField(this, 0);
	}
	/// C type : char*
	@Field(0) 
	public MonoDebugLocalVar name(Pointer<Byte > name) {
		this.io.setPointerField(this, 0, name);
		return this;
	}
	@Field(1) 
	public int index() {
		return this.io.getIntField(this, 1);
	}
	@Field(1) 
	public MonoDebugLocalVar index(int index) {
		this.io.setIntField(this, 1, index);
		return this;
	}
	/**
	 * Might be null for the main scope<br>
	 * C type : MonoDebugCodeBlock*
	 */
	@Field(2) 
	public Pointer<MonoDebugCodeBlock > block() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * Might be null for the main scope<br>
	 * C type : MonoDebugCodeBlock*
	 */
	@Field(2) 
	public MonoDebugLocalVar block(Pointer<MonoDebugCodeBlock > block) {
		this.io.setPointerField(this, 2, block);
		return this;
	}
}