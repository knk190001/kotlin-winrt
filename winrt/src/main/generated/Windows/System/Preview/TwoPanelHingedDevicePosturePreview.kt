package Windows.System.Preview

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

@ABIMarker(TwoPanelHingedDevicePosturePreview.ABI::class)
@Signature("rc(Windows.System.Preview.TwoPanelHingedDevicePosturePreview;{72245c31-4b39-42a6-8e73-7235ade16853})")
@WinRTByReference(brClass = TwoPanelHingedDevicePosturePreview.ByReference::class)
public class TwoPanelHingedDevicePosturePreview(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITwoPanelHingedDevicePosturePreview.WithDefault, IWinRTObject {
  private val __686136068_Interface: ITwoPanelHingedDevicePosturePreview.WithDefault by lazy {
    as_686136068()
  }


  public override val __686136068_Ptr: JNAPointer? by lazy {
    __686136068_Interface.__686136068_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__686136068_Interface)

  private fun as_686136068(): ITwoPanelHingedDevicePosturePreview.WithDefault {
    if(pointer == NULL) {
      return(ITwoPanelHingedDevicePosturePreview.ABI.makeITwoPanelHingedDevicePosturePreview(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITwoPanelHingedDevicePosturePreview>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITwoPanelHingedDevicePosturePreview.ABI.makeITwoPanelHingedDevicePosturePreview(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TwoPanelHingedDevicePosturePreview> {
    public override fun getValue() = TwoPanelHingedDevicePosturePreview(pointer.getPointer(0))

    public fun setValue(value: TwoPanelHingedDevicePosturePreview): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TwoPanelHingedDevicePosturePreview, MemoryAddress> {
    public val ITwoPanelHingedDevicePosturePreviewStatics_Instance:
        ITwoPanelHingedDevicePosturePreviewStatics by lazy {
      createITwoPanelHingedDevicePosturePreviewStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITwoPanelHingedDevicePosturePreviewStatics():
        ITwoPanelHingedDevicePosturePreviewStatics {
      val refiid = Guid.REFIID(ITwoPanelHingedDevicePosturePreviewStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Preview.TwoPanelHingedDevicePosturePreview".toHandle(),refiid,interfacePtr)
      val result =
          ITwoPanelHingedDevicePosturePreviewStatics.ABI.makeITwoPanelHingedDevicePosturePreviewStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): TwoPanelHingedDevicePosturePreview {
      val address = segment.toRawLongValue()
      return TwoPanelHingedDevicePosturePreview(Pointer(address))
    }

    public override fun toNative(obj: TwoPanelHingedDevicePosturePreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefaultAsync() =
        ABI.ITwoPanelHingedDevicePosturePreviewStatics_Instance.GetDefaultAsync()
  }
}
