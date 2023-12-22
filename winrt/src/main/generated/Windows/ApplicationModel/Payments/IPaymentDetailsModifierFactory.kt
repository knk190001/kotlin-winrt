package Windows.ApplicationModel.Payments

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(IPaymentDetailsModifierFactory.ABI::class)
@Signature("{79005286-54de-429c-9e4f-5dce6e10ebce}")
@Guid("7900528654de429c9e4f5dce6e10ebce")
@WinRTInterface("7900528654de429c9e4f5dce6e10ebce")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaymentDetailsModifierFactory.ByReference::class)
public interface IPaymentDetailsModifierFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(supportedMethodIds: IIterable<String?>?, total: PaymentItem?):
      PaymentDetailsModifier?

  @InterfaceMethod(1)
  public fun CreateWithAdditionalDisplayItems(
    supportedMethodIds: IIterable<String?>?,
    total: PaymentItem?,
    additionalDisplayItems: IIterable<PaymentItem?>?
  ): PaymentDetailsModifier?

  @InterfaceMethod(2)
  public fun CreateWithAdditionalDisplayItemsAndJsonData(
    supportedMethodIds: IIterable<String?>?,
    total: PaymentItem?,
    additionalDisplayItems: IIterable<PaymentItem?>?,
    jsonData: String?
  ): PaymentDetailsModifier?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaymentDetailsModifierFactory> {
    public override fun getValue() = ABI.makeIPaymentDetailsModifierFactory(pointer.getPointer(0))

    public fun setValue(value: IPaymentDetailsModifierFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaymentDetailsModifierFactory {
    public val __567186139_Ptr: Pointer?

    public val _567186139_VtblPtr: Pointer?
      get() = __567186139_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(supportedMethodIds: IIterable<String?>?, total: PaymentItem?):
        PaymentDetailsModifier? {
      val fnPtr = _567186139_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentDetailsModifier>()
      val hr = fn.invokeHR(arrayOf(__567186139_Ptr, marshalToNative(supportedMethodIds),
          marshalToNative(total), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentDetailsModifier>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithAdditionalDisplayItems(
      supportedMethodIds: IIterable<String?>?,
      total: PaymentItem?,
      additionalDisplayItems: IIterable<PaymentItem?>?
    ): PaymentDetailsModifier? {
      val fnPtr = _567186139_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentDetailsModifier>()
      val hr = fn.invokeHR(arrayOf(__567186139_Ptr, marshalToNative(supportedMethodIds),
          marshalToNative(total), marshalToNative(additionalDisplayItems), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentDetailsModifier>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateWithAdditionalDisplayItemsAndJsonData(
      supportedMethodIds: IIterable<String?>?,
      total: PaymentItem?,
      additionalDisplayItems: IIterable<PaymentItem?>?,
      jsonData: String?
    ): PaymentDetailsModifier? {
      val fnPtr = _567186139_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentDetailsModifier>()
      val hr = fn.invokeHR(arrayOf(__567186139_Ptr, marshalToNative(supportedMethodIds),
          marshalToNative(total), marshalToNative(additionalDisplayItems),
          marshalToNative(jsonData), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentDetailsModifier>(result.getValue())
      return resultValue
    }
  }

  public class IPaymentDetailsModifierFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __567186139_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaymentDetailsModifierFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7900528654de429c9e4f5dce6e10ebce")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaymentDetailsModifierFactory(ptr: Pointer?): WithDefault =
        IPaymentDetailsModifierFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaymentDetailsModifierFactory {
      val address = segment.toRawLongValue()
      return makeIPaymentDetailsModifierFactory(Pointer(address))
    }

    public override fun toNative(obj: IPaymentDetailsModifierFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__567186139_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaymentDetailsModifierFactory):
        Array<IPaymentDetailsModifierFactory?> = (elements as
        Array<IPaymentDetailsModifierFactory?>).castToImpl<IPaymentDetailsModifierFactory,IPaymentDetailsModifierFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaymentDetailsModifierFactory?> =
        arrayOfNulls<IPaymentDetailsModifierFactory_Impl>(size) as
        Array<IPaymentDetailsModifierFactory?>
  }
}
