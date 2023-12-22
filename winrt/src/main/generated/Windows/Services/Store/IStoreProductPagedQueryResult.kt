package Windows.Services.Store

import Windows.Foundation.Collections.IMapView
import Windows.Foundation.HResult
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

@ABIMarker(IStoreProductPagedQueryResult.ABI::class)
@Signature("{c92718c5-4dd5-4869-a462-ecc6872e43c5}")
@Guid("c92718c54dd54869a462ecc6872e43c5")
@WinRTInterface("c92718c54dd54869a462ecc6872e43c5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoreProductPagedQueryResult.ByReference::class)
public interface IStoreProductPagedQueryResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Products(): IMapView<String?, StoreProduct?>?

  @InterfaceMethod(1)
  public fun get_HasMoreResults(): Boolean

  @InterfaceMethod(2)
  public fun get_ExtendedError(): HResult?

  @InterfaceMethod(3)
  public fun GetNextAsync(): IAsyncOperation<StoreProductPagedQueryResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStoreProductPagedQueryResult> {
    public override fun getValue() = ABI.makeIStoreProductPagedQueryResult(pointer.getPointer(0))

    public fun setValue(value: IStoreProductPagedQueryResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoreProductPagedQueryResult {
    public val __1015896363_Ptr: Pointer?

    public val _1015896363_VtblPtr: Pointer?
      get() = __1015896363_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Products(): IMapView<String?, StoreProduct?>? {
      val fnPtr = _1015896363_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, StoreProduct?>>()
      val hr = fn.invokeHR(arrayOf(__1015896363_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, StoreProduct?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HasMoreResults(): Boolean {
      val fnPtr = _1015896363_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1015896363_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _1015896363_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__1015896363_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetNextAsync(): IAsyncOperation<StoreProductPagedQueryResult?>? {
      val fnPtr = _1015896363_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StoreProductPagedQueryResult?>>()
      val hr = fn.invokeHR(arrayOf(__1015896363_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<StoreProductPagedQueryResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IStoreProductPagedQueryResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1015896363_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoreProductPagedQueryResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c92718c54dd54869a462ecc6872e43c5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoreProductPagedQueryResult(ptr: Pointer?): WithDefault =
        IStoreProductPagedQueryResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoreProductPagedQueryResult {
      val address = segment.toRawLongValue()
      return makeIStoreProductPagedQueryResult(Pointer(address))
    }

    public override fun toNative(obj: IStoreProductPagedQueryResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1015896363_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoreProductPagedQueryResult):
        Array<IStoreProductPagedQueryResult?> = (elements as
        Array<IStoreProductPagedQueryResult?>).castToImpl<IStoreProductPagedQueryResult,IStoreProductPagedQueryResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoreProductPagedQueryResult?> =
        arrayOfNulls<IStoreProductPagedQueryResult_Impl>(size) as
        Array<IStoreProductPagedQueryResult?>
  }
}
