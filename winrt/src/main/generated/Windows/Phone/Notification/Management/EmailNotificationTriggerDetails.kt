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

@ABIMarker(EmailNotificationTriggerDetails.ABI::class)
@Signature("rc(Windows.Phone.Notification.Management.EmailNotificationTriggerDetails;{f3b82612-46cf-4e70-8e0d-7b2e04ab492b})")
@WinRTByReference(brClass = EmailNotificationTriggerDetails.ByReference::class)
public class EmailNotificationTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEmailNotificationTriggerDetails.WithDefault,
    IAccessoryNotificationTriggerDetails.WithDefault, IEmailNotificationTriggerDetails2.WithDefault,
    IWinRTObject {
  private val __678335651_Interface: IEmailNotificationTriggerDetails.WithDefault by lazy {
    as_678335651()
  }


  private val __1414915993_Interface: IAccessoryNotificationTriggerDetails.WithDefault by lazy {
    as_1414915993()
  }


  private val __446431249_Interface: IEmailNotificationTriggerDetails2.WithDefault by lazy {
    as_446431249()
  }


  public override val __678335651_Ptr: JNAPointer? by lazy {
    __678335651_Interface.__678335651_Ptr
  }


  public override val __1414915993_Ptr: JNAPointer? by lazy {
    __1414915993_Interface.__1414915993_Ptr
  }


  public override val __446431249_Ptr: JNAPointer? by lazy {
    __446431249_Interface.__446431249_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__678335651_Interface, __1414915993_Interface, __446431249_Interface)

  private fun as_678335651(): IEmailNotificationTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IEmailNotificationTriggerDetails.ABI.makeIEmailNotificationTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailNotificationTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailNotificationTriggerDetails.ABI.makeIEmailNotificationTriggerDetails(ref.value))
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

  private fun as_446431249(): IEmailNotificationTriggerDetails2.WithDefault {
    if(pointer == NULL) {
      return(IEmailNotificationTriggerDetails2.ABI.makeIEmailNotificationTriggerDetails2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEmailNotificationTriggerDetails2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEmailNotificationTriggerDetails2.ABI.makeIEmailNotificationTriggerDetails2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EmailNotificationTriggerDetails> {
    public override fun getValue() = EmailNotificationTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: EmailNotificationTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EmailNotificationTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EmailNotificationTriggerDetails {
      val address = segment.toRawLongValue()
      return EmailNotificationTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: EmailNotificationTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
