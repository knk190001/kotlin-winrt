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

@ABIMarker(IPaymentRequestChangedResultFactory.ABI::class)
@Signature("{08740f56-1d33-4431-814b-67ea24bf21db}")
@Guid("08740f561d334431814b67ea24bf21db")
@WinRTInterface("08740f561d334431814b67ea24bf21db")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaymentRequestChangedResultFactory.ByReference::class)
public interface IPaymentRequestChangedResultFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(changeAcceptedByMerchant: Boolean): PaymentRequestChangedResult?

  @InterfaceMethod(1)
  public fun CreateWithPaymentDetails(changeAcceptedByMerchant: Boolean,
      updatedPaymentDetails: PaymentDetails?): PaymentRequestChangedResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaymentRequestChangedResultFactory> {
    public override fun getValue() =
        ABI.makeIPaymentRequestChangedResultFactory(pointer.getPointer(0))

    public fun setValue(value: IPaymentRequestChangedResultFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaymentRequestChangedResultFactory {
    public val __1896673292_Ptr: Pointer?

    public val _1896673292_VtblPtr: Pointer?
      get() = __1896673292_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(changeAcceptedByMerchant: Boolean): PaymentRequestChangedResult? {
      val fnPtr = _1896673292_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentRequestChangedResult>()
      val hr = fn.invokeHR(arrayOf(__1896673292_Ptr, changeAcceptedByMerchant, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentRequestChangedResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithPaymentDetails(changeAcceptedByMerchant: Boolean,
        updatedPaymentDetails: PaymentDetails?): PaymentRequestChangedResult? {
      val fnPtr = _1896673292_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentRequestChangedResult>()
      val hr = fn.invokeHR(arrayOf(__1896673292_Ptr, changeAcceptedByMerchant,
          marshalToNative(updatedPaymentDetails), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentRequestChangedResult>(result.getValue())
      return resultValue
    }
  }

  public class IPaymentRequestChangedResultFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1896673292_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaymentRequestChangedResultFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("08740f561d334431814b67ea24bf21db")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaymentRequestChangedResultFactory(ptr: Pointer?): WithDefault =
        IPaymentRequestChangedResultFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaymentRequestChangedResultFactory {
      val address = segment.toRawLongValue()
      return makeIPaymentRequestChangedResultFactory(Pointer(address))
    }

    public override fun toNative(obj: IPaymentRequestChangedResultFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1896673292_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaymentRequestChangedResultFactory):
        Array<IPaymentRequestChangedResultFactory?> = (elements as
        Array<IPaymentRequestChangedResultFactory?>).castToImpl<IPaymentRequestChangedResultFactory,IPaymentRequestChangedResultFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaymentRequestChangedResultFactory?> =
        arrayOfNulls<IPaymentRequestChangedResultFactory_Impl>(size) as
        Array<IPaymentRequestChangedResultFactory?>
  }
}
