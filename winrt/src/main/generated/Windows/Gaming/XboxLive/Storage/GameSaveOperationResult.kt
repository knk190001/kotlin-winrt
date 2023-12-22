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

@ABIMarker(GameSaveOperationResult.ABI::class)
@Signature("rc(Windows.Gaming.XboxLive.Storage.GameSaveOperationResult;{cf0f1a05-24a0-4582-9a55-b1bbbb9388d8})")
@WinRTByReference(brClass = GameSaveOperationResult.ByReference::class)
public class GameSaveOperationResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGameSaveOperationResult.WithDefault, IWinRTObject {
  private val __2075481108_Interface: IGameSaveOperationResult.WithDefault by lazy {
    as_2075481108()
  }


  public override val __2075481108_Ptr: JNAPointer? by lazy {
    __2075481108_Interface.__2075481108_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2075481108_Interface)

  private fun as_2075481108(): IGameSaveOperationResult.WithDefault {
    if(pointer == NULL) {
      return(IGameSaveOperationResult.ABI.makeIGameSaveOperationResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGameSaveOperationResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGameSaveOperationResult.ABI.makeIGameSaveOperationResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GameSaveOperationResult> {
    public override fun getValue() = GameSaveOperationResult(pointer.getPointer(0))

    public fun setValue(value: GameSaveOperationResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GameSaveOperationResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GameSaveOperationResult {
      val address = segment.toRawLongValue()
      return GameSaveOperationResult(Pointer(address))
    }

    public override fun toNative(obj: GameSaveOperationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
