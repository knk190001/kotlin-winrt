package Windows.Foundation.Diagnostics

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

@ABIMarker(IErrorReportingSettings.ABI::class)
@Signature("{16369792-b03e-4ba1-8bb8-d28f4ab4d2c0}")
@Guid("16369792b03e4ba18bb8d28f4ab4d2c0")
@WinRTInterface("16369792b03e4ba18bb8d28f4ab4d2c0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IErrorReportingSettings.ByReference::class)
public interface IErrorReportingSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetErrorOptions(value: ErrorOptions?): Unit

  @InterfaceMethod(1)
  public fun GetErrorOptions(): ErrorOptions?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IErrorReportingSettings> {
    public override fun getValue() = ABI.makeIErrorReportingSettings(pointer.getPointer(0))

    public fun setValue(value: IErrorReportingSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IErrorReportingSettings {
    public val __1572226410_Ptr: Pointer?

    public val _1572226410_VtblPtr: Pointer?
      get() = __1572226410_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetErrorOptions(value: ErrorOptions?): Unit {
      val fnPtr = _1572226410_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1572226410_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun GetErrorOptions(): ErrorOptions? {
      val fnPtr = _1572226410_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ErrorOptions>()
      val hr = fn.invokeHR(arrayOf(__1572226410_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ErrorOptions>(result.getValue())
      return resultValue
    }
  }

  public class IErrorReportingSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1572226410_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IErrorReportingSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("16369792b03e4ba18bb8d28f4ab4d2c0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIErrorReportingSettings(ptr: Pointer?): WithDefault =
        IErrorReportingSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IErrorReportingSettings {
      val address = segment.toRawLongValue()
      return makeIErrorReportingSettings(Pointer(address))
    }

    public override fun toNative(obj: IErrorReportingSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1572226410_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IErrorReportingSettings): Array<IErrorReportingSettings?>
        = (elements as
        Array<IErrorReportingSettings?>).castToImpl<IErrorReportingSettings,IErrorReportingSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IErrorReportingSettings?> =
        arrayOfNulls<IErrorReportingSettings_Impl>(size) as Array<IErrorReportingSettings?>
  }
}
