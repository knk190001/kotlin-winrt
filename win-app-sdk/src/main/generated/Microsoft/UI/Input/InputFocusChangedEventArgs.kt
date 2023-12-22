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

@ABIMarker(InputFocusChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Input.InputFocusChangedEventArgs;{d85b1b7a-045d-5a1b-9966-ebc0b3d47567})")
@WinRTByReference(brClass = InputFocusChangedEventArgs.ByReference::class)
public class InputFocusChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInputFocusChangedEventArgs.WithDefault, IWinRTObject {
  private val __732457418_Interface: IInputFocusChangedEventArgs.WithDefault by lazy {
    as_732457418()
  }


  public override val __732457418_Ptr: JNAPointer? by lazy {
    __732457418_Interface.__732457418_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__732457418_Interface)

  private fun as_732457418(): IInputFocusChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IInputFocusChangedEventArgs.ABI.makeIInputFocusChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInputFocusChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputFocusChangedEventArgs.ABI.makeIInputFocusChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InputFocusChangedEventArgs> {
    public override fun getValue() = InputFocusChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: InputFocusChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InputFocusChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InputFocusChangedEventArgs {
      val address = segment.toRawLongValue()
      return InputFocusChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: InputFocusChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
