package Windows.Storage.Search

import Windows.Foundation.Collections.IMapView
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
import Windows.Storage.StorageFolder
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IContentIndexerQuery.ABI::class)
@Signature("{70e3b0f8-4bfc-428a-8889-cc51da9a7b9d}")
@Guid("70e3b0f84bfc428a8889cc51da9a7b9d")
@WinRTInterface("70e3b0f84bfc428a8889cc51da9a7b9d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentIndexerQuery.ByReference::class)
public interface IContentIndexerQuery : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCountAsync(): IAsyncOperation<WinDef.UINT>?

  @InterfaceMethod(1)
  public fun GetPropertiesAsync(): IAsyncOperation<IVectorView<IMapView<String?, IUnknown?>?>?>?

  @InterfaceMethod(2)
  public fun GetPropertiesAsync(startIndex: WinDef.UINT, maxItems: WinDef.UINT):
      IAsyncOperation<IVectorView<IMapView<String?, IUnknown?>?>?>?

  @InterfaceMethod(3)
  public fun GetAsync(): IAsyncOperation<IVectorView<IIndexableContent?>?>?

  @InterfaceMethod(4)
  public fun GetAsync(startIndex: WinDef.UINT, maxItems: WinDef.UINT):
      IAsyncOperation<IVectorView<IIndexableContent?>?>?

  @InterfaceMethod(5)
  public fun get_QueryFolder(): StorageFolder?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentIndexerQuery> {
    public override fun getValue() = ABI.makeIContentIndexerQuery(pointer.getPointer(0))

    public fun setValue(value: IContentIndexerQuery_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentIndexerQuery {
    public val __95283265_Ptr: Pointer?

    public val _95283265_VtblPtr: Pointer?
      get() = __95283265_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCountAsync(): IAsyncOperation<WinDef.UINT>? {
      val fnPtr = _95283265_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__95283265_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetPropertiesAsync(): IAsyncOperation<IVectorView<IMapView<String?,
        IUnknown?>?>?>? {
      val fnPtr = _95283265_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<IMapView<String?,
          IUnknown?>?>?>>()
      val hr = fn.invokeHR(arrayOf(__95283265_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IVectorView<IMapView<String?,
          IUnknown?>?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetPropertiesAsync(startIndex: WinDef.UINT, maxItems: WinDef.UINT):
        IAsyncOperation<IVectorView<IMapView<String?, IUnknown?>?>?>? {
      val fnPtr = _95283265_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<IMapView<String?,
          IUnknown?>?>?>>()
      val hr = fn.invokeHR(arrayOf(__95283265_Ptr, startIndex, maxItems, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IVectorView<IMapView<String?,
          IUnknown?>?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetAsync(): IAsyncOperation<IVectorView<IIndexableContent?>?>? {
      val fnPtr = _95283265_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<IIndexableContent?>?>>()
      val hr = fn.invokeHR(arrayOf(__95283265_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<IIndexableContent?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetAsync(startIndex: WinDef.UINT, maxItems: WinDef.UINT):
        IAsyncOperation<IVectorView<IIndexableContent?>?>? {
      val fnPtr = _95283265_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<IIndexableContent?>?>>()
      val hr = fn.invokeHR(arrayOf(__95283265_Ptr, startIndex, maxItems, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<IIndexableContent?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_QueryFolder(): StorageFolder? {
      val fnPtr = _95283265_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__95283265_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }
  }

  public class IContentIndexerQuery_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __95283265_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentIndexerQuery, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("70e3b0f84bfc428a8889cc51da9a7b9d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentIndexerQuery(ptr: Pointer?): WithDefault = IContentIndexerQuery_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentIndexerQuery {
      val address = segment.toRawLongValue()
      return makeIContentIndexerQuery(Pointer(address))
    }

    public override fun toNative(obj: IContentIndexerQuery): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__95283265_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentIndexerQuery): Array<IContentIndexerQuery?> =
        (elements as
        Array<IContentIndexerQuery?>).castToImpl<IContentIndexerQuery,IContentIndexerQuery_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentIndexerQuery?> =
        arrayOfNulls<IContentIndexerQuery_Impl>(size) as Array<IContentIndexerQuery?>
  }
}
