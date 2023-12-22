package Windows.System.Preview

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

@ABIMarker(TwoPanelHingedDevicePosturePreviewReadingChangedEventArgs.ABI::class)
@Signature("rc(Windows.System.Preview.TwoPanelHingedDevicePosturePreviewReadingChangedEventArgs;{2d2d1bc6-02ce-474a-a556-a75b1cf93a03})")
@WinRTByReference(brClass =
    TwoPanelHingedDevicePosturePreviewReadingChangedEventArgs.ByReference::class)
public class TwoPanelHingedDevicePosturePreviewReadingChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITwoPanelHingedDevicePosturePreviewReadingChangedEventArgs.WithDefault,
    IWinRTObject {
  private val __789410899_Interface:
      ITwoPanelHingedDevicePosturePreviewReadingChangedEventArgs.WithDefault by lazy {
    as_789410899()
  }


  public override val __789410899_Ptr: JNAPointer? by lazy {
    __789410899_Interface.__789410899_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__789410899_Interface)

  private fun as_789410899():
      ITwoPanelHingedDevicePosturePreviewReadingChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITwoPanelHingedDevicePosturePreviewReadingChangedEventArgs.ABI.makeITwoPanelHingedDevicePosturePreviewReadingChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITwoPanelHingedDevicePosturePreviewReadingChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITwoPanelHingedDevicePosturePreviewReadingChangedEventArgs.ABI.makeITwoPanelHingedDevicePosturePreviewReadingChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TwoPanelHingedDevicePosturePreviewReadingChangedEventArgs> {
    public override fun getValue() =
        TwoPanelHingedDevicePosturePreviewReadingChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: TwoPanelHingedDevicePosturePreviewReadingChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TwoPanelHingedDevicePosturePreviewReadingChangedEventArgs, MemoryAddress>
      {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        TwoPanelHingedDevicePosturePreviewReadingChangedEventArgs {
      val address = segment.toRawLongValue()
      return TwoPanelHingedDevicePosturePreviewReadingChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TwoPanelHingedDevicePosturePreviewReadingChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
