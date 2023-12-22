package Windows.Storage

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

@ABIMarker(UserDataPaths.ABI::class)
@Signature("rc(Windows.Storage.UserDataPaths;{f9c53912-abc4-46ff-8a2b-dc9d7fa6e52f})")
@WinRTByReference(brClass = UserDataPaths.ByReference::class)
public class UserDataPaths(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataPaths.WithDefault, IWinRTObject {
  private val __1671292960_Interface: IUserDataPaths.WithDefault by lazy {
    as_1671292960()
  }


  public override val __1671292960_Ptr: JNAPointer? by lazy {
    __1671292960_Interface.__1671292960_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1671292960_Interface)

  private fun as_1671292960(): IUserDataPaths.WithDefault {
    if(pointer == NULL) {
      return(IUserDataPaths.ABI.makeIUserDataPaths(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataPaths>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataPaths.ABI.makeIUserDataPaths(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<UserDataPaths>
      {
    public override fun getValue() = UserDataPaths(pointer.getPointer(0))

    public fun setValue(value: UserDataPaths): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataPaths, MemoryAddress> {
    public val IUserDataPathsStatics_Instance: IUserDataPathsStatics by lazy {
      createIUserDataPathsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIUserDataPathsStatics(): IUserDataPathsStatics {
      val refiid = Guid.REFIID(IUserDataPathsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.UserDataPaths".toHandle(),refiid,interfacePtr)
      val result = IUserDataPathsStatics.ABI.makeIUserDataPathsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): UserDataPaths {
      val address = segment.toRawLongValue()
      return UserDataPaths(Pointer(address))
    }

    public override fun toNative(obj: UserDataPaths): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForUser(user: User) = ABI.IUserDataPathsStatics_Instance.GetForUser(user)

    public fun GetDefault() = ABI.IUserDataPathsStatics_Instance.GetDefault()
  }
}
