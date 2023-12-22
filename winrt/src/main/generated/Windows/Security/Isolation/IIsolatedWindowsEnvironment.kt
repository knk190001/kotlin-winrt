package Windows.Security.Isolation

import Windows.Foundation.IAsyncAction
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

@ABIMarker(IIsolatedWindowsEnvironment.ABI::class)
@Signature("{41d24597-c328-4467-b37f-4dfc6f60b6bc}")
@Guid("41d24597c3284467b37f4dfc6f60b6bc")
@WinRTInterface("41d24597c3284467b37f4dfc6f60b6bc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIsolatedWindowsEnvironment.ByReference::class)
public interface IIsolatedWindowsEnvironment : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun StartProcessSilentlyAsync(
    hostExePath: String?,
    arguments: String?,
    activator: IsolatedWindowsEnvironmentActivator?
  ): IAsyncOperation<IsolatedWindowsEnvironmentStartProcessResult?>?

  @InterfaceMethod(2)
  public fun StartProcessSilentlyAsync(
    hostExePath: String?,
    arguments: String?,
    activator: IsolatedWindowsEnvironmentActivator?,
    telemetryParameters: IsolatedWindowsEnvironmentTelemetryParameters?
  ): IAsyncOperation<IsolatedWindowsEnvironmentStartProcessResult?>?

  @InterfaceMethod(3)
  public fun ShareFolderAsync(hostFolder: String?,
      requestOptions: IsolatedWindowsEnvironmentShareFolderRequestOptions?):
      IAsyncOperation<IsolatedWindowsEnvironmentShareFolderResult?>?

  @InterfaceMethod(4)
  public fun ShareFolderAsync(
    hostFolder: String?,
    requestOptions: IsolatedWindowsEnvironmentShareFolderRequestOptions?,
    telemetryParameters: IsolatedWindowsEnvironmentTelemetryParameters?
  ): IAsyncOperation<IsolatedWindowsEnvironmentShareFolderResult?>?

  @InterfaceMethod(5)
  public fun LaunchFileWithUIAsync(
    appExePath: String?,
    argumentsTemplate: String?,
    filePath: String?
  ): IAsyncOperation<IsolatedWindowsEnvironmentLaunchFileResult?>?

  @InterfaceMethod(6)
  public fun LaunchFileWithUIAsync(
    appExePath: String?,
    argumentsTemplate: String?,
    filePath: String?,
    telemetryParameters: IsolatedWindowsEnvironmentTelemetryParameters?
  ): IAsyncOperation<IsolatedWindowsEnvironmentLaunchFileResult?>?

  @InterfaceMethod(7)
  public fun TerminateAsync(): IAsyncAction?

  @InterfaceMethod(8)
  public fun TerminateAsync(telemetryParameters: IsolatedWindowsEnvironmentTelemetryParameters?):
      IAsyncAction?

  @InterfaceMethod(9)
  public fun RegisterMessageReceiver(receiverId: com.sun.jna.platform.win32.Guid.GUID?,
      messageReceivedCallback: MessageReceivedCallback?): Unit

  @InterfaceMethod(10)
  public fun UnregisterMessageReceiver(receiverId: com.sun.jna.platform.win32.Guid.GUID?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIsolatedWindowsEnvironment> {
    public override fun getValue() = ABI.makeIIsolatedWindowsEnvironment(pointer.getPointer(0))

    public fun setValue(value: IIsolatedWindowsEnvironment_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIsolatedWindowsEnvironment {
    public val __2047448519_Ptr: Pointer?

    public val _2047448519_VtblPtr: Pointer?
      get() = __2047448519_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _2047448519_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2047448519_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun StartProcessSilentlyAsync(
      hostExePath: String?,
      arguments: String?,
      activator: IsolatedWindowsEnvironmentActivator?
    ): IAsyncOperation<IsolatedWindowsEnvironmentStartProcessResult?>? {
      val fnPtr = _2047448519_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<IsolatedWindowsEnvironmentStartProcessResult?>>()
      val hr = fn.invokeHR(arrayOf(__2047448519_Ptr, marshalToNative(hostExePath),
          marshalToNative(arguments), marshalToNative(activator), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IsolatedWindowsEnvironmentStartProcessResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun StartProcessSilentlyAsync(
      hostExePath: String?,
      arguments: String?,
      activator: IsolatedWindowsEnvironmentActivator?,
      telemetryParameters: IsolatedWindowsEnvironmentTelemetryParameters?
    ): IAsyncOperation<IsolatedWindowsEnvironmentStartProcessResult?>? {
      val fnPtr = _2047448519_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<IsolatedWindowsEnvironmentStartProcessResult?>>()
      val hr = fn.invokeHR(arrayOf(__2047448519_Ptr, marshalToNative(hostExePath),
          marshalToNative(arguments), marshalToNative(activator),
          marshalToNative(telemetryParameters), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IsolatedWindowsEnvironmentStartProcessResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ShareFolderAsync(hostFolder: String?,
        requestOptions: IsolatedWindowsEnvironmentShareFolderRequestOptions?):
        IAsyncOperation<IsolatedWindowsEnvironmentShareFolderResult?>? {
      val fnPtr = _2047448519_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<IsolatedWindowsEnvironmentShareFolderResult?>>()
      val hr = fn.invokeHR(arrayOf(__2047448519_Ptr, marshalToNative(hostFolder),
          marshalToNative(requestOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IsolatedWindowsEnvironmentShareFolderResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun ShareFolderAsync(
      hostFolder: String?,
      requestOptions: IsolatedWindowsEnvironmentShareFolderRequestOptions?,
      telemetryParameters: IsolatedWindowsEnvironmentTelemetryParameters?
    ): IAsyncOperation<IsolatedWindowsEnvironmentShareFolderResult?>? {
      val fnPtr = _2047448519_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<IsolatedWindowsEnvironmentShareFolderResult?>>()
      val hr = fn.invokeHR(arrayOf(__2047448519_Ptr, marshalToNative(hostFolder),
          marshalToNative(requestOptions), marshalToNative(telemetryParameters), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IsolatedWindowsEnvironmentShareFolderResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun LaunchFileWithUIAsync(
      appExePath: String?,
      argumentsTemplate: String?,
      filePath: String?
    ): IAsyncOperation<IsolatedWindowsEnvironmentLaunchFileResult?>? {
      val fnPtr = _2047448519_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<IsolatedWindowsEnvironmentLaunchFileResult?>>()
      val hr = fn.invokeHR(arrayOf(__2047448519_Ptr, marshalToNative(appExePath),
          marshalToNative(argumentsTemplate), marshalToNative(filePath), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IsolatedWindowsEnvironmentLaunchFileResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun LaunchFileWithUIAsync(
      appExePath: String?,
      argumentsTemplate: String?,
      filePath: String?,
      telemetryParameters: IsolatedWindowsEnvironmentTelemetryParameters?
    ): IAsyncOperation<IsolatedWindowsEnvironmentLaunchFileResult?>? {
      val fnPtr = _2047448519_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<IsolatedWindowsEnvironmentLaunchFileResult?>>()
      val hr = fn.invokeHR(arrayOf(__2047448519_Ptr, marshalToNative(appExePath),
          marshalToNative(argumentsTemplate), marshalToNative(filePath),
          marshalToNative(telemetryParameters), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IsolatedWindowsEnvironmentLaunchFileResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun TerminateAsync(): IAsyncAction? {
      val fnPtr = _2047448519_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2047448519_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override
        fun TerminateAsync(telemetryParameters: IsolatedWindowsEnvironmentTelemetryParameters?):
        IAsyncAction? {
      val fnPtr = _2047448519_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2047448519_Ptr, marshalToNative(telemetryParameters), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun RegisterMessageReceiver(receiverId: com.sun.jna.platform.win32.Guid.GUID?,
        messageReceivedCallback: MessageReceivedCallback?): Unit {
      val fnPtr = _2047448519_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2047448519_Ptr, marshalToNative(receiverId),
          marshalToNative(messageReceivedCallback),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override
        fun UnregisterMessageReceiver(receiverId: com.sun.jna.platform.win32.Guid.GUID?): Unit {
      val fnPtr = _2047448519_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2047448519_Ptr, marshalToNative(receiverId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IIsolatedWindowsEnvironment_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2047448519_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIsolatedWindowsEnvironment, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("41d24597c3284467b37f4dfc6f60b6bc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIsolatedWindowsEnvironment(ptr: Pointer?): WithDefault =
        IIsolatedWindowsEnvironment_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIsolatedWindowsEnvironment {
      val address = segment.toRawLongValue()
      return makeIIsolatedWindowsEnvironment(Pointer(address))
    }

    public override fun toNative(obj: IIsolatedWindowsEnvironment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2047448519_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIsolatedWindowsEnvironment):
        Array<IIsolatedWindowsEnvironment?> = (elements as
        Array<IIsolatedWindowsEnvironment?>).castToImpl<IIsolatedWindowsEnvironment,IIsolatedWindowsEnvironment_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIsolatedWindowsEnvironment?> =
        arrayOfNulls<IIsolatedWindowsEnvironment_Impl>(size) as Array<IIsolatedWindowsEnvironment?>
  }
}
