package Windows.UI.Composition

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(RectangleClip.ABI::class)
@Signature("rc(Windows.UI.Composition.RectangleClip;{b3e7549e-00b4-5b53-8be8-353f6c433101})")
@WinRTByReference(brClass = RectangleClip.ByReference::class)
public class RectangleClip(
  ptr: JNAPointer? = NULL
) : CompositionClip(ptr), IRectangleClip.WithDefault, IWinRTObject {
  private val __228263823_Interface: IRectangleClip.WithDefault by lazy {
    as_228263823()
  }


  public override val __228263823_Ptr: JNAPointer? by lazy {
    __228263823_Interface.__228263823_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__228263823_Interface)

  private fun as_228263823(): IRectangleClip.WithDefault {
    if(pointer == NULL) {
      return(IRectangleClip.ABI.makeIRectangleClip(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRectangleClip>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRectangleClip.ABI.makeIRectangleClip(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<RectangleClip>
      {
    public override fun getValue() = RectangleClip(pointer.getPointer(0))

    public fun setValue(value: RectangleClip): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RectangleClip, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RectangleClip {
      val address = segment.toRawLongValue()
      return RectangleClip(Pointer(address))
    }

    public override fun toNative(obj: RectangleClip): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
