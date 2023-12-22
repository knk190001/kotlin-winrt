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

@ABIMarker(PhoneCallDetails.ABI::class)
@Signature("rc(Windows.Phone.Notification.Management.PhoneCallDetails;{0c1b6f53-f071-483e-bf33-ebd44b724447})")
@WinRTByReference(brClass = PhoneCallDetails.ByReference::class)
public class PhoneCallDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhoneCallDetails.WithDefault, IWinRTObject {
  private val __1036226884_Interface: IPhoneCallDetails.WithDefault by lazy {
    as_1036226884()
  }


  public override val __1036226884_Ptr: JNAPointer? by lazy {
    __1036226884_Interface.__1036226884_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1036226884_Interface)

  private fun as_1036226884(): IPhoneCallDetails.WithDefault {
    if(pointer == NULL) {
      return(IPhoneCallDetails.ABI.makeIPhoneCallDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneCallDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneCallDetails.ABI.makeIPhoneCallDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhoneCallDetails> {
    public override fun getValue() = PhoneCallDetails(pointer.getPointer(0))

    public fun setValue(value: PhoneCallDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneCallDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PhoneCallDetails {
      val address = segment.toRawLongValue()
      return PhoneCallDetails(Pointer(address))
    }

    public override fun toNative(obj: PhoneCallDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
