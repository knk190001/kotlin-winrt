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

@ABIMarker(UserDataAccountProviderAddAccountOperation.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserDataAccounts.Provider.UserDataAccountProviderAddAccountOperation;{b9c72530-3f84-4b5d-8eaa-45e97aa842ed})")
@WinRTByReference(brClass = UserDataAccountProviderAddAccountOperation.ByReference::class)
public class UserDataAccountProviderAddAccountOperation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataAccountProviderAddAccountOperation.WithDefault,
    IUserDataAccountProviderOperation.WithDefault, IWinRTObject {
  private val __1276043711_Interface: IUserDataAccountProviderAddAccountOperation.WithDefault by
      lazy {
    as_1276043711()
  }


  private val __2091816275_Interface: IUserDataAccountProviderOperation.WithDefault by lazy {
    as_2091816275()
  }


  public override val __1276043711_Ptr: JNAPointer? by lazy {
    __1276043711_Interface.__1276043711_Ptr
  }


  public override val __2091816275_Ptr: JNAPointer? by lazy {
    __2091816275_Interface.__2091816275_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1276043711_Interface, __2091816275_Interface)

  private fun as_1276043711(): IUserDataAccountProviderAddAccountOperation.WithDefault {
    if(pointer == NULL) {
      return(IUserDataAccountProviderAddAccountOperation.ABI.makeIUserDataAccountProviderAddAccountOperation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataAccountProviderAddAccountOperation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataAccountProviderAddAccountOperation.ABI.makeIUserDataAccountProviderAddAccountOperation(ref.value))
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
      IByReference<UserDataAccountProviderAddAccountOperation> {
    public override fun getValue() =
        UserDataAccountProviderAddAccountOperation(pointer.getPointer(0))

    public fun setValue(value: UserDataAccountProviderAddAccountOperation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataAccountProviderAddAccountOperation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        UserDataAccountProviderAddAccountOperation {
      val address = segment.toRawLongValue()
      return UserDataAccountProviderAddAccountOperation(Pointer(address))
    }

    public override fun toNative(obj: UserDataAccountProviderAddAccountOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
