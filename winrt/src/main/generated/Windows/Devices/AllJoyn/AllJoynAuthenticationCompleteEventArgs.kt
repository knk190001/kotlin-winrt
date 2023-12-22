package Windows.Devices.AllJoyn

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

@ABIMarker(AllJoynAuthenticationCompleteEventArgs.ABI::class)
@Signature("rc(Windows.Devices.AllJoyn.AllJoynAuthenticationCompleteEventArgs;{97b4701c-15dc-4b53-b6a4-7d134300d7bf})")
@WinRTByReference(brClass = AllJoynAuthenticationCompleteEventArgs.ByReference::class)
public class AllJoynAuthenticationCompleteEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAllJoynAuthenticationCompleteEventArgs.WithDefault, IWinRTObject {
  private val __1305570251_Interface: IAllJoynAuthenticationCompleteEventArgs.WithDefault by lazy {
    as_1305570251()
  }


  public override val __1305570251_Ptr: JNAPointer? by lazy {
    __1305570251_Interface.__1305570251_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1305570251_Interface)

  private fun as_1305570251(): IAllJoynAuthenticationCompleteEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAllJoynAuthenticationCompleteEventArgs.ABI.makeIAllJoynAuthenticationCompleteEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAllJoynAuthenticationCompleteEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAllJoynAuthenticationCompleteEventArgs.ABI.makeIAllJoynAuthenticationCompleteEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AllJoynAuthenticationCompleteEventArgs> {
    public override fun getValue() = AllJoynAuthenticationCompleteEventArgs(pointer.getPointer(0))

    public fun setValue(value: AllJoynAuthenticationCompleteEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AllJoynAuthenticationCompleteEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AllJoynAuthenticationCompleteEventArgs {
      val address = segment.toRawLongValue()
      return AllJoynAuthenticationCompleteEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AllJoynAuthenticationCompleteEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
