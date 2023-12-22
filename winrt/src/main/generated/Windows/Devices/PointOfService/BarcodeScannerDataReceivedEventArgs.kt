package Windows.Devices.PointOfService

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

@ABIMarker(BarcodeScannerDataReceivedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.BarcodeScannerDataReceivedEventArgs;{4234a7e2-ed97-467d-ad2b-01e44313a929})")
@WinRTByReference(brClass = BarcodeScannerDataReceivedEventArgs.ByReference::class)
public class BarcodeScannerDataReceivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBarcodeScannerDataReceivedEventArgs.WithDefault, IWinRTObject {
  private val __132358383_Interface: IBarcodeScannerDataReceivedEventArgs.WithDefault by lazy {
    as_132358383()
  }


  public override val __132358383_Ptr: JNAPointer? by lazy {
    __132358383_Interface.__132358383_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__132358383_Interface)

  private fun as_132358383(): IBarcodeScannerDataReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerDataReceivedEventArgs.ABI.makeIBarcodeScannerDataReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerDataReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerDataReceivedEventArgs.ABI.makeIBarcodeScannerDataReceivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BarcodeScannerDataReceivedEventArgs> {
    public override fun getValue() = BarcodeScannerDataReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: BarcodeScannerDataReceivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BarcodeScannerDataReceivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BarcodeScannerDataReceivedEventArgs {
      val address = segment.toRawLongValue()
      return BarcodeScannerDataReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: BarcodeScannerDataReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
