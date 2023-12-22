package Windows.Devices.Sms

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

@ABIMarker(SmsMessageReceivedTriggerDetails.ABI::class)
@Signature("rc(Windows.Devices.Sms.SmsMessageReceivedTriggerDetails;{2bcfcbd4-2657-4128-ad5f-e3877132bdb1})")
@WinRTByReference(brClass = SmsMessageReceivedTriggerDetails.ByReference::class)
public class SmsMessageReceivedTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmsMessageReceivedTriggerDetails.WithDefault, IWinRTObject {
  private val __300927557_Interface: ISmsMessageReceivedTriggerDetails.WithDefault by lazy {
    as_300927557()
  }


  public override val __300927557_Ptr: JNAPointer? by lazy {
    __300927557_Interface.__300927557_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__300927557_Interface)

  private fun as_300927557(): ISmsMessageReceivedTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(ISmsMessageReceivedTriggerDetails.ABI.makeISmsMessageReceivedTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmsMessageReceivedTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmsMessageReceivedTriggerDetails.ABI.makeISmsMessageReceivedTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SmsMessageReceivedTriggerDetails> {
    public override fun getValue() = SmsMessageReceivedTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: SmsMessageReceivedTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmsMessageReceivedTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SmsMessageReceivedTriggerDetails {
      val address = segment.toRawLongValue()
      return SmsMessageReceivedTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: SmsMessageReceivedTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
