package Windows.UI.Input.Inking.Preview

import Windows.Foundation.IClosable
import Windows.Foundation.Rect
import Windows.UI.Composition.Visual
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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PalmRejectionDelayZonePreview.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.Preview.PalmRejectionDelayZonePreview;{62b496cb-539d-5343-a65f-41f5300ec70c})")
@WinRTByReference(brClass = PalmRejectionDelayZonePreview.ByReference::class)
public class PalmRejectionDelayZonePreview(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPalmRejectionDelayZonePreview.WithDefault, IClosable.WithDefault,
    IWinRTObject {
  private val __273325040_Interface: IPalmRejectionDelayZonePreview.WithDefault by lazy {
    as_273325040()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __273325040_Ptr: JNAPointer? by lazy {
    __273325040_Interface.__273325040_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__273325040_Interface, __1260617006_Interface)

  private fun as_273325040(): IPalmRejectionDelayZonePreview.WithDefault {
    if(pointer == NULL) {
      return(IPalmRejectionDelayZonePreview.ABI.makeIPalmRejectionDelayZonePreview(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPalmRejectionDelayZonePreview>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPalmRejectionDelayZonePreview.ABI.makeIPalmRejectionDelayZonePreview(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PalmRejectionDelayZonePreview> {
    public override fun getValue() = PalmRejectionDelayZonePreview(pointer.getPointer(0))

    public fun setValue(value: PalmRejectionDelayZonePreview): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PalmRejectionDelayZonePreview, MemoryAddress> {
    public val IPalmRejectionDelayZonePreviewStatics_Instance: IPalmRejectionDelayZonePreviewStatics
        by lazy {
      createIPalmRejectionDelayZonePreviewStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPalmRejectionDelayZonePreviewStatics():
        IPalmRejectionDelayZonePreviewStatics {
      val refiid = Guid.REFIID(IPalmRejectionDelayZonePreviewStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.Inking.Preview.PalmRejectionDelayZonePreview".toHandle(),refiid,interfacePtr)
      val result =
          IPalmRejectionDelayZonePreviewStatics.ABI.makeIPalmRejectionDelayZonePreviewStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PalmRejectionDelayZonePreview {
      val address = segment.toRawLongValue()
      return PalmRejectionDelayZonePreview(Pointer(address))
    }

    public override fun toNative(obj: PalmRejectionDelayZonePreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateForVisual(inputPanelVisual: Visual, inputPanelRect: Rect) =
        ABI.IPalmRejectionDelayZonePreviewStatics_Instance.CreateForVisual(inputPanelVisual,
        inputPanelRect)

    public fun CreateForVisual(
      inputPanelVisual: Visual,
      inputPanelRect: Rect,
      viewportVisual: Visual,
      viewportRect: Rect
    ) = ABI.IPalmRejectionDelayZonePreviewStatics_Instance.CreateForVisual(inputPanelVisual,
        inputPanelRect, viewportVisual, viewportRect)
  }
}
