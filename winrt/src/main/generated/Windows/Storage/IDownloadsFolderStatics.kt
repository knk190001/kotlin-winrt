package Windows.Storage

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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDownloadsFolderStatics.ABI::class)
@Signature("{27862ed0-404e-47df-a1e2-e37308be7b37}")
@Guid("27862ed0404e47dfa1e2e37308be7b37")
@WinRTInterface("27862ed0404e47dfa1e2e37308be7b37")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDownloadsFolderStatics.ByReference::class)
public interface IDownloadsFolderStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFileAsync(desiredName: String?): IAsyncOperation<StorageFile?>?

  @InterfaceMethod(1)
  public fun CreateFolderAsync(desiredName: String?): IAsyncOperation<StorageFolder?>?

  @InterfaceMethod(2)
  public fun CreateFileAsync(desiredName: String?, option: CreationCollisionOption?):
      IAsyncOperation<StorageFile?>?

  @InterfaceMethod(3)
  public fun CreateFolderAsync(desiredName: String?, option: CreationCollisionOption?):
      IAsyncOperation<StorageFolder?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDownloadsFolderStatics> {
    public override fun getValue() = ABI.makeIDownloadsFolderStatics(pointer.getPointer(0))

    public fun setValue(value: IDownloadsFolderStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDownloadsFolderStatics {
    public val __910787621_Ptr: Pointer?

    public val _910787621_VtblPtr: Pointer?
      get() = __910787621_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFileAsync(desiredName: String?): IAsyncOperation<StorageFile?>? {
      val fnPtr = _910787621_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFile?>>()
      val hr = fn.invokeHR(arrayOf(__910787621_Ptr, marshalToNative(desiredName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFile?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFolderAsync(desiredName: String?): IAsyncOperation<StorageFolder?>? {
      val fnPtr = _910787621_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFolder?>>()
      val hr = fn.invokeHR(arrayOf(__910787621_Ptr, marshalToNative(desiredName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFolder?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateFileAsync(desiredName: String?, option: CreationCollisionOption?):
        IAsyncOperation<StorageFile?>? {
      val fnPtr = _910787621_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFile?>>()
      val hr = fn.invokeHR(arrayOf(__910787621_Ptr, marshalToNative(desiredName),
          marshalToNative(option), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFile?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateFolderAsync(desiredName: String?, option: CreationCollisionOption?):
        IAsyncOperation<StorageFolder?>? {
      val fnPtr = _910787621_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFolder?>>()
      val hr = fn.invokeHR(arrayOf(__910787621_Ptr, marshalToNative(desiredName),
          marshalToNative(option), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFolder?>>(result.getValue())
      return resultValue
    }
  }

  public class IDownloadsFolderStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __910787621_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDownloadsFolderStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("27862ed0404e47dfa1e2e37308be7b37")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDownloadsFolderStatics(ptr: Pointer?): WithDefault =
        IDownloadsFolderStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDownloadsFolderStatics {
      val address = segment.toRawLongValue()
      return makeIDownloadsFolderStatics(Pointer(address))
    }

    public override fun toNative(obj: IDownloadsFolderStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__910787621_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDownloadsFolderStatics): Array<IDownloadsFolderStatics?>
        = (elements as
        Array<IDownloadsFolderStatics?>).castToImpl<IDownloadsFolderStatics,IDownloadsFolderStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDownloadsFolderStatics?> =
        arrayOfNulls<IDownloadsFolderStatics_Impl>(size) as Array<IDownloadsFolderStatics?>
  }
}
