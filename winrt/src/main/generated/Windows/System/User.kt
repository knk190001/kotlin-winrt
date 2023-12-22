package Windows.System

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(User.ABI::class)
@Signature("rc(Windows.System.User;{df9a26c6-e746-4bcd-b5d4-120103c4209b})")
@WinRTByReference(brClass = User.ByReference::class)
public class User(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUser.WithDefault, IUser2.WithDefault, IWinRTObject {
  private val __866270278_Interface: IUser.WithDefault by lazy {
    as_866270278()
  }


  private val __1084574792_Interface: IUser2.WithDefault by lazy {
    as_1084574792()
  }


  public override val __866270278_Ptr: JNAPointer? by lazy {
    __866270278_Interface.__866270278_Ptr
  }


  public override val __1084574792_Ptr: JNAPointer? by lazy {
    __1084574792_Interface.__1084574792_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__866270278_Interface, __1084574792_Interface)

  private fun as_866270278(): IUser.WithDefault {
    if(pointer == NULL) {
      return(IUser.ABI.makeIUser(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUser>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUser.ABI.makeIUser(ref.value))
  }

  private fun as_1084574792(): IUser2.WithDefault {
    if(pointer == NULL) {
      return(IUser2.ABI.makeIUser2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUser2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUser2.ABI.makeIUser2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<User> {
    public override fun getValue() = User(pointer.getPointer(0))

    public fun setValue(value: User): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<User, MemoryAddress> {
    public val IUserStatics2_Instance: IUserStatics2 by lazy {
      createIUserStatics2()
    }


    public val IUserStatics_Instance: IUserStatics by lazy {
      createIUserStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIUserStatics2(): IUserStatics2 {
      val refiid = Guid.REFIID(IUserStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr = INSTANCE.RoGetActivationFactory("Windows.System.User".toHandle(),refiid,interfacePtr)
      val result = IUserStatics2.ABI.makeIUserStatics2(interfacePtr.value)
      return result
    }

    public fun createIUserStatics(): IUserStatics {
      val refiid = Guid.REFIID(IUserStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr = INSTANCE.RoGetActivationFactory("Windows.System.User".toHandle(),refiid,interfacePtr)
      val result = IUserStatics.ABI.makeIUserStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): User {
      val address = segment.toRawLongValue()
      return User(Pointer(address))
    }

    public override fun toNative(obj: User): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IUserStatics2_Instance.GetDefault()

    public fun CreateWatcher() = ABI.IUserStatics_Instance.CreateWatcher()

    public fun FindAllAsync() = ABI.IUserStatics_Instance.FindAllAsync()

    public fun FindAllAsync(type: UserType) = ABI.IUserStatics_Instance.FindAllAsync(type)

    public fun FindAllAsync(type: UserType, status: UserAuthenticationStatus) =
        ABI.IUserStatics_Instance.FindAllAsync(type, status)

    public fun GetFromId(nonRoamableId: String) = ABI.IUserStatics_Instance.GetFromId(nonRoamableId)
  }
}
