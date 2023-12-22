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

@ABIMarker(UserDataTaskListLimitedWriteOperations.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserDataTasks.UserDataTaskListLimitedWriteOperations;{7aa267f2-6078-4183-919e-4f29f19cfae9})")
@WinRTByReference(brClass = UserDataTaskListLimitedWriteOperations.ByReference::class)
public class UserDataTaskListLimitedWriteOperations(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataTaskListLimitedWriteOperations.WithDefault, IWinRTObject {
  private val __1327653923_Interface: IUserDataTaskListLimitedWriteOperations.WithDefault by lazy {
    as_1327653923()
  }


  public override val __1327653923_Ptr: JNAPointer? by lazy {
    __1327653923_Interface.__1327653923_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1327653923_Interface)

  private fun as_1327653923(): IUserDataTaskListLimitedWriteOperations.WithDefault {
    if(pointer == NULL) {
      return(IUserDataTaskListLimitedWriteOperations.ABI.makeIUserDataTaskListLimitedWriteOperations(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataTaskListLimitedWriteOperations>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataTaskListLimitedWriteOperations.ABI.makeIUserDataTaskListLimitedWriteOperations(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDataTaskListLimitedWriteOperations> {
    public override fun getValue() = UserDataTaskListLimitedWriteOperations(pointer.getPointer(0))

    public fun setValue(value: UserDataTaskListLimitedWriteOperations): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataTaskListLimitedWriteOperations, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UserDataTaskListLimitedWriteOperations {
      val address = segment.toRawLongValue()
      return UserDataTaskListLimitedWriteOperations(Pointer(address))
    }

    public override fun toNative(obj: UserDataTaskListLimitedWriteOperations): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
