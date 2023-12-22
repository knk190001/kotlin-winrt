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

@ABIMarker(AccountsSettingsPaneEventDeferral.ABI::class)
@Signature("rc(Windows.UI.ApplicationSettings.AccountsSettingsPaneEventDeferral;{cbf25d3f-e5ba-40ef-93da-65e096e5fb04})")
@WinRTByReference(brClass = AccountsSettingsPaneEventDeferral.ByReference::class)
public class AccountsSettingsPaneEventDeferral(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAccountsSettingsPaneEventDeferral.WithDefault, IWinRTObject {
  private val __2046824145_Interface: IAccountsSettingsPaneEventDeferral.WithDefault by lazy {
    as_2046824145()
  }


  public override val __2046824145_Ptr: JNAPointer? by lazy {
    __2046824145_Interface.__2046824145_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2046824145_Interface)

  private fun as_2046824145(): IAccountsSettingsPaneEventDeferral.WithDefault {
    if(pointer == NULL) {
      return(IAccountsSettingsPaneEventDeferral.ABI.makeIAccountsSettingsPaneEventDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAccountsSettingsPaneEventDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAccountsSettingsPaneEventDeferral.ABI.makeIAccountsSettingsPaneEventDeferral(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AccountsSettingsPaneEventDeferral> {
    public override fun getValue() = AccountsSettingsPaneEventDeferral(pointer.getPointer(0))

    public fun setValue(value: AccountsSettingsPaneEventDeferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AccountsSettingsPaneEventDeferral, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AccountsSettingsPaneEventDeferral {
      val address = segment.toRawLongValue()
      return AccountsSettingsPaneEventDeferral(Pointer(address))
    }

    public override fun toNative(obj: AccountsSettingsPaneEventDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
