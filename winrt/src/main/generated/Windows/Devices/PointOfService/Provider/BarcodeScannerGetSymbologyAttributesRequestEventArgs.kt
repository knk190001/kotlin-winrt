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

@ABIMarker(BarcodeScannerGetSymbologyAttributesRequestEventArgs.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.Provider.BarcodeScannerGetSymbologyAttributesRequestEventArgs;{7f89de3e-fb5d-493c-b402-356b24d574a6})")
@WinRTByReference(brClass = BarcodeScannerGetSymbologyAttributesRequestEventArgs.ByReference::class)
public class BarcodeScannerGetSymbologyAttributesRequestEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBarcodeScannerGetSymbologyAttributesRequestEventArgs.WithDefault,
    IWinRTObject {
  private val __1524933636_Interface:
      IBarcodeScannerGetSymbologyAttributesRequestEventArgs.WithDefault by lazy {
    as_1524933636()
  }


  public override val __1524933636_Ptr: JNAPointer? by lazy {
    __1524933636_Interface.__1524933636_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1524933636_Interface)

  private fun as_1524933636(): IBarcodeScannerGetSymbologyAttributesRequestEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerGetSymbologyAttributesRequestEventArgs.ABI.makeIBarcodeScannerGetSymbologyAttributesRequestEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerGetSymbologyAttributesRequestEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerGetSymbologyAttributesRequestEventArgs.ABI.makeIBarcodeScannerGetSymbologyAttributesRequestEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BarcodeScannerGetSymbologyAttributesRequestEventArgs> {
    public override fun getValue() =
        BarcodeScannerGetSymbologyAttributesRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: BarcodeScannerGetSymbologyAttributesRequestEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BarcodeScannerGetSymbologyAttributesRequestEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        BarcodeScannerGetSymbologyAttributesRequestEventArgs {
      val address = segment.toRawLongValue()
      return BarcodeScannerGetSymbologyAttributesRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: BarcodeScannerGetSymbologyAttributesRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
