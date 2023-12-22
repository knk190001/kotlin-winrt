package Windows.Storage.BulkAccess

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFileInformationFactory.ABI::class)
@Signature("{401d88be-960f-4d6d-a7d0-1a3861e76c83}")
@Guid("401d88be960f4d6da7d01a3861e76c83")
@WinRTInterface("401d88be960f4d6da7d01a3861e76c83")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFileInformationFactory.ByReference::class)
public interface IFileInformationFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetItemsAsync(startIndex: WinDef.UINT, maxItemsToRetrieve: WinDef.UINT):
      IAsyncOperation<IVectorView<IStorageItemInformation?>?>?

  @InterfaceMethod(1)
  public fun GetItemsAsync(): IAsyncOperation<IVectorView<IStorageItemInformation?>?>?

  @InterfaceMethod(2)
  public fun GetFilesAsync(startIndex: WinDef.UINT, maxItemsToRetrieve: WinDef.UINT):
      IAsyncOperation<IVectorView<FileInformation?>?>?

  @InterfaceMethod(3)
  public fun GetFilesAsync(): IAsyncOperation<IVectorView<FileInformation?>?>?

  @InterfaceMethod(4)
  public fun GetFoldersAsync(startIndex: WinDef.UINT, maxItemsToRetrieve: WinDef.UINT):
      IAsyncOperation<IVectorView<FolderInformation?>?>?

  @InterfaceMethod(5)
  public fun GetFoldersAsync(): IAsyncOperation<IVectorView<FolderInformation?>?>?

  @InterfaceMethod(6)
  public fun GetVirtualizedItemsVector(): IUnknown?

  @InterfaceMethod(7)
  public fun GetVirtualizedFilesVector(): IUnknown?

  @InterfaceMethod(8)
  public fun GetVirtualizedFoldersVector(): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFileInformationFactory> {
    public override fun getValue() = ABI.makeIFileInformationFactory(pointer.getPointer(0))

    public fun setValue(value: IFileInformationFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFileInformationFactory {
    public val __170837521_Ptr: Pointer?

    public val _170837521_VtblPtr: Pointer?
      get() = __170837521_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetItemsAsync(startIndex: WinDef.UINT, maxItemsToRetrieve: WinDef.UINT):
        IAsyncOperation<IVectorView<IStorageItemInformation?>?>? {
      val fnPtr = _170837521_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<IStorageItemInformation?>?>>()
      val hr = fn.invokeHR(arrayOf(__170837521_Ptr, startIndex, maxItemsToRetrieve, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<IStorageItemInformation?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetItemsAsync(): IAsyncOperation<IVectorView<IStorageItemInformation?>?>? {
      val fnPtr = _170837521_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<IStorageItemInformation?>?>>()
      val hr = fn.invokeHR(arrayOf(__170837521_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<IStorageItemInformation?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetFilesAsync(startIndex: WinDef.UINT, maxItemsToRetrieve: WinDef.UINT):
        IAsyncOperation<IVectorView<FileInformation?>?>? {
      val fnPtr = _170837521_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<FileInformation?>?>>()
      val hr = fn.invokeHR(arrayOf(__170837521_Ptr, startIndex, maxItemsToRetrieve, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<FileInformation?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetFilesAsync(): IAsyncOperation<IVectorView<FileInformation?>?>? {
      val fnPtr = _170837521_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<FileInformation?>?>>()
      val hr = fn.invokeHR(arrayOf(__170837521_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<FileInformation?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetFoldersAsync(startIndex: WinDef.UINT, maxItemsToRetrieve: WinDef.UINT):
        IAsyncOperation<IVectorView<FolderInformation?>?>? {
      val fnPtr = _170837521_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<FolderInformation?>?>>()
      val hr = fn.invokeHR(arrayOf(__170837521_Ptr, startIndex, maxItemsToRetrieve, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<FolderInformation?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetFoldersAsync(): IAsyncOperation<IVectorView<FolderInformation?>?>? {
      val fnPtr = _170837521_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<FolderInformation?>?>>()
      val hr = fn.invokeHR(arrayOf(__170837521_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<FolderInformation?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetVirtualizedItemsVector(): IUnknown? {
      val fnPtr = _170837521_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__170837521_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetVirtualizedFilesVector(): IUnknown? {
      val fnPtr = _170837521_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__170837521_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun GetVirtualizedFoldersVector(): IUnknown? {
      val fnPtr = _170837521_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__170837521_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IFileInformationFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __170837521_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFileInformationFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("401d88be960f4d6da7d01a3861e76c83")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFileInformationFactory(ptr: Pointer?): WithDefault =
        IFileInformationFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFileInformationFactory {
      val address = segment.toRawLongValue()
      return makeIFileInformationFactory(Pointer(address))
    }

    public override fun toNative(obj: IFileInformationFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__170837521_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFileInformationFactory): Array<IFileInformationFactory?>
        = (elements as
        Array<IFileInformationFactory?>).castToImpl<IFileInformationFactory,IFileInformationFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFileInformationFactory?> =
        arrayOfNulls<IFileInformationFactory_Impl>(size) as Array<IFileInformationFactory?>
  }
}
