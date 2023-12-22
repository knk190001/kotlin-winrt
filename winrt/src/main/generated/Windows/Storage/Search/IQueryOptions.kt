package Windows.Storage.Search

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVector
import Windows.Storage.FileProperties.PropertyPrefetchOptions
import Windows.Storage.FileProperties.ThumbnailMode
import Windows.Storage.FileProperties.ThumbnailOptions
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

@ABIMarker(IQueryOptions.ABI::class)
@Signature("{1e5e46ee-0f45-4838-a8e9-d0479d446c30}")
@Guid("1e5e46ee0f454838a8e9d0479d446c30")
@WinRTInterface("1e5e46ee0f454838a8e9d0479d446c30")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IQueryOptions.ByReference::class)
public interface IQueryOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FileTypeFilter(): IVector<String?>?

  @InterfaceMethod(1)
  public fun get_FolderDepth(): FolderDepth?

  @InterfaceMethod(2)
  public fun put_FolderDepth(value: FolderDepth?): Unit

  @InterfaceMethod(3)
  public fun get_ApplicationSearchFilter(): String?

  @InterfaceMethod(4)
  public fun put_ApplicationSearchFilter(value: String?): Unit

  @InterfaceMethod(5)
  public fun get_UserSearchFilter(): String?

  @InterfaceMethod(6)
  public fun put_UserSearchFilter(value: String?): Unit

  @InterfaceMethod(7)
  public fun get_Language(): String?

  @InterfaceMethod(8)
  public fun put_Language(value: String?): Unit

  @InterfaceMethod(9)
  public fun get_IndexerOption(): IndexerOption?

  @InterfaceMethod(10)
  public fun put_IndexerOption(value: IndexerOption?): Unit

  @InterfaceMethod(11)
  public fun get_SortOrder(): IVector<SortEntry?>?

  @InterfaceMethod(12)
  public fun get_GroupPropertyName(): String?

  @InterfaceMethod(13)
  public fun get_DateStackOption(): DateStackOption?

  @InterfaceMethod(14)
  public fun SaveToString(): String?

  @InterfaceMethod(15)
  public fun LoadFromString(value: String?): Unit

  @InterfaceMethod(16)
  public fun SetThumbnailPrefetch(
    mode: ThumbnailMode?,
    requestedSize: WinDef.UINT,
    options: ThumbnailOptions?
  ): Unit

  @InterfaceMethod(17)
  public fun SetPropertyPrefetch(options: PropertyPrefetchOptions?,
      propertiesToRetrieve: IIterable<String?>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IQueryOptions>
      {
    public override fun getValue() = ABI.makeIQueryOptions(pointer.getPointer(0))

    public fun setValue(value: IQueryOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IQueryOptions {
    public val __605529529_Ptr: Pointer?

    public val _605529529_VtblPtr: Pointer?
      get() = __605529529_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FileTypeFilter(): IVector<String?>? {
      val fnPtr = _605529529_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__605529529_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_FolderDepth(): FolderDepth? {
      val fnPtr = _605529529_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FolderDepth>()
      val hr = fn.invokeHR(arrayOf(__605529529_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FolderDepth>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_FolderDepth(value: FolderDepth?): Unit {
      val fnPtr = _605529529_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__605529529_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_ApplicationSearchFilter(): String? {
      val fnPtr = _605529529_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__605529529_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_ApplicationSearchFilter(value: String?): Unit {
      val fnPtr = _605529529_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__605529529_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_UserSearchFilter(): String? {
      val fnPtr = _605529529_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__605529529_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_UserSearchFilter(value: String?): Unit {
      val fnPtr = _605529529_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__605529529_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_Language(): String? {
      val fnPtr = _605529529_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__605529529_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_Language(value: String?): Unit {
      val fnPtr = _605529529_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__605529529_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_IndexerOption(): IndexerOption? {
      val fnPtr = _605529529_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IndexerOption>()
      val hr = fn.invokeHR(arrayOf(__605529529_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IndexerOption>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_IndexerOption(value: IndexerOption?): Unit {
      val fnPtr = _605529529_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__605529529_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_SortOrder(): IVector<SortEntry?>? {
      val fnPtr = _605529529_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<SortEntry?>>()
      val hr = fn.invokeHR(arrayOf(__605529529_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<SortEntry?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_GroupPropertyName(): String? {
      val fnPtr = _605529529_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__605529529_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_DateStackOption(): DateStackOption? {
      val fnPtr = _605529529_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateStackOption>()
      val hr = fn.invokeHR(arrayOf(__605529529_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateStackOption>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun SaveToString(): String? {
      val fnPtr = _605529529_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__605529529_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun LoadFromString(value: String?): Unit {
      val fnPtr = _605529529_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__605529529_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun SetThumbnailPrefetch(
      mode: ThumbnailMode?,
      requestedSize: WinDef.UINT,
      options: ThumbnailOptions?
    ): Unit {
      val fnPtr = _605529529_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__605529529_Ptr, marshalToNative(mode), requestedSize,
          marshalToNative(options),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun SetPropertyPrefetch(options: PropertyPrefetchOptions?,
        propertiesToRetrieve: IIterable<String?>?): Unit {
      val fnPtr = _605529529_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__605529529_Ptr, marshalToNative(options),
          marshalToNative(propertiesToRetrieve),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IQueryOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __605529529_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IQueryOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1e5e46ee0f454838a8e9d0479d446c30")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIQueryOptions(ptr: Pointer?): WithDefault = IQueryOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IQueryOptions {
      val address = segment.toRawLongValue()
      return makeIQueryOptions(Pointer(address))
    }

    public override fun toNative(obj: IQueryOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__605529529_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IQueryOptions): Array<IQueryOptions?> = (elements as
        Array<IQueryOptions?>).castToImpl<IQueryOptions,IQueryOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IQueryOptions?> =
        arrayOfNulls<IQueryOptions_Impl>(size) as Array<IQueryOptions?>
  }
}
