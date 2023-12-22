package Windows.ApplicationModel.UserDataTasks.DataProvider

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

@ABIMarker(UserDataTaskListSyncManagerSyncRequest.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserDataTasks.DataProvider.UserDataTaskListSyncManagerSyncRequest;{40a73807-7590-4149-ae19-b211431a9f48})")
@WinRTByReference(brClass = UserDataTaskListSyncManagerSyncRequest.ByReference::class)
public class UserDataTaskListSyncManagerSyncRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataTaskListSyncManagerSyncRequest.WithDefault, IWinRTObject {
  private val __2133011063_Interface: IUserDataTaskListSyncManagerSyncRequest.WithDefault by lazy {
    as_2133011063()
  }


  public override val __2133011063_Ptr: JNAPointer? by lazy {
    __2133011063_Interface.__2133011063_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2133011063_Interface)

  private fun as_2133011063(): IUserDataTaskListSyncManagerSyncRequest.WithDefault {
    if(pointer == NULL) {
      return(IUserDataTaskListSyncManagerSyncRequest.ABI.makeIUserDataTaskListSyncManagerSyncRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataTaskListSyncManagerSyncRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataTaskListSyncManagerSyncRequest.ABI.makeIUserDataTaskListSyncManagerSyncRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDataTaskListSyncManagerSyncRequest> {
    public override fun getValue() = UserDataTaskListSyncManagerSyncRequest(pointer.getPointer(0))

    public fun setValue(value: UserDataTaskListSyncManagerSyncRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataTaskListSyncManagerSyncRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UserDataTaskListSyncManagerSyncRequest {
      val address = segment.toRawLongValue()
      return UserDataTaskListSyncManagerSyncRequest(Pointer(address))
    }

    public override fun toNative(obj: UserDataTaskListSyncManagerSyncRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
