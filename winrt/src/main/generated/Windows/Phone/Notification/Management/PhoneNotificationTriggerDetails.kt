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

@ABIMarker(PhoneNotificationTriggerDetails.ABI::class)
@Signature("rc(Windows.Phone.Notification.Management.PhoneNotificationTriggerDetails;{ccc2fdf7-09c3-4118-91bc-ca6323a8d383})")
@WinRTByReference(brClass = PhoneNotificationTriggerDetails.ByReference::class)
public class PhoneNotificationTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhoneNotificationTriggerDetails.WithDefault,
    IAccessoryNotificationTriggerDetails.WithDefault, IWinRTObject {
  private val __1884029941_Interface: IPhoneNotificationTriggerDetails.WithDefault by lazy {
    as_1884029941()
  }


  private val __1414915993_Interface: IAccessoryNotificationTriggerDetails.WithDefault by lazy {
    as_1414915993()
  }


  public override val __1884029941_Ptr: JNAPointer? by lazy {
    __1884029941_Interface.__1884029941_Ptr
  }


  public override val __1414915993_Ptr: JNAPointer? by lazy {
    __1414915993_Interface.__1414915993_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1884029941_Interface, __1414915993_Interface)

  private fun as_1884029941(): IPhoneNotificationTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IPhoneNotificationTriggerDetails.ABI.makeIPhoneNotificationTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneNotificationTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneNotificationTriggerDetails.ABI.makeIPhoneNotificationTriggerDetails(ref.value))
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
      IByReference<PhoneNotificationTriggerDetails> {
    public override fun getValue() = PhoneNotificationTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: PhoneNotificationTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneNotificationTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PhoneNotificationTriggerDetails {
      val address = segment.toRawLongValue()
      return PhoneNotificationTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: PhoneNotificationTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
