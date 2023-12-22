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

@ABIMarker(BarcodeScannerSetSymbologyAttributesRequestEventArgs.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.Provider.BarcodeScannerSetSymbologyAttributesRequestEventArgs;{b2b89809-9824-47d4-85bd-d0077baa7bd2})")
@WinRTByReference(brClass = BarcodeScannerSetSymbologyAttributesRequestEventArgs.ByReference::class)
public class BarcodeScannerSetSymbologyAttributesRequestEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBarcodeScannerSetSymbologyAttributesRequestEventArgs.WithDefault,
    IWinRTObject {
  private val __356254856_Interface:
      IBarcodeScannerSetSymbologyAttributesRequestEventArgs.WithDefault by lazy {
    as_356254856()
  }


  public override val __356254856_Ptr: JNAPointer? by lazy {
    __356254856_Interface.__356254856_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__356254856_Interface)

  private fun as_356254856(): IBarcodeScannerSetSymbologyAttributesRequestEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerSetSymbologyAttributesRequestEventArgs.ABI.makeIBarcodeScannerSetSymbologyAttributesRequestEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerSetSymbologyAttributesRequestEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerSetSymbologyAttributesRequestEventArgs.ABI.makeIBarcodeScannerSetSymbologyAttributesRequestEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BarcodeScannerSetSymbologyAttributesRequestEventArgs> {
    public override fun getValue() =
        BarcodeScannerSetSymbologyAttributesRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: BarcodeScannerSetSymbologyAttributesRequestEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BarcodeScannerSetSymbologyAttributesRequestEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        BarcodeScannerSetSymbologyAttributesRequestEventArgs {
      val address = segment.toRawLongValue()
      return BarcodeScannerSetSymbologyAttributesRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: BarcodeScannerSetSymbologyAttributesRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
