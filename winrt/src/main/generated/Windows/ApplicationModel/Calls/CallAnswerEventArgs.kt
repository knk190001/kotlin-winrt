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

@ABIMarker(CallAnswerEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.CallAnswerEventArgs;{fd789617-2dd7-4c8c-b2bd-95d17a5bb733})")
@WinRTByReference(brClass = CallAnswerEventArgs.ByReference::class)
public class CallAnswerEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICallAnswerEventArgs.WithDefault, IWinRTObject {
  private val __2048291075_Interface: ICallAnswerEventArgs.WithDefault by lazy {
    as_2048291075()
  }


  public override val __2048291075_Ptr: JNAPointer? by lazy {
    __2048291075_Interface.__2048291075_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2048291075_Interface)

  private fun as_2048291075(): ICallAnswerEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICallAnswerEventArgs.ABI.makeICallAnswerEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICallAnswerEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICallAnswerEventArgs.ABI.makeICallAnswerEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CallAnswerEventArgs> {
    public override fun getValue() = CallAnswerEventArgs(pointer.getPointer(0))

    public fun setValue(value: CallAnswerEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CallAnswerEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CallAnswerEventArgs {
      val address = segment.toRawLongValue()
      return CallAnswerEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CallAnswerEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
