package Windows.Media.Playlists

import Windows.Foundation.Collections.IVector
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Storage.IStorageFolder
import Windows.Storage.NameCollisionOption
import Windows.Storage.StorageFile
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

@ABIMarker(IPlaylist.ABI::class)
@Signature("{803736f5-cf44-4d97-83b3-7a089e9ab663}")
@Guid("803736f5cf444d9783b37a089e9ab663")
@WinRTInterface("803736f5cf444d9783b37a089e9ab663")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlaylist.ByReference::class)
public interface IPlaylist : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Files(): IVector<StorageFile?>?

  @InterfaceMethod(1)
  public fun SaveAsync(): IAsyncAction?

  @InterfaceMethod(2)
  public fun SaveAsAsync(
    saveLocation: IStorageFolder?,
    desiredName: String?,
    option: NameCollisionOption?
  ): IAsyncOperation<StorageFile?>?

  @InterfaceMethod(3)
  public fun SaveAsAsync(
    saveLocation: IStorageFolder?,
    desiredName: String?,
    option: NameCollisionOption?,
    playlistFormat: PlaylistFormat?
  ): IAsyncOperation<StorageFile?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPlaylist> {
    public override fun getValue() = ABI.makeIPlaylist(pointer.getPointer(0))

    public fun setValue(value: IPlaylist_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlaylist {
    public val __1479725359_Ptr: Pointer?

    public val _1479725359_VtblPtr: Pointer?
      get() = __1479725359_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Files(): IVector<StorageFile?>? {
      val fnPtr = _1479725359_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<StorageFile?>>()
      val hr = fn.invokeHR(arrayOf(__1479725359_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<StorageFile?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SaveAsync(): IAsyncAction? {
      val fnPtr = _1479725359_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1479725359_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SaveAsAsync(
      saveLocation: IStorageFolder?,
      desiredName: String?,
      option: NameCollisionOption?
    ): IAsyncOperation<StorageFile?>? {
      val fnPtr = _1479725359_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFile?>>()
      val hr = fn.invokeHR(arrayOf(__1479725359_Ptr, marshalToNative(saveLocation),
          marshalToNative(desiredName), marshalToNative(option), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFile?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SaveAsAsync(
      saveLocation: IStorageFolder?,
      desiredName: String?,
      option: NameCollisionOption?,
      playlistFormat: PlaylistFormat?
    ): IAsyncOperation<StorageFile?>? {
      val fnPtr = _1479725359_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFile?>>()
      val hr = fn.invokeHR(arrayOf(__1479725359_Ptr, marshalToNative(saveLocation),
          marshalToNative(desiredName), marshalToNative(option), marshalToNative(playlistFormat),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFile?>>(result.getValue())
      return resultValue
    }
  }

  public class IPlaylist_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1479725359_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlaylist, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("803736f5cf444d9783b37a089e9ab663")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlaylist(ptr: Pointer?): WithDefault = IPlaylist_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlaylist {
      val address = segment.toRawLongValue()
      return makeIPlaylist(Pointer(address))
    }

    public override fun toNative(obj: IPlaylist): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1479725359_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlaylist): Array<IPlaylist?> = (elements as
        Array<IPlaylist?>).castToImpl<IPlaylist,IPlaylist_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlaylist?> = arrayOfNulls<IPlaylist_Impl>(size)
        as Array<IPlaylist?>
  }
}
