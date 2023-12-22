package Windows.ApplicationModel.UserDataAccounts

import Windows.Foundation.IAsyncAction
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

@ABIMarker(IUserDataAccountManagerStatics.ABI::class)
@Signature("{0d9b89ea-1928-4a20-86d5-3c737f7dc3b0}")
@Guid("0d9b89ea19284a2086d53c737f7dc3b0")
@WinRTInterface("0d9b89ea19284a2086d53c737f7dc3b0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataAccountManagerStatics.ByReference::class)
public interface IUserDataAccountManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestStoreAsync(storeAccessType: UserDataAccountStoreAccessType?):
      IAsyncOperation<UserDataAccountStore?>?

  @InterfaceMethod(1)
  public fun ShowAddAccountAsync(contentKinds: UserDataAccountContentKinds?):
      IAsyncOperation<String?>?

  @InterfaceMethod(2)
  public fun ShowAccountSettingsAsync(id: String?): IAsyncAction?

  @InterfaceMethod(3)
  public fun ShowAccountErrorResolverAsync(id: String?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataAccountManagerStatics> {
    public override fun getValue() = ABI.makeIUserDataAccountManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IUserDataAccountManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataAccountManagerStatics {
    public val __106130644_Ptr: Pointer?

    public val _106130644_VtblPtr: Pointer?
      get() = __106130644_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestStoreAsync(storeAccessType: UserDataAccountStoreAccessType?):
        IAsyncOperation<UserDataAccountStore?>? {
      val fnPtr = _106130644_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<UserDataAccountStore?>>()
      val hr = fn.invokeHR(arrayOf(__106130644_Ptr, marshalToNative(storeAccessType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<UserDataAccountStore?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ShowAddAccountAsync(contentKinds: UserDataAccountContentKinds?):
        IAsyncOperation<String?>? {
      val fnPtr = _106130644_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__106130644_Ptr, marshalToNative(contentKinds), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ShowAccountSettingsAsync(id: String?): IAsyncAction? {
      val fnPtr = _106130644_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__106130644_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ShowAccountErrorResolverAsync(id: String?): IAsyncAction? {
      val fnPtr = _106130644_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__106130644_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IUserDataAccountManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __106130644_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataAccountManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0d9b89ea19284a2086d53c737f7dc3b0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataAccountManagerStatics(ptr: Pointer?): WithDefault =
        IUserDataAccountManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserDataAccountManagerStatics {
      val address = segment.toRawLongValue()
      return makeIUserDataAccountManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IUserDataAccountManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__106130644_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataAccountManagerStatics):
        Array<IUserDataAccountManagerStatics?> = (elements as
        Array<IUserDataAccountManagerStatics?>).castToImpl<IUserDataAccountManagerStatics,IUserDataAccountManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataAccountManagerStatics?> =
        arrayOfNulls<IUserDataAccountManagerStatics_Impl>(size) as
        Array<IUserDataAccountManagerStatics?>
  }
}
