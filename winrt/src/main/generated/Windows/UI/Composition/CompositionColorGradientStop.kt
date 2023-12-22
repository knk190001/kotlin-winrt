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

@ABIMarker(CompositionColorGradientStop.ABI::class)
@Signature("rc(Windows.UI.Composition.CompositionColorGradientStop;{6f00ca92-c801-4e41-9a8f-a53e20f57778})")
@WinRTByReference(brClass = CompositionColorGradientStop.ByReference::class)
public class CompositionColorGradientStop(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), ICompositionColorGradientStop.WithDefault, IWinRTObject {
  private val __72489081_Interface: ICompositionColorGradientStop.WithDefault by lazy {
    as_72489081()
  }


  public override val __72489081_Ptr: JNAPointer? by lazy {
    __72489081_Interface.__72489081_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__72489081_Interface)

  private fun as_72489081(): ICompositionColorGradientStop.WithDefault {
    if(pointer == NULL) {
      return(ICompositionColorGradientStop.ABI.makeICompositionColorGradientStop(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionColorGradientStop>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionColorGradientStop.ABI.makeICompositionColorGradientStop(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionColorGradientStop> {
    public override fun getValue() = CompositionColorGradientStop(pointer.getPointer(0))

    public fun setValue(value: CompositionColorGradientStop): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionColorGradientStop, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionColorGradientStop {
      val address = segment.toRawLongValue()
      return CompositionColorGradientStop(Pointer(address))
    }

    public override fun toNative(obj: CompositionColorGradientStop): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
