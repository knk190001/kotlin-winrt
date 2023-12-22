package Windows.ApplicationModel.UserDataAccounts.SystemAccess

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(IUserDataAccountSystemAccessManagerStatics.ABI::class)
@Signature("{9d6b11b9-cbe5-45f5-822b-c267b81dbdb6}")
@Guid("9d6b11b9cbe545f5822bc267b81dbdb6")
@WinRTInterface("9d6b11b9cbe545f5822bc267b81dbdb6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataAccountSystemAccessManagerStatics.ByReference::class)
public interface IUserDataAccountSystemAccessManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AddAndShowDeviceAccountsAsync(accounts: IIterable<DeviceAccountConfiguration?>?):
      IAsyncOperation<IVectorView<String?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataAccountSystemAccessManagerStatics> {
    public override fun getValue() =
        ABI.makeIUserDataAccountSystemAccessManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IUserDataAccountSystemAccessManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataAccountSystemAccessManagerStatics {
    public val __845088726_Ptr: Pointer?

    public val _845088726_VtblPtr: Pointer?
      get() = __845088726_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun AddAndShowDeviceAccountsAsync(accounts: IIterable<DeviceAccountConfiguration?>?):
        IAsyncOperation<IVectorView<String?>?>? {
      val fnPtr = _845088726_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<String?>?>>()
      val hr = fn.invokeHR(arrayOf(__845088726_Ptr, marshalToNative(accounts), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IVectorView<String?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IUserDataAccountSystemAccessManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __845088726_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataAccountSystemAccessManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9d6b11b9cbe545f5822bc267b81dbdb6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataAccountSystemAccessManagerStatics(ptr: Pointer?): WithDefault =
        IUserDataAccountSystemAccessManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IUserDataAccountSystemAccessManagerStatics {
      val address = segment.toRawLongValue()
      return makeIUserDataAccountSystemAccessManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IUserDataAccountSystemAccessManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__845088726_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataAccountSystemAccessManagerStatics):
        Array<IUserDataAccountSystemAccessManagerStatics?> = (elements as
        Array<IUserDataAccountSystemAccessManagerStatics?>).castToImpl<IUserDataAccountSystemAccessManagerStatics,IUserDataAccountSystemAccessManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataAccountSystemAccessManagerStatics?> =
        arrayOfNulls<IUserDataAccountSystemAccessManagerStatics_Impl>(size) as
        Array<IUserDataAccountSystemAccessManagerStatics?>
  }
}
