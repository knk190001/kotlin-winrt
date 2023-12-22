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

@ABIMarker(UserDataTaskListCompleteTaskRequestEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserDataTasks.DataProvider.UserDataTaskListCompleteTaskRequestEventArgs;{d77c393d-4cf2-48ad-87fd-963f0eaa7a95})")
@WinRTByReference(brClass = UserDataTaskListCompleteTaskRequestEventArgs.ByReference::class)
public class UserDataTaskListCompleteTaskRequestEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataTaskListCompleteTaskRequestEventArgs.WithDefault, IWinRTObject {
  private val __1518866419_Interface: IUserDataTaskListCompleteTaskRequestEventArgs.WithDefault by
      lazy {
    as_1518866419()
  }


  public override val __1518866419_Ptr: JNAPointer? by lazy {
    __1518866419_Interface.__1518866419_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1518866419_Interface)

  private fun as_1518866419(): IUserDataTaskListCompleteTaskRequestEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IUserDataTaskListCompleteTaskRequestEventArgs.ABI.makeIUserDataTaskListCompleteTaskRequestEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataTaskListCompleteTaskRequestEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataTaskListCompleteTaskRequestEventArgs.ABI.makeIUserDataTaskListCompleteTaskRequestEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDataTaskListCompleteTaskRequestEventArgs> {
    public override fun getValue() =
        UserDataTaskListCompleteTaskRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: UserDataTaskListCompleteTaskRequestEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataTaskListCompleteTaskRequestEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        UserDataTaskListCompleteTaskRequestEventArgs {
      val address = segment.toRawLongValue()
      return UserDataTaskListCompleteTaskRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: UserDataTaskListCompleteTaskRequestEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
