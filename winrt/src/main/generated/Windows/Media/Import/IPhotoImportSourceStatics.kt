package Windows.Media.Import

import Windows.Foundation.IAsyncOperation
import Windows.Storage.IStorageFolder
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

@ABIMarker(IPhotoImportSourceStatics.ABI::class)
@Signature("{0528e586-32d8-467c-8cee-23a1b2f43e85}")
@Guid("0528e58632d8467c8cee23a1b2f43e85")
@WinRTInterface("0528e58632d8467c8cee23a1b2f43e85")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhotoImportSourceStatics.ByReference::class)
public interface IPhotoImportSourceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromIdAsync(sourceId: String?): IAsyncOperation<PhotoImportSource?>?

  @InterfaceMethod(1)
  public fun FromFolderAsync(sourceRootFolder: IStorageFolder?):
      IAsyncOperation<PhotoImportSource?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhotoImportSourceStatics> {
    public override fun getValue() = ABI.makeIPhotoImportSourceStatics(pointer.getPointer(0))

    public fun setValue(value: IPhotoImportSourceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhotoImportSourceStatics {
    public val __201464770_Ptr: Pointer?

    public val _201464770_VtblPtr: Pointer?
      get() = __201464770_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromIdAsync(sourceId: String?): IAsyncOperation<PhotoImportSource?>? {
      val fnPtr = _201464770_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PhotoImportSource?>>()
      val hr = fn.invokeHR(arrayOf(__201464770_Ptr, marshalToNative(sourceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<PhotoImportSource?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FromFolderAsync(sourceRootFolder: IStorageFolder?):
        IAsyncOperation<PhotoImportSource?>? {
      val fnPtr = _201464770_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PhotoImportSource?>>()
      val hr = fn.invokeHR(arrayOf(__201464770_Ptr, marshalToNative(sourceRootFolder), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<PhotoImportSource?>>(result.getValue())
      return resultValue
    }
  }

  public class IPhotoImportSourceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __201464770_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhotoImportSourceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0528e58632d8467c8cee23a1b2f43e85")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhotoImportSourceStatics(ptr: Pointer?): WithDefault =
        IPhotoImportSourceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhotoImportSourceStatics {
      val address = segment.toRawLongValue()
      return makeIPhotoImportSourceStatics(Pointer(address))
    }

    public override fun toNative(obj: IPhotoImportSourceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__201464770_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhotoImportSourceStatics):
        Array<IPhotoImportSourceStatics?> = (elements as
        Array<IPhotoImportSourceStatics?>).castToImpl<IPhotoImportSourceStatics,IPhotoImportSourceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhotoImportSourceStatics?> =
        arrayOfNulls<IPhotoImportSourceStatics_Impl>(size) as Array<IPhotoImportSourceStatics?>
  }
}
