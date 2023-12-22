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

@ABIMarker(PhoneLineDialResult.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.PhoneLineDialResult;{e825a30a-5c7f-546f-b918-3ad2fe70fb34})")
@WinRTByReference(brClass = PhoneLineDialResult.ByReference::class)
public class PhoneLineDialResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhoneLineDialResult.WithDefault, IWinRTObject {
  private val __898363247_Interface: IPhoneLineDialResult.WithDefault by lazy {
    as_898363247()
  }


  public override val __898363247_Ptr: JNAPointer? by lazy {
    __898363247_Interface.__898363247_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__898363247_Interface)

  private fun as_898363247(): IPhoneLineDialResult.WithDefault {
    if(pointer == NULL) {
      return(IPhoneLineDialResult.ABI.makeIPhoneLineDialResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneLineDialResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneLineDialResult.ABI.makeIPhoneLineDialResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhoneLineDialResult> {
    public override fun getValue() = PhoneLineDialResult(pointer.getPointer(0))

    public fun setValue(value: PhoneLineDialResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneLineDialResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PhoneLineDialResult {
      val address = segment.toRawLongValue()
      return PhoneLineDialResult(Pointer(address))
    }

    public override fun toNative(obj: PhoneLineDialResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
