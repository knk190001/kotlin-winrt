package Windows.ApplicationModel.UserDataTasks

import Windows.System.User
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(UserDataTaskManager.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserDataTasks.UserDataTaskManager;{8451c914-e60b-48a9-9211-7fb8a56cb84c})")
@WinRTByReference(brClass = UserDataTaskManager.ByReference::class)
public class UserDataTaskManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataTaskManager.WithDefault, IWinRTObject {
  private val __643952249_Interface: IUserDataTaskManager.WithDefault by lazy {
    as_643952249()
  }


  public override val __643952249_Ptr: JNAPointer? by lazy {
    __643952249_Interface.__643952249_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__643952249_Interface)

  private fun as_643952249(): IUserDataTaskManager.WithDefault {
    if(pointer == NULL) {
      return(IUserDataTaskManager.ABI.makeIUserDataTaskManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataTaskManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataTaskManager.ABI.makeIUserDataTaskManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDataTaskManager> {
    public override fun getValue() = UserDataTaskManager(pointer.getPointer(0))

    public fun setValue(value: UserDataTaskManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataTaskManager, MemoryAddress> {
    public val IUserDataTaskManagerStatics_Instance: IUserDataTaskManagerStatics by lazy {
      createIUserDataTaskManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIUserDataTaskManagerStatics(): IUserDataTaskManagerStatics {
      val refiid = Guid.REFIID(IUserDataTaskManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.UserDataTasks.UserDataTaskManager".toHandle(),refiid,interfacePtr)
      val result =
          IUserDataTaskManagerStatics.ABI.makeIUserDataTaskManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): UserDataTaskManager {
      val address = segment.toRawLongValue()
      return UserDataTaskManager(Pointer(address))
    }

    public override fun toNative(obj: UserDataTaskManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IUserDataTaskManagerStatics_Instance.GetDefault()

    public fun GetForUser(user: User) = ABI.IUserDataTaskManagerStatics_Instance.GetForUser(user)
  }
}
