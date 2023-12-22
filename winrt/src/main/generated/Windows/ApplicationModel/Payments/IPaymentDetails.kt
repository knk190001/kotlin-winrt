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

@ABIMarker(IPaymentDetails.ABI::class)
@Signature("{53bb2d7d-e0eb-4053-8eae-ce7c48e02945}")
@Guid("53bb2d7de0eb40538eaece7c48e02945")
@WinRTInterface("53bb2d7de0eb40538eaece7c48e02945")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaymentDetails.ByReference::class)
public interface IPaymentDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Total(): PaymentItem?

  @InterfaceMethod(1)
  public fun put_Total(value: PaymentItem?): Unit

  @InterfaceMethod(2)
  public fun get_DisplayItems(): IVectorView<PaymentItem?>?

  @InterfaceMethod(3)
  public fun put_DisplayItems(value: IVectorView<PaymentItem?>?): Unit

  @InterfaceMethod(4)
  public fun get_ShippingOptions(): IVectorView<PaymentShippingOption?>?

  @InterfaceMethod(5)
  public fun put_ShippingOptions(value: IVectorView<PaymentShippingOption?>?): Unit

  @InterfaceMethod(6)
  public fun get_Modifiers(): IVectorView<PaymentDetailsModifier?>?

  @InterfaceMethod(7)
  public fun put_Modifiers(value: IVectorView<PaymentDetailsModifier?>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaymentDetails> {
    public override fun getValue() = ABI.makeIPaymentDetails(pointer.getPointer(0))

    public fun setValue(value: IPaymentDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaymentDetails {
    public val __546537262_Ptr: Pointer?

    public val _546537262_VtblPtr: Pointer?
      get() = __546537262_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Total(): PaymentItem? {
      val fnPtr = _546537262_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentItem>()
      val hr = fn.invokeHR(arrayOf(__546537262_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentItem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Total(value: PaymentItem?): Unit {
      val fnPtr = _546537262_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__546537262_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DisplayItems(): IVectorView<PaymentItem?>? {
      val fnPtr = _546537262_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<PaymentItem?>>()
      val hr = fn.invokeHR(arrayOf(__546537262_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<PaymentItem?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_DisplayItems(value: IVectorView<PaymentItem?>?): Unit {
      val fnPtr = _546537262_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__546537262_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ShippingOptions(): IVectorView<PaymentShippingOption?>? {
      val fnPtr = _546537262_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<PaymentShippingOption?>>()
      val hr = fn.invokeHR(arrayOf(__546537262_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<PaymentShippingOption?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ShippingOptions(value: IVectorView<PaymentShippingOption?>?): Unit {
      val fnPtr = _546537262_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__546537262_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Modifiers(): IVectorView<PaymentDetailsModifier?>? {
      val fnPtr = _546537262_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<PaymentDetailsModifier?>>()
      val hr = fn.invokeHR(arrayOf(__546537262_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<PaymentDetailsModifier?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Modifiers(value: IVectorView<PaymentDetailsModifier?>?): Unit {
      val fnPtr = _546537262_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__546537262_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPaymentDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __546537262_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaymentDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("53bb2d7de0eb40538eaece7c48e02945")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaymentDetails(ptr: Pointer?): WithDefault = IPaymentDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaymentDetails {
      val address = segment.toRawLongValue()
      return makeIPaymentDetails(Pointer(address))
    }

    public override fun toNative(obj: IPaymentDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__546537262_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaymentDetails): Array<IPaymentDetails?> = (elements as
        Array<IPaymentDetails?>).castToImpl<IPaymentDetails,IPaymentDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaymentDetails?> =
        arrayOfNulls<IPaymentDetails_Impl>(size) as Array<IPaymentDetails?>
  }
}
