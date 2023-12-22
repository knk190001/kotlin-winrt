package Windows.ApplicationModel.UserDataAccounts

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUserDataAccountStore.ABI::class)
@Signature("{2073b0ad-7d0a-4e76-bf45-2368f978a59a}")
@Guid("2073b0ad7d0a4e76bf452368f978a59a")
@WinRTInterface("2073b0ad7d0a4e76bf452368f978a59a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataAccountStore.ByReference::class)
public interface IUserDataAccountStore : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FindAccountsAsync(): IAsyncOperation<IVectorView<UserDataAccount?>?>?

  @InterfaceMethod(1)
  public fun GetAccountAsync(id: String?): IAsyncOperation<UserDataAccount?>?

  @InterfaceMethod(2)
  public fun CreateAccountAsync(userDisplayName: String?): IAsyncOperation<UserDataAccount?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataAccountStore> {
    public override fun getValue() = ABI.makeIUserDataAccountStore(pointer.getPointer(0))

    public fun setValue(value: IUserDataAccountStore_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataAccountStore {
    public val __627606157_Ptr: Pointer?

    public val _627606157_VtblPtr: Pointer?
      get() = __627606157_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FindAccountsAsync(): IAsyncOperation<IVectorView<UserDataAccount?>?>? {
      val fnPtr = _627606157_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<UserDataAccount?>?>>()
      val hr = fn.invokeHR(arrayOf(__627606157_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<UserDataAccount?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetAccountAsync(id: String?): IAsyncOperation<UserDataAccount?>? {
      val fnPtr = _627606157_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<UserDataAccount?>>()
      val hr = fn.invokeHR(arrayOf(__627606157_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<UserDataAccount?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateAccountAsync(userDisplayName: String?):
        IAsyncOperation<UserDataAccount?>? {
      val fnPtr = _627606157_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<UserDataAccount?>>()
      val hr = fn.invokeHR(arrayOf(__627606157_Ptr, marshalToNative(userDisplayName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<UserDataAccount?>>(result.getValue())
      return resultValue
    }
  }

  public class IUserDataAccountStore_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __627606157_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataAccountStore, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2073b0ad7d0a4e76bf452368f978a59a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataAccountStore(ptr: Pointer?): WithDefault =
        IUserDataAccountStore_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserDataAccountStore {
      val address = segment.toRawLongValue()
      return makeIUserDataAccountStore(Pointer(address))
    }

    public override fun toNative(obj: IUserDataAccountStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__627606157_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataAccountStore): Array<IUserDataAccountStore?> =
        (elements as
        Array<IUserDataAccountStore?>).castToImpl<IUserDataAccountStore,IUserDataAccountStore_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataAccountStore?> =
        arrayOfNulls<IUserDataAccountStore_Impl>(size) as Array<IUserDataAccountStore?>
  }
}
