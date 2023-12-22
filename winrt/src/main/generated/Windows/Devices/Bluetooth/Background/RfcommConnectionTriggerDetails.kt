package Windows.Devices.Bluetooth.Background

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

@ABIMarker(RfcommConnectionTriggerDetails.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.Background.RfcommConnectionTriggerDetails;{f922734d-2e3c-4efc-ab59-fc5cf96f97e3})")
@WinRTByReference(brClass = RfcommConnectionTriggerDetails.ByReference::class)
public class RfcommConnectionTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRfcommConnectionTriggerDetails.WithDefault, IWinRTObject {
  private val __2050734023_Interface: IRfcommConnectionTriggerDetails.WithDefault by lazy {
    as_2050734023()
  }


  public override val __2050734023_Ptr: JNAPointer? by lazy {
    __2050734023_Interface.__2050734023_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2050734023_Interface)

  private fun as_2050734023(): IRfcommConnectionTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IRfcommConnectionTriggerDetails.ABI.makeIRfcommConnectionTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRfcommConnectionTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRfcommConnectionTriggerDetails.ABI.makeIRfcommConnectionTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RfcommConnectionTriggerDetails> {
    public override fun getValue() = RfcommConnectionTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: RfcommConnectionTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RfcommConnectionTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RfcommConnectionTriggerDetails {
      val address = segment.toRawLongValue()
      return RfcommConnectionTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: RfcommConnectionTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
