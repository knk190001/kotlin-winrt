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

@ABIMarker(PhoneCallVideoCapabilities.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.PhoneCallVideoCapabilities;{02382786-b16a-4fdb-be3b-c4240e13ad0d})")
@WinRTByReference(brClass = PhoneCallVideoCapabilities.ByReference::class)
public class PhoneCallVideoCapabilities(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhoneCallVideoCapabilities.WithDefault, IWinRTObject {
  private val __1555988803_Interface: IPhoneCallVideoCapabilities.WithDefault by lazy {
    as_1555988803()
  }


  public override val __1555988803_Ptr: JNAPointer? by lazy {
    __1555988803_Interface.__1555988803_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1555988803_Interface)

  private fun as_1555988803(): IPhoneCallVideoCapabilities.WithDefault {
    if(pointer == NULL) {
      return(IPhoneCallVideoCapabilities.ABI.makeIPhoneCallVideoCapabilities(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneCallVideoCapabilities>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneCallVideoCapabilities.ABI.makeIPhoneCallVideoCapabilities(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhoneCallVideoCapabilities> {
    public override fun getValue() = PhoneCallVideoCapabilities(pointer.getPointer(0))

    public fun setValue(value: PhoneCallVideoCapabilities): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneCallVideoCapabilities, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PhoneCallVideoCapabilities {
      val address = segment.toRawLongValue()
      return PhoneCallVideoCapabilities(Pointer(address))
    }

    public override fun toNative(obj: PhoneCallVideoCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
