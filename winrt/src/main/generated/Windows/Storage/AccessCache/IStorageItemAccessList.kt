package Windows.Storage.AccessCache

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStorageItemAccessList.ABI::class)
@Signature("{2caff6ad-de90-47f5-b2c3-dd36c9fdd453}")
@Guid("2caff6adde9047f5b2c3dd36c9fdd453")
@WinRTInterface("2caff6adde9047f5b2c3dd36c9fdd453")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageItemAccessList.ByReference::class)
public interface IStorageItemAccessList : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Add(`file`: IStorageItem?): String?

  @InterfaceMethod(1)
  public fun Add(`file`: IStorageItem?, metadata: String?): String?

  @InterfaceMethod(2)
  public fun AddOrReplace(token: String?, `file`: IStorageItem?): Unit

  @InterfaceMethod(3)
  public fun AddOrReplace(
    token: String?,
    `file`: IStorageItem?,
    metadata: String?
  ): Unit

  @InterfaceMethod(4)
  public fun GetItemAsync(token: String?): IAsyncOperation<IStorageItem?>?

  @InterfaceMethod(5)
  public fun GetFileAsync(token: String?): IAsyncOperation<StorageFile?>?

  @InterfaceMethod(6)
  public fun GetFolderAsync(token: String?): IAsyncOperation<StorageFolder?>?

  @InterfaceMethod(7)
  public fun GetItemAsync(token: String?, options: AccessCacheOptions?):
      IAsyncOperation<IStorageItem?>?

  @InterfaceMethod(8)
  public fun GetFileAsync(token: String?, options: AccessCacheOptions?):
      IAsyncOperation<StorageFile?>?

  @InterfaceMethod(9)
  public fun GetFolderAsync(token: String?, options: AccessCacheOptions?):
      IAsyncOperation<StorageFolder?>?

  @InterfaceMethod(10)
  public fun Remove(token: String?): Unit

  @InterfaceMethod(11)
  public fun ContainsItem(token: String?): Boolean

  @InterfaceMethod(12)
  public fun Clear(): Unit

  @InterfaceMethod(13)
  public fun CheckAccess(`file`: IStorageItem?): Boolean

  @InterfaceMethod(14)
  public fun get_Entries(): AccessListEntryView?

  @InterfaceMethod(15)
  public fun get_MaximumItemsAllowed(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageItemAccessList> {
    public override fun getValue() = ABI.makeIStorageItemAccessList(pointer.getPointer(0))

    public fun setValue(value: IStorageItemAccessList_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageItemAccessList {
    public val __178972825_Ptr: Pointer?

    public val _178972825_VtblPtr: Pointer?
      get() = __178972825_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Add(`file`: IStorageItem?): String? {
      val fnPtr = _178972825_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__178972825_Ptr, marshalToNative(file), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Add(`file`: IStorageItem?, metadata: String?): String? {
      val fnPtr = _178972825_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__178972825_Ptr, marshalToNative(file),
          marshalToNative(metadata), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun AddOrReplace(token: String?, `file`: IStorageItem?): Unit {
      val fnPtr = _178972825_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__178972825_Ptr, marshalToNative(token), marshalToNative(file),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun AddOrReplace(
      token: String?,
      `file`: IStorageItem?,
      metadata: String?
    ): Unit {
      val fnPtr = _178972825_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__178972825_Ptr, marshalToNative(token), marshalToNative(file),
          marshalToNative(metadata),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun GetItemAsync(token: String?): IAsyncOperation<IStorageItem?>? {
      val fnPtr = _178972825_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IStorageItem?>>()
      val hr = fn.invokeHR(arrayOf(__178972825_Ptr, marshalToNative(token), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IStorageItem?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetFileAsync(token: String?): IAsyncOperation<StorageFile?>? {
      val fnPtr = _178972825_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFile?>>()
      val hr = fn.invokeHR(arrayOf(__178972825_Ptr, marshalToNative(token), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFile?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetFolderAsync(token: String?): IAsyncOperation<StorageFolder?>? {
      val fnPtr = _178972825_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFolder?>>()
      val hr = fn.invokeHR(arrayOf(__178972825_Ptr, marshalToNative(token), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFolder?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetItemAsync(token: String?, options: AccessCacheOptions?):
        IAsyncOperation<IStorageItem?>? {
      val fnPtr = _178972825_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IStorageItem?>>()
      val hr = fn.invokeHR(arrayOf(__178972825_Ptr, marshalToNative(token),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IStorageItem?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun GetFileAsync(token: String?, options: AccessCacheOptions?):
        IAsyncOperation<StorageFile?>? {
      val fnPtr = _178972825_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFile?>>()
      val hr = fn.invokeHR(arrayOf(__178972825_Ptr, marshalToNative(token),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFile?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun GetFolderAsync(token: String?, options: AccessCacheOptions?):
        IAsyncOperation<StorageFolder?>? {
      val fnPtr = _178972825_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFolder?>>()
      val hr = fn.invokeHR(arrayOf(__178972825_Ptr, marshalToNative(token),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFolder?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun Remove(token: String?): Unit {
      val fnPtr = _178972825_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__178972825_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun ContainsItem(token: String?): Boolean {
      val fnPtr = _178972825_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__178972825_Ptr, marshalToNative(token), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun Clear(): Unit {
      val fnPtr = _178972825_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__178972825_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun CheckAccess(`file`: IStorageItem?): Boolean {
      val fnPtr = _178972825_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__178972825_Ptr, marshalToNative(file), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun get_Entries(): AccessListEntryView? {
      val fnPtr = _178972825_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AccessListEntryView>()
      val hr = fn.invokeHR(arrayOf(__178972825_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AccessListEntryView>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_MaximumItemsAllowed(): WinDef.UINT {
      val fnPtr = _178972825_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__178972825_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IStorageItemAccessList_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __178972825_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageItemAccessList, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2caff6adde9047f5b2c3dd36c9fdd453")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageItemAccessList(ptr: Pointer?): WithDefault =
        IStorageItemAccessList_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageItemAccessList {
      val address = segment.toRawLongValue()
      return makeIStorageItemAccessList(Pointer(address))
    }

    public override fun toNative(obj: IStorageItemAccessList): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__178972825_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageItemAccessList): Array<IStorageItemAccessList?> =
        (elements as
        Array<IStorageItemAccessList?>).castToImpl<IStorageItemAccessList,IStorageItemAccessList_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageItemAccessList?> =
        arrayOfNulls<IStorageItemAccessList_Impl>(size) as Array<IStorageItemAccessList?>
  }
}
