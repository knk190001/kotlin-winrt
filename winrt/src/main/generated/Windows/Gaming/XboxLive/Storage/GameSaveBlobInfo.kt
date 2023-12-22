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

@ABIMarker(GameSaveBlobInfo.ABI::class)
@Signature("rc(Windows.Gaming.XboxLive.Storage.GameSaveBlobInfo;{add38034-baf0-4645-b6d0-46edaffb3c2b})")
@WinRTByReference(brClass = GameSaveBlobInfo.ByReference::class)
public class GameSaveBlobInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGameSaveBlobInfo.WithDefault, IWinRTObject {
  private val __2051977373_Interface: IGameSaveBlobInfo.WithDefault by lazy {
    as_2051977373()
  }


  public override val __2051977373_Ptr: JNAPointer? by lazy {
    __2051977373_Interface.__2051977373_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2051977373_Interface)

  private fun as_2051977373(): IGameSaveBlobInfo.WithDefault {
    if(pointer == NULL) {
      return(IGameSaveBlobInfo.ABI.makeIGameSaveBlobInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGameSaveBlobInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGameSaveBlobInfo.ABI.makeIGameSaveBlobInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GameSaveBlobInfo> {
    public override fun getValue() = GameSaveBlobInfo(pointer.getPointer(0))

    public fun setValue(value: GameSaveBlobInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GameSaveBlobInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GameSaveBlobInfo {
      val address = segment.toRawLongValue()
      return GameSaveBlobInfo(Pointer(address))
    }

    public override fun toNative(obj: GameSaveBlobInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
