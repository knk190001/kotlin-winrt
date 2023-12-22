package Windows.UI.Composition

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(DelegatedInkTrailVisual.ABI::class)
@Signature("rc(Windows.UI.Composition.DelegatedInkTrailVisual;{856e60b1-e1ab-5b23-8e3d-d513f221c998})")
@WinRTByReference(brClass = DelegatedInkTrailVisual.ByReference::class)
public class DelegatedInkTrailVisual(
  ptr: JNAPointer? = NULL
) : Visual(ptr), IDelegatedInkTrailVisual.WithDefault, IWinRTObject {
  private val __813954833_Interface: IDelegatedInkTrailVisual.WithDefault by lazy {
    as_813954833()
  }


  public override val __813954833_Ptr: JNAPointer? by lazy {
    __813954833_Interface.__813954833_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__813954833_Interface)

  private fun as_813954833(): IDelegatedInkTrailVisual.WithDefault {
    if(pointer == NULL) {
      return(IDelegatedInkTrailVisual.ABI.makeIDelegatedInkTrailVisual(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDelegatedInkTrailVisual>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDelegatedInkTrailVisual.ABI.makeIDelegatedInkTrailVisual(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DelegatedInkTrailVisual> {
    public override fun getValue() = DelegatedInkTrailVisual(pointer.getPointer(0))

    public fun setValue(value: DelegatedInkTrailVisual): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DelegatedInkTrailVisual, MemoryAddress> {
    public val IDelegatedInkTrailVisualStatics_Instance: IDelegatedInkTrailVisualStatics by lazy {
      createIDelegatedInkTrailVisualStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDelegatedInkTrailVisualStatics(): IDelegatedInkTrailVisualStatics {
      val refiid = Guid.REFIID(IDelegatedInkTrailVisualStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Composition.DelegatedInkTrailVisual".toHandle(),refiid,interfacePtr)
      val result =
          IDelegatedInkTrailVisualStatics.ABI.makeIDelegatedInkTrailVisualStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DelegatedInkTrailVisual {
      val address = segment.toRawLongValue()
      return DelegatedInkTrailVisual(Pointer(address))
    }

    public override fun toNative(obj: DelegatedInkTrailVisual): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create(compositor: Compositor) =
        ABI.IDelegatedInkTrailVisualStatics_Instance.Create(compositor)

    public fun CreateForSwapChain(compositor: Compositor, swapChain: ICompositionSurface) =
        ABI.IDelegatedInkTrailVisualStatics_Instance.CreateForSwapChain(compositor, swapChain)
  }
}
