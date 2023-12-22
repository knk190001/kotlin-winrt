package Windows.Security.Authentication.OnlineId

import Windows.Foundation.IAsyncInfo
import Windows.Foundation.IAsyncOperation
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
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(UserAuthenticationOperation.ABI::class)
@Signature("rc(Windows.Security.Authentication.OnlineId.UserAuthenticationOperation;pinterface({9fc2b0bb-e446-44e2-aa61-9cab8f636af2};rc(Windows.Security.Authentication.OnlineId.UserIdentity;{2146d9cd-0742-4be3-8a1c-7c7ae679aa88})))")
@WinRTByReference(brClass = UserAuthenticationOperation.ByReference::class)
public class UserAuthenticationOperation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAsyncOperation<UserIdentity?>, IAsyncInfo.WithDefault, IWinRTObject {
  private val __1681603062_Interface: IAsyncOperation<UserIdentity?> by lazy {
    as_1681603062()
  }


  private val __1646648641_Interface: IAsyncInfo.WithDefault by lazy {
    as_1646648641()
  }


  public override val __1681603062_Type: KType = typeOf<IAsyncOperation<UserIdentity?>>()

  public override val __1681603062_Ptr: JNAPointer? by lazy {
    __1681603062_Interface.__1681603062_Ptr
  }


  public override val __1646648641_Ptr: JNAPointer? by lazy {
    __1646648641_Interface.__1646648641_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1681603062_Interface, __1646648641_Interface)

  private fun as_1681603062(): IAsyncOperation<UserIdentity?> {
    if(pointer == NULL) {
      return(IAsyncOperation.ABI.makeIAsyncOperation<UserIdentity?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAsyncOperation<UserIdentity?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAsyncOperation.ABI.makeIAsyncOperation<UserIdentity?>(ref.value))
  }

  private fun as_1646648641(): IAsyncInfo.WithDefault {
    if(pointer == NULL) {
      return(IAsyncInfo.ABI.makeIAsyncInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAsyncInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAsyncInfo.ABI.makeIAsyncInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserAuthenticationOperation> {
    public override fun getValue() = UserAuthenticationOperation(pointer.getPointer(0))

    public fun setValue(value: UserAuthenticationOperation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserAuthenticationOperation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UserAuthenticationOperation {
      val address = segment.toRawLongValue()
      return UserAuthenticationOperation(Pointer(address))
    }

    public override fun toNative(obj: UserAuthenticationOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
