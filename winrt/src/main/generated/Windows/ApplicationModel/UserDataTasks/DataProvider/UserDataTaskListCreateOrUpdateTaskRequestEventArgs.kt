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

@ABIMarker(UserDataTaskListCreateOrUpdateTaskRequestEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserDataTasks.DataProvider.UserDataTaskListCreateOrUpdateTaskRequestEventArgs;{12c55a52-e378-419b-ae38-a5e9e604476e})")
@WinRTByReference(brClass = UserDataTaskListCreateOrUpdateTaskRequestEventArgs.ByReference::class)
public class UserDataTaskListCreateOrUpdateTaskRequestEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataTaskListCreateOrUpdateTaskRequestEventArgs.WithDefault, IWinRTObject
    {
  private val __1875150268_Interface:
      IUserDataTaskListCreateOrUpdateTaskRequestEventArgs.WithDefault by lazy {
    as_1875150268()
  }


  public override val __1875150268_Ptr: JNAPointer? by lazy {
    __1875150268_Interface.__1875150268_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1875150268_Interface)

  private fun as_1875150268(): IUserDataTaskListCreateOrUpdateTaskRequestEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IUserDataTaskListCreateOrUpdateTaskRequestEventArgs.ABI.makeIUserDataTaskListCreateOrUpdateTaskRequestEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataTaskListCreateOrUpdateTaskRequestEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataTaskListCreateOrUpdateTaskRequestEventArgs.ABI.makeIUserDataTaskListCreateOrUpdateTaskRequestEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDataTaskListCreateOrUpdateTaskRequestEventArgs> {
    public override fun getValue() =
        UserDataTaskListCreateOrUpdateTaskRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: UserDataTaskListCreateOrUpdateTaskRequestEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataTaskListCreateOrUpdateTaskRequestEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        UserDataTaskListCreateOrUpdateTaskRequestEventArgs {
      val address = segment.toRawLongValue()
      return UserDataTaskListCreateOrUpdateTaskRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: UserDataTaskListCreateOrUpdateTaskRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
