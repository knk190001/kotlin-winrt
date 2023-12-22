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

@ABIMarker(ICurrentAppSimulatorWithConsumables.ABI::class)
@Signature("{4e51f0ab-20e7-4412-9b85-59bb78388667}")
@Guid("4e51f0ab20e744129b8559bb78388667")
@WinRTInterface("4e51f0ab20e744129b8559bb78388667")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICurrentAppSimulatorWithConsumables.ByReference::class)
public interface ICurrentAppSimulatorWithConsumables : NativeMapped, IWinRTInterface {
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
      IByReference<ICurrentAppSimulatorWithConsumables> {
    public override fun getValue() =
        ABI.makeICurrentAppSimulatorWithConsumables(pointer.getPointer(0))

    public fun setValue(value: ICurrentAppSimulatorWithConsumables_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICurrentAppSimulatorWithConsumables {
    public val __2078702688_Ptr: Pointer?

    public val _2078702688_VtblPtr: Pointer?
      get() = __2078702688_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReportConsumableFulfillmentAsync(productId: String?,
        transactionId: com.sun.jna.platform.win32.Guid.GUID?):
        IAsyncOperation<FulfillmentResult?>? {
      val fnPtr = _2078702688_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<FulfillmentResult?>>()
      val hr = fn.invokeHR(arrayOf(__2078702688_Ptr, marshalToNative(productId),
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
      val fnPtr = _2078702688_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PurchaseResults?>>()
      val hr = fn.invokeHR(arrayOf(__2078702688_Ptr, marshalToNative(productId), result))
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
      val fnPtr = _2078702688_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PurchaseResults?>>()
      val hr = fn.invokeHR(arrayOf(__2078702688_Ptr, marshalToNative(productId),
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
      val fnPtr = _2078702688_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<UnfulfilledConsumable?>?>>()
      val hr = fn.invokeHR(arrayOf(__2078702688_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<UnfulfilledConsumable?>?>>(result.getValue())
      return resultValue
    }
  }

  public class ICurrentAppSimulatorWithConsumables_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2078702688_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICurrentAppSimulatorWithConsumables, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4e51f0ab20e744129b8559bb78388667")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICurrentAppSimulatorWithConsumables(ptr: Pointer?): WithDefault =
        ICurrentAppSimulatorWithConsumables_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICurrentAppSimulatorWithConsumables {
      val address = segment.toRawLongValue()
      return makeICurrentAppSimulatorWithConsumables(Pointer(address))
    }

    public override fun toNative(obj: ICurrentAppSimulatorWithConsumables): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2078702688_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICurrentAppSimulatorWithConsumables):
        Array<ICurrentAppSimulatorWithConsumables?> = (elements as
        Array<ICurrentAppSimulatorWithConsumables?>).castToImpl<ICurrentAppSimulatorWithConsumables,ICurrentAppSimulatorWithConsumables_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICurrentAppSimulatorWithConsumables?> =
        arrayOfNulls<ICurrentAppSimulatorWithConsumables_Impl>(size) as
        Array<ICurrentAppSimulatorWithConsumables?>
  }
}
