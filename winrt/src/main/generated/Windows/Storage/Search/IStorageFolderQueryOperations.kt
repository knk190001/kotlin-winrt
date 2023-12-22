package Windows.Storage.Search

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
import Windows.Storage.IStorageItem
import Windows.Storage.StorageFile
import Windows.Storage.StorageFolder
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStorageFolderQueryOperations.ABI::class)
@Signature("{cb43ccc9-446b-4a4f-be97-757771be5203}")
@Guid("cb43ccc9446b4a4fbe97757771be5203")
@WinRTInterface("cb43ccc9446b4a4fbe97757771be5203")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageFolderQueryOperations.ByReference::class)
public interface IStorageFolderQueryOperations : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetIndexedStateAsync(): IAsyncOperation<IndexedState?>?

  @InterfaceMethod(1)
  public fun CreateFileQuery(): StorageFileQueryResult?

  @InterfaceMethod(2)
  public fun CreateFileQuery(query: CommonFileQuery?): StorageFileQueryResult?

  @InterfaceMethod(3)
  public fun CreateFileQueryWithOptions(queryOptions: QueryOptions?): StorageFileQueryResult?

  @InterfaceMethod(4)
  public fun CreateFolderQuery(): StorageFolderQueryResult?

  @InterfaceMethod(5)
  public fun CreateFolderQuery(query: CommonFolderQuery?): StorageFolderQueryResult?

  @InterfaceMethod(6)
  public fun CreateFolderQueryWithOptions(queryOptions: QueryOptions?): StorageFolderQueryResult?

  @InterfaceMethod(7)
  public fun CreateItemQuery(): StorageItemQueryResult?

  @InterfaceMethod(8)
  public fun CreateItemQueryWithOptions(queryOptions: QueryOptions?): StorageItemQueryResult?

  @InterfaceMethod(9)
  public fun GetFilesAsync(
    query: CommonFileQuery?,
    startIndex: WinDef.UINT,
    maxItemsToRetrieve: WinDef.UINT
  ): IAsyncOperation<IVectorView<StorageFile?>?>?

  @InterfaceMethod(10)
  public fun GetFilesAsync(query: CommonFileQuery?): IAsyncOperation<IVectorView<StorageFile?>?>?

  @InterfaceMethod(11)
  public fun GetFoldersAsync(
    query: CommonFolderQuery?,
    startIndex: WinDef.UINT,
    maxItemsToRetrieve: WinDef.UINT
  ): IAsyncOperation<IVectorView<StorageFolder?>?>?

  @InterfaceMethod(12)
  public fun GetFoldersAsync(query: CommonFolderQuery?):
      IAsyncOperation<IVectorView<StorageFolder?>?>?

  @InterfaceMethod(13)
  public fun GetItemsAsync(startIndex: WinDef.UINT, maxItemsToRetrieve: WinDef.UINT):
      IAsyncOperation<IVectorView<IStorageItem?>?>?

  @InterfaceMethod(14)
  public fun AreQueryOptionsSupported(queryOptions: QueryOptions?): Boolean

  @InterfaceMethod(15)
  public fun IsCommonFolderQuerySupported(query: CommonFolderQuery?): Boolean

  @InterfaceMethod(16)
  public fun IsCommonFileQuerySupported(query: CommonFileQuery?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageFolderQueryOperations> {
    public override fun getValue() = ABI.makeIStorageFolderQueryOperations(pointer.getPointer(0))

    public fun setValue(value: IStorageFolderQueryOperations_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageFolderQueryOperations {
    public val __1216874446_Ptr: Pointer?

    public val _1216874446_VtblPtr: Pointer?
      get() = __1216874446_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetIndexedStateAsync(): IAsyncOperation<IndexedState?>? {
      val fnPtr = _1216874446_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IndexedState?>>()
      val hr = fn.invokeHR(arrayOf(__1216874446_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IndexedState?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFileQuery(): StorageFileQueryResult? {
      val fnPtr = _1216874446_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFileQueryResult>()
      val hr = fn.invokeHR(arrayOf(__1216874446_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFileQueryResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateFileQuery(query: CommonFileQuery?): StorageFileQueryResult? {
      val fnPtr = _1216874446_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFileQueryResult>()
      val hr = fn.invokeHR(arrayOf(__1216874446_Ptr, marshalToNative(query), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFileQueryResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateFileQueryWithOptions(queryOptions: QueryOptions?):
        StorageFileQueryResult? {
      val fnPtr = _1216874446_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFileQueryResult>()
      val hr = fn.invokeHR(arrayOf(__1216874446_Ptr, marshalToNative(queryOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFileQueryResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateFolderQuery(): StorageFolderQueryResult? {
      val fnPtr = _1216874446_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolderQueryResult>()
      val hr = fn.invokeHR(arrayOf(__1216874446_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolderQueryResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun CreateFolderQuery(query: CommonFolderQuery?): StorageFolderQueryResult? {
      val fnPtr = _1216874446_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolderQueryResult>()
      val hr = fn.invokeHR(arrayOf(__1216874446_Ptr, marshalToNative(query), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolderQueryResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun CreateFolderQueryWithOptions(queryOptions: QueryOptions?):
        StorageFolderQueryResult? {
      val fnPtr = _1216874446_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolderQueryResult>()
      val hr = fn.invokeHR(arrayOf(__1216874446_Ptr, marshalToNative(queryOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolderQueryResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun CreateItemQuery(): StorageItemQueryResult? {
      val fnPtr = _1216874446_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageItemQueryResult>()
      val hr = fn.invokeHR(arrayOf(__1216874446_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageItemQueryResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun CreateItemQueryWithOptions(queryOptions: QueryOptions?):
        StorageItemQueryResult? {
      val fnPtr = _1216874446_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageItemQueryResult>()
      val hr = fn.invokeHR(arrayOf(__1216874446_Ptr, marshalToNative(queryOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageItemQueryResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun GetFilesAsync(
      query: CommonFileQuery?,
      startIndex: WinDef.UINT,
      maxItemsToRetrieve: WinDef.UINT
    ): IAsyncOperation<IVectorView<StorageFile?>?>? {
      val fnPtr = _1216874446_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<StorageFile?>?>>()
      val hr = fn.invokeHR(arrayOf(__1216874446_Ptr, marshalToNative(query), startIndex,
          maxItemsToRetrieve, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<StorageFile?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun GetFilesAsync(query: CommonFileQuery?):
        IAsyncOperation<IVectorView<StorageFile?>?>? {
      val fnPtr = _1216874446_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<StorageFile?>?>>()
      val hr = fn.invokeHR(arrayOf(__1216874446_Ptr, marshalToNative(query), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<StorageFile?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun GetFoldersAsync(
      query: CommonFolderQuery?,
      startIndex: WinDef.UINT,
      maxItemsToRetrieve: WinDef.UINT
    ): IAsyncOperation<IVectorView<StorageFolder?>?>? {
      val fnPtr = _1216874446_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<StorageFolder?>?>>()
      val hr = fn.invokeHR(arrayOf(__1216874446_Ptr, marshalToNative(query), startIndex,
          maxItemsToRetrieve, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<StorageFolder?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun GetFoldersAsync(query: CommonFolderQuery?):
        IAsyncOperation<IVectorView<StorageFolder?>?>? {
      val fnPtr = _1216874446_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<StorageFolder?>?>>()
      val hr = fn.invokeHR(arrayOf(__1216874446_Ptr, marshalToNative(query), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<StorageFolder?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun GetItemsAsync(startIndex: WinDef.UINT, maxItemsToRetrieve: WinDef.UINT):
        IAsyncOperation<IVectorView<IStorageItem?>?>? {
      val fnPtr = _1216874446_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<IStorageItem?>?>>()
      val hr = fn.invokeHR(arrayOf(__1216874446_Ptr, startIndex, maxItemsToRetrieve, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<IStorageItem?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun AreQueryOptionsSupported(queryOptions: QueryOptions?): Boolean {
      val fnPtr = _1216874446_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1216874446_Ptr, marshalToNative(queryOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun IsCommonFolderQuerySupported(query: CommonFolderQuery?): Boolean {
      val fnPtr = _1216874446_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1216874446_Ptr, marshalToNative(query), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(16)
    public override fun IsCommonFileQuerySupported(query: CommonFileQuery?): Boolean {
      val fnPtr = _1216874446_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1216874446_Ptr, marshalToNative(query), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IStorageFolderQueryOperations_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1216874446_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageFolderQueryOperations, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cb43ccc9446b4a4fbe97757771be5203")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageFolderQueryOperations(ptr: Pointer?): WithDefault =
        IStorageFolderQueryOperations_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageFolderQueryOperations {
      val address = segment.toRawLongValue()
      return makeIStorageFolderQueryOperations(Pointer(address))
    }

    public override fun toNative(obj: IStorageFolderQueryOperations): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1216874446_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageFolderQueryOperations):
        Array<IStorageFolderQueryOperations?> = (elements as
        Array<IStorageFolderQueryOperations?>).castToImpl<IStorageFolderQueryOperations,IStorageFolderQueryOperations_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageFolderQueryOperations?> =
        arrayOfNulls<IStorageFolderQueryOperations_Impl>(size) as
        Array<IStorageFolderQueryOperations?>
  }
}
