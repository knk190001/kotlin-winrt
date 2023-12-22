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

@ABIMarker(AlarmNotificationTriggerDetails.ABI::class)
@Signature("rc(Windows.Phone.Notification.Management.AlarmNotificationTriggerDetails;{38f5fa30-c738-4da2-908c-775d83c36abb})")
@WinRTByReference(brClass = AlarmNotificationTriggerDetails.ByReference::class)
public class AlarmNotificationTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAlarmNotificationTriggerDetails.WithDefault,
    IAccessoryNotificationTriggerDetails.WithDefault, IAlarmNotificationTriggerDetails2.WithDefault,
    IWinRTObject {
  private val __2067195112_Interface: IAlarmNotificationTriggerDetails.WithDefault by lazy {
    as_2067195112()
  }


  private val __1414915993_Interface: IAccessoryNotificationTriggerDetails.WithDefault by lazy {
    as_1414915993()
  }


  private val __341461018_Interface: IAlarmNotificationTriggerDetails2.WithDefault by lazy {
    as_341461018()
  }


  public override val __2067195112_Ptr: JNAPointer? by lazy {
    __2067195112_Interface.__2067195112_Ptr
  }


  public override val __1414915993_Ptr: JNAPointer? by lazy {
    __1414915993_Interface.__1414915993_Ptr
  }


  public override val __341461018_Ptr: JNAPointer? by lazy {
    __341461018_Interface.__341461018_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2067195112_Interface, __1414915993_Interface, __341461018_Interface)

  private fun as_2067195112(): IAlarmNotificationTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IAlarmNotificationTriggerDetails.ABI.makeIAlarmNotificationTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAlarmNotificationTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAlarmNotificationTriggerDetails.ABI.makeIAlarmNotificationTriggerDetails(ref.value))
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

  private fun as_341461018(): IAlarmNotificationTriggerDetails2.WithDefault {
    if(pointer == NULL) {
      return(IAlarmNotificationTriggerDetails2.ABI.makeIAlarmNotificationTriggerDetails2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAlarmNotificationTriggerDetails2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAlarmNotificationTriggerDetails2.ABI.makeIAlarmNotificationTriggerDetails2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AlarmNotificationTriggerDetails> {
    public override fun getValue() = AlarmNotificationTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: AlarmNotificationTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AlarmNotificationTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AlarmNotificationTriggerDetails {
      val address = segment.toRawLongValue()
      return AlarmNotificationTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: AlarmNotificationTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
