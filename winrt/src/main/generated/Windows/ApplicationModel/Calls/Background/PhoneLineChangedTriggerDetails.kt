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

@ABIMarker(PhoneLineChangedTriggerDetails.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.Background.PhoneLineChangedTriggerDetails;{c6d321e7-d11d-40d8-b2b7-e40a01d66249})")
@WinRTByReference(brClass = PhoneLineChangedTriggerDetails.ByReference::class)
public class PhoneLineChangedTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhoneLineChangedTriggerDetails.WithDefault, IWinRTObject {
  private val __11612012_Interface: IPhoneLineChangedTriggerDetails.WithDefault by lazy {
    as_11612012()
  }


  public override val __11612012_Ptr: JNAPointer? by lazy {
    __11612012_Interface.__11612012_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__11612012_Interface)

  private fun as_11612012(): IPhoneLineChangedTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IPhoneLineChangedTriggerDetails.ABI.makeIPhoneLineChangedTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneLineChangedTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneLineChangedTriggerDetails.ABI.makeIPhoneLineChangedTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhoneLineChangedTriggerDetails> {
    public override fun getValue() = PhoneLineChangedTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: PhoneLineChangedTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneLineChangedTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PhoneLineChangedTriggerDetails {
      val address = segment.toRawLongValue()
      return PhoneLineChangedTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: PhoneLineChangedTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
