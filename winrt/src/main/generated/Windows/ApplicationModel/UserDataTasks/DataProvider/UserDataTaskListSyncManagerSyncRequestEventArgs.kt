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

@ABIMarker(UserDataTaskListSyncManagerSyncRequestEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserDataTasks.DataProvider.UserDataTaskListSyncManagerSyncRequestEventArgs;{8ead1c12-768e-43bd-8385-5cdc351ffdea})")
@WinRTByReference(brClass = UserDataTaskListSyncManagerSyncRequestEventArgs.ByReference::class)
public class UserDataTaskListSyncManagerSyncRequestEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataTaskListSyncManagerSyncRequestEventArgs.WithDefault, IWinRTObject {
  private val __106516238_Interface: IUserDataTaskListSyncManagerSyncRequestEventArgs.WithDefault by
      lazy {
    as_106516238()
  }


  public override val __106516238_Ptr: JNAPointer? by lazy {
    __106516238_Interface.__106516238_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__106516238_Interface)

  private fun as_106516238(): IUserDataTaskListSyncManagerSyncRequestEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IUserDataTaskListSyncManagerSyncRequestEventArgs.ABI.makeIUserDataTaskListSyncManagerSyncRequestEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataTaskListSyncManagerSyncRequestEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataTaskListSyncManagerSyncRequestEventArgs.ABI.makeIUserDataTaskListSyncManagerSyncRequestEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDataTaskListSyncManagerSyncRequestEventArgs> {
    public override fun getValue() =
        UserDataTaskListSyncManagerSyncRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: UserDataTaskListSyncManagerSyncRequestEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataTaskListSyncManagerSyncRequestEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        UserDataTaskListSyncManagerSyncRequestEventArgs {
      val address = segment.toRawLongValue()
      return UserDataTaskListSyncManagerSyncRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: UserDataTaskListSyncManagerSyncRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
