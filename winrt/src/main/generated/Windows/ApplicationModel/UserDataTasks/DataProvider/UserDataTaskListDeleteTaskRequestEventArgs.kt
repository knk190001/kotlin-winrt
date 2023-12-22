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

@ABIMarker(UserDataTaskListDeleteTaskRequestEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserDataTasks.DataProvider.UserDataTaskListDeleteTaskRequestEventArgs;{6063dad9-f562-4145-8efe-d50078c92b7f})")
@WinRTByReference(brClass = UserDataTaskListDeleteTaskRequestEventArgs.ByReference::class)
public class UserDataTaskListDeleteTaskRequestEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataTaskListDeleteTaskRequestEventArgs.WithDefault, IWinRTObject {
  private val __256762561_Interface: IUserDataTaskListDeleteTaskRequestEventArgs.WithDefault by
      lazy {
    as_256762561()
  }


  public override val __256762561_Ptr: JNAPointer? by lazy {
    __256762561_Interface.__256762561_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__256762561_Interface)

  private fun as_256762561(): IUserDataTaskListDeleteTaskRequestEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IUserDataTaskListDeleteTaskRequestEventArgs.ABI.makeIUserDataTaskListDeleteTaskRequestEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataTaskListDeleteTaskRequestEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataTaskListDeleteTaskRequestEventArgs.ABI.makeIUserDataTaskListDeleteTaskRequestEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDataTaskListDeleteTaskRequestEventArgs> {
    public override fun getValue() =
        UserDataTaskListDeleteTaskRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: UserDataTaskListDeleteTaskRequestEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataTaskListDeleteTaskRequestEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        UserDataTaskListDeleteTaskRequestEventArgs {
      val address = segment.toRawLongValue()
      return UserDataTaskListDeleteTaskRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: UserDataTaskListDeleteTaskRequestEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
