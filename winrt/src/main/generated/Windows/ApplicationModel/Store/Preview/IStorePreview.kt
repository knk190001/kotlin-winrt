package Windows.ApplicationModel.Store.Preview

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

@ABIMarker(IStorePreview.ABI::class)
@Signature("{8a157241-840e-49a9-bc01-5d5b01fbc8e9}")
@Guid("8a157241840e49a9bc015d5b01fbc8e9")
@WinRTInterface("8a157241840e49a9bc015d5b01fbc8e9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorePreview.ByReference::class)
public interface IStorePreview : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestProductPurchaseByProductIdAndSkuIdAsync(productId: String?, skuId: String?):
      IAsyncOperation<StorePreviewPurchaseResults?>?

  @InterfaceMethod(1)
  public fun LoadAddOnProductInfosAsync(): IAsyncOperation<IVectorView<StorePreviewProductInfo?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IStorePreview>
      {
    public override fun getValue() = ABI.makeIStorePreview(pointer.getPointer(0))

    public fun setValue(value: IStorePreview_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorePreview {
    public val __1211909919_Ptr: Pointer?

    public val _1211909919_VtblPtr: Pointer?
      get() = __1211909919_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestProductPurchaseByProductIdAndSkuIdAsync(productId: String?,
        skuId: String?): IAsyncOperation<StorePreviewPurchaseResults?>? {
      val fnPtr = _1211909919_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorePreviewPurchaseResults?>>()
      val hr = fn.invokeHR(arrayOf(__1211909919_Ptr, marshalToNative(productId),
          marshalToNative(skuId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<StorePreviewPurchaseResults?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun LoadAddOnProductInfosAsync():
        IAsyncOperation<IVectorView<StorePreviewProductInfo?>?>? {
      val fnPtr = _1211909919_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<StorePreviewProductInfo?>?>>()
      val hr = fn.invokeHR(arrayOf(__1211909919_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<StorePreviewProductInfo?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IStorePreview_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1211909919_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorePreview, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8a157241840e49a9bc015d5b01fbc8e9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorePreview(ptr: Pointer?): WithDefault = IStorePreview_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorePreview {
      val address = segment.toRawLongValue()
      return makeIStorePreview(Pointer(address))
    }

    public override fun toNative(obj: IStorePreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1211909919_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorePreview): Array<IStorePreview?> = (elements as
        Array<IStorePreview?>).castToImpl<IStorePreview,IStorePreview_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorePreview?> =
        arrayOfNulls<IStorePreview_Impl>(size) as Array<IStorePreview?>
  }
}
