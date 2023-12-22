package Windows.Services.Store

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Uri
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

@ABIMarker(IStoreProduct.ABI::class)
@Signature("{320e2c52-d760-450a-a42b-67d1e901ac90}")
@Guid("320e2c52d760450aa42b67d1e901ac90")
@WinRTInterface("320e2c52d760450aa42b67d1e901ac90")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoreProduct.ByReference::class)
public interface IStoreProduct : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StoreId(): String?

  @InterfaceMethod(1)
  public fun get_Language(): String?

  @InterfaceMethod(2)
  public fun get_Title(): String?

  @InterfaceMethod(3)
  public fun get_Description(): String?

  @InterfaceMethod(4)
  public fun get_ProductKind(): String?

  @InterfaceMethod(5)
  public fun get_HasDigitalDownload(): Boolean

  @InterfaceMethod(6)
  public fun get_Keywords(): IVectorView<String?>?

  @InterfaceMethod(7)
  public fun get_Images(): IVectorView<StoreImage?>?

  @InterfaceMethod(8)
  public fun get_Videos(): IVectorView<StoreVideo?>?

  @InterfaceMethod(9)
  public fun get_Skus(): IVectorView<StoreSku?>?

  @InterfaceMethod(10)
  public fun get_IsInUserCollection(): Boolean

  @InterfaceMethod(11)
  public fun get_Price(): StorePrice?

  @InterfaceMethod(12)
  public fun get_ExtendedJsonData(): String?

  @InterfaceMethod(13)
  public fun get_LinkUri(): Uri?

  @InterfaceMethod(14)
  public fun GetIsAnySkuInstalledAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(15)
  public fun RequestPurchaseAsync(): IAsyncOperation<StorePurchaseResult?>?

  @InterfaceMethod(16)
  public fun RequestPurchaseAsync(storePurchaseProperties: StorePurchaseProperties?):
      IAsyncOperation<StorePurchaseResult?>?

  @InterfaceMethod(17)
  public fun get_InAppOfferToken(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IStoreProduct>
      {
    public override fun getValue() = ABI.makeIStoreProduct(pointer.getPointer(0))

    public fun setValue(value: IStoreProduct_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoreProduct {
    public val __1256583429_Ptr: Pointer?

    public val _1256583429_VtblPtr: Pointer?
      get() = __1256583429_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StoreId(): String? {
      val fnPtr = _1256583429_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1256583429_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Language(): String? {
      val fnPtr = _1256583429_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1256583429_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Title(): String? {
      val fnPtr = _1256583429_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1256583429_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Description(): String? {
      val fnPtr = _1256583429_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1256583429_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ProductKind(): String? {
      val fnPtr = _1256583429_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1256583429_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_HasDigitalDownload(): Boolean {
      val fnPtr = _1256583429_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1256583429_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_Keywords(): IVectorView<String?>? {
      val fnPtr = _1256583429_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1256583429_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_Images(): IVectorView<StoreImage?>? {
      val fnPtr = _1256583429_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<StoreImage?>>()
      val hr = fn.invokeHR(arrayOf(__1256583429_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<StoreImage?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_Videos(): IVectorView<StoreVideo?>? {
      val fnPtr = _1256583429_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<StoreVideo?>>()
      val hr = fn.invokeHR(arrayOf(__1256583429_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<StoreVideo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_Skus(): IVectorView<StoreSku?>? {
      val fnPtr = _1256583429_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<StoreSku?>>()
      val hr = fn.invokeHR(arrayOf(__1256583429_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<StoreSku?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_IsInUserCollection(): Boolean {
      val fnPtr = _1256583429_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1256583429_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun get_Price(): StorePrice? {
      val fnPtr = _1256583429_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorePrice>()
      val hr = fn.invokeHR(arrayOf(__1256583429_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorePrice>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_ExtendedJsonData(): String? {
      val fnPtr = _1256583429_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1256583429_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_LinkUri(): Uri? {
      val fnPtr = _1256583429_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1256583429_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun GetIsAnySkuInstalledAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _1256583429_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1256583429_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun RequestPurchaseAsync(): IAsyncOperation<StorePurchaseResult?>? {
      val fnPtr = _1256583429_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorePurchaseResult?>>()
      val hr = fn.invokeHR(arrayOf(__1256583429_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorePurchaseResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun RequestPurchaseAsync(storePurchaseProperties: StorePurchaseProperties?):
        IAsyncOperation<StorePurchaseResult?>? {
      val fnPtr = _1256583429_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorePurchaseResult?>>()
      val hr = fn.invokeHR(arrayOf(__1256583429_Ptr, marshalToNative(storePurchaseProperties),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorePurchaseResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_InAppOfferToken(): String? {
      val fnPtr = _1256583429_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1256583429_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IStoreProduct_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1256583429_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoreProduct, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("320e2c52d760450aa42b67d1e901ac90")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoreProduct(ptr: Pointer?): WithDefault = IStoreProduct_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoreProduct {
      val address = segment.toRawLongValue()
      return makeIStoreProduct(Pointer(address))
    }

    public override fun toNative(obj: IStoreProduct): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1256583429_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoreProduct): Array<IStoreProduct?> = (elements as
        Array<IStoreProduct?>).castToImpl<IStoreProduct,IStoreProduct_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoreProduct?> =
        arrayOfNulls<IStoreProduct_Impl>(size) as Array<IStoreProduct?>
  }
}
