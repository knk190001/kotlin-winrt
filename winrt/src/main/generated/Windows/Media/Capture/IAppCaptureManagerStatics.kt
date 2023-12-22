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

@ABIMarker(IAppCaptureManagerStatics.ABI::class)
@Signature("{7d9e3ea7-6282-4735-8d4e-aa45f90f6723}")
@Guid("7d9e3ea7628247358d4eaa45f90f6723")
@WinRTInterface("7d9e3ea7628247358d4eaa45f90f6723")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppCaptureManagerStatics.ByReference::class)
public interface IAppCaptureManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCurrentSettings(): AppCaptureSettings?

  @InterfaceMethod(1)
  public fun ApplySettings(appCaptureSettings: AppCaptureSettings?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppCaptureManagerStatics> {
    public override fun getValue() = ABI.makeIAppCaptureManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IAppCaptureManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppCaptureManagerStatics {
    public val __991306635_Ptr: Pointer?

    public val _991306635_VtblPtr: Pointer?
      get() = __991306635_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCurrentSettings(): AppCaptureSettings? {
      val fnPtr = _991306635_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppCaptureSettings>()
      val hr = fn.invokeHR(arrayOf(__991306635_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppCaptureSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ApplySettings(appCaptureSettings: AppCaptureSettings?): Unit {
      val fnPtr = _991306635_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__991306635_Ptr, marshalToNative(appCaptureSettings),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppCaptureManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __991306635_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppCaptureManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7d9e3ea7628247358d4eaa45f90f6723")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppCaptureManagerStatics(ptr: Pointer?): WithDefault =
        IAppCaptureManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppCaptureManagerStatics {
      val address = segment.toRawLongValue()
      return makeIAppCaptureManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IAppCaptureManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__991306635_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppCaptureManagerStatics):
        Array<IAppCaptureManagerStatics?> = (elements as
        Array<IAppCaptureManagerStatics?>).castToImpl<IAppCaptureManagerStatics,IAppCaptureManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppCaptureManagerStatics?> =
        arrayOfNulls<IAppCaptureManagerStatics_Impl>(size) as Array<IAppCaptureManagerStatics?>
  }
}
