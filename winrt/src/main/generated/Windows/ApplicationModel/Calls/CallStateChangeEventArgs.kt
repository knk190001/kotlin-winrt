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

@ABIMarker(CallStateChangeEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.CallStateChangeEventArgs;{eab2349e-66f5-47f9-9fb5-459c5198c720})")
@WinRTByReference(brClass = CallStateChangeEventArgs.ByReference::class)
public class CallStateChangeEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICallStateChangeEventArgs.WithDefault, IWinRTObject {
  private val __1400348658_Interface: ICallStateChangeEventArgs.WithDefault by lazy {
    as_1400348658()
  }


  public override val __1400348658_Ptr: JNAPointer? by lazy {
    __1400348658_Interface.__1400348658_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1400348658_Interface)

  private fun as_1400348658(): ICallStateChangeEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICallStateChangeEventArgs.ABI.makeICallStateChangeEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICallStateChangeEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICallStateChangeEventArgs.ABI.makeICallStateChangeEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CallStateChangeEventArgs> {
    public override fun getValue() = CallStateChangeEventArgs(pointer.getPointer(0))

    public fun setValue(value: CallStateChangeEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CallStateChangeEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CallStateChangeEventArgs {
      val address = segment.toRawLongValue()
      return CallStateChangeEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CallStateChangeEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
