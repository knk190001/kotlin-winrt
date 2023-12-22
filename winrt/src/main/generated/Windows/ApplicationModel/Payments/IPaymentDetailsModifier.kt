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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPaymentDetailsModifier.ABI::class)
@Signature("{be1c7d65-4323-41d7-b305-dfcb765f69de}")
@Guid("be1c7d65432341d7b305dfcb765f69de")
@WinRTInterface("be1c7d65432341d7b305dfcb765f69de")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaymentDetailsModifier.ByReference::class)
public interface IPaymentDetailsModifier : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_JsonData(): String?

  @InterfaceMethod(1)
  public fun get_SupportedMethodIds(): IVectorView<String?>?

  @InterfaceMethod(2)
  public fun get_Total(): PaymentItem?

  @InterfaceMethod(3)
  public fun get_AdditionalDisplayItems(): IVectorView<PaymentItem?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaymentDetailsModifier> {
    public override fun getValue() = ABI.makeIPaymentDetailsModifier(pointer.getPointer(0))

    public fun setValue(value: IPaymentDetailsModifier_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaymentDetailsModifier {
    public val __1411045413_Ptr: Pointer?

    public val _1411045413_VtblPtr: Pointer?
      get() = __1411045413_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_JsonData(): String? {
      val fnPtr = _1411045413_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1411045413_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SupportedMethodIds(): IVectorView<String?>? {
      val fnPtr = _1411045413_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1411045413_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Total(): PaymentItem? {
      val fnPtr = _1411045413_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentItem>()
      val hr = fn.invokeHR(arrayOf(__1411045413_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentItem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_AdditionalDisplayItems(): IVectorView<PaymentItem?>? {
      val fnPtr = _1411045413_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<PaymentItem?>>()
      val hr = fn.invokeHR(arrayOf(__1411045413_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<PaymentItem?>>(result.getValue())
      return resultValue
    }
  }

  public class IPaymentDetailsModifier_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1411045413_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaymentDetailsModifier, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("be1c7d65432341d7b305dfcb765f69de")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaymentDetailsModifier(ptr: Pointer?): WithDefault =
        IPaymentDetailsModifier_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaymentDetailsModifier {
      val address = segment.toRawLongValue()
      return makeIPaymentDetailsModifier(Pointer(address))
    }

    public override fun toNative(obj: IPaymentDetailsModifier): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1411045413_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaymentDetailsModifier): Array<IPaymentDetailsModifier?>
        = (elements as
        Array<IPaymentDetailsModifier?>).castToImpl<IPaymentDetailsModifier,IPaymentDetailsModifier_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaymentDetailsModifier?> =
        arrayOfNulls<IPaymentDetailsModifier_Impl>(size) as Array<IPaymentDetailsModifier?>
  }
}
