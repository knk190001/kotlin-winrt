package Windows.UI.ApplicationSettings

import Windows.System.User
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AccountsSettingsPane.ABI::class)
@Signature("rc(Windows.UI.ApplicationSettings.AccountsSettingsPane;{81ea942c-4f09-4406-a538-838d9b14b7e6})")
@WinRTByReference(brClass = AccountsSettingsPane.ByReference::class)
public class AccountsSettingsPane(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAccountsSettingsPane.WithDefault, IWinRTObject {
  private val __1512257898_Interface: IAccountsSettingsPane.WithDefault by lazy {
    as_1512257898()
  }


  public override val __1512257898_Ptr: JNAPointer? by lazy {
    __1512257898_Interface.__1512257898_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1512257898_Interface)

  private fun as_1512257898(): IAccountsSettingsPane.WithDefault {
    if(pointer == NULL) {
      return(IAccountsSettingsPane.ABI.makeIAccountsSettingsPane(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAccountsSettingsPane>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAccountsSettingsPane.ABI.makeIAccountsSettingsPane(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AccountsSettingsPane> {
    public override fun getValue() = AccountsSettingsPane(pointer.getPointer(0))

    public fun setValue(value: AccountsSettingsPane): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AccountsSettingsPane, MemoryAddress> {
    public val IAccountsSettingsPaneStatics2_Instance: IAccountsSettingsPaneStatics2 by lazy {
      createIAccountsSettingsPaneStatics2()
    }


    public val IAccountsSettingsPaneStatics_Instance: IAccountsSettingsPaneStatics by lazy {
      createIAccountsSettingsPaneStatics()
    }


    public val IAccountsSettingsPaneStatics3_Instance: IAccountsSettingsPaneStatics3 by lazy {
      createIAccountsSettingsPaneStatics3()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAccountsSettingsPaneStatics2(): IAccountsSettingsPaneStatics2 {
      val refiid = Guid.REFIID(IAccountsSettingsPaneStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ApplicationSettings.AccountsSettingsPane".toHandle(),refiid,interfacePtr)
      val result =
          IAccountsSettingsPaneStatics2.ABI.makeIAccountsSettingsPaneStatics2(interfacePtr.value)
      return result
    }

    public fun createIAccountsSettingsPaneStatics(): IAccountsSettingsPaneStatics {
      val refiid = Guid.REFIID(IAccountsSettingsPaneStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ApplicationSettings.AccountsSettingsPane".toHandle(),refiid,interfacePtr)
      val result =
          IAccountsSettingsPaneStatics.ABI.makeIAccountsSettingsPaneStatics(interfacePtr.value)
      return result
    }

    public fun createIAccountsSettingsPaneStatics3(): IAccountsSettingsPaneStatics3 {
      val refiid = Guid.REFIID(IAccountsSettingsPaneStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ApplicationSettings.AccountsSettingsPane".toHandle(),refiid,interfacePtr)
      val result =
          IAccountsSettingsPaneStatics3.ABI.makeIAccountsSettingsPaneStatics3(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AccountsSettingsPane {
      val address = segment.toRawLongValue()
      return AccountsSettingsPane(Pointer(address))
    }

    public override fun toNative(obj: AccountsSettingsPane): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun ShowManageAccountsAsync() =
        ABI.IAccountsSettingsPaneStatics2_Instance.ShowManageAccountsAsync()

    public fun ShowAddAccountAsync() =
        ABI.IAccountsSettingsPaneStatics2_Instance.ShowAddAccountAsync()

    public fun GetForCurrentView() = ABI.IAccountsSettingsPaneStatics_Instance.GetForCurrentView()

    public fun Show() = ABI.IAccountsSettingsPaneStatics_Instance.Show()

    public fun ShowManageAccountsForUserAsync(user: User) =
        ABI.IAccountsSettingsPaneStatics3_Instance.ShowManageAccountsForUserAsync(user)

    public fun ShowAddAccountForUserAsync(user: User) =
        ABI.IAccountsSettingsPaneStatics3_Instance.ShowAddAccountForUserAsync(user)
  }
}
