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

@ABIMarker(ReminderNotificationTriggerDetails.ABI::class)
@Signature("rc(Windows.Phone.Notification.Management.ReminderNotificationTriggerDetails;{5bddaa5d-9f61-4bf0-9feb-10502bc0b0c2})")
@WinRTByReference(brClass = ReminderNotificationTriggerDetails.ByReference::class)
public class ReminderNotificationTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IReminderNotificationTriggerDetails.WithDefault,
    IAccessoryNotificationTriggerDetails.WithDefault,
    IReminderNotificationTriggerDetails2.WithDefault, IWinRTObject {
  private val __390763691_Interface: IReminderNotificationTriggerDetails.WithDefault by lazy {
    as_390763691()
  }


  private val __1414915993_Interface: IAccessoryNotificationTriggerDetails.WithDefault by lazy {
    as_1414915993()
  }


  private val __771227517_Interface: IReminderNotificationTriggerDetails2.WithDefault by lazy {
    as_771227517()
  }


  public override val __390763691_Ptr: JNAPointer? by lazy {
    __390763691_Interface.__390763691_Ptr
  }


  public override val __1414915993_Ptr: JNAPointer? by lazy {
    __1414915993_Interface.__1414915993_Ptr
  }


  public override val __771227517_Ptr: JNAPointer? by lazy {
    __771227517_Interface.__771227517_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__390763691_Interface, __1414915993_Interface, __771227517_Interface)

  private fun as_390763691(): IReminderNotificationTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IReminderNotificationTriggerDetails.ABI.makeIReminderNotificationTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IReminderNotificationTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IReminderNotificationTriggerDetails.ABI.makeIReminderNotificationTriggerDetails(ref.value))
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

  private fun as_771227517(): IReminderNotificationTriggerDetails2.WithDefault {
    if(pointer == NULL) {
      return(IReminderNotificationTriggerDetails2.ABI.makeIReminderNotificationTriggerDetails2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IReminderNotificationTriggerDetails2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IReminderNotificationTriggerDetails2.ABI.makeIReminderNotificationTriggerDetails2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ReminderNotificationTriggerDetails> {
    public override fun getValue() = ReminderNotificationTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: ReminderNotificationTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ReminderNotificationTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ReminderNotificationTriggerDetails {
      val address = segment.toRawLongValue()
      return ReminderNotificationTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: ReminderNotificationTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
