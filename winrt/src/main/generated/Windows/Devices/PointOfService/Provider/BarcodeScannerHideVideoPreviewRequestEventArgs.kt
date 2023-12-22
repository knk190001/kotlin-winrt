package Windows.Devices.PointOfService.Provider

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

@ABIMarker(BarcodeScannerHideVideoPreviewRequestEventArgs.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.Provider.BarcodeScannerHideVideoPreviewRequestEventArgs;{16a281fc-d6be-4bc7-9df1-33741f3eadea})")
@WinRTByReference(brClass = BarcodeScannerHideVideoPreviewRequestEventArgs.ByReference::class)
public class BarcodeScannerHideVideoPreviewRequestEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBarcodeScannerHideVideoPreviewRequestEventArgs.WithDefault, IWinRTObject {
  private val __1757992791_Interface: IBarcodeScannerHideVideoPreviewRequestEventArgs.WithDefault by
      lazy {
    as_1757992791()
  }


  public override val __1757992791_Ptr: JNAPointer? by lazy {
    __1757992791_Interface.__1757992791_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1757992791_Interface)

  private fun as_1757992791(): IBarcodeScannerHideVideoPreviewRequestEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerHideVideoPreviewRequestEventArgs.ABI.makeIBarcodeScannerHideVideoPreviewRequestEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerHideVideoPreviewRequestEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerHideVideoPreviewRequestEventArgs.ABI.makeIBarcodeScannerHideVideoPreviewRequestEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BarcodeScannerHideVideoPreviewRequestEventArgs> {
    public override fun getValue() =
        BarcodeScannerHideVideoPreviewRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: BarcodeScannerHideVideoPreviewRequestEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BarcodeScannerHideVideoPreviewRequestEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        BarcodeScannerHideVideoPreviewRequestEventArgs {
      val address = segment.toRawLongValue()
      return BarcodeScannerHideVideoPreviewRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: BarcodeScannerHideVideoPreviewRequestEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
