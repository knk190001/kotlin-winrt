package Windows.Gaming.Input

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(RawGameController.ABI::class)
@Signature("rc(Windows.Gaming.Input.RawGameController;{7cad6d91-a7e1-4f71-9a78-33e9c5dfea62})")
@WinRTByReference(brClass = RawGameController.ByReference::class)
public class RawGameController(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRawGameController.WithDefault, IGameController.WithDefault,
    IGameControllerBatteryInfo.WithDefault, IRawGameController2.WithDefault, IWinRTObject {
  private val __1516440669_Interface: IRawGameController.WithDefault by lazy {
    as_1516440669()
  }


  private val __925471711_Interface: IGameController.WithDefault by lazy {
    as_925471711()
  }


  private val __1091749242_Interface: IGameControllerBatteryInfo.WithDefault by lazy {
    as_1091749242()
  }


  private val __234979567_Interface: IRawGameController2.WithDefault by lazy {
    as_234979567()
  }


  public override val __1516440669_Ptr: JNAPointer? by lazy {
    __1516440669_Interface.__1516440669_Ptr
  }


  public override val __925471711_Ptr: JNAPointer? by lazy {
    __925471711_Interface.__925471711_Ptr
  }


  public override val __1091749242_Ptr: JNAPointer? by lazy {
    __1091749242_Interface.__1091749242_Ptr
  }


  public override val __234979567_Ptr: JNAPointer? by lazy {
    __234979567_Interface.__234979567_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1516440669_Interface, __925471711_Interface, __1091749242_Interface,
        __234979567_Interface)

  private fun as_1516440669(): IRawGameController.WithDefault {
    if(pointer == NULL) {
      return(IRawGameController.ABI.makeIRawGameController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRawGameController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRawGameController.ABI.makeIRawGameController(ref.value))
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

  private fun as_234979567(): IRawGameController2.WithDefault {
    if(pointer == NULL) {
      return(IRawGameController2.ABI.makeIRawGameController2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRawGameController2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRawGameController2.ABI.makeIRawGameController2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RawGameController> {
    public override fun getValue() = RawGameController(pointer.getPointer(0))

    public fun setValue(value: RawGameController): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RawGameController, MemoryAddress> {
    public val IRawGameControllerStatics_Instance: IRawGameControllerStatics by lazy {
      createIRawGameControllerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRawGameControllerStatics(): IRawGameControllerStatics {
      val refiid = Guid.REFIID(IRawGameControllerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Gaming.Input.RawGameController".toHandle(),refiid,interfacePtr)
      val result = IRawGameControllerStatics.ABI.makeIRawGameControllerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): RawGameController {
      val address = segment.toRawLongValue()
      return RawGameController(Pointer(address))
    }

    public override fun toNative(obj: RawGameController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun add_RawGameControllerAdded(value: EventHandler<RawGameController?>) =
        ABI.IRawGameControllerStatics_Instance.add_RawGameControllerAdded(value)

    public fun remove_RawGameControllerAdded(token: EventRegistrationToken) =
        ABI.IRawGameControllerStatics_Instance.remove_RawGameControllerAdded(token)

    public fun add_RawGameControllerRemoved(value: EventHandler<RawGameController?>) =
        ABI.IRawGameControllerStatics_Instance.add_RawGameControllerRemoved(value)

    public fun remove_RawGameControllerRemoved(token: EventRegistrationToken) =
        ABI.IRawGameControllerStatics_Instance.remove_RawGameControllerRemoved(token)

    public fun get_RawGameControllers() =
        ABI.IRawGameControllerStatics_Instance.get_RawGameControllers()

    public fun FromGameController(gameController: IGameController) =
        ABI.IRawGameControllerStatics_Instance.FromGameController(gameController)
  }
}
