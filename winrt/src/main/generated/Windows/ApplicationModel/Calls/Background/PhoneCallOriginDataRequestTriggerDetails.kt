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

@ABIMarker(PhoneCallOriginDataRequestTriggerDetails.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.Background.PhoneCallOriginDataRequestTriggerDetails;{6e9b5b3f-c54b-4e82-4cc9-e329a4184592})")
@WinRTByReference(brClass = PhoneCallOriginDataRequestTriggerDetails.ByReference::class)
public class PhoneCallOriginDataRequestTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhoneCallOriginDataRequestTriggerDetails.WithDefault, IWinRTObject {
  private val __728649717_Interface: IPhoneCallOriginDataRequestTriggerDetails.WithDefault by lazy {
    as_728649717()
  }


  public override val __728649717_Ptr: JNAPointer? by lazy {
    __728649717_Interface.__728649717_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__728649717_Interface)

  private fun as_728649717(): IPhoneCallOriginDataRequestTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IPhoneCallOriginDataRequestTriggerDetails.ABI.makeIPhoneCallOriginDataRequestTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneCallOriginDataRequestTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneCallOriginDataRequestTriggerDetails.ABI.makeIPhoneCallOriginDataRequestTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhoneCallOriginDataRequestTriggerDetails> {
    public override fun getValue() = PhoneCallOriginDataRequestTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: PhoneCallOriginDataRequestTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneCallOriginDataRequestTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        PhoneCallOriginDataRequestTriggerDetails {
      val address = segment.toRawLongValue()
      return PhoneCallOriginDataRequestTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: PhoneCallOriginDataRequestTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
