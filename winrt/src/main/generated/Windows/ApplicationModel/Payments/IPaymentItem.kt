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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPaymentItem.ABI::class)
@Signature("{685ac88b-79b2-4b76-9e03-a876223dfe72}")
@Guid("685ac88b79b24b769e03a876223dfe72")
@WinRTInterface("685ac88b79b24b769e03a876223dfe72")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaymentItem.ByReference::class)
public interface IPaymentItem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Label(): String?

  @InterfaceMethod(1)
  public fun put_Label(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Amount(): PaymentCurrencyAmount?

  @InterfaceMethod(3)
  public fun put_Amount(value: PaymentCurrencyAmount?): Unit

  @InterfaceMethod(4)
  public fun get_Pending(): Boolean

  @InterfaceMethod(5)
  public fun put_Pending(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPaymentItem> {
    public override fun getValue() = ABI.makeIPaymentItem(pointer.getPointer(0))

    public fun setValue(value: IPaymentItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaymentItem {
    public val __1016072793_Ptr: Pointer?

    public val _1016072793_VtblPtr: Pointer?
      get() = __1016072793_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Label(): String? {
      val fnPtr = _1016072793_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1016072793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Label(value: String?): Unit {
      val fnPtr = _1016072793_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016072793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Amount(): PaymentCurrencyAmount? {
      val fnPtr = _1016072793_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentCurrencyAmount>()
      val hr = fn.invokeHR(arrayOf(__1016072793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentCurrencyAmount>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Amount(value: PaymentCurrencyAmount?): Unit {
      val fnPtr = _1016072793_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016072793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Pending(): Boolean {
      val fnPtr = _1016072793_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1016072793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_Pending(value: Boolean): Unit {
      val fnPtr = _1016072793_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1016072793_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPaymentItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1016072793_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaymentItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("685ac88b79b24b769e03a876223dfe72")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaymentItem(ptr: Pointer?): WithDefault = IPaymentItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaymentItem {
      val address = segment.toRawLongValue()
      return makeIPaymentItem(Pointer(address))
    }

    public override fun toNative(obj: IPaymentItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1016072793_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaymentItem): Array<IPaymentItem?> = (elements as
        Array<IPaymentItem?>).castToImpl<IPaymentItem,IPaymentItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaymentItem?> =
        arrayOfNulls<IPaymentItem_Impl>(size) as Array<IPaymentItem?>
  }
}
