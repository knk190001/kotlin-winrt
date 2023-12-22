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

@ABIMarker(UserDataTaskListCreateOrUpdateTaskRequest.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserDataTasks.DataProvider.UserDataTaskListCreateOrUpdateTaskRequest;{2133772c-55c2-4300-8279-04326e07cce4})")
@WinRTByReference(brClass = UserDataTaskListCreateOrUpdateTaskRequest.ByReference::class)
public class UserDataTaskListCreateOrUpdateTaskRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataTaskListCreateOrUpdateTaskRequest.WithDefault, IWinRTObject {
  private val __1378796315_Interface: IUserDataTaskListCreateOrUpdateTaskRequest.WithDefault by
      lazy {
    as_1378796315()
  }


  public override val __1378796315_Ptr: JNAPointer? by lazy {
    __1378796315_Interface.__1378796315_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1378796315_Interface)

  private fun as_1378796315(): IUserDataTaskListCreateOrUpdateTaskRequest.WithDefault {
    if(pointer == NULL) {
      return(IUserDataTaskListCreateOrUpdateTaskRequest.ABI.makeIUserDataTaskListCreateOrUpdateTaskRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataTaskListCreateOrUpdateTaskRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataTaskListCreateOrUpdateTaskRequest.ABI.makeIUserDataTaskListCreateOrUpdateTaskRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDataTaskListCreateOrUpdateTaskRequest> {
    public override fun getValue() =
        UserDataTaskListCreateOrUpdateTaskRequest(pointer.getPointer(0))

    public fun setValue(value: UserDataTaskListCreateOrUpdateTaskRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataTaskListCreateOrUpdateTaskRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        UserDataTaskListCreateOrUpdateTaskRequest {
      val address = segment.toRawLongValue()
      return UserDataTaskListCreateOrUpdateTaskRequest(Pointer(address))
    }

    public override fun toNative(obj: UserDataTaskListCreateOrUpdateTaskRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
