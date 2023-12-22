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

@ABIMarker(PhoneCallBlockedTriggerDetails.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.Background.PhoneCallBlockedTriggerDetails;{a4a690a2-e4c1-427f-864e-e470477ddb67})")
@WinRTByReference(brClass = PhoneCallBlockedTriggerDetails.ByReference::class)
public class PhoneCallBlockedTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhoneCallBlockedTriggerDetails.WithDefault, IWinRTObject {
  private val __880216482_Interface: IPhoneCallBlockedTriggerDetails.WithDefault by lazy {
    as_880216482()
  }


  public override val __880216482_Ptr: JNAPointer? by lazy {
    __880216482_Interface.__880216482_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__880216482_Interface)

  private fun as_880216482(): IPhoneCallBlockedTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IPhoneCallBlockedTriggerDetails.ABI.makeIPhoneCallBlockedTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneCallBlockedTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneCallBlockedTriggerDetails.ABI.makeIPhoneCallBlockedTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhoneCallBlockedTriggerDetails> {
    public override fun getValue() = PhoneCallBlockedTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: PhoneCallBlockedTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneCallBlockedTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PhoneCallBlockedTriggerDetails {
      val address = segment.toRawLongValue()
      return PhoneCallBlockedTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: PhoneCallBlockedTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
