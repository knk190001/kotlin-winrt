package Windows.ApplicationModel.Payments

import Windows.Foundation.Collections.IVectorView
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPaymentRequest.ABI::class)
@Signature("{b74942e1-ed7b-47eb-bc08-78cc5d6896b6}")
@Guid("b74942e1ed7b47ebbc0878cc5d6896b6")
@WinRTInterface("b74942e1ed7b47ebbc0878cc5d6896b6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaymentRequest.ByReference::class)
public interface IPaymentRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MerchantInfo(): PaymentMerchantInfo?

  @InterfaceMethod(1)
  public fun get_Details(): PaymentDetails?

  @InterfaceMethod(2)
  public fun get_MethodData(): IVectorView<PaymentMethodData?>?

  @InterfaceMethod(3)
  public fun get_Options(): PaymentOptions?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaymentRequest> {
    public override fun getValue() = ABI.makeIPaymentRequest(pointer.getPointer(0))

    public fun setValue(value: IPaymentRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaymentRequest {
    public val __84508539_Ptr: Pointer?

    public val _84508539_VtblPtr: Pointer?
      get() = __84508539_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MerchantInfo(): PaymentMerchantInfo? {
      val fnPtr = _84508539_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentMerchantInfo>()
      val hr = fn.invokeHR(arrayOf(__84508539_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentMerchantInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Details(): PaymentDetails? {
      val fnPtr = _84508539_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentDetails>()
      val hr = fn.invokeHR(arrayOf(__84508539_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentDetails>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MethodData(): IVectorView<PaymentMethodData?>? {
      val fnPtr = _84508539_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<PaymentMethodData?>>()
      val hr = fn.invokeHR(arrayOf(__84508539_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<PaymentMethodData?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Options(): PaymentOptions? {
      val fnPtr = _84508539_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentOptions>()
      val hr = fn.invokeHR(arrayOf(__84508539_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentOptions>(result.getValue())
      return resultValue
    }
  }

  public class IPaymentRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __84508539_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaymentRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b74942e1ed7b47ebbc0878cc5d6896b6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaymentRequest(ptr: Pointer?): WithDefault = IPaymentRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaymentRequest {
      val address = segment.toRawLongValue()
      return makeIPaymentRequest(Pointer(address))
    }

    public override fun toNative(obj: IPaymentRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__84508539_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaymentRequest): Array<IPaymentRequest?> = (elements as
        Array<IPaymentRequest?>).castToImpl<IPaymentRequest,IPaymentRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaymentRequest?> =
        arrayOfNulls<IPaymentRequest_Impl>(size) as Array<IPaymentRequest?>
  }
}
