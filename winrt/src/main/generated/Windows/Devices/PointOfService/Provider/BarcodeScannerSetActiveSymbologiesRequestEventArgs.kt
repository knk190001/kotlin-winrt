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

@ABIMarker(BarcodeScannerSetActiveSymbologiesRequestEventArgs.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.Provider.BarcodeScannerSetActiveSymbologiesRequestEventArgs;{06305afa-7bf6-4d52-801a-330272f60ae1})")
@WinRTByReference(brClass = BarcodeScannerSetActiveSymbologiesRequestEventArgs.ByReference::class)
public class BarcodeScannerSetActiveSymbologiesRequestEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBarcodeScannerSetActiveSymbologiesRequestEventArgs.WithDefault, IWinRTObject
    {
  private val __147372729_Interface: IBarcodeScannerSetActiveSymbologiesRequestEventArgs.WithDefault
      by lazy {
    as_147372729()
  }


  public override val __147372729_Ptr: JNAPointer? by lazy {
    __147372729_Interface.__147372729_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__147372729_Interface)

  private fun as_147372729(): IBarcodeScannerSetActiveSymbologiesRequestEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerSetActiveSymbologiesRequestEventArgs.ABI.makeIBarcodeScannerSetActiveSymbologiesRequestEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerSetActiveSymbologiesRequestEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerSetActiveSymbologiesRequestEventArgs.ABI.makeIBarcodeScannerSetActiveSymbologiesRequestEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BarcodeScannerSetActiveSymbologiesRequestEventArgs> {
    public override fun getValue() =
        BarcodeScannerSetActiveSymbologiesRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: BarcodeScannerSetActiveSymbologiesRequestEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BarcodeScannerSetActiveSymbologiesRequestEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        BarcodeScannerSetActiveSymbologiesRequestEventArgs {
      val address = segment.toRawLongValue()
      return BarcodeScannerSetActiveSymbologiesRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: BarcodeScannerSetActiveSymbologiesRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
