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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPaymentCurrencyAmount.ABI::class)
@Signature("{e3a3e9e0-b41f-4987-bdcb-071331f2daa4}")
@Guid("e3a3e9e0b41f4987bdcb071331f2daa4")
@WinRTInterface("e3a3e9e0b41f4987bdcb071331f2daa4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaymentCurrencyAmount.ByReference::class)
public interface IPaymentCurrencyAmount : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Currency(): String?

  @InterfaceMethod(1)
  public fun put_Currency(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_CurrencySystem(): String?

  @InterfaceMethod(3)
  public fun put_CurrencySystem(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_Value(): String?

  @InterfaceMethod(5)
  public fun put_Value(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaymentCurrencyAmount> {
    public override fun getValue() = ABI.makeIPaymentCurrencyAmount(pointer.getPointer(0))

    public fun setValue(value: IPaymentCurrencyAmount_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaymentCurrencyAmount {
    public val __757493085_Ptr: Pointer?

    public val _757493085_VtblPtr: Pointer?
      get() = __757493085_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Currency(): String? {
      val fnPtr = _757493085_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__757493085_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Currency(value: String?): Unit {
      val fnPtr = _757493085_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__757493085_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CurrencySystem(): String? {
      val fnPtr = _757493085_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__757493085_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_CurrencySystem(value: String?): Unit {
      val fnPtr = _757493085_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__757493085_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Value(): String? {
      val fnPtr = _757493085_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__757493085_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Value(value: String?): Unit {
      val fnPtr = _757493085_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__757493085_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPaymentCurrencyAmount_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __757493085_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaymentCurrencyAmount, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e3a3e9e0b41f4987bdcb071331f2daa4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaymentCurrencyAmount(ptr: Pointer?): WithDefault =
        IPaymentCurrencyAmount_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaymentCurrencyAmount {
      val address = segment.toRawLongValue()
      return makeIPaymentCurrencyAmount(Pointer(address))
    }

    public override fun toNative(obj: IPaymentCurrencyAmount): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__757493085_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaymentCurrencyAmount): Array<IPaymentCurrencyAmount?> =
        (elements as
        Array<IPaymentCurrencyAmount?>).castToImpl<IPaymentCurrencyAmount,IPaymentCurrencyAmount_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaymentCurrencyAmount?> =
        arrayOfNulls<IPaymentCurrencyAmount_Impl>(size) as Array<IPaymentCurrencyAmount?>
  }
}
