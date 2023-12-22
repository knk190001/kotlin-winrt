package Windows.Phone.Notification.Management

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

@ABIMarker(EmailReadNotificationTriggerDetails.ABI::class)
@Signature("rc(Windows.Phone.Notification.Management.EmailReadNotificationTriggerDetails;{f5b7a087-06f3-4e3e-8c42-325e67010413})")
@WinRTByReference(brClass = EmailReadNotificationTriggerDetails.ByReference::class)
public class EmailReadNotificationTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailReadNotificationTriggerDetails.WithDefault,
    IAccessoryNotificationTriggerDetails.WithDefault, IWinRTObject {
  private val __2134789159_Interface: IEmailReadNotificationTriggerDetails.WithDefault by lazy {
    as_2134789159()
  }


  private val __1414915993_Interface: IAccessoryNotificationTriggerDetails.WithDefault by lazy {
    as_1414915993()
  }


  public override val __2134789159_Ptr: JNAPointer? by lazy {
    __2134789159_Interface.__2134789159_Ptr
  }


  public override val __1414915993_Ptr: JNAPointer? by lazy {
    __1414915993_Interface.__1414915993_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2134789159_Interface, __1414915993_Interface)

  private fun as_2134789159(): IEmailReadNotificationTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IEmailReadNotificationTriggerDetails.ABI.makeIEmailReadNotificationTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailReadNotificationTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailReadNotificationTriggerDetails.ABI.makeIEmailReadNotificationTriggerDetails(ref.value))
  }

  private fun as_1414915993(): IAccessoryNotificationTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IAccessoryNotificationTriggerDetails.ABI.makeIAccessoryNotificationTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAccessoryNotificationTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAccessoryNotificationTriggerDetails.ABI.makeIAccessoryNotificationTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailReadNotificationTriggerDetails> {
    public override fun getValue() = EmailReadNotificationTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: EmailReadNotificationTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailReadNotificationTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EmailReadNotificationTriggerDetails {
      val address = segment.toRawLongValue()
      return EmailReadNotificationTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: EmailReadNotificationTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
