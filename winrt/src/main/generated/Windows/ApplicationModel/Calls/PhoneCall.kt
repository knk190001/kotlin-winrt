package Windows.ApplicationModel.Calls

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PhoneCall.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.PhoneCall;{c14ed0f8-c17d-59d2-9628-66e545b6cd21})")
@WinRTByReference(brClass = PhoneCall.ByReference::class)
public class PhoneCall(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhoneCall.WithDefault, IWinRTObject {
  private val __1867384786_Interface: IPhoneCall.WithDefault by lazy {
    as_1867384786()
  }


  public override val __1867384786_Ptr: JNAPointer? by lazy {
    __1867384786_Interface.__1867384786_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1867384786_Interface)

  private fun as_1867384786(): IPhoneCall.WithDefault {
    if(pointer == NULL) {
      return(IPhoneCall.ABI.makeIPhoneCall(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneCall>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneCall.ABI.makeIPhoneCall(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PhoneCall> {
    public override fun getValue() = PhoneCall(pointer.getPointer(0))

    public fun setValue(value: PhoneCall): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneCall, MemoryAddress> {
    public val IPhoneCallStatics_Instance: IPhoneCallStatics by lazy {
      createIPhoneCallStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPhoneCallStatics(): IPhoneCallStatics {
      val refiid = Guid.REFIID(IPhoneCallStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Calls.PhoneCall".toHandle(),refiid,interfacePtr)
      val result = IPhoneCallStatics.ABI.makeIPhoneCallStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PhoneCall {
      val address = segment.toRawLongValue()
      return PhoneCall(Pointer(address))
    }

    public override fun toNative(obj: PhoneCall): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetFromId(callId: String) = ABI.IPhoneCallStatics_Instance.GetFromId(callId)
  }
}
