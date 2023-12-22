package Windows.Gaming.Input.Preview

import Windows.Gaming.Input.Custom.IGameControllerProvider
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
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(GameControllerProviderInfo.ABI::class)
@WinRTByReference(brClass = GameControllerProviderInfo.ByReference::class)
public class GameControllerProviderInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GameControllerProviderInfo> {
    public override fun getValue() = GameControllerProviderInfo(pointer.getPointer(0))

    public fun setValue(value: GameControllerProviderInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GameControllerProviderInfo, MemoryAddress> {
    public val IGameControllerProviderInfoStatics_Instance: IGameControllerProviderInfoStatics by
        lazy {
      createIGameControllerProviderInfoStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGameControllerProviderInfoStatics(): IGameControllerProviderInfoStatics {
      val refiid = Guid.REFIID(IGameControllerProviderInfoStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Gaming.Input.Preview.GameControllerProviderInfo".toHandle(),refiid,interfacePtr)
      val result =
          IGameControllerProviderInfoStatics.ABI.makeIGameControllerProviderInfoStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GameControllerProviderInfo {
      val address = segment.toRawLongValue()
      return GameControllerProviderInfo(Pointer(address))
    }

    public override fun toNative(obj: GameControllerProviderInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetParentProviderId(provider: IGameControllerProvider) =
        ABI.IGameControllerProviderInfoStatics_Instance.GetParentProviderId(provider)

    public fun GetProviderId(provider: IGameControllerProvider) =
        ABI.IGameControllerProviderInfoStatics_Instance.GetProviderId(provider)
  }
}
