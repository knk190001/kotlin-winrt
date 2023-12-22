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

@ABIMarker(PhoneCallInfo.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.PhoneCallInfo;{22b42577-3e4d-5dc6-89c2-469fe5ffc189})")
@WinRTByReference(brClass = PhoneCallInfo.ByReference::class)
public class PhoneCallInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhoneCallInfo.WithDefault, IWinRTObject {
  private val __2040596988_Interface: IPhoneCallInfo.WithDefault by lazy {
    as_2040596988()
  }


  public override val __2040596988_Ptr: JNAPointer? by lazy {
    __2040596988_Interface.__2040596988_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2040596988_Interface)

  private fun as_2040596988(): IPhoneCallInfo.WithDefault {
    if(pointer == NULL) {
      return(IPhoneCallInfo.ABI.makeIPhoneCallInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneCallInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneCallInfo.ABI.makeIPhoneCallInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PhoneCallInfo>
      {
    public override fun getValue() = PhoneCallInfo(pointer.getPointer(0))

    public fun setValue(value: PhoneCallInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneCallInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PhoneCallInfo {
      val address = segment.toRawLongValue()
      return PhoneCallInfo(Pointer(address))
    }

    public override fun toNative(obj: PhoneCallInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
