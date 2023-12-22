package Windows.Media.DialProtocol

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

@ABIMarker(IDialApp.ABI::class)
@Signature("{555ffbd3-45b7-49f3-bbd7-302db6084646}")
@Guid("555ffbd345b749f3bbd7302db6084646")
@WinRTInterface("555ffbd345b749f3bbd7302db6084646")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDialApp.ByReference::class)
public interface IDialApp : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AppName(): String?

  @InterfaceMethod(1)
  public fun RequestLaunchAsync(appArgument: String?): IAsyncOperation<DialAppLaunchResult?>?

  @InterfaceMethod(2)
  public fun StopAsync(): IAsyncOperation<DialAppStopResult?>?

  @InterfaceMethod(3)
  public fun GetAppStateAsync(): IAsyncOperation<DialAppStateDetails?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDialApp> {
    public override fun getValue() = ABI.makeIDialApp(pointer.getPointer(0))

    public fun setValue(value: IDialApp_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDialApp {
    public val __1915240283_Ptr: Pointer?

    public val _1915240283_VtblPtr: Pointer?
      get() = __1915240283_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppName(): String? {
      val fnPtr = _1915240283_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1915240283_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RequestLaunchAsync(appArgument: String?):
        IAsyncOperation<DialAppLaunchResult?>? {
      val fnPtr = _1915240283_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DialAppLaunchResult?>>()
      val hr = fn.invokeHR(arrayOf(__1915240283_Ptr, marshalToNative(appArgument), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DialAppLaunchResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun StopAsync(): IAsyncOperation<DialAppStopResult?>? {
      val fnPtr = _1915240283_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DialAppStopResult?>>()
      val hr = fn.invokeHR(arrayOf(__1915240283_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DialAppStopResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetAppStateAsync(): IAsyncOperation<DialAppStateDetails?>? {
      val fnPtr = _1915240283_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DialAppStateDetails?>>()
      val hr = fn.invokeHR(arrayOf(__1915240283_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DialAppStateDetails?>>(result.getValue())
      return resultValue
    }
  }

  public class IDialApp_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1915240283_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDialApp, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("555ffbd345b749f3bbd7302db6084646")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDialApp(ptr: Pointer?): WithDefault = IDialApp_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDialApp {
      val address = segment.toRawLongValue()
      return makeIDialApp(Pointer(address))
    }

    public override fun toNative(obj: IDialApp): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1915240283_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDialApp): Array<IDialApp?> = (elements as
        Array<IDialApp?>).castToImpl<IDialApp,IDialApp_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDialApp?> = arrayOfNulls<IDialApp_Impl>(size) as
        Array<IDialApp?>
  }
}
