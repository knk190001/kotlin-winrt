package Microsoft.UI.Input

import Microsoft.UI.Content.ContentIsland
import Microsoft.UI.WindowId
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(InputLightDismissAction.ABI::class)
@Signature("rc(Microsoft.UI.Input.InputLightDismissAction;{e8a39502-a860-502f-8c10-3646d43aecf1})")
@WinRTByReference(brClass = InputLightDismissAction.ByReference::class)
public class InputLightDismissAction(
  ptr: JNAPointer? = NULL
) : InputObject(ptr), IInputLightDismissAction.WithDefault, IWinRTObject {
  private val __1118568517_Interface: IInputLightDismissAction.WithDefault by lazy {
    as_1118568517()
  }


  public override val __1118568517_Ptr: JNAPointer? by lazy {
    __1118568517_Interface.__1118568517_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1118568517_Interface)

  private fun as_1118568517(): IInputLightDismissAction.WithDefault {
    if(pointer == NULL) {
      return(IInputLightDismissAction.ABI.makeIInputLightDismissAction(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInputLightDismissAction>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputLightDismissAction.ABI.makeIInputLightDismissAction(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InputLightDismissAction> {
    public override fun getValue() = InputLightDismissAction(pointer.getPointer(0))

    public fun setValue(value: InputLightDismissAction): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InputLightDismissAction, MemoryAddress> {
    public val IInputLightDismissActionStatics_Instance: IInputLightDismissActionStatics by lazy {
      createIInputLightDismissActionStatics()
    }


    public val IInputLightDismissActionStatics2_Instance: IInputLightDismissActionStatics2 by lazy {
      createIInputLightDismissActionStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInputLightDismissActionStatics(): IInputLightDismissActionStatics {
      val refiid = Guid.REFIID(IInputLightDismissActionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Input.InputLightDismissAction".toHandle(),refiid,interfacePtr)
      val result =
          IInputLightDismissActionStatics.ABI.makeIInputLightDismissActionStatics(interfacePtr.value)
      return result
    }

    public fun createIInputLightDismissActionStatics2(): IInputLightDismissActionStatics2 {
      val refiid = Guid.REFIID(IInputLightDismissActionStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Input.InputLightDismissAction".toHandle(),refiid,interfacePtr)
      val result =
          IInputLightDismissActionStatics2.ABI.makeIInputLightDismissActionStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): InputLightDismissAction {
      val address = segment.toRawLongValue()
      return InputLightDismissAction(Pointer(address))
    }

    public override fun toNative(obj: InputLightDismissAction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForWindowId(windowId: WindowId) =
        ABI.IInputLightDismissActionStatics_Instance.GetForWindowId(windowId)

    public fun GetForIsland(content: ContentIsland) =
        ABI.IInputLightDismissActionStatics2_Instance.GetForIsland(content)
  }
}
