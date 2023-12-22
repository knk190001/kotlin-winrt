package Windows.Storage

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
import Windows.Storage.IStorageItem.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IStorageFolder.ABI::class)
@Signature("{72d1cb78-b3ef-4f75-a80b-6fd9dae2944b}")
@Guid("72d1cb78b3ef4f75a80b6fd9dae2944b")
@WinRTInterface("72d1cb78b3ef4f75a80b6fd9dae2944b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageFolder.ByReference::class)
public interface IStorageFolder : NativeMapped, IWinRTInterface, IStorageItem {
  @InterfaceMethod(0)
  public fun CreateFileAsync(desiredName: String?): IAsyncOperation<StorageFile?>?

  @InterfaceMethod(1)
  public fun CreateFileAsync(desiredName: String?, options: CreationCollisionOption?):
      IAsyncOperation<StorageFile?>?

  @InterfaceMethod(2)
  public fun CreateFolderAsync(desiredName: String?): IAsyncOperation<StorageFolder?>?

  @InterfaceMethod(3)
  public fun CreateFolderAsync(desiredName: String?, options: CreationCollisionOption?):
      IAsyncOperation<StorageFolder?>?

  @InterfaceMethod(4)
  public fun GetFileAsync(name: String?): IAsyncOperation<StorageFile?>?

  @InterfaceMethod(5)
  public fun GetFolderAsync(name: String?): IAsyncOperation<StorageFolder?>?

  @InterfaceMethod(6)
  public fun GetItemAsync(name: String?): IAsyncOperation<IStorageItem?>?

  @InterfaceMethod(7)
  public fun GetFilesAsync(): IAsyncOperation<IVectorView<StorageFile?>?>?

  @InterfaceMethod(8)
  public fun GetFoldersAsync(): IAsyncOperation<IVectorView<StorageFolder?>?>?

  @InterfaceMethod(9)
  public fun GetItemsAsync(): IAsyncOperation<IVectorView<IStorageItem?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IStorageFolder>
      {
    public override fun getValue() = ABI.makeIStorageFolder(pointer.getPointer(0))

    public fun setValue(value: IStorageFolder_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageFolder, IStorageItem.WithDefault {
    public val __1926392112_Ptr: Pointer?

    public val _1926392112_VtblPtr: Pointer?
      get() = __1926392112_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFileAsync(desiredName: String?): IAsyncOperation<StorageFile?>? {
      val fnPtr = _1926392112_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFile?>>()
      val hr = fn.invokeHR(arrayOf(__1926392112_Ptr, marshalToNative(desiredName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFile?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFileAsync(desiredName: String?, options: CreationCollisionOption?):
        IAsyncOperation<StorageFile?>? {
      val fnPtr = _1926392112_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFile?>>()
      val hr = fn.invokeHR(arrayOf(__1926392112_Ptr, marshalToNative(desiredName),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFile?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateFolderAsync(desiredName: String?): IAsyncOperation<StorageFolder?>? {
      val fnPtr = _1926392112_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFolder?>>()
      val hr = fn.invokeHR(arrayOf(__1926392112_Ptr, marshalToNative(desiredName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFolder?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateFolderAsync(desiredName: String?, options: CreationCollisionOption?):
        IAsyncOperation<StorageFolder?>? {
      val fnPtr = _1926392112_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFolder?>>()
      val hr = fn.invokeHR(arrayOf(__1926392112_Ptr, marshalToNative(desiredName),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFolder?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetFileAsync(name: String?): IAsyncOperation<StorageFile?>? {
      val fnPtr = _1926392112_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFile?>>()
      val hr = fn.invokeHR(arrayOf(__1926392112_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFile?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetFolderAsync(name: String?): IAsyncOperation<StorageFolder?>? {
      val fnPtr = _1926392112_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFolder?>>()
      val hr = fn.invokeHR(arrayOf(__1926392112_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFolder?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetItemAsync(name: String?): IAsyncOperation<IStorageItem?>? {
      val fnPtr = _1926392112_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IStorageItem?>>()
      val hr = fn.invokeHR(arrayOf(__1926392112_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IStorageItem?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetFilesAsync(): IAsyncOperation<IVectorView<StorageFile?>?>? {
      val fnPtr = _1926392112_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<StorageFile?>?>>()
      val hr = fn.invokeHR(arrayOf(__1926392112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<StorageFile?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun GetFoldersAsync(): IAsyncOperation<IVectorView<StorageFolder?>?>? {
      val fnPtr = _1926392112_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<StorageFolder?>?>>()
      val hr = fn.invokeHR(arrayOf(__1926392112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<StorageFolder?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun GetItemsAsync(): IAsyncOperation<IVectorView<IStorageItem?>?>? {
      val fnPtr = _1926392112_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<IStorageItem?>?>>()
      val hr = fn.invokeHR(arrayOf(__1926392112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<IStorageItem?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IStorageFolder_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IStorageItem {
    public override val __507586037_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1926392112_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1926392112_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageFolder, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("72d1cb78b3ef4f75a80b6fd9dae2944b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageFolder(ptr: Pointer?): WithDefault = IStorageFolder_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageFolder {
      val address = segment.toRawLongValue()
      return makeIStorageFolder(Pointer(address))
    }

    public override fun toNative(obj: IStorageFolder): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1926392112_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageFolder): Array<IStorageFolder?> = (elements as
        Array<IStorageFolder?>).castToImpl<IStorageFolder,IStorageFolder_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageFolder?> =
        arrayOfNulls<IStorageFolder_Impl>(size) as Array<IStorageFolder?>
  }
}
