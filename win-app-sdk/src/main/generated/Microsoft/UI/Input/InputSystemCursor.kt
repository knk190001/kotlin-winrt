package Microsoft.UI.Input

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(InputSystemCursor.ABI::class)
@Signature("rc(Microsoft.UI.Input.InputSystemCursor;{59f538e7-c500-59ab-8b54-0bc6100fd49e})")
@WinRTByReference(brClass = InputSystemCursor.ByReference::class)
public class InputSystemCursor(
  ptr: JNAPointer? = NULL
) : InputCursor(ptr), IInputSystemCursor.WithDefault, IWinRTObject {
  private val __324909322_Interface: IInputSystemCursor.WithDefault by lazy {
    as_324909322()
  }


  public override val __324909322_Ptr: JNAPointer? by lazy {
    __324909322_Interface.__324909322_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__324909322_Interface)

  private fun as_324909322(): IInputSystemCursor.WithDefault {
    if(pointer == NULL) {
      return(IInputSystemCursor.ABI.makeIInputSystemCursor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInputSystemCursor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputSystemCursor.ABI.makeIInputSystemCursor(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InputSystemCursor> {
    public override fun getValue() = InputSystemCursor(pointer.getPointer(0))

    public fun setValue(value: InputSystemCursor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InputSystemCursor, MemoryAddress> {
    public val IInputSystemCursorStatics_Instance: IInputSystemCursorStatics by lazy {
      createIInputSystemCursorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInputSystemCursorStatics(): IInputSystemCursorStatics {
      val refiid = Guid.REFIID(IInputSystemCursorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Input.InputSystemCursor".toHandle(),refiid,interfacePtr)
      val result = IInputSystemCursorStatics.ABI.makeIInputSystemCursorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): InputSystemCursor {
      val address = segment.toRawLongValue()
      return InputSystemCursor(Pointer(address))
    }

    public override fun toNative(obj: InputSystemCursor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create(type: InputSystemCursorShape) =
        ABI.IInputSystemCursorStatics_Instance.Create(type)
  }
}
