package Windows.Gaming.XboxLive.Storage

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

@ABIMarker(GameSaveContainer.ABI::class)
@Signature("rc(Windows.Gaming.XboxLive.Storage.GameSaveContainer;{c3c08f89-563f-4ecd-9c6f-33fd0e323d10})")
@WinRTByReference(brClass = GameSaveContainer.ByReference::class)
public class GameSaveContainer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGameSaveContainer.WithDefault, IWinRTObject {
  private val __410935799_Interface: IGameSaveContainer.WithDefault by lazy {
    as_410935799()
  }


  public override val __410935799_Ptr: JNAPointer? by lazy {
    __410935799_Interface.__410935799_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__410935799_Interface)

  private fun as_410935799(): IGameSaveContainer.WithDefault {
    if(pointer == NULL) {
      return(IGameSaveContainer.ABI.makeIGameSaveContainer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGameSaveContainer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGameSaveContainer.ABI.makeIGameSaveContainer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GameSaveContainer> {
    public override fun getValue() = GameSaveContainer(pointer.getPointer(0))

    public fun setValue(value: GameSaveContainer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GameSaveContainer, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GameSaveContainer {
      val address = segment.toRawLongValue()
      return GameSaveContainer(Pointer(address))
    }

    public override fun toNative(obj: GameSaveContainer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
