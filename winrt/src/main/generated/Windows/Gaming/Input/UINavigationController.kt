package Windows.Gaming.Input

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(UINavigationController.ABI::class)
@Signature("rc(Windows.Gaming.Input.UINavigationController;{e5aeefdd-f50e-4a55-8cdc-d33229548175})")
@WinRTByReference(brClass = UINavigationController.ByReference::class)
public class UINavigationController(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUINavigationController.WithDefault, IGameController.WithDefault,
    IGameControllerBatteryInfo.WithDefault, IWinRTObject {
  private val __1981332137_Interface: IUINavigationController.WithDefault by lazy {
    as_1981332137()
  }


  private val __925471711_Interface: IGameController.WithDefault by lazy {
    as_925471711()
  }


  private val __1091749242_Interface: IGameControllerBatteryInfo.WithDefault by lazy {
    as_1091749242()
  }


  public override val __1981332137_Ptr: JNAPointer? by lazy {
    __1981332137_Interface.__1981332137_Ptr
  }


  public override val __925471711_Ptr: JNAPointer? by lazy {
    __925471711_Interface.__925471711_Ptr
  }


  public override val __1091749242_Ptr: JNAPointer? by lazy {
    __1091749242_Interface.__1091749242_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1981332137_Interface, __925471711_Interface, __1091749242_Interface)

  private fun as_1981332137(): IUINavigationController.WithDefault {
    if(pointer == NULL) {
      return(IUINavigationController.ABI.makeIUINavigationController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUINavigationController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUINavigationController.ABI.makeIUINavigationController(ref.value))
  }

  private fun as_925471711(): IGameController.WithDefault {
    if(pointer == NULL) {
      return(IGameController.ABI.makeIGameController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGameController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGameController.ABI.makeIGameController(ref.value))
  }

  private fun as_1091749242(): IGameControllerBatteryInfo.WithDefault {
    if(pointer == NULL) {
      return(IGameControllerBatteryInfo.ABI.makeIGameControllerBatteryInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGameControllerBatteryInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGameControllerBatteryInfo.ABI.makeIGameControllerBatteryInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UINavigationController> {
    public override fun getValue() = UINavigationController(pointer.getPointer(0))

    public fun setValue(value: UINavigationController): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UINavigationController, MemoryAddress> {
    public val IUINavigationControllerStatics_Instance: IUINavigationControllerStatics by lazy {
      createIUINavigationControllerStatics()
    }


    public val IUINavigationControllerStatics2_Instance: IUINavigationControllerStatics2 by lazy {
      createIUINavigationControllerStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIUINavigationControllerStatics(): IUINavigationControllerStatics {
      val refiid = Guid.REFIID(IUINavigationControllerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Gaming.Input.UINavigationController".toHandle(),refiid,interfacePtr)
      val result =
          IUINavigationControllerStatics.ABI.makeIUINavigationControllerStatics(interfacePtr.value)
      return result
    }

    public fun createIUINavigationControllerStatics2(): IUINavigationControllerStatics2 {
      val refiid = Guid.REFIID(IUINavigationControllerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Gaming.Input.UINavigationController".toHandle(),refiid,interfacePtr)
      val result =
          IUINavigationControllerStatics2.ABI.makeIUINavigationControllerStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): UINavigationController {
      val address = segment.toRawLongValue()
      return UINavigationController(Pointer(address))
    }

    public override fun toNative(obj: UINavigationController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun add_UINavigationControllerAdded(value: EventHandler<UINavigationController?>) =
        ABI.IUINavigationControllerStatics_Instance.add_UINavigationControllerAdded(value)

    public fun remove_UINavigationControllerAdded(token: EventRegistrationToken) =
        ABI.IUINavigationControllerStatics_Instance.remove_UINavigationControllerAdded(token)

    public fun add_UINavigationControllerRemoved(value: EventHandler<UINavigationController?>) =
        ABI.IUINavigationControllerStatics_Instance.add_UINavigationControllerRemoved(value)

    public fun remove_UINavigationControllerRemoved(token: EventRegistrationToken) =
        ABI.IUINavigationControllerStatics_Instance.remove_UINavigationControllerRemoved(token)

    public fun get_UINavigationControllers() =
        ABI.IUINavigationControllerStatics_Instance.get_UINavigationControllers()

    public fun FromGameController(gameController: IGameController) =
        ABI.IUINavigationControllerStatics2_Instance.FromGameController(gameController)
  }
}
