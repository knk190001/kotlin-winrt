package Windows.UI.Input

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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(InputActivationListener.ABI::class)
@Signature("rc(Windows.UI.Input.InputActivationListener;{5d6d4ed2-28c7-5ae3-aa74-c918a9f243ca})")
@WinRTByReference(brClass = InputActivationListener.ByReference::class)
public class InputActivationListener(
  ptr: JNAPointer? = NULL
) : AttachableInputObject(ptr), IInputActivationListener.WithDefault, IWinRTObject {
  private val __1023372090_Interface: IInputActivationListener.WithDefault by lazy {
    as_1023372090()
  }


  public override val __1023372090_Ptr: JNAPointer? by lazy {
    __1023372090_Interface.__1023372090_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1023372090_Interface)

  private fun as_1023372090(): IInputActivationListener.WithDefault {
    if(pointer == NULL) {
      return(IInputActivationListener.ABI.makeIInputActivationListener(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInputActivationListener>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputActivationListener.ABI.makeIInputActivationListener(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InputActivationListener> {
    public override fun getValue() = InputActivationListener(pointer.getPointer(0))

    public fun setValue(value: InputActivationListener): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InputActivationListener, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InputActivationListener {
      val address = segment.toRawLongValue()
      return InputActivationListener(Pointer(address))
    }

    public override fun toNative(obj: InputActivationListener): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
