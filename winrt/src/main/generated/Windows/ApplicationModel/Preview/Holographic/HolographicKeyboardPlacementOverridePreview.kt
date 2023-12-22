package Windows.ApplicationModel.Preview.Holographic

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

@ABIMarker(HolographicKeyboardPlacementOverridePreview.ABI::class)
@Signature("rc(Windows.ApplicationModel.Preview.Holographic.HolographicKeyboardPlacementOverridePreview;{c8a8ce3a-dfde-5a14-8d5f-182c526dd9c4})")
@WinRTByReference(brClass = HolographicKeyboardPlacementOverridePreview.ByReference::class)
public class HolographicKeyboardPlacementOverridePreview(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHolographicKeyboardPlacementOverridePreview.WithDefault, IWinRTObject {
  private val __622564929_Interface: IHolographicKeyboardPlacementOverridePreview.WithDefault by
      lazy {
    as_622564929()
  }


  public override val __622564929_Ptr: JNAPointer? by lazy {
    __622564929_Interface.__622564929_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__622564929_Interface)

  private fun as_622564929(): IHolographicKeyboardPlacementOverridePreview.WithDefault {
    if(pointer == NULL) {
      return(IHolographicKeyboardPlacementOverridePreview.ABI.makeIHolographicKeyboardPlacementOverridePreview(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicKeyboardPlacementOverridePreview>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicKeyboardPlacementOverridePreview.ABI.makeIHolographicKeyboardPlacementOverridePreview(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HolographicKeyboardPlacementOverridePreview> {
    public override fun getValue() =
        HolographicKeyboardPlacementOverridePreview(pointer.getPointer(0))

    public fun setValue(value: HolographicKeyboardPlacementOverridePreview): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HolographicKeyboardPlacementOverridePreview, MemoryAddress> {
    public val IHolographicKeyboardPlacementOverridePreviewStatics_Instance:
        IHolographicKeyboardPlacementOverridePreviewStatics by lazy {
      createIHolographicKeyboardPlacementOverridePreviewStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHolographicKeyboardPlacementOverridePreviewStatics():
        IHolographicKeyboardPlacementOverridePreviewStatics {
      val refiid = Guid.REFIID(IHolographicKeyboardPlacementOverridePreviewStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Preview.Holographic.HolographicKeyboardPlacementOverridePreview".toHandle(),refiid,interfacePtr)
      val result =
          IHolographicKeyboardPlacementOverridePreviewStatics.ABI.makeIHolographicKeyboardPlacementOverridePreviewStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress):
        HolographicKeyboardPlacementOverridePreview {
      val address = segment.toRawLongValue()
      return HolographicKeyboardPlacementOverridePreview(Pointer(address))
    }

    public override fun toNative(obj: HolographicKeyboardPlacementOverridePreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForCurrentView() =
        ABI.IHolographicKeyboardPlacementOverridePreviewStatics_Instance.GetForCurrentView()
  }
}
