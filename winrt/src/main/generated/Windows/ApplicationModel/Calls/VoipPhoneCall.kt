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

@ABIMarker(VoipPhoneCall.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.VoipPhoneCall;{6cf1f19a-7794-4a5a-8c68-ae87947a6990})")
@WinRTByReference(brClass = VoipPhoneCall.ByReference::class)
public class VoipPhoneCall(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVoipPhoneCall.WithDefault, IVoipPhoneCall2.WithDefault,
    IVoipPhoneCall3.WithDefault, IWinRTObject {
  private val __1934567790_Interface: IVoipPhoneCall.WithDefault by lazy {
    as_1934567790()
  }


  private val __157940604_Interface: IVoipPhoneCall2.WithDefault by lazy {
    as_157940604()
  }


  private val __157940603_Interface: IVoipPhoneCall3.WithDefault by lazy {
    as_157940603()
  }


  public override val __1934567790_Ptr: JNAPointer? by lazy {
    __1934567790_Interface.__1934567790_Ptr
  }


  public override val __157940604_Ptr: JNAPointer? by lazy {
    __157940604_Interface.__157940604_Ptr
  }


  public override val __157940603_Ptr: JNAPointer? by lazy {
    __157940603_Interface.__157940603_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1934567790_Interface, __157940604_Interface, __157940603_Interface)

  private fun as_1934567790(): IVoipPhoneCall.WithDefault {
    if(pointer == NULL) {
      return(IVoipPhoneCall.ABI.makeIVoipPhoneCall(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVoipPhoneCall>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVoipPhoneCall.ABI.makeIVoipPhoneCall(ref.value))
  }

  private fun as_157940604(): IVoipPhoneCall2.WithDefault {
    if(pointer == NULL) {
      return(IVoipPhoneCall2.ABI.makeIVoipPhoneCall2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVoipPhoneCall2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVoipPhoneCall2.ABI.makeIVoipPhoneCall2(ref.value))
  }

  private fun as_157940603(): IVoipPhoneCall3.WithDefault {
    if(pointer == NULL) {
      return(IVoipPhoneCall3.ABI.makeIVoipPhoneCall3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVoipPhoneCall3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVoipPhoneCall3.ABI.makeIVoipPhoneCall3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<VoipPhoneCall>
      {
    public override fun getValue() = VoipPhoneCall(pointer.getPointer(0))

    public fun setValue(value: VoipPhoneCall): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VoipPhoneCall, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VoipPhoneCall {
      val address = segment.toRawLongValue()
      return VoipPhoneCall(Pointer(address))
    }

    public override fun toNative(obj: VoipPhoneCall): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
