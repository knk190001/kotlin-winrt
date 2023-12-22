package Windows.ApplicationModel.Preview.Holographic

import Windows.ApplicationModel.Activation.IActivatedEventArgs
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(HolographicApplicationPreview.ABI::class)
@WinRTByReference(brClass = HolographicApplicationPreview.ByReference::class)
public class HolographicApplicationPreview(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HolographicApplicationPreview> {
    public override fun getValue() = HolographicApplicationPreview(pointer.getPointer(0))

    public fun setValue(value: HolographicApplicationPreview): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HolographicApplicationPreview, MemoryAddress> {
    public val IHolographicApplicationPreviewStatics_Instance: IHolographicApplicationPreviewStatics
        by lazy {
      createIHolographicApplicationPreviewStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHolographicApplicationPreviewStatics():
        IHolographicApplicationPreviewStatics {
      val refiid = Guid.REFIID(IHolographicApplicationPreviewStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Preview.Holographic.HolographicApplicationPreview".toHandle(),refiid,interfacePtr)
      val result =
          IHolographicApplicationPreviewStatics.ABI.makeIHolographicApplicationPreviewStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): HolographicApplicationPreview {
      val address = segment.toRawLongValue()
      return HolographicApplicationPreview(Pointer(address))
    }

    public override fun toNative(obj: HolographicApplicationPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun IsCurrentViewPresentedOnHolographicDisplay() =
        ABI.IHolographicApplicationPreviewStatics_Instance.IsCurrentViewPresentedOnHolographicDisplay()

    public fun IsHolographicActivation(activatedEventArgs: IActivatedEventArgs) =
        ABI.IHolographicApplicationPreviewStatics_Instance.IsHolographicActivation(activatedEventArgs)
  }
}
