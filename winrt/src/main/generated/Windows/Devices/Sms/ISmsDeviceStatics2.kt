package Windows.Devices.Sms

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

@ABIMarker(ISmsDeviceStatics2.ABI::class)
@Signature("{2ca11c87-0873-4caf-8a7d-bd471e8586d1}")
@Guid("2ca11c8708734caf8a7dbd471e8586d1")
@WinRTInterface("2ca11c8708734caf8a7dbd471e8586d1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmsDeviceStatics2.ByReference::class)
public interface ISmsDeviceStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromNetworkAccountIdAsync(networkAccountId: String?): IAsyncOperation<SmsDevice?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmsDeviceStatics2> {
    public override fun getValue() = ABI.makeISmsDeviceStatics2(pointer.getPointer(0))

    public fun setValue(value: ISmsDeviceStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmsDeviceStatics2 {
    public val __1151273424_Ptr: Pointer?

    public val _1151273424_VtblPtr: Pointer?
      get() = __1151273424_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromNetworkAccountIdAsync(networkAccountId: String?):
        IAsyncOperation<SmsDevice?>? {
      val fnPtr = _1151273424_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SmsDevice?>>()
      val hr = fn.invokeHR(arrayOf(__1151273424_Ptr, marshalToNative(networkAccountId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<SmsDevice?>>(result.getValue())
      return resultValue
    }
  }

  public class ISmsDeviceStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1151273424_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmsDeviceStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2ca11c8708734caf8a7dbd471e8586d1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmsDeviceStatics2(ptr: Pointer?): WithDefault = ISmsDeviceStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmsDeviceStatics2 {
      val address = segment.toRawLongValue()
      return makeISmsDeviceStatics2(Pointer(address))
    }

    public override fun toNative(obj: ISmsDeviceStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1151273424_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmsDeviceStatics2): Array<ISmsDeviceStatics2?> =
        (elements as
        Array<ISmsDeviceStatics2?>).castToImpl<ISmsDeviceStatics2,ISmsDeviceStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmsDeviceStatics2?> =
        arrayOfNulls<ISmsDeviceStatics2_Impl>(size) as Array<ISmsDeviceStatics2?>
  }
}
