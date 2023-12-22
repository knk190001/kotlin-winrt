package Windows.UI.Core

import Windows.Foundation.IClosable
import Windows.UI.Composition.IVisualElement
import Windows.UI.Composition.Visual
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

@ABIMarker(CoreIndependentInputSourceController.ABI::class)
@Signature("rc(Windows.UI.Core.CoreIndependentInputSourceController;{0963261c-84fe-578a-83ca-6425309ccde4})")
@WinRTByReference(brClass = CoreIndependentInputSourceController.ByReference::class)
public class CoreIndependentInputSourceController(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreIndependentInputSourceController.WithDefault, IClosable.WithDefault,
    IWinRTObject {
  private val __2119982911_Interface: ICoreIndependentInputSourceController.WithDefault by lazy {
    as_2119982911()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __2119982911_Ptr: JNAPointer? by lazy {
    __2119982911_Interface.__2119982911_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2119982911_Interface, __1260617006_Interface)

  private fun as_2119982911(): ICoreIndependentInputSourceController.WithDefault {
    if(pointer == NULL) {
      return(ICoreIndependentInputSourceController.ABI.makeICoreIndependentInputSourceController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreIndependentInputSourceController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreIndependentInputSourceController.ABI.makeICoreIndependentInputSourceController(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreIndependentInputSourceController> {
    public override fun getValue() = CoreIndependentInputSourceController(pointer.getPointer(0))

    public fun setValue(value: CoreIndependentInputSourceController): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreIndependentInputSourceController, MemoryAddress> {
    public val ICoreIndependentInputSourceControllerStatics_Instance:
        ICoreIndependentInputSourceControllerStatics by lazy {
      createICoreIndependentInputSourceControllerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICoreIndependentInputSourceControllerStatics():
        ICoreIndependentInputSourceControllerStatics {
      val refiid = Guid.REFIID(ICoreIndependentInputSourceControllerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Core.CoreIndependentInputSourceController".toHandle(),refiid,interfacePtr)
      val result =
          ICoreIndependentInputSourceControllerStatics.ABI.makeICoreIndependentInputSourceControllerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CoreIndependentInputSourceController {
      val address = segment.toRawLongValue()
      return CoreIndependentInputSourceController(Pointer(address))
    }

    public override fun toNative(obj: CoreIndependentInputSourceController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateForVisual(visual: Visual) =
        ABI.ICoreIndependentInputSourceControllerStatics_Instance.CreateForVisual(visual)

    public fun CreateForIVisualElement(visualElement: IVisualElement) =
        ABI.ICoreIndependentInputSourceControllerStatics_Instance.CreateForIVisualElement(visualElement)
  }
}
