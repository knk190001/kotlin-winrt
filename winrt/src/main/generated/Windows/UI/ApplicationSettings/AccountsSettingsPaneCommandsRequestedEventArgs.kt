package Windows.UI.ApplicationSettings

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

@ABIMarker(AccountsSettingsPaneCommandsRequestedEventArgs.ABI::class)
@Signature("rc(Windows.UI.ApplicationSettings.AccountsSettingsPaneCommandsRequestedEventArgs;{3b68c099-db19-45d0-9abf-95d3773c9330})")
@WinRTByReference(brClass = AccountsSettingsPaneCommandsRequestedEventArgs.ByReference::class)
public class AccountsSettingsPaneCommandsRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAccountsSettingsPaneCommandsRequestedEventArgs.WithDefault,
    IAccountsSettingsPaneCommandsRequestedEventArgs2.WithDefault, IWinRTObject {
  private val __745879897_Interface: IAccountsSettingsPaneCommandsRequestedEventArgs.WithDefault by
      lazy {
    as_745879897()
  }


  private val __1647440277_Interface: IAccountsSettingsPaneCommandsRequestedEventArgs2.WithDefault
      by lazy {
    as_1647440277()
  }


  public override val __745879897_Ptr: JNAPointer? by lazy {
    __745879897_Interface.__745879897_Ptr
  }


  public override val __1647440277_Ptr: JNAPointer? by lazy {
    __1647440277_Interface.__1647440277_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__745879897_Interface, __1647440277_Interface)

  private fun as_745879897(): IAccountsSettingsPaneCommandsRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAccountsSettingsPaneCommandsRequestedEventArgs.ABI.makeIAccountsSettingsPaneCommandsRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAccountsSettingsPaneCommandsRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAccountsSettingsPaneCommandsRequestedEventArgs.ABI.makeIAccountsSettingsPaneCommandsRequestedEventArgs(ref.value))
  }

  private fun as_1647440277(): IAccountsSettingsPaneCommandsRequestedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IAccountsSettingsPaneCommandsRequestedEventArgs2.ABI.makeIAccountsSettingsPaneCommandsRequestedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAccountsSettingsPaneCommandsRequestedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAccountsSettingsPaneCommandsRequestedEventArgs2.ABI.makeIAccountsSettingsPaneCommandsRequestedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AccountsSettingsPaneCommandsRequestedEventArgs> {
    public override fun getValue() =
        AccountsSettingsPaneCommandsRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AccountsSettingsPaneCommandsRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AccountsSettingsPaneCommandsRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AccountsSettingsPaneCommandsRequestedEventArgs {
      val address = segment.toRawLongValue()
      return AccountsSettingsPaneCommandsRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AccountsSettingsPaneCommandsRequestedEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
