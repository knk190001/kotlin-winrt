package Windows.Devices.Display.Core

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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DisplayFence.ABI::class)
@Signature("rc(Windows.Devices.Display.Core.DisplayFence;{04dcf9ef-3406-5700-8fec-77eba4c5a74b})")
@WinRTByReference(brClass = DisplayFence.ByReference::class)
public class DisplayFence(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDisplayFence.WithDefault, IWinRTObject {
  private val __2051520239_Interface: IDisplayFence.WithDefault by lazy {
    as_2051520239()
  }


  public override val __2051520239_Ptr: JNAPointer? by lazy {
    __2051520239_Interface.__2051520239_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2051520239_Interface)

  private fun as_2051520239(): IDisplayFence.WithDefault {
    if(pointer == NULL) {
      return(IDisplayFence.ABI.makeIDisplayFence(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayFence>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayFence.ABI.makeIDisplayFence(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DisplayFence> {
    public override fun getValue() = DisplayFence(pointer.getPointer(0))

    public fun setValue(value: DisplayFence): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DisplayFence, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DisplayFence {
      val address = segment.toRawLongValue()
      return DisplayFence(Pointer(address))
    }

    public override fun toNative(obj: DisplayFence): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
