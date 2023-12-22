package Windows.ApplicationModel.UserDataAccounts.SystemAccess

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

@ABIMarker(IUserDataAccountSystemAccessManagerStatics2.ABI::class)
@Signature("{943f854d-4b4e-439f-83d3-979b27c05ac7}")
@Guid("943f854d4b4e439f83d3979b27c05ac7")
@WinRTInterface("943f854d4b4e439f83d3979b27c05ac7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataAccountSystemAccessManagerStatics2.ByReference::class)
public interface IUserDataAccountSystemAccessManagerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SuppressLocalAccountWithAccountAsync(userDataAccountId: String?): IAsyncAction?

  @InterfaceMethod(1)
  public fun CreateDeviceAccountAsync(account: DeviceAccountConfiguration?):
      IAsyncOperation<String?>?

  @InterfaceMethod(2)
  public fun DeleteDeviceAccountAsync(accountId: String?): IAsyncAction?

  @InterfaceMethod(3)
  public fun GetDeviceAccountConfigurationAsync(accountId: String?):
      IAsyncOperation<DeviceAccountConfiguration?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataAccountSystemAccessManagerStatics2> {
    public override fun getValue() =
        ABI.makeIUserDataAccountSystemAccessManagerStatics2(pointer.getPointer(0))

    public fun setValue(value: IUserDataAccountSystemAccessManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataAccountSystemAccessManagerStatics2 {
    public val __427946780_Ptr: Pointer?

    public val _427946780_VtblPtr: Pointer?
      get() = __427946780_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SuppressLocalAccountWithAccountAsync(userDataAccountId: String?):
        IAsyncAction? {
      val fnPtr = _427946780_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__427946780_Ptr, marshalToNative(userDataAccountId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateDeviceAccountAsync(account: DeviceAccountConfiguration?):
        IAsyncOperation<String?>? {
      val fnPtr = _427946780_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__427946780_Ptr, marshalToNative(account), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun DeleteDeviceAccountAsync(accountId: String?): IAsyncAction? {
      val fnPtr = _427946780_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__427946780_Ptr, marshalToNative(accountId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetDeviceAccountConfigurationAsync(accountId: String?):
        IAsyncOperation<DeviceAccountConfiguration?>? {
      val fnPtr = _427946780_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DeviceAccountConfiguration?>>()
      val hr = fn.invokeHR(arrayOf(__427946780_Ptr, marshalToNative(accountId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<DeviceAccountConfiguration?>>(result.getValue())
      return resultValue
    }
  }

  public class IUserDataAccountSystemAccessManagerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __427946780_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataAccountSystemAccessManagerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("943f854d4b4e439f83d3979b27c05ac7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataAccountSystemAccessManagerStatics2(ptr: Pointer?): WithDefault =
        IUserDataAccountSystemAccessManagerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IUserDataAccountSystemAccessManagerStatics2 {
      val address = segment.toRawLongValue()
      return makeIUserDataAccountSystemAccessManagerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IUserDataAccountSystemAccessManagerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__427946780_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataAccountSystemAccessManagerStatics2):
        Array<IUserDataAccountSystemAccessManagerStatics2?> = (elements as
        Array<IUserDataAccountSystemAccessManagerStatics2?>).castToImpl<IUserDataAccountSystemAccessManagerStatics2,IUserDataAccountSystemAccessManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataAccountSystemAccessManagerStatics2?> =
        arrayOfNulls<IUserDataAccountSystemAccessManagerStatics2_Impl>(size) as
        Array<IUserDataAccountSystemAccessManagerStatics2?>
  }
}
