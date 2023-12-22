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

@ABIMarker(PhoneLineCellularDetails.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.PhoneLineCellularDetails;{192601d5-147c-4769-b673-98a5ec8426cb})")
@WinRTByReference(brClass = PhoneLineCellularDetails.ByReference::class)
public class PhoneLineCellularDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhoneLineCellularDetails.WithDefault, IWinRTObject {
  private val __1327820564_Interface: IPhoneLineCellularDetails.WithDefault by lazy {
    as_1327820564()
  }


  public override val __1327820564_Ptr: JNAPointer? by lazy {
    __1327820564_Interface.__1327820564_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1327820564_Interface)

  private fun as_1327820564(): IPhoneLineCellularDetails.WithDefault {
    if(pointer == NULL) {
      return(IPhoneLineCellularDetails.ABI.makeIPhoneLineCellularDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneLineCellularDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneLineCellularDetails.ABI.makeIPhoneLineCellularDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhoneLineCellularDetails> {
    public override fun getValue() = PhoneLineCellularDetails(pointer.getPointer(0))

    public fun setValue(value: PhoneLineCellularDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneLineCellularDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PhoneLineCellularDetails {
      val address = segment.toRawLongValue()
      return PhoneLineCellularDetails(Pointer(address))
    }

    public override fun toNative(obj: PhoneLineCellularDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
