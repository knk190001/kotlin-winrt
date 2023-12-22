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

@ABIMarker(UserDataTaskListSkipOccurrenceRequestEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserDataTasks.DataProvider.UserDataTaskListSkipOccurrenceRequestEventArgs;{7a3b924a-cc2f-4e7b-aacd-a5b9d29cfa4e})")
@WinRTByReference(brClass = UserDataTaskListSkipOccurrenceRequestEventArgs.ByReference::class)
public class UserDataTaskListSkipOccurrenceRequestEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataTaskListSkipOccurrenceRequestEventArgs.WithDefault, IWinRTObject {
  private val __1406699361_Interface: IUserDataTaskListSkipOccurrenceRequestEventArgs.WithDefault by
      lazy {
    as_1406699361()
  }


  public override val __1406699361_Ptr: JNAPointer? by lazy {
    __1406699361_Interface.__1406699361_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1406699361_Interface)

  private fun as_1406699361(): IUserDataTaskListSkipOccurrenceRequestEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IUserDataTaskListSkipOccurrenceRequestEventArgs.ABI.makeIUserDataTaskListSkipOccurrenceRequestEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataTaskListSkipOccurrenceRequestEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataTaskListSkipOccurrenceRequestEventArgs.ABI.makeIUserDataTaskListSkipOccurrenceRequestEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDataTaskListSkipOccurrenceRequestEventArgs> {
    public override fun getValue() =
        UserDataTaskListSkipOccurrenceRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: UserDataTaskListSkipOccurrenceRequestEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataTaskListSkipOccurrenceRequestEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        UserDataTaskListSkipOccurrenceRequestEventArgs {
      val address = segment.toRawLongValue()
      return UserDataTaskListSkipOccurrenceRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: UserDataTaskListSkipOccurrenceRequestEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
