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

@ABIMarker(UserDataTaskListDeleteTaskRequest.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserDataTasks.DataProvider.UserDataTaskListDeleteTaskRequest;{4b863c68-7657-4f3d-b074-d47ec8df07e7})")
@WinRTByReference(brClass = UserDataTaskListDeleteTaskRequest.ByReference::class)
public class UserDataTaskListDeleteTaskRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataTaskListDeleteTaskRequest.WithDefault, IWinRTObject {
  private val __1796793288_Interface: IUserDataTaskListDeleteTaskRequest.WithDefault by lazy {
    as_1796793288()
  }


  public override val __1796793288_Ptr: JNAPointer? by lazy {
    __1796793288_Interface.__1796793288_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1796793288_Interface)

  private fun as_1796793288(): IUserDataTaskListDeleteTaskRequest.WithDefault {
    if(pointer == NULL) {
      return(IUserDataTaskListDeleteTaskRequest.ABI.makeIUserDataTaskListDeleteTaskRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataTaskListDeleteTaskRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataTaskListDeleteTaskRequest.ABI.makeIUserDataTaskListDeleteTaskRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDataTaskListDeleteTaskRequest> {
    public override fun getValue() = UserDataTaskListDeleteTaskRequest(pointer.getPointer(0))

    public fun setValue(value: UserDataTaskListDeleteTaskRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataTaskListDeleteTaskRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UserDataTaskListDeleteTaskRequest {
      val address = segment.toRawLongValue()
      return UserDataTaskListDeleteTaskRequest(Pointer(address))
    }

    public override fun toNative(obj: UserDataTaskListDeleteTaskRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
