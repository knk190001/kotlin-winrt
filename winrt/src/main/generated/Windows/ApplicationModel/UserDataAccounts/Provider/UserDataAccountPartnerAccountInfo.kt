package Windows.ApplicationModel.UserDataAccounts.Provider

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

@ABIMarker(UserDataAccountPartnerAccountInfo.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserDataAccounts.Provider.UserDataAccountPartnerAccountInfo;{5f200037-f6ef-4ec3-8630-012c59c1149f})")
@WinRTByReference(brClass = UserDataAccountPartnerAccountInfo.ByReference::class)
public class UserDataAccountPartnerAccountInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataAccountPartnerAccountInfo.WithDefault, IWinRTObject {
  private val __176958780_Interface: IUserDataAccountPartnerAccountInfo.WithDefault by lazy {
    as_176958780()
  }


  public override val __176958780_Ptr: JNAPointer? by lazy {
    __176958780_Interface.__176958780_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__176958780_Interface)

  private fun as_176958780(): IUserDataAccountPartnerAccountInfo.WithDefault {
    if(pointer == NULL) {
      return(IUserDataAccountPartnerAccountInfo.ABI.makeIUserDataAccountPartnerAccountInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataAccountPartnerAccountInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataAccountPartnerAccountInfo.ABI.makeIUserDataAccountPartnerAccountInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDataAccountPartnerAccountInfo> {
    public override fun getValue() = UserDataAccountPartnerAccountInfo(pointer.getPointer(0))

    public fun setValue(value: UserDataAccountPartnerAccountInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataAccountPartnerAccountInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UserDataAccountPartnerAccountInfo {
      val address = segment.toRawLongValue()
      return UserDataAccountPartnerAccountInfo(Pointer(address))
    }

    public override fun toNative(obj: UserDataAccountPartnerAccountInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
