package Windows.Gaming.Input.Custom

import Windows.Gaming.Input.IGameController
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(GameControllerFactoryManager.ABI::class)
@WinRTByReference(brClass = GameControllerFactoryManager.ByReference::class)
public class GameControllerFactoryManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GameControllerFactoryManager> {
    public override fun getValue() = GameControllerFactoryManager(pointer.getPointer(0))

    public fun setValue(value: GameControllerFactoryManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GameControllerFactoryManager, MemoryAddress> {
    public val IGameControllerFactoryManagerStatics2_Instance: IGameControllerFactoryManagerStatics2
        by lazy {
      createIGameControllerFactoryManagerStatics2()
    }


    public val IGameControllerFactoryManagerStatics_Instance: IGameControllerFactoryManagerStatics
        by lazy {
      createIGameControllerFactoryManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGameControllerFactoryManagerStatics2():
        IGameControllerFactoryManagerStatics2 {
      val refiid = Guid.REFIID(IGameControllerFactoryManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Gaming.Input.Custom.GameControllerFactoryManager".toHandle(),refiid,interfacePtr)
      val result =
          IGameControllerFactoryManagerStatics2.ABI.makeIGameControllerFactoryManagerStatics2(interfacePtr.value)
      return result
    }

    public fun createIGameControllerFactoryManagerStatics(): IGameControllerFactoryManagerStatics {
      val refiid = Guid.REFIID(IGameControllerFactoryManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Gaming.Input.Custom.GameControllerFactoryManager".toHandle(),refiid,interfacePtr)
      val result =
          IGameControllerFactoryManagerStatics.ABI.makeIGameControllerFactoryManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GameControllerFactoryManager {
      val address = segment.toRawLongValue()
      return GameControllerFactoryManager(Pointer(address))
    }

    public override fun toNative(obj: GameControllerFactoryManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun TryGetFactoryControllerFromGameController(factory: ICustomGameControllerFactory,
        gameController: IGameController) =
        ABI.IGameControllerFactoryManagerStatics2_Instance.TryGetFactoryControllerFromGameController(factory,
        gameController)

    public fun RegisterCustomFactoryForGipInterface(factory: ICustomGameControllerFactory,
        interfaceId: Guid.GUID) =
        ABI.IGameControllerFactoryManagerStatics_Instance.RegisterCustomFactoryForGipInterface(factory,
        interfaceId)

    public fun RegisterCustomFactoryForHardwareId(
      factory: ICustomGameControllerFactory,
      hardwareVendorId: WinDef.USHORT,
      hardwareProductId: WinDef.USHORT
    ) =
        ABI.IGameControllerFactoryManagerStatics_Instance.RegisterCustomFactoryForHardwareId(factory,
        hardwareVendorId, hardwareProductId)

    public fun RegisterCustomFactoryForXusbType(
      factory: ICustomGameControllerFactory,
      xusbType: XusbDeviceType,
      xusbSubtype: XusbDeviceSubtype
    ) = ABI.IGameControllerFactoryManagerStatics_Instance.RegisterCustomFactoryForXusbType(factory,
        xusbType, xusbSubtype)
  }
}
