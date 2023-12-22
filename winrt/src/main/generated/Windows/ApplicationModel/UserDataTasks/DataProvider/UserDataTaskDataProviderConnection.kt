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

@ABIMarker(UserDataTaskDataProviderConnection.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserDataTasks.DataProvider.UserDataTaskDataProviderConnection;{9ff39d1d-a447-428b-afe9-e5402bdeb041})")
@WinRTByReference(brClass = UserDataTaskDataProviderConnection.ByReference::class)
public class UserDataTaskDataProviderConnection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataTaskDataProviderConnection.WithDefault, IWinRTObject {
  private val __1749520706_Interface: IUserDataTaskDataProviderConnection.WithDefault by lazy {
    as_1749520706()
  }


  public override val __1749520706_Ptr: JNAPointer? by lazy {
    __1749520706_Interface.__1749520706_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1749520706_Interface)

  private fun as_1749520706(): IUserDataTaskDataProviderConnection.WithDefault {
    if(pointer == NULL) {
      return(IUserDataTaskDataProviderConnection.ABI.makeIUserDataTaskDataProviderConnection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataTaskDataProviderConnection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataTaskDataProviderConnection.ABI.makeIUserDataTaskDataProviderConnection(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDataTaskDataProviderConnection> {
    public override fun getValue() = UserDataTaskDataProviderConnection(pointer.getPointer(0))

    public fun setValue(value: UserDataTaskDataProviderConnection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataTaskDataProviderConnection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UserDataTaskDataProviderConnection {
      val address = segment.toRawLongValue()
      return UserDataTaskDataProviderConnection(Pointer(address))
    }

    public override fun toNative(obj: UserDataTaskDataProviderConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
