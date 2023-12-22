package Windows.ApplicationModel.UserDataAccounts

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

@ABIMarker(UserDataAccount.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserDataAccounts.UserDataAccount;{b9c4367e-b348-4910-be94-4ad4bba6dea7})")
@WinRTByReference(brClass = UserDataAccount.ByReference::class)
public class UserDataAccount(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataAccount.WithDefault, IUserDataAccount2.WithDefault,
    IUserDataAccount3.WithDefault, IUserDataAccount4.WithDefault, IWinRTObject {
  private val __560621900_Interface: IUserDataAccount.WithDefault by lazy {
    as_560621900()
  }


  private val __199409666_Interface: IUserDataAccount2.WithDefault by lazy {
    as_199409666()
  }


  private val __199409665_Interface: IUserDataAccount3.WithDefault by lazy {
    as_199409665()
  }


  private val __199409664_Interface: IUserDataAccount4.WithDefault by lazy {
    as_199409664()
  }


  public override val __560621900_Ptr: JNAPointer? by lazy {
    __560621900_Interface.__560621900_Ptr
  }


  public override val __199409666_Ptr: JNAPointer? by lazy {
    __199409666_Interface.__199409666_Ptr
  }


  public override val __199409665_Ptr: JNAPointer? by lazy {
    __199409665_Interface.__199409665_Ptr
  }


  public override val __199409664_Ptr: JNAPointer? by lazy {
    __199409664_Interface.__199409664_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__560621900_Interface, __199409666_Interface, __199409665_Interface,
        __199409664_Interface)

  private fun as_560621900(): IUserDataAccount.WithDefault {
    if(pointer == NULL) {
      return(IUserDataAccount.ABI.makeIUserDataAccount(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataAccount>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataAccount.ABI.makeIUserDataAccount(ref.value))
  }

  private fun as_199409666(): IUserDataAccount2.WithDefault {
    if(pointer == NULL) {
      return(IUserDataAccount2.ABI.makeIUserDataAccount2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataAccount2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataAccount2.ABI.makeIUserDataAccount2(ref.value))
  }

  private fun as_199409665(): IUserDataAccount3.WithDefault {
    if(pointer == NULL) {
      return(IUserDataAccount3.ABI.makeIUserDataAccount3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataAccount3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataAccount3.ABI.makeIUserDataAccount3(ref.value))
  }

  private fun as_199409664(): IUserDataAccount4.WithDefault {
    if(pointer == NULL) {
      return(IUserDataAccount4.ABI.makeIUserDataAccount4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataAccount4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataAccount4.ABI.makeIUserDataAccount4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDataAccount> {
    public override fun getValue() = UserDataAccount(pointer.getPointer(0))

    public fun setValue(value: UserDataAccount): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataAccount, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UserDataAccount {
      val address = segment.toRawLongValue()
      return UserDataAccount(Pointer(address))
    }

    public override fun toNative(obj: UserDataAccount): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
