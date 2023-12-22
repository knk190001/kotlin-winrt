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

@ABIMarker(GameSaveBlobInfoGetResult.ABI::class)
@Signature("rc(Windows.Gaming.XboxLive.Storage.GameSaveBlobInfoGetResult;{c7578582-3697-42bf-989c-665d923b5231})")
@WinRTByReference(brClass = GameSaveBlobInfoGetResult.ByReference::class)
public class GameSaveBlobInfoGetResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGameSaveBlobInfoGetResult.WithDefault, IWinRTObject {
  private val __412441328_Interface: IGameSaveBlobInfoGetResult.WithDefault by lazy {
    as_412441328()
  }


  public override val __412441328_Ptr: JNAPointer? by lazy {
    __412441328_Interface.__412441328_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__412441328_Interface)

  private fun as_412441328(): IGameSaveBlobInfoGetResult.WithDefault {
    if(pointer == NULL) {
      return(IGameSaveBlobInfoGetResult.ABI.makeIGameSaveBlobInfoGetResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGameSaveBlobInfoGetResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGameSaveBlobInfoGetResult.ABI.makeIGameSaveBlobInfoGetResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GameSaveBlobInfoGetResult> {
    public override fun getValue() = GameSaveBlobInfoGetResult(pointer.getPointer(0))

    public fun setValue(value: GameSaveBlobInfoGetResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GameSaveBlobInfoGetResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GameSaveBlobInfoGetResult {
      val address = segment.toRawLongValue()
      return GameSaveBlobInfoGetResult(Pointer(address))
    }

    public override fun toNative(obj: GameSaveBlobInfoGetResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
