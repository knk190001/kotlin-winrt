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

@ABIMarker(GameSaveBlobInfoQuery.ABI::class)
@Signature("rc(Windows.Gaming.XboxLive.Storage.GameSaveBlobInfoQuery;{9fdd74b2-eeee-447b-a9d2-7f96c0f83208})")
@WinRTByReference(brClass = GameSaveBlobInfoQuery.ByReference::class)
public class GameSaveBlobInfoQuery(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGameSaveBlobInfoQuery.WithDefault, IWinRTObject {
  private val __580649179_Interface: IGameSaveBlobInfoQuery.WithDefault by lazy {
    as_580649179()
  }


  public override val __580649179_Ptr: JNAPointer? by lazy {
    __580649179_Interface.__580649179_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__580649179_Interface)

  private fun as_580649179(): IGameSaveBlobInfoQuery.WithDefault {
    if(pointer == NULL) {
      return(IGameSaveBlobInfoQuery.ABI.makeIGameSaveBlobInfoQuery(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGameSaveBlobInfoQuery>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGameSaveBlobInfoQuery.ABI.makeIGameSaveBlobInfoQuery(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GameSaveBlobInfoQuery> {
    public override fun getValue() = GameSaveBlobInfoQuery(pointer.getPointer(0))

    public fun setValue(value: GameSaveBlobInfoQuery): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GameSaveBlobInfoQuery, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GameSaveBlobInfoQuery {
      val address = segment.toRawLongValue()
      return GameSaveBlobInfoQuery(Pointer(address))
    }

    public override fun toNative(obj: GameSaveBlobInfoQuery): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
