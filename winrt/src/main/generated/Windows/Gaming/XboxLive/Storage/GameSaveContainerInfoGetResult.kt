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

@ABIMarker(GameSaveContainerInfoGetResult.ABI::class)
@Signature("rc(Windows.Gaming.XboxLive.Storage.GameSaveContainerInfoGetResult;{ffc50d74-c581-4f9d-9e39-30a10c1e4c50})")
@WinRTByReference(brClass = GameSaveContainerInfoGetResult.ByReference::class)
public class GameSaveContainerInfoGetResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGameSaveContainerInfoGetResult.WithDefault, IWinRTObject {
  private val __450589308_Interface: IGameSaveContainerInfoGetResult.WithDefault by lazy {
    as_450589308()
  }


  public override val __450589308_Ptr: JNAPointer? by lazy {
    __450589308_Interface.__450589308_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__450589308_Interface)

  private fun as_450589308(): IGameSaveContainerInfoGetResult.WithDefault {
    if(pointer == NULL) {
      return(IGameSaveContainerInfoGetResult.ABI.makeIGameSaveContainerInfoGetResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGameSaveContainerInfoGetResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGameSaveContainerInfoGetResult.ABI.makeIGameSaveContainerInfoGetResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GameSaveContainerInfoGetResult> {
    public override fun getValue() = GameSaveContainerInfoGetResult(pointer.getPointer(0))

    public fun setValue(value: GameSaveContainerInfoGetResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GameSaveContainerInfoGetResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GameSaveContainerInfoGetResult {
      val address = segment.toRawLongValue()
      return GameSaveContainerInfoGetResult(Pointer(address))
    }

    public override fun toNative(obj: GameSaveContainerInfoGetResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
