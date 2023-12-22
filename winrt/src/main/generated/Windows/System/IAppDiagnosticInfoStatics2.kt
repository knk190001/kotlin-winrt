package Windows.System

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IAppDiagnosticInfoStatics2.ABI::class)
@Signature("{05b24b86-1000-4c90-bb9f-7235071c50fe}")
@Guid("05b24b8610004c90bb9f7235071c50fe")
@WinRTInterface("05b24b8610004c90bb9f7235071c50fe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppDiagnosticInfoStatics2.ByReference::class)
public interface IAppDiagnosticInfoStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWatcher(): AppDiagnosticInfoWatcher?

  @InterfaceMethod(1)
  public fun RequestAccessAsync(): IAsyncOperation<DiagnosticAccessStatus?>?

  @InterfaceMethod(2)
  public fun RequestInfoForPackageAsync(packageFamilyName: String?):
      IAsyncOperation<IVector<AppDiagnosticInfo?>?>?

  @InterfaceMethod(3)
  public fun RequestInfoForAppAsync(): IAsyncOperation<IVector<AppDiagnosticInfo?>?>?

  @InterfaceMethod(4)
  public fun RequestInfoForAppAsync(appUserModelId: String?):
      IAsyncOperation<IVector<AppDiagnosticInfo?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppDiagnosticInfoStatics2> {
    public override fun getValue() = ABI.makeIAppDiagnosticInfoStatics2(pointer.getPointer(0))

    public fun setValue(value: IAppDiagnosticInfoStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppDiagnosticInfoStatics2 {
    public val __13218796_Ptr: Pointer?

    public val _13218796_VtblPtr: Pointer?
      get() = __13218796_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWatcher(): AppDiagnosticInfoWatcher? {
      val fnPtr = _13218796_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppDiagnosticInfoWatcher>()
      val hr = fn.invokeHR(arrayOf(__13218796_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppDiagnosticInfoWatcher>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RequestAccessAsync(): IAsyncOperation<DiagnosticAccessStatus?>? {
      val fnPtr = _13218796_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DiagnosticAccessStatus?>>()
      val hr = fn.invokeHR(arrayOf(__13218796_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<DiagnosticAccessStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun RequestInfoForPackageAsync(packageFamilyName: String?):
        IAsyncOperation<IVector<AppDiagnosticInfo?>?>? {
      val fnPtr = _13218796_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVector<AppDiagnosticInfo?>?>>()
      val hr = fn.invokeHR(arrayOf(__13218796_Ptr, marshalToNative(packageFamilyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVector<AppDiagnosticInfo?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun RequestInfoForAppAsync(): IAsyncOperation<IVector<AppDiagnosticInfo?>?>? {
      val fnPtr = _13218796_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVector<AppDiagnosticInfo?>?>>()
      val hr = fn.invokeHR(arrayOf(__13218796_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVector<AppDiagnosticInfo?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun RequestInfoForAppAsync(appUserModelId: String?):
        IAsyncOperation<IVector<AppDiagnosticInfo?>?>? {
      val fnPtr = _13218796_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVector<AppDiagnosticInfo?>?>>()
      val hr = fn.invokeHR(arrayOf(__13218796_Ptr, marshalToNative(appUserModelId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVector<AppDiagnosticInfo?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IAppDiagnosticInfoStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __13218796_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppDiagnosticInfoStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("05b24b8610004c90bb9f7235071c50fe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppDiagnosticInfoStatics2(ptr: Pointer?): WithDefault =
        IAppDiagnosticInfoStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppDiagnosticInfoStatics2 {
      val address = segment.toRawLongValue()
      return makeIAppDiagnosticInfoStatics2(Pointer(address))
    }

    public override fun toNative(obj: IAppDiagnosticInfoStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__13218796_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppDiagnosticInfoStatics2):
        Array<IAppDiagnosticInfoStatics2?> = (elements as
        Array<IAppDiagnosticInfoStatics2?>).castToImpl<IAppDiagnosticInfoStatics2,IAppDiagnosticInfoStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppDiagnosticInfoStatics2?> =
        arrayOfNulls<IAppDiagnosticInfoStatics2_Impl>(size) as Array<IAppDiagnosticInfoStatics2?>
  }
}
