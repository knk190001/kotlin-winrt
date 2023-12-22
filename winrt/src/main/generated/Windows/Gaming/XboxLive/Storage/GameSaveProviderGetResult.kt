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

@ABIMarker(GameSaveProviderGetResult.ABI::class)
@Signature("rc(Windows.Gaming.XboxLive.Storage.GameSaveProviderGetResult;{3ab90816-d393-4d65-ac16-41c3e67ab945})")
@WinRTByReference(brClass = GameSaveProviderGetResult.ByReference::class)
public class GameSaveProviderGetResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGameSaveProviderGetResult.WithDefault, IWinRTObject {
  private val __1007054250_Interface: IGameSaveProviderGetResult.WithDefault by lazy {
    as_1007054250()
  }


  public override val __1007054250_Ptr: JNAPointer? by lazy {
    __1007054250_Interface.__1007054250_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1007054250_Interface)

  private fun as_1007054250(): IGameSaveProviderGetResult.WithDefault {
    if(pointer == NULL) {
      return(IGameSaveProviderGetResult.ABI.makeIGameSaveProviderGetResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGameSaveProviderGetResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGameSaveProviderGetResult.ABI.makeIGameSaveProviderGetResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GameSaveProviderGetResult> {
    public override fun getValue() = GameSaveProviderGetResult(pointer.getPointer(0))

    public fun setValue(value: GameSaveProviderGetResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GameSaveProviderGetResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GameSaveProviderGetResult {
      val address = segment.toRawLongValue()
      return GameSaveProviderGetResult(Pointer(address))
    }

    public override fun toNative(obj: GameSaveProviderGetResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
