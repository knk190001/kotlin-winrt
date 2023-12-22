package Windows.Gaming.Preview.GamesEnumeration

import Windows.Foundation.EventRegistrationToken
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(GameList.ABI::class)
@WinRTByReference(brClass = GameList.ByReference::class)
public class GameList(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<GameList> {
    public override fun getValue() = GameList(pointer.getPointer(0))

    public fun setValue(value: GameList): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GameList, MemoryAddress> {
    public val IGameListStatics_Instance: IGameListStatics by lazy {
      createIGameListStatics()
    }


    public val IGameListStatics2_Instance: IGameListStatics2 by lazy {
      createIGameListStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGameListStatics(): IGameListStatics {
      val refiid = Guid.REFIID(IGameListStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Gaming.Preview.GamesEnumeration.GameList".toHandle(),refiid,interfacePtr)
      val result = IGameListStatics.ABI.makeIGameListStatics(interfacePtr.value)
      return result
    }

    public fun createIGameListStatics2(): IGameListStatics2 {
      val refiid = Guid.REFIID(IGameListStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Gaming.Preview.GamesEnumeration.GameList".toHandle(),refiid,interfacePtr)
      val result = IGameListStatics2.ABI.makeIGameListStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GameList {
      val address = segment.toRawLongValue()
      return GameList(Pointer(address))
    }

    public override fun toNative(obj: GameList): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FindAllAsync() = ABI.IGameListStatics_Instance.FindAllAsync()

    public fun FindAllAsync(packageFamilyName: String) =
        ABI.IGameListStatics_Instance.FindAllAsync(packageFamilyName)

    public fun add_GameAdded(handler: GameListChangedEventHandler) =
        ABI.IGameListStatics_Instance.add_GameAdded(handler)

    public fun remove_GameAdded(token: EventRegistrationToken) =
        ABI.IGameListStatics_Instance.remove_GameAdded(token)

    public fun add_GameRemoved(handler: GameListRemovedEventHandler) =
        ABI.IGameListStatics_Instance.add_GameRemoved(handler)

    public fun remove_GameRemoved(token: EventRegistrationToken) =
        ABI.IGameListStatics_Instance.remove_GameRemoved(token)

    public fun add_GameUpdated(handler: GameListChangedEventHandler) =
        ABI.IGameListStatics_Instance.add_GameUpdated(handler)

    public fun remove_GameUpdated(token: EventRegistrationToken) =
        ABI.IGameListStatics_Instance.remove_GameUpdated(token)

    public fun MergeEntriesAsync(left: GameListEntry, right: GameListEntry) =
        ABI.IGameListStatics2_Instance.MergeEntriesAsync(left, right)

    public fun UnmergeEntryAsync(mergedEntry: GameListEntry) =
        ABI.IGameListStatics2_Instance.UnmergeEntryAsync(mergedEntry)
  }
}
