package Windows.ApplicationModel.UserActivities

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

@ABIMarker(UserActivitySessionHistoryItem.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserActivities.UserActivitySessionHistoryItem;{e8d59bd3-3e5d-49fd-98d7-6da97521e255})")
@WinRTByReference(brClass = UserActivitySessionHistoryItem.ByReference::class)
public class UserActivitySessionHistoryItem(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserActivitySessionHistoryItem.WithDefault, IWinRTObject {
  private val __235568142_Interface: IUserActivitySessionHistoryItem.WithDefault by lazy {
    as_235568142()
  }


  public override val __235568142_Ptr: JNAPointer? by lazy {
    __235568142_Interface.__235568142_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__235568142_Interface)

  private fun as_235568142(): IUserActivitySessionHistoryItem.WithDefault {
    if(pointer == NULL) {
      return(IUserActivitySessionHistoryItem.ABI.makeIUserActivitySessionHistoryItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserActivitySessionHistoryItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserActivitySessionHistoryItem.ABI.makeIUserActivitySessionHistoryItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserActivitySessionHistoryItem> {
    public override fun getValue() = UserActivitySessionHistoryItem(pointer.getPointer(0))

    public fun setValue(value: UserActivitySessionHistoryItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserActivitySessionHistoryItem, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UserActivitySessionHistoryItem {
      val address = segment.toRawLongValue()
      return UserActivitySessionHistoryItem(Pointer(address))
    }

    public override fun toNative(obj: UserActivitySessionHistoryItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
