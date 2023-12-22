package Windows.UI.StartScreen

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

@ABIMarker(VisualElementsRequestDeferral.ABI::class)
@Signature("rc(Windows.UI.StartScreen.VisualElementsRequestDeferral;{a1656eb0-0126-4357-8204-bd82bb2a046d})")
@WinRTByReference(brClass = VisualElementsRequestDeferral.ByReference::class)
public class VisualElementsRequestDeferral(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVisualElementsRequestDeferral.WithDefault, IWinRTObject {
  private val __676374631_Interface: IVisualElementsRequestDeferral.WithDefault by lazy {
    as_676374631()
  }


  public override val __676374631_Ptr: JNAPointer? by lazy {
    __676374631_Interface.__676374631_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__676374631_Interface)

  private fun as_676374631(): IVisualElementsRequestDeferral.WithDefault {
    if(pointer == NULL) {
      return(IVisualElementsRequestDeferral.ABI.makeIVisualElementsRequestDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVisualElementsRequestDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVisualElementsRequestDeferral.ABI.makeIVisualElementsRequestDeferral(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VisualElementsRequestDeferral> {
    public override fun getValue() = VisualElementsRequestDeferral(pointer.getPointer(0))

    public fun setValue(value: VisualElementsRequestDeferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VisualElementsRequestDeferral, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VisualElementsRequestDeferral {
      val address = segment.toRawLongValue()
      return VisualElementsRequestDeferral(Pointer(address))
    }

    public override fun toNative(obj: VisualElementsRequestDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
