package Windows.Gaming.UI

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

@ABIMarker(GameChatOverlay.ABI::class)
@Signature("rc(Windows.Gaming.UI.GameChatOverlay;{fbc64865-f6fc-4a48-ae07-03ac6ed43704})")
@WinRTByReference(brClass = GameChatOverlay.ByReference::class)
public class GameChatOverlay(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGameChatOverlay.WithDefault, IWinRTObject {
  private val __1873591867_Interface: IGameChatOverlay.WithDefault by lazy {
    as_1873591867()
  }


  public override val __1873591867_Ptr: JNAPointer? by lazy {
    __1873591867_Interface.__1873591867_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1873591867_Interface)

  private fun as_1873591867(): IGameChatOverlay.WithDefault {
    if(pointer == NULL) {
      return(IGameChatOverlay.ABI.makeIGameChatOverlay(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGameChatOverlay>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGameChatOverlay.ABI.makeIGameChatOverlay(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GameChatOverlay> {
    public override fun getValue() = GameChatOverlay(pointer.getPointer(0))

    public fun setValue(value: GameChatOverlay): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GameChatOverlay, MemoryAddress> {
    public val IGameChatOverlayStatics_Instance: IGameChatOverlayStatics by lazy {
      createIGameChatOverlayStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGameChatOverlayStatics(): IGameChatOverlayStatics {
      val refiid = Guid.REFIID(IGameChatOverlayStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Gaming.UI.GameChatOverlay".toHandle(),refiid,interfacePtr)
      val result = IGameChatOverlayStatics.ABI.makeIGameChatOverlayStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GameChatOverlay {
      val address = segment.toRawLongValue()
      return GameChatOverlay(Pointer(address))
    }

    public override fun toNative(obj: GameChatOverlay): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IGameChatOverlayStatics_Instance.GetDefault()
  }
}
