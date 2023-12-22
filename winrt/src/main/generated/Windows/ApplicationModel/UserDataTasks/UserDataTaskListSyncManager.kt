package Windows.ApplicationModel.UserDataTasks

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

@ABIMarker(UserDataTaskListSyncManager.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserDataTasks.UserDataTaskListSyncManager;{8e591a95-1dcf-469f-93ec-ba48bb553c6b})")
@WinRTByReference(brClass = UserDataTaskListSyncManager.ByReference::class)
public class UserDataTaskListSyncManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataTaskListSyncManager.WithDefault, IWinRTObject {
  private val __1130310688_Interface: IUserDataTaskListSyncManager.WithDefault by lazy {
    as_1130310688()
  }


  public override val __1130310688_Ptr: JNAPointer? by lazy {
    __1130310688_Interface.__1130310688_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1130310688_Interface)

  private fun as_1130310688(): IUserDataTaskListSyncManager.WithDefault {
    if(pointer == NULL) {
      return(IUserDataTaskListSyncManager.ABI.makeIUserDataTaskListSyncManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataTaskListSyncManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataTaskListSyncManager.ABI.makeIUserDataTaskListSyncManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDataTaskListSyncManager> {
    public override fun getValue() = UserDataTaskListSyncManager(pointer.getPointer(0))

    public fun setValue(value: UserDataTaskListSyncManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataTaskListSyncManager, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UserDataTaskListSyncManager {
      val address = segment.toRawLongValue()
      return UserDataTaskListSyncManager(Pointer(address))
    }

    public override fun toNative(obj: UserDataTaskListSyncManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
