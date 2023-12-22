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

@ABIMarker(PhoneIncomingCallDismissedTriggerDetails.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.Background.PhoneIncomingCallDismissedTriggerDetails;{bad30276-83b6-5732-9c38-0c206546196a})")
@WinRTByReference(brClass = PhoneIncomingCallDismissedTriggerDetails.ByReference::class)
public class PhoneIncomingCallDismissedTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhoneIncomingCallDismissedTriggerDetails.WithDefault, IWinRTObject {
  private val __1623900007_Interface: IPhoneIncomingCallDismissedTriggerDetails.WithDefault by
      lazy {
    as_1623900007()
  }


  public override val __1623900007_Ptr: JNAPointer? by lazy {
    __1623900007_Interface.__1623900007_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1623900007_Interface)

  private fun as_1623900007(): IPhoneIncomingCallDismissedTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IPhoneIncomingCallDismissedTriggerDetails.ABI.makeIPhoneIncomingCallDismissedTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneIncomingCallDismissedTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneIncomingCallDismissedTriggerDetails.ABI.makeIPhoneIncomingCallDismissedTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhoneIncomingCallDismissedTriggerDetails> {
    public override fun getValue() = PhoneIncomingCallDismissedTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: PhoneIncomingCallDismissedTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneIncomingCallDismissedTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        PhoneIncomingCallDismissedTriggerDetails {
      val address = segment.toRawLongValue()
      return PhoneIncomingCallDismissedTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: PhoneIncomingCallDismissedTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
