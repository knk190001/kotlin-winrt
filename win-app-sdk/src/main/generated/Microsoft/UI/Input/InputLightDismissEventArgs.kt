package Microsoft.UI.Input

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

@ABIMarker(InputLightDismissEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Input.InputLightDismissEventArgs;{078660ee-07ca-5808-b982-e6e899cf098c})")
@WinRTByReference(brClass = InputLightDismissEventArgs.ByReference::class)
public class InputLightDismissEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInputLightDismissEventArgs.WithDefault, IWinRTObject {
  private val __1209216754_Interface: IInputLightDismissEventArgs.WithDefault by lazy {
    as_1209216754()
  }


  public override val __1209216754_Ptr: JNAPointer? by lazy {
    __1209216754_Interface.__1209216754_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1209216754_Interface)

  private fun as_1209216754(): IInputLightDismissEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IInputLightDismissEventArgs.ABI.makeIInputLightDismissEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInputLightDismissEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputLightDismissEventArgs.ABI.makeIInputLightDismissEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InputLightDismissEventArgs> {
    public override fun getValue() = InputLightDismissEventArgs(pointer.getPointer(0))

    public fun setValue(value: InputLightDismissEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InputLightDismissEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InputLightDismissEventArgs {
      val address = segment.toRawLongValue()
      return InputLightDismissEventArgs(Pointer(address))
    }

    public override fun toNative(obj: InputLightDismissEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
