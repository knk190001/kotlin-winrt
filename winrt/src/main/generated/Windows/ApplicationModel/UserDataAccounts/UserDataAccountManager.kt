package Windows.ApplicationModel.UserDataAccounts

import Windows.System.User
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(UserDataAccountManager.ABI::class)
@WinRTByReference(brClass = UserDataAccountManager.ByReference::class)
public class UserDataAccountManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDataAccountManager> {
    public override fun getValue() = UserDataAccountManager(pointer.getPointer(0))

    public fun setValue(value: UserDataAccountManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataAccountManager, MemoryAddress> {
    public val IUserDataAccountManagerStatics_Instance: IUserDataAccountManagerStatics by lazy {
      createIUserDataAccountManagerStatics()
    }


    public val IUserDataAccountManagerStatics2_Instance: IUserDataAccountManagerStatics2 by lazy {
      createIUserDataAccountManagerStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIUserDataAccountManagerStatics(): IUserDataAccountManagerStatics {
      val refiid = Guid.REFIID(IUserDataAccountManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.UserDataAccounts.UserDataAccountManager".toHandle(),refiid,interfacePtr)
      val result =
          IUserDataAccountManagerStatics.ABI.makeIUserDataAccountManagerStatics(interfacePtr.value)
      return result
    }

    public fun createIUserDataAccountManagerStatics2(): IUserDataAccountManagerStatics2 {
      val refiid = Guid.REFIID(IUserDataAccountManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.UserDataAccounts.UserDataAccountManager".toHandle(),refiid,interfacePtr)
      val result =
          IUserDataAccountManagerStatics2.ABI.makeIUserDataAccountManagerStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): UserDataAccountManager {
      val address = segment.toRawLongValue()
      return UserDataAccountManager(Pointer(address))
    }

    public override fun toNative(obj: UserDataAccountManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun RequestStoreAsync(storeAccessType: UserDataAccountStoreAccessType) =
        ABI.IUserDataAccountManagerStatics_Instance.RequestStoreAsync(storeAccessType)

    public fun ShowAddAccountAsync(contentKinds: UserDataAccountContentKinds) =
        ABI.IUserDataAccountManagerStatics_Instance.ShowAddAccountAsync(contentKinds)

    public fun ShowAccountSettingsAsync(id: String) =
        ABI.IUserDataAccountManagerStatics_Instance.ShowAccountSettingsAsync(id)

    public fun ShowAccountErrorResolverAsync(id: String) =
        ABI.IUserDataAccountManagerStatics_Instance.ShowAccountErrorResolverAsync(id)

    public fun GetForUser(user: User) =
        ABI.IUserDataAccountManagerStatics2_Instance.GetForUser(user)
  }
}
