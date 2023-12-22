package Microsoft.UI.Xaml.Input

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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(Pointer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Input.Pointer;{1f9afbf5-11a3-5e68-aa1b-72febfa0ab23})")
@WinRTByReference(brClass = Pointer.ByReference::class)
public class Pointer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPointer.WithDefault, IWinRTObject {
  private val __203456210_Interface: IPointer.WithDefault by lazy {
    as_203456210()
  }


  public override val __203456210_Ptr: JNAPointer? by lazy {
    __203456210_Interface.__203456210_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__203456210_Interface)

  private fun as_203456210(): IPointer.WithDefault {
    if(pointer == NULL) {
      return(IPointer.ABI.makeIPointer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPointer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPointer.ABI.makeIPointer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Pointer> {
    public override fun getValue() = Pointer(pointer.getPointer(0))

    public fun setValue(value: Pointer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Pointer, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): Pointer {
      val address = segment.toRawLongValue()
      return Pointer(com.sun.jna.Pointer(address))
    }

    public override fun toNative(obj: Pointer): MemoryAddress =
        MemoryAddress.ofLong(com.sun.jna.Pointer.nativeValue(obj.pointer))
  }
}
