package Windows.Security.Isolation

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

@ABIMarker(IIsolatedWindowsEnvironment3.ABI::class)
@Signature("{cb7fc7d2-d06e-4c26-8ada-dacdaaad03f5}")
@Guid("cb7fc7d2d06e4c268adadacdaaad03f5")
@WinRTInterface("cb7fc7d2d06e4c268adadacdaaad03f5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIsolatedWindowsEnvironment3.ByReference::class)
public interface IIsolatedWindowsEnvironment3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetUserInfo(): IsolatedWindowsEnvironmentUserInfo?

  @InterfaceMethod(1)
  public fun ShareFileAsync(filePath: String?,
      options: IsolatedWindowsEnvironmentShareFileRequestOptions?):
      IAsyncOperation<IsolatedWindowsEnvironmentShareFileResult?>?

  @InterfaceMethod(2)
  public fun ShareFileAsync(
    filePath: String?,
    options: IsolatedWindowsEnvironmentShareFileRequestOptions?,
    telemetryParameters: IsolatedWindowsEnvironmentTelemetryParameters?
  ): IAsyncOperation<IsolatedWindowsEnvironmentShareFileResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIsolatedWindowsEnvironment3> {
    public override fun getValue() = ABI.makeIIsolatedWindowsEnvironment3(pointer.getPointer(0))

    public fun setValue(value: IIsolatedWindowsEnvironment3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIsolatedWindowsEnvironment3 {
    public val __953605300_Ptr: Pointer?

    public val _953605300_VtblPtr: Pointer?
      get() = __953605300_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetUserInfo(): IsolatedWindowsEnvironmentUserInfo? {
      val fnPtr = _953605300_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IsolatedWindowsEnvironmentUserInfo>()
      val hr = fn.invokeHR(arrayOf(__953605300_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IsolatedWindowsEnvironmentUserInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ShareFileAsync(filePath: String?,
        options: IsolatedWindowsEnvironmentShareFileRequestOptions?):
        IAsyncOperation<IsolatedWindowsEnvironmentShareFileResult?>? {
      val fnPtr = _953605300_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<IsolatedWindowsEnvironmentShareFileResult?>>()
      val hr = fn.invokeHR(arrayOf(__953605300_Ptr, marshalToNative(filePath),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IsolatedWindowsEnvironmentShareFileResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ShareFileAsync(
      filePath: String?,
      options: IsolatedWindowsEnvironmentShareFileRequestOptions?,
      telemetryParameters: IsolatedWindowsEnvironmentTelemetryParameters?
    ): IAsyncOperation<IsolatedWindowsEnvironmentShareFileResult?>? {
      val fnPtr = _953605300_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<IsolatedWindowsEnvironmentShareFileResult?>>()
      val hr = fn.invokeHR(arrayOf(__953605300_Ptr, marshalToNative(filePath),
          marshalToNative(options), marshalToNative(telemetryParameters), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IsolatedWindowsEnvironmentShareFileResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IIsolatedWindowsEnvironment3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __953605300_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIsolatedWindowsEnvironment3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cb7fc7d2d06e4c268adadacdaaad03f5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIsolatedWindowsEnvironment3(ptr: Pointer?): WithDefault =
        IIsolatedWindowsEnvironment3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIsolatedWindowsEnvironment3 {
      val address = segment.toRawLongValue()
      return makeIIsolatedWindowsEnvironment3(Pointer(address))
    }

    public override fun toNative(obj: IIsolatedWindowsEnvironment3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__953605300_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIsolatedWindowsEnvironment3):
        Array<IIsolatedWindowsEnvironment3?> = (elements as
        Array<IIsolatedWindowsEnvironment3?>).castToImpl<IIsolatedWindowsEnvironment3,IIsolatedWindowsEnvironment3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIsolatedWindowsEnvironment3?> =
        arrayOfNulls<IIsolatedWindowsEnvironment3_Impl>(size) as
        Array<IIsolatedWindowsEnvironment3?>
  }
}
