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

@ABIMarker(UserDataAccountManagerForUser.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserDataAccounts.UserDataAccountManagerForUser;{56a6e8db-db8f-41ab-a65f-8c5971aac982})")
@WinRTByReference(brClass = UserDataAccountManagerForUser.ByReference::class)
public class UserDataAccountManagerForUser(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataAccountManagerForUser.WithDefault, IWinRTObject {
  private val __1112863643_Interface: IUserDataAccountManagerForUser.WithDefault by lazy {
    as_1112863643()
  }


  public override val __1112863643_Ptr: JNAPointer? by lazy {
    __1112863643_Interface.__1112863643_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1112863643_Interface)

  private fun as_1112863643(): IUserDataAccountManagerForUser.WithDefault {
    if(pointer == NULL) {
      return(IUserDataAccountManagerForUser.ABI.makeIUserDataAccountManagerForUser(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataAccountManagerForUser>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataAccountManagerForUser.ABI.makeIUserDataAccountManagerForUser(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDataAccountManagerForUser> {
    public override fun getValue() = UserDataAccountManagerForUser(pointer.getPointer(0))

    public fun setValue(value: UserDataAccountManagerForUser): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataAccountManagerForUser, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UserDataAccountManagerForUser {
      val address = segment.toRawLongValue()
      return UserDataAccountManagerForUser(Pointer(address))
    }

    public override fun toNative(obj: UserDataAccountManagerForUser): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
