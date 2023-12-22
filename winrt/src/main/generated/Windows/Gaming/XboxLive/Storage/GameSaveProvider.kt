package Windows.Gaming.XboxLive.Storage

import Windows.System.User
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(GameSaveProvider.ABI::class)
@Signature("rc(Windows.Gaming.XboxLive.Storage.GameSaveProvider;{90a60394-80fe-4211-97f8-a5de14dd95d2})")
@WinRTByReference(brClass = GameSaveProvider.ByReference::class)
public class GameSaveProvider(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGameSaveProvider.WithDefault, IWinRTObject {
  private val __1921999721_Interface: IGameSaveProvider.WithDefault by lazy {
    as_1921999721()
  }


  public override val __1921999721_Ptr: JNAPointer? by lazy {
    __1921999721_Interface.__1921999721_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1921999721_Interface)

  private fun as_1921999721(): IGameSaveProvider.WithDefault {
    if(pointer == NULL) {
      return(IGameSaveProvider.ABI.makeIGameSaveProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGameSaveProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGameSaveProvider.ABI.makeIGameSaveProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GameSaveProvider> {
    public override fun getValue() = GameSaveProvider(pointer.getPointer(0))

    public fun setValue(value: GameSaveProvider): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GameSaveProvider, MemoryAddress> {
    public val IGameSaveProviderStatics_Instance: IGameSaveProviderStatics by lazy {
      createIGameSaveProviderStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGameSaveProviderStatics(): IGameSaveProviderStatics {
      val refiid = Guid.REFIID(IGameSaveProviderStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Gaming.XboxLive.Storage.GameSaveProvider".toHandle(),refiid,interfacePtr)
      val result = IGameSaveProviderStatics.ABI.makeIGameSaveProviderStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GameSaveProvider {
      val address = segment.toRawLongValue()
      return GameSaveProvider(Pointer(address))
    }

    public override fun toNative(obj: GameSaveProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForUserAsync(user: User, serviceConfigId: String) =
        ABI.IGameSaveProviderStatics_Instance.GetForUserAsync(user, serviceConfigId)

    public fun GetSyncOnDemandForUserAsync(user: User, serviceConfigId: String) =
        ABI.IGameSaveProviderStatics_Instance.GetSyncOnDemandForUserAsync(user, serviceConfigId)
  }
}
