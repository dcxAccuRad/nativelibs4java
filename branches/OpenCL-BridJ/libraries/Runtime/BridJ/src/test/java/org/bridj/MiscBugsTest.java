package org.bridj;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;

import static org.bridj.Pointer.*;
import static org.junit.Assert.*;

public class MiscBugsTest {
  
	@Test
	public void emptyIteratorFromUnmanagedPointer() {
		Pointer<Byte> ptr = allocateBytes(10);
		assertTrue(!ptr.isEmpty());
		assertTrue(ptr.iterator().next() != null);
		
		Pointer<Byte> unmanaged = pointerToAddress(ptr.getPeer()).as(Byte.class);
		assertTrue(!unmanaged.isEmpty());
		assertTrue(unmanaged.iterator().next() != null);
	}
}
