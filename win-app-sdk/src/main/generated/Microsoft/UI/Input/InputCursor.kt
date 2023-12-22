package Microsoft.UI.Input

import Windows.Foundation.IClosable
import Windows.UI.Core.CoreCursor
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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(InputCursor.ABI::class)
@Signature("rc(Microsoft.UI.Input.InputCursor;{359b15f9-19c2-5714-8432-75176826406b})")
@WinRTByReference(brClass = InputCursor.ByReference::class)
public open class InputCursor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInputCursor.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __619935577_Interface: IInputCursor.WithDefault by lazy {
    as_619935577()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __619935577_Ptr: JNAPointer? by lazy {
    __619935577_Interface.__619935577_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__619935577_Interface, __1260617006_Interface)

  private fun as_619935577(): IInputCursor.WithDefault {
    if(pointer == NULL) {
      return(IInputCursor.ABI.makeIInputCursor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInputCursor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputCursor.ABI.makeIInputCursor(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<InputCursor> {
    public override fun getValue() = InputCursor(pointer.getPointer(0))

    public fun setValue(value: InputCursor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InputCursor, MemoryAddress> {
    public val IInputCursorStatics_Instance: IInputCursorStatics by lazy {
      createIInputCursorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInputCursorStatics(): IInputCursorStatics {
      val refiid = Guid.REFIID(IInputCursorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Input.InputCursor".toHandle(),refiid,interfacePtr)
      val result = IInputCursorStatics.ABI.makeIInputCursorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): InputCursor {
      val address = segment.toRawLongValue()
      return InputCursor(Pointer(address))
    }

    public override fun toNative(obj: InputCursor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateFromCoreCursor(cursor: CoreCursor) =
        ABI.IInputCursorStatics_Instance.CreateFromCoreCursor(cursor)
  }
}
