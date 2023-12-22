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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(InputDesktopResourceCursor.ABI::class)
@Signature("rc(Microsoft.UI.Input.InputDesktopResourceCursor;{1df2777f-7c90-58fc-a7a3-d5736c6510fd})")
@WinRTByReference(brClass = InputDesktopResourceCursor.ByReference::class)
public class InputDesktopResourceCursor(
  ptr: JNAPointer? = NULL
) : InputCursor(ptr), IInputDesktopResourceCursor.WithDefault, IWinRTObject {
  private val __263382321_Interface: IInputDesktopResourceCursor.WithDefault by lazy {
    as_263382321()
  }


  public override val __263382321_Ptr: JNAPointer? by lazy {
    __263382321_Interface.__263382321_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__263382321_Interface)

  private fun as_263382321(): IInputDesktopResourceCursor.WithDefault {
    if(pointer == NULL) {
      return(IInputDesktopResourceCursor.ABI.makeIInputDesktopResourceCursor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInputDesktopResourceCursor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputDesktopResourceCursor.ABI.makeIInputDesktopResourceCursor(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InputDesktopResourceCursor> {
    public override fun getValue() = InputDesktopResourceCursor(pointer.getPointer(0))

    public fun setValue(value: InputDesktopResourceCursor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InputDesktopResourceCursor, MemoryAddress> {
    public val IInputDesktopResourceCursorStatics_Instance: IInputDesktopResourceCursorStatics by
        lazy {
      createIInputDesktopResourceCursorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInputDesktopResourceCursorStatics(): IInputDesktopResourceCursorStatics {
      val refiid = Guid.REFIID(IInputDesktopResourceCursorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Input.InputDesktopResourceCursor".toHandle(),refiid,interfacePtr)
      val result =
          IInputDesktopResourceCursorStatics.ABI.makeIInputDesktopResourceCursorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): InputDesktopResourceCursor {
      val address = segment.toRawLongValue()
      return InputDesktopResourceCursor(Pointer(address))
    }

    public override fun toNative(obj: InputDesktopResourceCursor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create(resourceId: WinDef.UINT) =
        ABI.IInputDesktopResourceCursorStatics_Instance.Create(resourceId)

    public fun CreateFromModule(moduleName: String, resourceId: WinDef.UINT) =
        ABI.IInputDesktopResourceCursorStatics_Instance.CreateFromModule(moduleName, resourceId)
  }
}
