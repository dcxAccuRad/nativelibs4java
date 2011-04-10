package com.nativelibs4java.mono.bridj;
import com.nativelibs4java.mono.bridj.MonoLibrary.MonoType;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : /Library/Frameworks/Mono.framework/Headers/mono-2.0/mono/metadata/mono-debug.h:124</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("mono") 
public class MonoDebugVarInfo extends StructObject {
	public MonoDebugVarInfo() {
		super();
	}
	public MonoDebugVarInfo(Pointer pointer) {
		super(pointer);
	}
	@Field(0) 
	public int index() {
		return this.io.getIntField(this, 0);
	}
	@Field(0) 
	public MonoDebugVarInfo index(int index) {
		this.io.setIntField(this, 0, index);
		return this;
	}
	@Field(1) 
	public int offset() {
		return this.io.getIntField(this, 1);
	}
	@Field(1) 
	public MonoDebugVarInfo offset(int offset) {
		this.io.setIntField(this, 1, offset);
		return this;
	}
	@Field(2) 
	public int size() {
		return this.io.getIntField(this, 2);
	}
	@Field(2) 
	public MonoDebugVarInfo size(int size) {
		this.io.setIntField(this, 2, size);
		return this;
	}
	@Field(3) 
	public int begin_scope() {
		return this.io.getIntField(this, 3);
	}
	@Field(3) 
	public MonoDebugVarInfo begin_scope(int begin_scope) {
		this.io.setIntField(this, 3, begin_scope);
		return this;
	}
	@Field(4) 
	public int end_scope() {
		return this.io.getIntField(this, 4);
	}
	@Field(4) 
	public MonoDebugVarInfo end_scope(int end_scope) {
		this.io.setIntField(this, 4, end_scope);
		return this;
	}
	/// C type : MonoType*
	@Field(5) 
	public Pointer<MonoType > type() {
		return this.io.getPointerField(this, 5);
	}
	/// C type : MonoType*
	@Field(5) 
	public MonoDebugVarInfo type(Pointer<MonoType > type) {
		this.io.setPointerField(this, 5, type);
		return this;
	}
}