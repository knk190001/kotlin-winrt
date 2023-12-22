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

@ABIMarker(InputActivationListenerActivationChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Input.InputActivationListenerActivationChangedEventArgs;{7978526b-00b6-5303-8f7d-55bef36da786})")
@WinRTByReference(brClass = InputActivationListenerActivationChangedEventArgs.ByReference::class)
public class InputActivationListenerActivationChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInputActivationListenerActivationChangedEventArgs.WithDefault, IWinRTObject {
  private val __219253652_Interface: IInputActivationListenerActivationChangedEventArgs.WithDefault
      by lazy {
    as_219253652()
  }


  public override val __219253652_Ptr: JNAPointer? by lazy {
    __219253652_Interface.__219253652_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__219253652_Interface)

  private fun as_219253652(): IInputActivationListenerActivationChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IInputActivationListenerActivationChangedEventArgs.ABI.makeIInputActivationListenerActivationChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInputActivationListenerActivationChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputActivationListenerActivationChangedEventArgs.ABI.makeIInputActivationListenerActivationChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InputActivationListenerActivationChangedEventArgs> {
    public override fun getValue() =
        InputActivationListenerActivationChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: InputActivationListenerActivationChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InputActivationListenerActivationChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        InputActivationListenerActivationChangedEventArgs {
      val address = segment.toRawLongValue()
      return InputActivationListenerActivationChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: InputActivationListenerActivationChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
