package Microsoft.UI.Input

import Microsoft.UI.Content.ContentIsland
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

@ABIMarker(InputFocusController.ABI::class)
@Signature("rc(Microsoft.UI.Input.InputFocusController;{8dfdc26c-8b8d-515d-8ddd-4685b3a540e9})")
@WinRTByReference(brClass = InputFocusController.ByReference::class)
public class InputFocusController(
  ptr: JNAPointer? = NULL
) : InputObject(ptr), IInputFocusController.WithDefault, IWinRTObject {
  private val __842620003_Interface: IInputFocusController.WithDefault by lazy {
    as_842620003()
  }


  public override val __842620003_Ptr: JNAPointer? by lazy {
    __842620003_Interface.__842620003_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__842620003_Interface)

  private fun as_842620003(): IInputFocusController.WithDefault {
    if(pointer == NULL) {
      return(IInputFocusController.ABI.makeIInputFocusController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInputFocusController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputFocusController.ABI.makeIInputFocusController(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InputFocusController> {
    public override fun getValue() = InputFocusController(pointer.getPointer(0))

    public fun setValue(value: InputFocusController): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InputFocusController, MemoryAddress> {
    public val IInputFocusControllerStatics_Instance: IInputFocusControllerStatics by lazy {
      createIInputFocusControllerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInputFocusControllerStatics(): IInputFocusControllerStatics {
      val refiid = Guid.REFIID(IInputFocusControllerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Input.InputFocusController".toHandle(),refiid,interfacePtr)
      val result =
          IInputFocusControllerStatics.ABI.makeIInputFocusControllerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): InputFocusController {
      val address = segment.toRawLongValue()
      return InputFocusController(Pointer(address))
    }

    public override fun toNative(obj: InputFocusController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForIsland(island: ContentIsland) =
        ABI.IInputFocusControllerStatics_Instance.GetForIsland(island)
  }
}
