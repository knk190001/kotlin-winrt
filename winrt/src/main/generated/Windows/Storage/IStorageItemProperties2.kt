package Windows.Storage

import Windows.Foundation.IAsyncOperation
import Windows.Storage.FileProperties.StorageItemThumbnail
import Windows.Storage.FileProperties.ThumbnailMode
import Windows.Storage.FileProperties.ThumbnailOptions
import Windows.Storage.IStorageItemProperties.ABI.IID
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IStorageItemProperties2.ABI::class)
@Signature("{8e86a951-04b9-4bd2-929d-fef3f71621d0}")
@Guid("8e86a95104b94bd2929dfef3f71621d0")
@WinRTInterface("8e86a95104b94bd2929dfef3f71621d0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageItemProperties2.ByReference::class)
public interface IStorageItemProperties2 : NativeMapped, IWinRTInterface, IStorageItemProperties {
  @InterfaceMethod(0)
  public fun GetScaledImageAsThumbnailAsync(mode: ThumbnailMode?):
      IAsyncOperation<StorageItemThumbnail?>?

  @InterfaceMethod(1)
  public fun GetScaledImageAsThumbnailAsync(mode: ThumbnailMode?, requestedSize: WinDef.UINT):
      IAsyncOperation<StorageItemThumbnail?>?

  @InterfaceMethod(2)
  public fun GetScaledImageAsThumbnailAsync(
    mode: ThumbnailMode?,
    requestedSize: WinDef.UINT,
    options: ThumbnailOptions?
  ): IAsyncOperation<StorageItemThumbnail?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageItemProperties2> {
    public override fun getValue() = ABI.makeIStorageItemProperties2(pointer.getPointer(0))

    public fun setValue(value: IStorageItemProperties2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageItemProperties2, IStorageItemProperties.WithDefault {
    public val __581517270_Ptr: Pointer?

    public val _581517270_VtblPtr: Pointer?
      get() = __581517270_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetScaledImageAsThumbnailAsync(mode: ThumbnailMode?):
        IAsyncOperation<StorageItemThumbnail?>? {
      val fnPtr = _581517270_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageItemThumbnail?>>()
      val hr = fn.invokeHR(arrayOf(__581517270_Ptr, marshalToNative(mode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageItemThumbnail?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetScaledImageAsThumbnailAsync(mode: ThumbnailMode?,
        requestedSize: WinDef.UINT): IAsyncOperation<StorageItemThumbnail?>? {
      val fnPtr = _581517270_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageItemThumbnail?>>()
      val hr = fn.invokeHR(arrayOf(__581517270_Ptr, marshalToNative(mode), requestedSize, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageItemThumbnail?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetScaledImageAsThumbnailAsync(
      mode: ThumbnailMode?,
      requestedSize: WinDef.UINT,
      options: ThumbnailOptions?
    ): IAsyncOperation<StorageItemThumbnail?>? {
      val fnPtr = _581517270_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageItemThumbnail?>>()
      val hr = fn.invokeHR(arrayOf(__581517270_Ptr, marshalToNative(mode), requestedSize,
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageItemThumbnail?>>(result.getValue())
      return resultValue
    }
  }

  public class IStorageItemProperties2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IStorageItemProperties {
    public override val __850042616_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_581517270_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __581517270_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageItemProperties2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8e86a95104b94bd2929dfef3f71621d0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageItemProperties2(ptr: Pointer?): WithDefault =
        IStorageItemProperties2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageItemProperties2 {
      val address = segment.toRawLongValue()
      return makeIStorageItemProperties2(Pointer(address))
    }

    public override fun toNative(obj: IStorageItemProperties2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__581517270_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageItemProperties2): Array<IStorageItemProperties2?>
        = (elements as
        Array<IStorageItemProperties2?>).castToImpl<IStorageItemProperties2,IStorageItemProperties2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageItemProperties2?> =
        arrayOfNulls<IStorageItemProperties2_Impl>(size) as Array<IStorageItemProperties2?>
  }
}
