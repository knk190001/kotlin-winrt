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

@ABIMarker(UserDataTaskStore.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserDataTasks.UserDataTaskStore;{f06a9cb0-f1db-45ba-8a62-086004c0213d})")
@WinRTByReference(brClass = UserDataTaskStore.ByReference::class)
public class UserDataTaskStore(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataTaskStore.WithDefault, IWinRTObject {
  private val __958732973_Interface: IUserDataTaskStore.WithDefault by lazy {
    as_958732973()
  }


  public override val __958732973_Ptr: JNAPointer? by lazy {
    __958732973_Interface.__958732973_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__958732973_Interface)

  private fun as_958732973(): IUserDataTaskStore.WithDefault {
    if(pointer == NULL) {
      return(IUserDataTaskStore.ABI.makeIUserDataTaskStore(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataTaskStore>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataTaskStore.ABI.makeIUserDataTaskStore(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDataTaskStore> {
    public override fun getValue() = UserDataTaskStore(pointer.getPointer(0))

    public fun setValue(value: UserDataTaskStore): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataTaskStore, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UserDataTaskStore {
      val address = segment.toRawLongValue()
      return UserDataTaskStore(Pointer(address))
    }

    public override fun toNative(obj: UserDataTaskStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
