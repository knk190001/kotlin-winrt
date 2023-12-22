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

@ABIMarker(CortanaTileNotificationTriggerDetails.ABI::class)
@Signature("rc(Windows.Phone.Notification.Management.CortanaTileNotificationTriggerDetails;{dc0f01d5-1489-46bb-b73b-7f90067ecf27})")
@WinRTByReference(brClass = CortanaTileNotificationTriggerDetails.ByReference::class)
public class CortanaTileNotificationTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICortanaTileNotificationTriggerDetails.WithDefault,
    IAccessoryNotificationTriggerDetails.WithDefault, IWinRTObject {
  private val __734014277_Interface: ICortanaTileNotificationTriggerDetails.WithDefault by lazy {
    as_734014277()
  }


  private val __1414915993_Interface: IAccessoryNotificationTriggerDetails.WithDefault by lazy {
    as_1414915993()
  }


  public override val __734014277_Ptr: JNAPointer? by lazy {
    __734014277_Interface.__734014277_Ptr
  }


  public override val __1414915993_Ptr: JNAPointer? by lazy {
    __1414915993_Interface.__1414915993_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__734014277_Interface, __1414915993_Interface)

  private fun as_734014277(): ICortanaTileNotificationTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(ICortanaTileNotificationTriggerDetails.ABI.makeICortanaTileNotificationTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICortanaTileNotificationTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICortanaTileNotificationTriggerDetails.ABI.makeICortanaTileNotificationTriggerDetails(ref.value))
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
      IByReference<CortanaTileNotificationTriggerDetails> {
    public override fun getValue() = CortanaTileNotificationTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: CortanaTileNotificationTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CortanaTileNotificationTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CortanaTileNotificationTriggerDetails {
      val address = segment.toRawLongValue()
      return CortanaTileNotificationTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: CortanaTileNotificationTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
