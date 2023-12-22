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

@ABIMarker(BarcodeScannerFrameReaderFrameArrivedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.Provider.BarcodeScannerFrameReaderFrameArrivedEventArgs;{b0bbd604-54fd-436d-8629-712e787223dd})")
@WinRTByReference(brClass = BarcodeScannerFrameReaderFrameArrivedEventArgs.ByReference::class)
public class BarcodeScannerFrameReaderFrameArrivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBarcodeScannerFrameReaderFrameArrivedEventArgs.WithDefault, IWinRTObject {
  private val __38999527_Interface: IBarcodeScannerFrameReaderFrameArrivedEventArgs.WithDefault by
      lazy {
    as_38999527()
  }


  public override val __38999527_Ptr: JNAPointer? by lazy {
    __38999527_Interface.__38999527_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__38999527_Interface)

  private fun as_38999527(): IBarcodeScannerFrameReaderFrameArrivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerFrameReaderFrameArrivedEventArgs.ABI.makeIBarcodeScannerFrameReaderFrameArrivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerFrameReaderFrameArrivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerFrameReaderFrameArrivedEventArgs.ABI.makeIBarcodeScannerFrameReaderFrameArrivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BarcodeScannerFrameReaderFrameArrivedEventArgs> {
    public override fun getValue() =
        BarcodeScannerFrameReaderFrameArrivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: BarcodeScannerFrameReaderFrameArrivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BarcodeScannerFrameReaderFrameArrivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        BarcodeScannerFrameReaderFrameArrivedEventArgs {
      val address = segment.toRawLongValue()
      return BarcodeScannerFrameReaderFrameArrivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: BarcodeScannerFrameReaderFrameArrivedEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
