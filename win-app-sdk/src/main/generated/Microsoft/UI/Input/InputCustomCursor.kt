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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(InputCustomCursor.ABI::class)
@Signature("rc(Microsoft.UI.Input.InputCustomCursor;{5486f042-7e1a-5dc8-8041-e47b609a5ba1})")
@WinRTByReference(brClass = InputCustomCursor.ByReference::class)
public class InputCustomCursor(
  ptr: JNAPointer? = NULL
) : InputCursor(ptr), IInputCustomCursor.WithDefault, IWinRTObject {
  private val __750839480_Interface: IInputCustomCursor.WithDefault by lazy {
    as_750839480()
  }


  public override val __750839480_Ptr: JNAPointer? by lazy {
    __750839480_Interface.__750839480_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__750839480_Interface)

  private fun as_750839480(): IInputCustomCursor.WithDefault {
    if(pointer == NULL) {
      return(IInputCustomCursor.ABI.makeIInputCustomCursor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInputCustomCursor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputCustomCursor.ABI.makeIInputCustomCursor(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InputCustomCursor> {
    public override fun getValue() = InputCustomCursor(pointer.getPointer(0))

    public fun setValue(value: InputCustomCursor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InputCustomCursor, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InputCustomCursor {
      val address = segment.toRawLongValue()
      return InputCustomCursor(Pointer(address))
    }

    public override fun toNative(obj: InputCustomCursor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
