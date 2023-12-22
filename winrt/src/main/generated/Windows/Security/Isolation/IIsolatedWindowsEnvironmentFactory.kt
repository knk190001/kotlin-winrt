package Windows.Security.Isolation

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperationWithProgress
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

@ABIMarker(IIsolatedWindowsEnvironmentFactory.ABI::class)
@Signature("{1aca93e7-e804-454d-8466-f9897c20b0f6}")
@Guid("1aca93e7e804454d8466f9897c20b0f6")
@WinRTInterface("1aca93e7e804454d8466f9897c20b0f6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIsolatedWindowsEnvironmentFactory.ByReference::class)
public interface IIsolatedWindowsEnvironmentFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateAsync(options: IsolatedWindowsEnvironmentOptions?):
      IAsyncOperationWithProgress<IsolatedWindowsEnvironmentCreateResult?,
      IsolatedWindowsEnvironmentCreateProgress?>?

  @InterfaceMethod(1)
  public fun CreateAsync(options: IsolatedWindowsEnvironmentOptions?,
      telemetryParameters: IsolatedWindowsEnvironmentTelemetryParameters?):
      IAsyncOperationWithProgress<IsolatedWindowsEnvironmentCreateResult?,
      IsolatedWindowsEnvironmentCreateProgress?>?

  @InterfaceMethod(2)
  public fun GetById(environmentId: String?): IsolatedWindowsEnvironment?

  @InterfaceMethod(3)
  public fun FindByOwnerId(environmentOwnerId: String?): IVectorView<IsolatedWindowsEnvironment?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIsolatedWindowsEnvironmentFactory> {
    public override fun getValue() =
        ABI.makeIIsolatedWindowsEnvironmentFactory(pointer.getPointer(0))

    public fun setValue(value: IIsolatedWindowsEnvironmentFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIsolatedWindowsEnvironmentFactory {
    public val __886934205_Ptr: Pointer?

    public val _886934205_VtblPtr: Pointer?
      get() = __886934205_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateAsync(options: IsolatedWindowsEnvironmentOptions?):
        IAsyncOperationWithProgress<IsolatedWindowsEnvironmentCreateResult?,
        IsolatedWindowsEnvironmentCreateProgress?>? {
      val fnPtr = _886934205_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperationWithProgress<IsolatedWindowsEnvironmentCreateResult?,
          IsolatedWindowsEnvironmentCreateProgress?>>()
      val hr = fn.invokeHR(arrayOf(__886934205_Ptr, marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperationWithProgress<IsolatedWindowsEnvironmentCreateResult?,
          IsolatedWindowsEnvironmentCreateProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateAsync(options: IsolatedWindowsEnvironmentOptions?,
        telemetryParameters: IsolatedWindowsEnvironmentTelemetryParameters?):
        IAsyncOperationWithProgress<IsolatedWindowsEnvironmentCreateResult?,
        IsolatedWindowsEnvironmentCreateProgress?>? {
      val fnPtr = _886934205_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperationWithProgress<IsolatedWindowsEnvironmentCreateResult?,
          IsolatedWindowsEnvironmentCreateProgress?>>()
      val hr = fn.invokeHR(arrayOf(__886934205_Ptr, marshalToNative(options),
          marshalToNative(telemetryParameters), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperationWithProgress<IsolatedWindowsEnvironmentCreateResult?,
          IsolatedWindowsEnvironmentCreateProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetById(environmentId: String?): IsolatedWindowsEnvironment? {
      val fnPtr = _886934205_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IsolatedWindowsEnvironment>()
      val hr = fn.invokeHR(arrayOf(__886934205_Ptr, marshalToNative(environmentId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IsolatedWindowsEnvironment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun FindByOwnerId(environmentOwnerId: String?):
        IVectorView<IsolatedWindowsEnvironment?>? {
      val fnPtr = _886934205_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<IsolatedWindowsEnvironment?>>()
      val hr = fn.invokeHR(arrayOf(__886934205_Ptr, marshalToNative(environmentOwnerId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<IsolatedWindowsEnvironment?>>(result.getValue())
      return resultValue
    }
  }

  public class IIsolatedWindowsEnvironmentFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __886934205_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIsolatedWindowsEnvironmentFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1aca93e7e804454d8466f9897c20b0f6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIsolatedWindowsEnvironmentFactory(ptr: Pointer?): WithDefault =
        IIsolatedWindowsEnvironmentFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIsolatedWindowsEnvironmentFactory {
      val address = segment.toRawLongValue()
      return makeIIsolatedWindowsEnvironmentFactory(Pointer(address))
    }

    public override fun toNative(obj: IIsolatedWindowsEnvironmentFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__886934205_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIsolatedWindowsEnvironmentFactory):
        Array<IIsolatedWindowsEnvironmentFactory?> = (elements as
        Array<IIsolatedWindowsEnvironmentFactory?>).castToImpl<IIsolatedWindowsEnvironmentFactory,IIsolatedWindowsEnvironmentFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIsolatedWindowsEnvironmentFactory?> =
        arrayOfNulls<IIsolatedWindowsEnvironmentFactory_Impl>(size) as
        Array<IIsolatedWindowsEnvironmentFactory?>
  }
}
