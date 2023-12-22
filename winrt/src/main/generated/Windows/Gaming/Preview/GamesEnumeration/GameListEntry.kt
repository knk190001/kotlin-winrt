package Windows.Gaming.Preview.GamesEnumeration

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

@ABIMarker(GameListEntry.ABI::class)
@Signature("rc(Windows.Gaming.Preview.GamesEnumeration.GameListEntry;{735924d3-811f-4494-b69c-c641a0c61543})")
@WinRTByReference(brClass = GameListEntry.ByReference::class)
public class GameListEntry(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGameListEntry.WithDefault, IGameListEntry2.WithDefault, IWinRTObject {
  private val __621623417_Interface: IGameListEntry.WithDefault by lazy {
    as_621623417()
  }


  private val __2090456793_Interface: IGameListEntry2.WithDefault by lazy {
    as_2090456793()
  }


  public override val __621623417_Ptr: JNAPointer? by lazy {
    __621623417_Interface.__621623417_Ptr
  }


  public override val __2090456793_Ptr: JNAPointer? by lazy {
    __2090456793_Interface.__2090456793_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__621623417_Interface, __2090456793_Interface)

  private fun as_621623417(): IGameListEntry.WithDefault {
    if(pointer == NULL) {
      return(IGameListEntry.ABI.makeIGameListEntry(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGameListEntry>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGameListEntry.ABI.makeIGameListEntry(ref.value))
  }

  private fun as_2090456793(): IGameListEntry2.WithDefault {
    if(pointer == NULL) {
      return(IGameListEntry2.ABI.makeIGameListEntry2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGameListEntry2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGameListEntry2.ABI.makeIGameListEntry2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<GameListEntry>
      {
    public override fun getValue() = GameListEntry(pointer.getPointer(0))

    public fun setValue(value: GameListEntry): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GameListEntry, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GameListEntry {
      val address = segment.toRawLongValue()
      return GameListEntry(Pointer(address))
    }

    public override fun toNative(obj: GameListEntry): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
