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

@ABIMarker(Gamepad.ABI::class)
@Signature("rc(Windows.Gaming.Input.Gamepad;{bc7bb43c-0a69-3903-9e9d-a50f86a45de5})")
@WinRTByReference(brClass = Gamepad.ByReference::class)
public class Gamepad(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGamepad.WithDefault, IGameController.WithDefault, IGamepad2.WithDefault,
    IGameControllerBatteryInfo.WithDefault, IWinRTObject {
  private val __418806734_Interface: IGamepad.WithDefault by lazy {
    as_418806734()
  }


  private val __925471711_Interface: IGameController.WithDefault by lazy {
    as_925471711()
  }


  private val __98106916_Interface: IGamepad2.WithDefault by lazy {
    as_98106916()
  }


  private val __1091749242_Interface: IGameControllerBatteryInfo.WithDefault by lazy {
    as_1091749242()
  }


  public override val __418806734_Ptr: JNAPointer? by lazy {
    __418806734_Interface.__418806734_Ptr
  }


  public override val __925471711_Ptr: JNAPointer? by lazy {
    __925471711_Interface.__925471711_Ptr
  }


  public override val __98106916_Ptr: JNAPointer? by lazy {
    __98106916_Interface.__98106916_Ptr
  }


  public override val __1091749242_Ptr: JNAPointer? by lazy {
    __1091749242_Interface.__1091749242_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__418806734_Interface, __925471711_Interface, __98106916_Interface,
        __1091749242_Interface)

  private fun as_418806734(): IGamepad.WithDefault {
    if(pointer == NULL) {
      return(IGamepad.ABI.makeIGamepad(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGamepad>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGamepad.ABI.makeIGamepad(ref.value))
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

  private fun as_98106916(): IGamepad2.WithDefault {
    if(pointer == NULL) {
      return(IGamepad2.ABI.makeIGamepad2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGamepad2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGamepad2.ABI.makeIGamepad2(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Gamepad> {
    public override fun getValue() = Gamepad(pointer.getPointer(0))

    public fun setValue(value: Gamepad): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Gamepad, MemoryAddress> {
    public val IGamepadStatics_Instance: IGamepadStatics by lazy {
      createIGamepadStatics()
    }


    public val IGamepadStatics2_Instance: IGamepadStatics2 by lazy {
      createIGamepadStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGamepadStatics(): IGamepadStatics {
      val refiid = Guid.REFIID(IGamepadStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Gaming.Input.Gamepad".toHandle(),refiid,interfacePtr)
      val result = IGamepadStatics.ABI.makeIGamepadStatics(interfacePtr.value)
      return result
    }

    public fun createIGamepadStatics2(): IGamepadStatics2 {
      val refiid = Guid.REFIID(IGamepadStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Gaming.Input.Gamepad".toHandle(),refiid,interfacePtr)
      val result = IGamepadStatics2.ABI.makeIGamepadStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Gamepad {
      val address = segment.toRawLongValue()
      return Gamepad(Pointer(address))
    }

    public override fun toNative(obj: Gamepad): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun add_GamepadAdded(value: EventHandler<Gamepad?>) =
        ABI.IGamepadStatics_Instance.add_GamepadAdded(value)

    public fun remove_GamepadAdded(token: EventRegistrationToken) =
        ABI.IGamepadStatics_Instance.remove_GamepadAdded(token)

    public fun add_GamepadRemoved(value: EventHandler<Gamepad?>) =
        ABI.IGamepadStatics_Instance.add_GamepadRemoved(value)

    public fun remove_GamepadRemoved(token: EventRegistrationToken) =
        ABI.IGamepadStatics_Instance.remove_GamepadRemoved(token)

    public fun get_Gamepads() = ABI.IGamepadStatics_Instance.get_Gamepads()

    public fun FromGameController(gameController: IGameController) =
        ABI.IGamepadStatics2_Instance.FromGameController(gameController)
  }
}
