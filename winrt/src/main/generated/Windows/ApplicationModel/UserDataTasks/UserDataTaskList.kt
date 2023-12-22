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

@ABIMarker(UserDataTaskList.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserDataTasks.UserDataTaskList;{49412e39-7c1d-4df1-bed3-314b7cbf5e4e})")
@WinRTByReference(brClass = UserDataTaskList.ByReference::class)
public class UserDataTaskList(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataTaskList.WithDefault, IWinRTObject {
  private val __1277633874_Interface: IUserDataTaskList.WithDefault by lazy {
    as_1277633874()
  }


  public override val __1277633874_Ptr: JNAPointer? by lazy {
    __1277633874_Interface.__1277633874_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1277633874_Interface)

  private fun as_1277633874(): IUserDataTaskList.WithDefault {
    if(pointer == NULL) {
      return(IUserDataTaskList.ABI.makeIUserDataTaskList(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataTaskList>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataTaskList.ABI.makeIUserDataTaskList(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDataTaskList> {
    public override fun getValue() = UserDataTaskList(pointer.getPointer(0))

    public fun setValue(value: UserDataTaskList): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataTaskList, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UserDataTaskList {
      val address = segment.toRawLongValue()
      return UserDataTaskList(Pointer(address))
    }

    public override fun toNative(obj: UserDataTaskList): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
