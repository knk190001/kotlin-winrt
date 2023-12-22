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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(InputDesktopNamedResourceCursor.ABI::class)
@Signature("rc(Microsoft.UI.Input.InputDesktopNamedResourceCursor;{f40ea93b-0ed7-5b3a-bfe2-14e2b5ad88a3})")
@WinRTByReference(brClass = InputDesktopNamedResourceCursor.ByReference::class)
public class InputDesktopNamedResourceCursor(
  ptr: JNAPointer? = NULL
) : InputCursor(ptr), IInputDesktopNamedResourceCursor.WithDefault, IWinRTObject {
  private val __829335118_Interface: IInputDesktopNamedResourceCursor.WithDefault by lazy {
    as_829335118()
  }


  public override val __829335118_Ptr: JNAPointer? by lazy {
    __829335118_Interface.__829335118_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__829335118_Interface)

  private fun as_829335118(): IInputDesktopNamedResourceCursor.WithDefault {
    if(pointer == NULL) {
      return(IInputDesktopNamedResourceCursor.ABI.makeIInputDesktopNamedResourceCursor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInputDesktopNamedResourceCursor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputDesktopNamedResourceCursor.ABI.makeIInputDesktopNamedResourceCursor(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InputDesktopNamedResourceCursor> {
    public override fun getValue() = InputDesktopNamedResourceCursor(pointer.getPointer(0))

    public fun setValue(value: InputDesktopNamedResourceCursor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InputDesktopNamedResourceCursor, MemoryAddress> {
    public val IInputDesktopNamedResourceCursorStatics_Instance:
        IInputDesktopNamedResourceCursorStatics by lazy {
      createIInputDesktopNamedResourceCursorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInputDesktopNamedResourceCursorStatics():
        IInputDesktopNamedResourceCursorStatics {
      val refiid = Guid.REFIID(IInputDesktopNamedResourceCursorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Input.InputDesktopNamedResourceCursor".toHandle(),refiid,interfacePtr)
      val result =
          IInputDesktopNamedResourceCursorStatics.ABI.makeIInputDesktopNamedResourceCursorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): InputDesktopNamedResourceCursor {
      val address = segment.toRawLongValue()
      return InputDesktopNamedResourceCursor(Pointer(address))
    }

    public override fun toNative(obj: InputDesktopNamedResourceCursor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create(resourceName: String) =
        ABI.IInputDesktopNamedResourceCursorStatics_Instance.Create(resourceName)

    public fun CreateFromModule(moduleName: String, resourceName: String) =
        ABI.IInputDesktopNamedResourceCursorStatics_Instance.CreateFromModule(moduleName,
        resourceName)
  }
}
