package Windows.Devices.Bluetooth.Rfcomm

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

@ABIMarker(RfcommDeviceServicesResult.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.Rfcomm.RfcommDeviceServicesResult;{3b48388c-7ccf-488e-9625-d259a5732d55})")
@WinRTByReference(brClass = RfcommDeviceServicesResult.ByReference::class)
public class RfcommDeviceServicesResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRfcommDeviceServicesResult.WithDefault, IWinRTObject {
  private val __154072606_Interface: IRfcommDeviceServicesResult.WithDefault by lazy {
    as_154072606()
  }


  public override val __154072606_Ptr: JNAPointer? by lazy {
    __154072606_Interface.__154072606_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__154072606_Interface)

  private fun as_154072606(): IRfcommDeviceServicesResult.WithDefault {
    if(pointer == NULL) {
      return(IRfcommDeviceServicesResult.ABI.makeIRfcommDeviceServicesResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRfcommDeviceServicesResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRfcommDeviceServicesResult.ABI.makeIRfcommDeviceServicesResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RfcommDeviceServicesResult> {
    public override fun getValue() = RfcommDeviceServicesResult(pointer.getPointer(0))

    public fun setValue(value: RfcommDeviceServicesResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RfcommDeviceServicesResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RfcommDeviceServicesResult {
      val address = segment.toRawLongValue()
      return RfcommDeviceServicesResult(Pointer(address))
    }

    public override fun toNative(obj: RfcommDeviceServicesResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
