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

@ABIMarker(UserDataAccountProviderSettingsOperation.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserDataAccounts.Provider.UserDataAccountProviderSettingsOperation;{92034db7-8648-4f30-acfa-3002658ca80d})")
@WinRTByReference(brClass = UserDataAccountProviderSettingsOperation.ByReference::class)
public class UserDataAccountProviderSettingsOperation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataAccountProviderSettingsOperation.WithDefault,
    IUserDataAccountProviderOperation.WithDefault, IWinRTObject {
  private val __705683510_Interface: IUserDataAccountProviderSettingsOperation.WithDefault by lazy {
    as_705683510()
  }


  private val __2091816275_Interface: IUserDataAccountProviderOperation.WithDefault by lazy {
    as_2091816275()
  }


  public override val __705683510_Ptr: JNAPointer? by lazy {
    __705683510_Interface.__705683510_Ptr
  }


  public override val __2091816275_Ptr: JNAPointer? by lazy {
    __2091816275_Interface.__2091816275_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__705683510_Interface, __2091816275_Interface)

  private fun as_705683510(): IUserDataAccountProviderSettingsOperation.WithDefault {
    if(pointer == NULL) {
      return(IUserDataAccountProviderSettingsOperation.ABI.makeIUserDataAccountProviderSettingsOperation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataAccountProviderSettingsOperation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataAccountProviderSettingsOperation.ABI.makeIUserDataAccountProviderSettingsOperation(ref.value))
  }

  private fun as_2091816275(): IUserDataAccountProviderOperation.WithDefault {
    if(pointer == NULL) {
      return(IUserDataAccountProviderOperation.ABI.makeIUserDataAccountProviderOperation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataAccountProviderOperation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataAccountProviderOperation.ABI.makeIUserDataAccountProviderOperation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDataAccountProviderSettingsOperation> {
    public override fun getValue() = UserDataAccountProviderSettingsOperation(pointer.getPointer(0))

    public fun setValue(value: UserDataAccountProviderSettingsOperation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataAccountProviderSettingsOperation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        UserDataAccountProviderSettingsOperation {
      val address = segment.toRawLongValue()
      return UserDataAccountProviderSettingsOperation(Pointer(address))
    }

    public override fun toNative(obj: UserDataAccountProviderSettingsOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
