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

@ABIMarker(PhoneNewVoicemailMessageTriggerDetails.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.Background.PhoneNewVoicemailMessageTriggerDetails;{13a8c01b-b831-48d3-8ba9-8d22a6580dcf})")
@WinRTByReference(brClass = PhoneNewVoicemailMessageTriggerDetails.ByReference::class)
public class PhoneNewVoicemailMessageTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhoneNewVoicemailMessageTriggerDetails.WithDefault, IWinRTObject {
  private val __1192189550_Interface: IPhoneNewVoicemailMessageTriggerDetails.WithDefault by lazy {
    as_1192189550()
  }


  public override val __1192189550_Ptr: JNAPointer? by lazy {
    __1192189550_Interface.__1192189550_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1192189550_Interface)

  private fun as_1192189550(): IPhoneNewVoicemailMessageTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IPhoneNewVoicemailMessageTriggerDetails.ABI.makeIPhoneNewVoicemailMessageTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneNewVoicemailMessageTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneNewVoicemailMessageTriggerDetails.ABI.makeIPhoneNewVoicemailMessageTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhoneNewVoicemailMessageTriggerDetails> {
    public override fun getValue() = PhoneNewVoicemailMessageTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: PhoneNewVoicemailMessageTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneNewVoicemailMessageTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PhoneNewVoicemailMessageTriggerDetails {
      val address = segment.toRawLongValue()
      return PhoneNewVoicemailMessageTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: PhoneNewVoicemailMessageTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
