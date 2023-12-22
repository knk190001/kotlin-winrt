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

@ABIMarker(ToastNotificationTriggerDetails.ABI::class)
@Signature("rc(Windows.Phone.Notification.Management.ToastNotificationTriggerDetails;{c9314895-4e6d-4e9d-afec-9e921b875ae8})")
@WinRTByReference(brClass = ToastNotificationTriggerDetails.ByReference::class)
public class ToastNotificationTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IToastNotificationTriggerDetails.WithDefault,
    IAccessoryNotificationTriggerDetails.WithDefault, IToastNotificationTriggerDetails2.WithDefault,
    IWinRTObject {
  private val __1776388242_Interface: IToastNotificationTriggerDetails.WithDefault by lazy {
    as_1776388242()
  }


  private val __1414915993_Interface: IAccessoryNotificationTriggerDetails.WithDefault by lazy {
    as_1414915993()
  }


  private val __766539396_Interface: IToastNotificationTriggerDetails2.WithDefault by lazy {
    as_766539396()
  }


  public override val __1776388242_Ptr: JNAPointer? by lazy {
    __1776388242_Interface.__1776388242_Ptr
  }


  public override val __1414915993_Ptr: JNAPointer? by lazy {
    __1414915993_Interface.__1414915993_Ptr
  }


  public override val __766539396_Ptr: JNAPointer? by lazy {
    __766539396_Interface.__766539396_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1776388242_Interface, __1414915993_Interface, __766539396_Interface)

  private fun as_1776388242(): IToastNotificationTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IToastNotificationTriggerDetails.ABI.makeIToastNotificationTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToastNotificationTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastNotificationTriggerDetails.ABI.makeIToastNotificationTriggerDetails(ref.value))
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

  private fun as_766539396(): IToastNotificationTriggerDetails2.WithDefault {
    if(pointer == NULL) {
      return(IToastNotificationTriggerDetails2.ABI.makeIToastNotificationTriggerDetails2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToastNotificationTriggerDetails2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastNotificationTriggerDetails2.ABI.makeIToastNotificationTriggerDetails2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ToastNotificationTriggerDetails> {
    public override fun getValue() = ToastNotificationTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: ToastNotificationTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ToastNotificationTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ToastNotificationTriggerDetails {
      val address = segment.toRawLongValue()
      return ToastNotificationTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: ToastNotificationTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
