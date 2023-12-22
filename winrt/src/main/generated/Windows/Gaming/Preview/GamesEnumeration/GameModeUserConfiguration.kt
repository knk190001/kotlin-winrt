package Windows.Gaming.Preview.GamesEnumeration

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

@ABIMarker(GameModeUserConfiguration.ABI::class)
@Signature("rc(Windows.Gaming.Preview.GamesEnumeration.GameModeUserConfiguration;{72d34af4-756b-470f-a0c2-ba62a90795db})")
@WinRTByReference(brClass = GameModeUserConfiguration.ByReference::class)
public class GameModeUserConfiguration(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGameModeUserConfiguration.WithDefault, IWinRTObject {
  private val __1564727821_Interface: IGameModeUserConfiguration.WithDefault by lazy {
    as_1564727821()
  }


  public override val __1564727821_Ptr: JNAPointer? by lazy {
    __1564727821_Interface.__1564727821_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1564727821_Interface)

  private fun as_1564727821(): IGameModeUserConfiguration.WithDefault {
    if(pointer == NULL) {
      return(IGameModeUserConfiguration.ABI.makeIGameModeUserConfiguration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGameModeUserConfiguration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGameModeUserConfiguration.ABI.makeIGameModeUserConfiguration(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GameModeUserConfiguration> {
    public override fun getValue() = GameModeUserConfiguration(pointer.getPointer(0))

    public fun setValue(value: GameModeUserConfiguration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GameModeUserConfiguration, MemoryAddress> {
    public val IGameModeUserConfigurationStatics_Instance: IGameModeUserConfigurationStatics by
        lazy {
      createIGameModeUserConfigurationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGameModeUserConfigurationStatics(): IGameModeUserConfigurationStatics {
      val refiid = Guid.REFIID(IGameModeUserConfigurationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Gaming.Preview.GamesEnumeration.GameModeUserConfiguration".toHandle(),refiid,interfacePtr)
      val result =
          IGameModeUserConfigurationStatics.ABI.makeIGameModeUserConfigurationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GameModeUserConfiguration {
      val address = segment.toRawLongValue()
      return GameModeUserConfiguration(Pointer(address))
    }

    public override fun toNative(obj: GameModeUserConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IGameModeUserConfigurationStatics_Instance.GetDefault()
  }
}
