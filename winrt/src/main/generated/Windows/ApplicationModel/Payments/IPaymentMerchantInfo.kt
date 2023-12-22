package Windows.ApplicationModel.Payments

import Windows.Foundation.Uri
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

@ABIMarker(IPaymentMerchantInfo.ABI::class)
@Signature("{63445050-0e94-4ed6-aacb-e6012bd327a7}")
@Guid("634450500e944ed6aacbe6012bd327a7")
@WinRTInterface("634450500e944ed6aacbe6012bd327a7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaymentMerchantInfo.ByReference::class)
public interface IPaymentMerchantInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PackageFullName(): String?

  @InterfaceMethod(1)
  public fun get_Uri(): Uri?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaymentMerchantInfo> {
    public override fun getValue() = ABI.makeIPaymentMerchantInfo(pointer.getPointer(0))

    public fun setValue(value: IPaymentMerchantInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaymentMerchantInfo {
    public val __514794794_Ptr: Pointer?

    public val _514794794_VtblPtr: Pointer?
      get() = __514794794_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PackageFullName(): String? {
      val fnPtr = _514794794_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__514794794_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Uri(): Uri? {
      val fnPtr = _514794794_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__514794794_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }
  }

  public class IPaymentMerchantInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __514794794_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaymentMerchantInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("634450500e944ed6aacbe6012bd327a7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaymentMerchantInfo(ptr: Pointer?): WithDefault = IPaymentMerchantInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaymentMerchantInfo {
      val address = segment.toRawLongValue()
      return makeIPaymentMerchantInfo(Pointer(address))
    }

    public override fun toNative(obj: IPaymentMerchantInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__514794794_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaymentMerchantInfo): Array<IPaymentMerchantInfo?> =
        (elements as
        Array<IPaymentMerchantInfo?>).castToImpl<IPaymentMerchantInfo,IPaymentMerchantInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaymentMerchantInfo?> =
        arrayOfNulls<IPaymentMerchantInfo_Impl>(size) as Array<IPaymentMerchantInfo?>
  }
}
