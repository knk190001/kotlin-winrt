package Microsoft.UI.Xaml.Input

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

@ABIMarker(ExecuteRequestedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Input.ExecuteRequestedEventArgs;{e1a9fd0c-34d0-5ae2-8f5d-377e7a8a2708})")
@WinRTByReference(brClass = ExecuteRequestedEventArgs.ByReference::class)
public class ExecuteRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IExecuteRequestedEventArgs.WithDefault, IWinRTObject {
  private val __257729651_Interface: IExecuteRequestedEventArgs.WithDefault by lazy {
    as_257729651()
  }


  public override val __257729651_Ptr: JNAPointer? by lazy {
    __257729651_Interface.__257729651_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__257729651_Interface)

  private fun as_257729651(): IExecuteRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IExecuteRequestedEventArgs.ABI.makeIExecuteRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IExecuteRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IExecuteRequestedEventArgs.ABI.makeIExecuteRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ExecuteRequestedEventArgs> {
    public override fun getValue() = ExecuteRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ExecuteRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ExecuteRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ExecuteRequestedEventArgs {
      val address = segment.toRawLongValue()
      return ExecuteRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ExecuteRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
