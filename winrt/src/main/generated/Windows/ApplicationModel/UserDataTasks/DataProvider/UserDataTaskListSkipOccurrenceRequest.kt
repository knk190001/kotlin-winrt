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

@ABIMarker(UserDataTaskListSkipOccurrenceRequest.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserDataTasks.DataProvider.UserDataTaskListSkipOccurrenceRequest;{ab87e34d-1cd3-431c-9f58-089aa4338d85})")
@WinRTByReference(brClass = UserDataTaskListSkipOccurrenceRequest.ByReference::class)
public class UserDataTaskListSkipOccurrenceRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataTaskListSkipOccurrenceRequest.WithDefault, IWinRTObject {
  private val __1421571288_Interface: IUserDataTaskListSkipOccurrenceRequest.WithDefault by lazy {
    as_1421571288()
  }


  public override val __1421571288_Ptr: JNAPointer? by lazy {
    __1421571288_Interface.__1421571288_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1421571288_Interface)

  private fun as_1421571288(): IUserDataTaskListSkipOccurrenceRequest.WithDefault {
    if(pointer == NULL) {
      return(IUserDataTaskListSkipOccurrenceRequest.ABI.makeIUserDataTaskListSkipOccurrenceRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataTaskListSkipOccurrenceRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataTaskListSkipOccurrenceRequest.ABI.makeIUserDataTaskListSkipOccurrenceRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDataTaskListSkipOccurrenceRequest> {
    public override fun getValue() = UserDataTaskListSkipOccurrenceRequest(pointer.getPointer(0))

    public fun setValue(value: UserDataTaskListSkipOccurrenceRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataTaskListSkipOccurrenceRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UserDataTaskListSkipOccurrenceRequest {
      val address = segment.toRawLongValue()
      return UserDataTaskListSkipOccurrenceRequest(Pointer(address))
    }

    public override fun toNative(obj: UserDataTaskListSkipOccurrenceRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
