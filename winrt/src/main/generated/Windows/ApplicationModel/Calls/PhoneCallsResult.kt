package Windows.ApplicationModel.Calls

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

@ABIMarker(PhoneCallsResult.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.PhoneCallsResult;{1bfad365-57cf-57dd-986d-b057c91eac33})")
@WinRTByReference(brClass = PhoneCallsResult.ByReference::class)
public class PhoneCallsResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhoneCallsResult.WithDefault, IWinRTObject {
  private val __1724093822_Interface: IPhoneCallsResult.WithDefault by lazy {
    as_1724093822()
  }


  public override val __1724093822_Ptr: JNAPointer? by lazy {
    __1724093822_Interface.__1724093822_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1724093822_Interface)

  private fun as_1724093822(): IPhoneCallsResult.WithDefault {
    if(pointer == NULL) {
      return(IPhoneCallsResult.ABI.makeIPhoneCallsResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneCallsResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneCallsResult.ABI.makeIPhoneCallsResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhoneCallsResult> {
    public override fun getValue() = PhoneCallsResult(pointer.getPointer(0))

    public fun setValue(value: PhoneCallsResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneCallsResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PhoneCallsResult {
      val address = segment.toRawLongValue()
      return PhoneCallsResult(Pointer(address))
    }

    public override fun toNative(obj: PhoneCallsResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
