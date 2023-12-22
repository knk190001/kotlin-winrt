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

@ABIMarker(IPaymentMethodDataFactory.ABI::class)
@Signature("{8addd27f-9baa-4a82-8342-a8210992a36b}")
@Guid("8addd27f9baa4a828342a8210992a36b")
@WinRTInterface("8addd27f9baa4a828342a8210992a36b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaymentMethodDataFactory.ByReference::class)
public interface IPaymentMethodDataFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(supportedMethodIds: IIterable<String?>?): PaymentMethodData?

  @InterfaceMethod(1)
  public fun CreateWithJsonData(supportedMethodIds: IIterable<String?>?, jsonData: String?):
      PaymentMethodData?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaymentMethodDataFactory> {
    public override fun getValue() = ABI.makeIPaymentMethodDataFactory(pointer.getPointer(0))

    public fun setValue(value: IPaymentMethodDataFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaymentMethodDataFactory {
    public val __1047940171_Ptr: Pointer?

    public val _1047940171_VtblPtr: Pointer?
      get() = __1047940171_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(supportedMethodIds: IIterable<String?>?): PaymentMethodData? {
      val fnPtr = _1047940171_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentMethodData>()
      val hr = fn.invokeHR(arrayOf(__1047940171_Ptr, marshalToNative(supportedMethodIds), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentMethodData>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithJsonData(supportedMethodIds: IIterable<String?>?,
        jsonData: String?): PaymentMethodData? {
      val fnPtr = _1047940171_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentMethodData>()
      val hr = fn.invokeHR(arrayOf(__1047940171_Ptr, marshalToNative(supportedMethodIds),
          marshalToNative(jsonData), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentMethodData>(result.getValue())
      return resultValue
    }
  }

  public class IPaymentMethodDataFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1047940171_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaymentMethodDataFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8addd27f9baa4a828342a8210992a36b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaymentMethodDataFactory(ptr: Pointer?): WithDefault =
        IPaymentMethodDataFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaymentMethodDataFactory {
      val address = segment.toRawLongValue()
      return makeIPaymentMethodDataFactory(Pointer(address))
    }

    public override fun toNative(obj: IPaymentMethodDataFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1047940171_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaymentMethodDataFactory):
        Array<IPaymentMethodDataFactory?> = (elements as
        Array<IPaymentMethodDataFactory?>).castToImpl<IPaymentMethodDataFactory,IPaymentMethodDataFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaymentMethodDataFactory?> =
        arrayOfNulls<IPaymentMethodDataFactory_Impl>(size) as Array<IPaymentMethodDataFactory?>
  }
}
