package Windows.Phone.System.UserProfile.GameServices.Core

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

@ABIMarker(GameServicePropertyCollection.ABI::class)
@Signature("rc(Windows.Phone.System.UserProfile.GameServices.Core.GameServicePropertyCollection;{07e57fc8-debb-4609-9cc8-529d16bc2bd9})")
@WinRTByReference(brClass = GameServicePropertyCollection.ByReference::class)
public class GameServicePropertyCollection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGameServicePropertyCollection.WithDefault, IWinRTObject {
  private val __1155340262_Interface: IGameServicePropertyCollection.WithDefault by lazy {
    as_1155340262()
  }


  public override val __1155340262_Ptr: JNAPointer? by lazy {
    __1155340262_Interface.__1155340262_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1155340262_Interface)

  private fun as_1155340262(): IGameServicePropertyCollection.WithDefault {
    if(pointer == NULL) {
      return(IGameServicePropertyCollection.ABI.makeIGameServicePropertyCollection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGameServicePropertyCollection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGameServicePropertyCollection.ABI.makeIGameServicePropertyCollection(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GameServicePropertyCollection> {
    public override fun getValue() = GameServicePropertyCollection(pointer.getPointer(0))

    public fun setValue(value: GameServicePropertyCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GameServicePropertyCollection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GameServicePropertyCollection {
      val address = segment.toRawLongValue()
      return GameServicePropertyCollection(Pointer(address))
    }

    public override fun toNative(obj: GameServicePropertyCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
