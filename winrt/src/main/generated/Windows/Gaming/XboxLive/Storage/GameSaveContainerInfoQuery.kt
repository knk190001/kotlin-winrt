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

@ABIMarker(GameSaveContainerInfoQuery.ABI::class)
@Signature("rc(Windows.Gaming.XboxLive.Storage.GameSaveContainerInfoQuery;{3c94e863-6f80-4327-9327-ffc11afd42b3})")
@WinRTByReference(brClass = GameSaveContainerInfoQuery.ByReference::class)
public class GameSaveContainerInfoQuery(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGameSaveContainerInfoQuery.WithDefault, IWinRTObject {
  private val __1541686095_Interface: IGameSaveContainerInfoQuery.WithDefault by lazy {
    as_1541686095()
  }


  public override val __1541686095_Ptr: JNAPointer? by lazy {
    __1541686095_Interface.__1541686095_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1541686095_Interface)

  private fun as_1541686095(): IGameSaveContainerInfoQuery.WithDefault {
    if(pointer == NULL) {
      return(IGameSaveContainerInfoQuery.ABI.makeIGameSaveContainerInfoQuery(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGameSaveContainerInfoQuery>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGameSaveContainerInfoQuery.ABI.makeIGameSaveContainerInfoQuery(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GameSaveContainerInfoQuery> {
    public override fun getValue() = GameSaveContainerInfoQuery(pointer.getPointer(0))

    public fun setValue(value: GameSaveContainerInfoQuery): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GameSaveContainerInfoQuery, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GameSaveContainerInfoQuery {
      val address = segment.toRawLongValue()
      return GameSaveContainerInfoQuery(Pointer(address))
    }

    public override fun toNative(obj: GameSaveContainerInfoQuery): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
