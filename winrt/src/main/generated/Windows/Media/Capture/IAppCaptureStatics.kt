package Windows.Media.Capture

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

@ABIMarker(IAppCaptureStatics.ABI::class)
@Signature("{f922dd6c-0a7e-4e74-8b20-9c1f902d08a1}")
@Guid("f922dd6c0a7e4e748b209c1f902d08a1")
@WinRTInterface("f922dd6c0a7e4e748b209c1f902d08a1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppCaptureStatics.ByReference::class)
public interface IAppCaptureStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentView(): AppCapture?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppCaptureStatics> {
    public override fun getValue() = ABI.makeIAppCaptureStatics(pointer.getPointer(0))

    public fun setValue(value: IAppCaptureStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppCaptureStatics {
    public val __1685686968_Ptr: Pointer?

    public val _1685686968_VtblPtr: Pointer?
      get() = __1685686968_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentView(): AppCapture? {
      val fnPtr = _1685686968_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppCapture>()
      val hr = fn.invokeHR(arrayOf(__1685686968_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppCapture>(result.getValue())
      return resultValue
    }
  }

  public class IAppCaptureStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1685686968_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppCaptureStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f922dd6c0a7e4e748b209c1f902d08a1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppCaptureStatics(ptr: Pointer?): WithDefault = IAppCaptureStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppCaptureStatics {
      val address = segment.toRawLongValue()
      return makeIAppCaptureStatics(Pointer(address))
    }

    public override fun toNative(obj: IAppCaptureStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1685686968_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppCaptureStatics): Array<IAppCaptureStatics?> =
        (elements as
        Array<IAppCaptureStatics?>).castToImpl<IAppCaptureStatics,IAppCaptureStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppCaptureStatics?> =
        arrayOfNulls<IAppCaptureStatics_Impl>(size) as Array<IAppCaptureStatics?>
  }
}
