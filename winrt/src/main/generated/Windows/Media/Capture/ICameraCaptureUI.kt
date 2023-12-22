package Windows.Media.Capture

import Windows.Foundation.IAsyncOperation
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICameraCaptureUI.ABI::class)
@Signature("{48587540-6f93-4bb4-b8f3-e89e48948c91}")
@Guid("485875406f934bb4b8f3e89e48948c91")
@WinRTInterface("485875406f934bb4b8f3e89e48948c91")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICameraCaptureUI.ByReference::class)
public interface ICameraCaptureUI : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PhotoSettings(): CameraCaptureUIPhotoCaptureSettings?

  @InterfaceMethod(1)
  public fun get_VideoSettings(): CameraCaptureUIVideoCaptureSettings?

  @InterfaceMethod(2)
  public fun CaptureFileAsync(mode: CameraCaptureUIMode?): IAsyncOperation<StorageFile?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICameraCaptureUI> {
    public override fun getValue() = ABI.makeICameraCaptureUI(pointer.getPointer(0))

    public fun setValue(value: ICameraCaptureUI_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICameraCaptureUI {
    public val __153247779_Ptr: Pointer?

    public val _153247779_VtblPtr: Pointer?
      get() = __153247779_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PhotoSettings(): CameraCaptureUIPhotoCaptureSettings? {
      val fnPtr = _153247779_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CameraCaptureUIPhotoCaptureSettings>()
      val hr = fn.invokeHR(arrayOf(__153247779_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CameraCaptureUIPhotoCaptureSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_VideoSettings(): CameraCaptureUIVideoCaptureSettings? {
      val fnPtr = _153247779_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CameraCaptureUIVideoCaptureSettings>()
      val hr = fn.invokeHR(arrayOf(__153247779_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CameraCaptureUIVideoCaptureSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CaptureFileAsync(mode: CameraCaptureUIMode?):
        IAsyncOperation<StorageFile?>? {
      val fnPtr = _153247779_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFile?>>()
      val hr = fn.invokeHR(arrayOf(__153247779_Ptr, marshalToNative(mode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFile?>>(result.getValue())
      return resultValue
    }
  }

  public class ICameraCaptureUI_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __153247779_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICameraCaptureUI, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("485875406f934bb4b8f3e89e48948c91")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICameraCaptureUI(ptr: Pointer?): WithDefault = ICameraCaptureUI_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICameraCaptureUI {
      val address = segment.toRawLongValue()
      return makeICameraCaptureUI(Pointer(address))
    }

    public override fun toNative(obj: ICameraCaptureUI): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__153247779_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICameraCaptureUI): Array<ICameraCaptureUI?> = (elements as
        Array<ICameraCaptureUI?>).castToImpl<ICameraCaptureUI,ICameraCaptureUI_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICameraCaptureUI?> =
        arrayOfNulls<ICameraCaptureUI_Impl>(size) as Array<ICameraCaptureUI?>
  }
}
