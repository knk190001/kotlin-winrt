package Windows.Services.Store

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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStoreSku.ABI::class)
@Signature("{397e6f55-4440-4f03-863c-91f3fec83d79}")
@Guid("397e6f5544404f03863c91f3fec83d79")
@WinRTInterface("397e6f5544404f03863c91f3fec83d79")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoreSku.ByReference::class)
public interface IStoreSku : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StoreId(): String?

  @InterfaceMethod(1)
  public fun get_Language(): String?

  @InterfaceMethod(2)
  public fun get_Title(): String?

  @InterfaceMethod(3)
  public fun get_Description(): String?

  @InterfaceMethod(4)
  public fun get_IsTrial(): Boolean

  @InterfaceMethod(5)
  public fun get_CustomDeveloperData(): String?

  @InterfaceMethod(6)
  public fun get_Images(): IVectorView<StoreImage?>?

  @InterfaceMethod(7)
  public fun get_Videos(): IVectorView<StoreVideo?>?

  @InterfaceMethod(8)
  public fun get_Availabilities(): IVectorView<StoreAvailability?>?

  @InterfaceMethod(9)
  public fun get_Price(): StorePrice?

  @InterfaceMethod(10)
  public fun get_ExtendedJsonData(): String?

  @InterfaceMethod(11)
  public fun get_IsInUserCollection(): Boolean

  @InterfaceMethod(12)
  public fun get_BundledSkus(): IVectorView<String?>?

  @InterfaceMethod(13)
  public fun get_CollectionData(): StoreCollectionData?

  @InterfaceMethod(14)
  public fun GetIsInstalledAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(15)
  public fun RequestPurchaseAsync(): IAsyncOperation<StorePurchaseResult?>?

  @InterfaceMethod(16)
  public fun RequestPurchaseAsync(storePurchaseProperties: StorePurchaseProperties?):
      IAsyncOperation<StorePurchaseResult?>?

  @InterfaceMethod(17)
  public fun get_IsSubscription(): Boolean

  @InterfaceMethod(18)
  public fun get_SubscriptionInfo(): StoreSubscriptionInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IStoreSku> {
    public override fun getValue() = ABI.makeIStoreSku(pointer.getPointer(0))

    public fun setValue(value: IStoreSku_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoreSku {
    public val __960961239_Ptr: Pointer?

    public val _960961239_VtblPtr: Pointer?
      get() = __960961239_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StoreId(): String? {
      val fnPtr = _960961239_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__960961239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Language(): String? {
      val fnPtr = _960961239_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__960961239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Title(): String? {
      val fnPtr = _960961239_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__960961239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Description(): String? {
      val fnPtr = _960961239_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__960961239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_IsTrial(): Boolean {
      val fnPtr = _960961239_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__960961239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_CustomDeveloperData(): String? {
      val fnPtr = _960961239_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__960961239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Images(): IVectorView<StoreImage?>? {
      val fnPtr = _960961239_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<StoreImage?>>()
      val hr = fn.invokeHR(arrayOf(__960961239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<StoreImage?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_Videos(): IVectorView<StoreVideo?>? {
      val fnPtr = _960961239_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<StoreVideo?>>()
      val hr = fn.invokeHR(arrayOf(__960961239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<StoreVideo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_Availabilities(): IVectorView<StoreAvailability?>? {
      val fnPtr = _960961239_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<StoreAvailability?>>()
      val hr = fn.invokeHR(arrayOf(__960961239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<StoreAvailability?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_Price(): StorePrice? {
      val fnPtr = _960961239_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorePrice>()
      val hr = fn.invokeHR(arrayOf(__960961239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorePrice>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_ExtendedJsonData(): String? {
      val fnPtr = _960961239_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__960961239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_IsInUserCollection(): Boolean {
      val fnPtr = _960961239_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__960961239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun get_BundledSkus(): IVectorView<String?>? {
      val fnPtr = _960961239_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__960961239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_CollectionData(): StoreCollectionData? {
      val fnPtr = _960961239_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StoreCollectionData>()
      val hr = fn.invokeHR(arrayOf(__960961239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StoreCollectionData>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun GetIsInstalledAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _960961239_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__960961239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun RequestPurchaseAsync(): IAsyncOperation<StorePurchaseResult?>? {
      val fnPtr = _960961239_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorePurchaseResult?>>()
      val hr = fn.invokeHR(arrayOf(__960961239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorePurchaseResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun RequestPurchaseAsync(storePurchaseProperties: StorePurchaseProperties?):
        IAsyncOperation<StorePurchaseResult?>? {
      val fnPtr = _960961239_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorePurchaseResult?>>()
      val hr = fn.invokeHR(arrayOf(__960961239_Ptr, marshalToNative(storePurchaseProperties),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorePurchaseResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_IsSubscription(): Boolean {
      val fnPtr = _960961239_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__960961239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(18)
    public override fun get_SubscriptionInfo(): StoreSubscriptionInfo? {
      val fnPtr = _960961239_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StoreSubscriptionInfo>()
      val hr = fn.invokeHR(arrayOf(__960961239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StoreSubscriptionInfo>(result.getValue())
      return resultValue
    }
  }

  public class IStoreSku_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __960961239_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoreSku, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("397e6f5544404f03863c91f3fec83d79")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoreSku(ptr: Pointer?): WithDefault = IStoreSku_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoreSku {
      val address = segment.toRawLongValue()
      return makeIStoreSku(Pointer(address))
    }

    public override fun toNative(obj: IStoreSku): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__960961239_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoreSku): Array<IStoreSku?> = (elements as
        Array<IStoreSku?>).castToImpl<IStoreSku,IStoreSku_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoreSku?> = arrayOfNulls<IStoreSku_Impl>(size)
        as Array<IStoreSku?>
  }
}
