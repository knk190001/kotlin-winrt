package Windows.ApplicationModel.Store

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(ICurrentAppWithConsumables.ABI::class)
@Signature("{844e0071-9e4f-4f79-995a-5f91172e6cef}")
@Guid("844e00719e4f4f79995a5f91172e6cef")
@WinRTInterface("844e00719e4f4f79995a5f91172e6cef")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICurrentAppWithConsumables.ByReference::class)
public interface ICurrentAppWithConsumables : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ReportConsumableFulfillmentAsync(productId: String?,
      transactionId: com.sun.jna.platform.win32.Guid.GUID?): IAsyncOperation<FulfillmentResult?>?

  @InterfaceMethod(1)
  public fun RequestProductPurchaseAsync(productId: String?): IAsyncOperation<PurchaseResults?>?

  @InterfaceMethod(2)
  public fun RequestProductPurchaseAsync(
    productId: String?,
    offerId: String?,
    displayProperties: ProductPurchaseDisplayProperties?
  ): IAsyncOperation<PurchaseResults?>?

  @InterfaceMethod(3)
  public fun GetUnfulfilledConsumablesAsync():
      IAsyncOperation<IVectorView<UnfulfilledConsumable?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICurrentAppWithConsumables> {
    public override fun getValue() = ABI.makeICurrentAppWithConsumables(pointer.getPointer(0))

    public fun setValue(value: ICurrentAppWithConsumables_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICurrentAppWithConsumables {
    public val __792130064_Ptr: Pointer?

    public val _792130064_VtblPtr: Pointer?
      get() = __792130064_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReportConsumableFulfillmentAsync(productId: String?,
        transactionId: com.sun.jna.platform.win32.Guid.GUID?):
        IAsyncOperation<FulfillmentResult?>? {
      val fnPtr = _792130064_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<FulfillmentResult?>>()
      val hr = fn.invokeHR(arrayOf(__792130064_Ptr, marshalToNative(productId),
          marshalToNative(transactionId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<FulfillmentResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RequestProductPurchaseAsync(productId: String?):
        IAsyncOperation<PurchaseResults?>? {
      val fnPtr = _792130064_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PurchaseResults?>>()
      val hr = fn.invokeHR(arrayOf(__792130064_Ptr, marshalToNative(productId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<PurchaseResults?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun RequestProductPurchaseAsync(
      productId: String?,
      offerId: String?,
      displayProperties: ProductPurchaseDisplayProperties?
    ): IAsyncOperation<PurchaseResults?>? {
      val fnPtr = _792130064_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PurchaseResults?>>()
      val hr = fn.invokeHR(arrayOf(__792130064_Ptr, marshalToNative(productId),
          marshalToNative(offerId), marshalToNative(displayProperties), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<PurchaseResults?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetUnfulfilledConsumablesAsync():
        IAsyncOperation<IVectorView<UnfulfilledConsumable?>?>? {
      val fnPtr = _792130064_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<UnfulfilledConsumable?>?>>()
      val hr = fn.invokeHR(arrayOf(__792130064_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<UnfulfilledConsumable?>?>>(result.getValue())
      return resultValue
    }
  }

  public class ICurrentAppWithConsumables_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __792130064_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICurrentAppWithConsumables, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("844e00719e4f4f79995a5f91172e6cef")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICurrentAppWithConsumables(ptr: Pointer?): WithDefault =
        ICurrentAppWithConsumables_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICurrentAppWithConsumables {
      val address = segment.toRawLongValue()
      return makeICurrentAppWithConsumables(Pointer(address))
    }

    public override fun toNative(obj: ICurrentAppWithConsumables): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__792130064_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICurrentAppWithConsumables):
        Array<ICurrentAppWithConsumables?> = (elements as
        Array<ICurrentAppWithConsumables?>).castToImpl<ICurrentAppWithConsumables,ICurrentAppWithConsumables_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICurrentAppWithConsumables?> =
        arrayOfNulls<ICurrentAppWithConsumables_Impl>(size) as Array<ICurrentAppWithConsumables?>
  }
}
