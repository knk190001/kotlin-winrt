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

@ABIMarker(UserDataTaskListCompleteTaskRequest.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserDataTasks.DataProvider.UserDataTaskListCompleteTaskRequest;{f65e14a3-1a42-49da-8552-2873e52c55eb})")
@WinRTByReference(brClass = UserDataTaskListCompleteTaskRequest.ByReference::class)
public class UserDataTaskListCompleteTaskRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataTaskListCompleteTaskRequest.WithDefault, IWinRTObject {
  private val __1893222826_Interface: IUserDataTaskListCompleteTaskRequest.WithDefault by lazy {
    as_1893222826()
  }


  public override val __1893222826_Ptr: JNAPointer? by lazy {
    __1893222826_Interface.__1893222826_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1893222826_Interface)

  private fun as_1893222826(): IUserDataTaskListCompleteTaskRequest.WithDefault {
    if(pointer == NULL) {
      return(IUserDataTaskListCompleteTaskRequest.ABI.makeIUserDataTaskListCompleteTaskRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataTaskListCompleteTaskRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataTaskListCompleteTaskRequest.ABI.makeIUserDataTaskListCompleteTaskRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDataTaskListCompleteTaskRequest> {
    public override fun getValue() = UserDataTaskListCompleteTaskRequest(pointer.getPointer(0))

    public fun setValue(value: UserDataTaskListCompleteTaskRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataTaskListCompleteTaskRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UserDataTaskListCompleteTaskRequest {
      val address = segment.toRawLongValue()
      return UserDataTaskListCompleteTaskRequest(Pointer(address))
    }

    public override fun toNative(obj: UserDataTaskListCompleteTaskRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
