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

@ABIMarker(IScreenCaptureStatics.ABI::class)
@Signature("{c898c3b0-c8a5-11e2-8b8b-0800200c9a66}")
@Guid("c898c3b0c8a511e28b8b0800200c9a66")
@WinRTInterface("c898c3b0c8a511e28b8b0800200c9a66")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScreenCaptureStatics.ByReference::class)
public interface IScreenCaptureStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentView(): ScreenCapture?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScreenCaptureStatics> {
    public override fun getValue() = ABI.makeIScreenCaptureStatics(pointer.getPointer(0))

    public fun setValue(value: IScreenCaptureStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScreenCaptureStatics {
    public val __2078958333_Ptr: Pointer?

    public val _2078958333_VtblPtr: Pointer?
      get() = __2078958333_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentView(): ScreenCapture? {
      val fnPtr = _2078958333_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScreenCapture>()
      val hr = fn.invokeHR(arrayOf(__2078958333_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScreenCapture>(result.getValue())
      return resultValue
    }
  }

  public class IScreenCaptureStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2078958333_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScreenCaptureStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c898c3b0c8a511e28b8b0800200c9a66")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScreenCaptureStatics(ptr: Pointer?): WithDefault =
        IScreenCaptureStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScreenCaptureStatics {
      val address = segment.toRawLongValue()
      return makeIScreenCaptureStatics(Pointer(address))
    }

    public override fun toNative(obj: IScreenCaptureStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2078958333_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScreenCaptureStatics): Array<IScreenCaptureStatics?> =
        (elements as
        Array<IScreenCaptureStatics?>).castToImpl<IScreenCaptureStatics,IScreenCaptureStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScreenCaptureStatics?> =
        arrayOfNulls<IScreenCaptureStatics_Impl>(size) as Array<IScreenCaptureStatics?>
  }
}
