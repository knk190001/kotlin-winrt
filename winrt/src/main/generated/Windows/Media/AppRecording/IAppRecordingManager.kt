package Windows.Media.AppRecording

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.DateTime
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TimeSpan
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

@ABIMarker(IAppRecordingManager.ABI::class)
@Signature("{e7e26076-a044-48e2-a512-3094d574c7cc}")
@Guid("e7e26076a04448e2a5123094d574c7cc")
@WinRTInterface("e7e26076a04448e2a5123094d574c7cc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppRecordingManager.ByReference::class)
public interface IAppRecordingManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetStatus(): AppRecordingStatus?

  @InterfaceMethod(1)
  public fun StartRecordingToFileAsync(`file`: StorageFile?): IAsyncOperation<AppRecordingResult?>?

  @InterfaceMethod(2)
  public fun RecordTimeSpanToFileAsync(
    startTime: DateTime?,
    duration: TimeSpan?,
    `file`: StorageFile?
  ): IAsyncOperation<AppRecordingResult?>?

  @InterfaceMethod(3)
  public fun get_SupportedScreenshotMediaEncodingSubtypes(): IVectorView<String?>?

  @InterfaceMethod(4)
  public fun SaveScreenshotToFilesAsync(
    folder: StorageFolder?,
    filenamePrefix: String?,
    option: AppRecordingSaveScreenshotOption?,
    requestedFormats: IIterable<String?>?
  ): IAsyncOperation<AppRecordingSaveScreenshotResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppRecordingManager> {
    public override fun getValue() = ABI.makeIAppRecordingManager(pointer.getPointer(0))

    public fun setValue(value: IAppRecordingManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppRecordingManager {
    public val __1210258055_Ptr: Pointer?

    public val _1210258055_VtblPtr: Pointer?
      get() = __1210258055_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetStatus(): AppRecordingStatus? {
      val fnPtr = _1210258055_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppRecordingStatus>()
      val hr = fn.invokeHR(arrayOf(__1210258055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppRecordingStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun StartRecordingToFileAsync(`file`: StorageFile?):
        IAsyncOperation<AppRecordingResult?>? {
      val fnPtr = _1210258055_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppRecordingResult?>>()
      val hr = fn.invokeHR(arrayOf(__1210258055_Ptr, marshalToNative(file), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<AppRecordingResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun RecordTimeSpanToFileAsync(
      startTime: DateTime?,
      duration: TimeSpan?,
      `file`: StorageFile?
    ): IAsyncOperation<AppRecordingResult?>? {
      val fnPtr = _1210258055_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppRecordingResult?>>()
      val hr = fn.invokeHR(arrayOf(__1210258055_Ptr, marshalToNative(startTime),
          marshalToNative(duration), marshalToNative(file), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<AppRecordingResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SupportedScreenshotMediaEncodingSubtypes(): IVectorView<String?>? {
      val fnPtr = _1210258055_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1210258055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun SaveScreenshotToFilesAsync(
      folder: StorageFolder?,
      filenamePrefix: String?,
      option: AppRecordingSaveScreenshotOption?,
      requestedFormats: IIterable<String?>?
    ): IAsyncOperation<AppRecordingSaveScreenshotResult?>? {
      val fnPtr = _1210258055_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppRecordingSaveScreenshotResult?>>()
      val hr = fn.invokeHR(arrayOf(__1210258055_Ptr, marshalToNative(folder),
          marshalToNative(filenamePrefix), marshalToNative(option),
          marshalToNative(requestedFormats), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<AppRecordingSaveScreenshotResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IAppRecordingManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1210258055_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppRecordingManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e7e26076a04448e2a5123094d574c7cc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppRecordingManager(ptr: Pointer?): WithDefault = IAppRecordingManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppRecordingManager {
      val address = segment.toRawLongValue()
      return makeIAppRecordingManager(Pointer(address))
    }

    public override fun toNative(obj: IAppRecordingManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1210258055_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppRecordingManager): Array<IAppRecordingManager?> =
        (elements as
        Array<IAppRecordingManager?>).castToImpl<IAppRecordingManager,IAppRecordingManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppRecordingManager?> =
        arrayOfNulls<IAppRecordingManager_Impl>(size) as Array<IAppRecordingManager?>
  }
}
