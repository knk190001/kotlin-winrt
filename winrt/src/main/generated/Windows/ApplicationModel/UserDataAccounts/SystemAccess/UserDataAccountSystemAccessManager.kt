package Windows.ApplicationModel.UserDataAccounts.SystemAccess

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(UserDataAccountSystemAccessManager.ABI::class)
@WinRTByReference(brClass = UserDataAccountSystemAccessManager.ByReference::class)
public class UserDataAccountSystemAccessManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDataAccountSystemAccessManager> {
    public override fun getValue() = UserDataAccountSystemAccessManager(pointer.getPointer(0))

    public fun setValue(value: UserDataAccountSystemAccessManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataAccountSystemAccessManager, MemoryAddress> {
    public val IUserDataAccountSystemAccessManagerStatics2_Instance:
        IUserDataAccountSystemAccessManagerStatics2 by lazy {
      createIUserDataAccountSystemAccessManagerStatics2()
    }


    public val IUserDataAccountSystemAccessManagerStatics_Instance:
        IUserDataAccountSystemAccessManagerStatics by lazy {
      createIUserDataAccountSystemAccessManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIUserDataAccountSystemAccessManagerStatics2():
        IUserDataAccountSystemAccessManagerStatics2 {
      val refiid = Guid.REFIID(IUserDataAccountSystemAccessManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.UserDataAccounts.SystemAccess.UserDataAccountSystemAccessManager".toHandle(),refiid,interfacePtr)
      val result =
          IUserDataAccountSystemAccessManagerStatics2.ABI.makeIUserDataAccountSystemAccessManagerStatics2(interfacePtr.value)
      return result
    }

    public fun createIUserDataAccountSystemAccessManagerStatics():
        IUserDataAccountSystemAccessManagerStatics {
      val refiid = Guid.REFIID(IUserDataAccountSystemAccessManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.UserDataAccounts.SystemAccess.UserDataAccountSystemAccessManager".toHandle(),refiid,interfacePtr)
      val result =
          IUserDataAccountSystemAccessManagerStatics.ABI.makeIUserDataAccountSystemAccessManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): UserDataAccountSystemAccessManager {
      val address = segment.toRawLongValue()
      return UserDataAccountSystemAccessManager(Pointer(address))
    }

    public override fun toNative(obj: UserDataAccountSystemAccessManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun SuppressLocalAccountWithAccountAsync(userDataAccountId: String) =
        ABI.IUserDataAccountSystemAccessManagerStatics2_Instance.SuppressLocalAccountWithAccountAsync(userDataAccountId)

    public fun CreateDeviceAccountAsync(account: DeviceAccountConfiguration) =
        ABI.IUserDataAccountSystemAccessManagerStatics2_Instance.CreateDeviceAccountAsync(account)

    public fun DeleteDeviceAccountAsync(accountId: String) =
        ABI.IUserDataAccountSystemAccessManagerStatics2_Instance.DeleteDeviceAccountAsync(accountId)

    public fun GetDeviceAccountConfigurationAsync(accountId: String) =
        ABI.IUserDataAccountSystemAccessManagerStatics2_Instance.GetDeviceAccountConfigurationAsync(accountId)

    public fun AddAndShowDeviceAccountsAsync(accounts: IIterable<DeviceAccountConfiguration?>) =
        ABI.IUserDataAccountSystemAccessManagerStatics_Instance.AddAndShowDeviceAccountsAsync(accounts)
  }
}
