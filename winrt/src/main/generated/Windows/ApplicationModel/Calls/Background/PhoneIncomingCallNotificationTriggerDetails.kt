package Windows.ApplicationModel.Calls.Background

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

@ABIMarker(PhoneIncomingCallNotificationTriggerDetails.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.Background.PhoneIncomingCallNotificationTriggerDetails;{2b0e6044-9b32-5d42-8222-d2812e39fb21})")
@WinRTByReference(brClass = PhoneIncomingCallNotificationTriggerDetails.ByReference::class)
public class PhoneIncomingCallNotificationTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhoneIncomingCallNotificationTriggerDetails.WithDefault, IWinRTObject {
  private val __1025114959_Interface: IPhoneIncomingCallNotificationTriggerDetails.WithDefault by
      lazy {
    as_1025114959()
  }


  public override val __1025114959_Ptr: JNAPointer? by lazy {
    __1025114959_Interface.__1025114959_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1025114959_Interface)

  private fun as_1025114959(): IPhoneIncomingCallNotificationTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IPhoneIncomingCallNotificationTriggerDetails.ABI.makeIPhoneIncomingCallNotificationTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneIncomingCallNotificationTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneIncomingCallNotificationTriggerDetails.ABI.makeIPhoneIncomingCallNotificationTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhoneIncomingCallNotificationTriggerDetails> {
    public override fun getValue() =
        PhoneIncomingCallNotificationTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: PhoneIncomingCallNotificationTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneIncomingCallNotificationTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        PhoneIncomingCallNotificationTriggerDetails {
      val address = segment.toRawLongValue()
      return PhoneIncomingCallNotificationTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: PhoneIncomingCallNotificationTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
