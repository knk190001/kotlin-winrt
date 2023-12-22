package Windows.ApplicationModel.Payments

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPaymentOptions.ABI::class)
@Signature("{aaa30854-1f2b-4365-8251-01b58915a5bc}")
@Guid("aaa308541f2b4365825101b58915a5bc")
@WinRTInterface("aaa308541f2b4365825101b58915a5bc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaymentOptions.ByReference::class)
public interface IPaymentOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RequestPayerEmail(): PaymentOptionPresence?

  @InterfaceMethod(1)
  public fun put_RequestPayerEmail(value: PaymentOptionPresence?): Unit

  @InterfaceMethod(2)
  public fun get_RequestPayerName(): PaymentOptionPresence?

  @InterfaceMethod(3)
  public fun put_RequestPayerName(value: PaymentOptionPresence?): Unit

  @InterfaceMethod(4)
  public fun get_RequestPayerPhoneNumber(): PaymentOptionPresence?

  @InterfaceMethod(5)
  public fun put_RequestPayerPhoneNumber(value: PaymentOptionPresence?): Unit

  @InterfaceMethod(6)
  public fun get_RequestShipping(): Boolean

  @InterfaceMethod(7)
  public fun put_RequestShipping(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_ShippingType(): PaymentShippingType?

  @InterfaceMethod(9)
  public fun put_ShippingType(value: PaymentShippingType?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaymentOptions> {
    public override fun getValue() = ABI.makeIPaymentOptions(pointer.getPointer(0))

    public fun setValue(value: IPaymentOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaymentOptions {
    public val __2034307978_Ptr: Pointer?

    public val _2034307978_VtblPtr: Pointer?
      get() = __2034307978_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RequestPayerEmail(): PaymentOptionPresence? {
      val fnPtr = _2034307978_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentOptionPresence>()
      val hr = fn.invokeHR(arrayOf(__2034307978_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentOptionPresence>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_RequestPayerEmail(value: PaymentOptionPresence?): Unit {
      val fnPtr = _2034307978_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2034307978_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_RequestPayerName(): PaymentOptionPresence? {
      val fnPtr = _2034307978_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentOptionPresence>()
      val hr = fn.invokeHR(arrayOf(__2034307978_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentOptionPresence>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_RequestPayerName(value: PaymentOptionPresence?): Unit {
      val fnPtr = _2034307978_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2034307978_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_RequestPayerPhoneNumber(): PaymentOptionPresence? {
      val fnPtr = _2034307978_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentOptionPresence>()
      val hr = fn.invokeHR(arrayOf(__2034307978_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentOptionPresence>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_RequestPayerPhoneNumber(value: PaymentOptionPresence?): Unit {
      val fnPtr = _2034307978_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2034307978_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_RequestShipping(): Boolean {
      val fnPtr = _2034307978_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2034307978_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_RequestShipping(value: Boolean): Unit {
      val fnPtr = _2034307978_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2034307978_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_ShippingType(): PaymentShippingType? {
      val fnPtr = _2034307978_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentShippingType>()
      val hr = fn.invokeHR(arrayOf(__2034307978_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentShippingType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_ShippingType(value: PaymentShippingType?): Unit {
      val fnPtr = _2034307978_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2034307978_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPaymentOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2034307978_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaymentOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aaa308541f2b4365825101b58915a5bc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaymentOptions(ptr: Pointer?): WithDefault = IPaymentOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaymentOptions {
      val address = segment.toRawLongValue()
      return makeIPaymentOptions(Pointer(address))
    }

    public override fun toNative(obj: IPaymentOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2034307978_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaymentOptions): Array<IPaymentOptions?> = (elements as
        Array<IPaymentOptions?>).castToImpl<IPaymentOptions,IPaymentOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaymentOptions?> =
        arrayOfNulls<IPaymentOptions_Impl>(size) as Array<IPaymentOptions?>
  }
}
