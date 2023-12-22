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

@ABIMarker(ArcadeStick.ABI::class)
@Signature("rc(Windows.Gaming.Input.ArcadeStick;{b14a539d-befb-4c81-8051-15ecf3b13036})")
@WinRTByReference(brClass = ArcadeStick.ByReference::class)
public class ArcadeStick(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IArcadeStick.WithDefault, IGameController.WithDefault,
    IGameControllerBatteryInfo.WithDefault, IWinRTObject {
  private val __1530563405_Interface: IArcadeStick.WithDefault by lazy {
    as_1530563405()
  }


  private val __925471711_Interface: IGameController.WithDefault by lazy {
    as_925471711()
  }


  private val __1091749242_Interface: IGameControllerBatteryInfo.WithDefault by lazy {
    as_1091749242()
  }


  public override val __1530563405_Ptr: JNAPointer? by lazy {
    __1530563405_Interface.__1530563405_Ptr
  }


  public override val __925471711_Ptr: JNAPointer? by lazy {
    __925471711_Interface.__925471711_Ptr
  }


  public override val __1091749242_Ptr: JNAPointer? by lazy {
    __1091749242_Interface.__1091749242_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1530563405_Interface, __925471711_Interface, __1091749242_Interface)

  private fun as_1530563405(): IArcadeStick.WithDefault {
    if(pointer == NULL) {
      return(IArcadeStick.ABI.makeIArcadeStick(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IArcadeStick>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IArcadeStick.ABI.makeIArcadeStick(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ArcadeStick> {
    public override fun getValue() = ArcadeStick(pointer.getPointer(0))

    public fun setValue(value: ArcadeStick): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ArcadeStick, MemoryAddress> {
    public val IArcadeStickStatics_Instance: IArcadeStickStatics by lazy {
      createIArcadeStickStatics()
    }


    public val IArcadeStickStatics2_Instance: IArcadeStickStatics2 by lazy {
      createIArcadeStickStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIArcadeStickStatics(): IArcadeStickStatics {
      val refiid = Guid.REFIID(IArcadeStickStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Gaming.Input.ArcadeStick".toHandle(),refiid,interfacePtr)
      val result = IArcadeStickStatics.ABI.makeIArcadeStickStatics(interfacePtr.value)
      return result
    }

    public fun createIArcadeStickStatics2(): IArcadeStickStatics2 {
      val refiid = Guid.REFIID(IArcadeStickStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Gaming.Input.ArcadeStick".toHandle(),refiid,interfacePtr)
      val result = IArcadeStickStatics2.ABI.makeIArcadeStickStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ArcadeStick {
      val address = segment.toRawLongValue()
      return ArcadeStick(Pointer(address))
    }

    public override fun toNative(obj: ArcadeStick): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun add_ArcadeStickAdded(value: EventHandler<ArcadeStick?>) =
        ABI.IArcadeStickStatics_Instance.add_ArcadeStickAdded(value)

    public fun remove_ArcadeStickAdded(token: EventRegistrationToken) =
        ABI.IArcadeStickStatics_Instance.remove_ArcadeStickAdded(token)

    public fun add_ArcadeStickRemoved(value: EventHandler<ArcadeStick?>) =
        ABI.IArcadeStickStatics_Instance.add_ArcadeStickRemoved(value)

    public fun remove_ArcadeStickRemoved(token: EventRegistrationToken) =
        ABI.IArcadeStickStatics_Instance.remove_ArcadeStickRemoved(token)

    public fun get_ArcadeSticks() = ABI.IArcadeStickStatics_Instance.get_ArcadeSticks()

    public fun FromGameController(gameController: IGameController) =
        ABI.IArcadeStickStatics2_Instance.FromGameController(gameController)
  }
}
