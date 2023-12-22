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

@ABIMarker(UserDataAccountProviderResolveErrorsOperation.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserDataAccounts.Provider.UserDataAccountProviderResolveErrorsOperation;{6235dc15-bfcb-41e1-9957-9759a28846cc})")
@WinRTByReference(brClass = UserDataAccountProviderResolveErrorsOperation.ByReference::class)
public class UserDataAccountProviderResolveErrorsOperation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataAccountProviderResolveErrorsOperation.WithDefault,
    IUserDataAccountProviderOperation.WithDefault, IWinRTObject {
  private val __1274021078_Interface: IUserDataAccountProviderResolveErrorsOperation.WithDefault by
      lazy {
    as_1274021078()
  }


  private val __2091816275_Interface: IUserDataAccountProviderOperation.WithDefault by lazy {
    as_2091816275()
  }


  public override val __1274021078_Ptr: JNAPointer? by lazy {
    __1274021078_Interface.__1274021078_Ptr
  }


  public override val __2091816275_Ptr: JNAPointer? by lazy {
    __2091816275_Interface.__2091816275_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1274021078_Interface, __2091816275_Interface)

  private fun as_1274021078(): IUserDataAccountProviderResolveErrorsOperation.WithDefault {
    if(pointer == NULL) {
      return(IUserDataAccountProviderResolveErrorsOperation.ABI.makeIUserDataAccountProviderResolveErrorsOperation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataAccountProviderResolveErrorsOperation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataAccountProviderResolveErrorsOperation.ABI.makeIUserDataAccountProviderResolveErrorsOperation(ref.value))
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
      IByReference<UserDataAccountProviderResolveErrorsOperation> {
    public override fun getValue() =
        UserDataAccountProviderResolveErrorsOperation(pointer.getPointer(0))

    public fun setValue(value: UserDataAccountProviderResolveErrorsOperation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataAccountProviderResolveErrorsOperation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        UserDataAccountProviderResolveErrorsOperation {
      val address = segment.toRawLongValue()
      return UserDataAccountProviderResolveErrorsOperation(Pointer(address))
    }

    public override fun toNative(obj: UserDataAccountProviderResolveErrorsOperation): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
