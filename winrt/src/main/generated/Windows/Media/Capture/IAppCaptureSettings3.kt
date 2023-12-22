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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppCaptureSettings3.ABI::class)
@Signature("{a93502fe-88c2-42d6-aaaa-40feffd75aec}")
@Guid("a93502fe88c242d6aaaa40feffd75aec")
@WinRTInterface("a93502fe88c242d6aaaa40feffd75aec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppCaptureSettings3.ByReference::class)
public interface IAppCaptureSettings3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_IsMicrophoneCaptureEnabled(value: Boolean): Unit

  @InterfaceMethod(1)
  public fun get_IsMicrophoneCaptureEnabled(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppCaptureSettings3> {
    public override fun getValue() = ABI.makeIAppCaptureSettings3(pointer.getPointer(0))

    public fun setValue(value: IAppCaptureSettings3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppCaptureSettings3 {
    public val __1431836365_Ptr: Pointer?

    public val _1431836365_VtblPtr: Pointer?
      get() = __1431836365_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_IsMicrophoneCaptureEnabled(value: Boolean): Unit {
      val fnPtr = _1431836365_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1431836365_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_IsMicrophoneCaptureEnabled(): Boolean {
      val fnPtr = _1431836365_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1431836365_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppCaptureSettings3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1431836365_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppCaptureSettings3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a93502fe88c242d6aaaa40feffd75aec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppCaptureSettings3(ptr: Pointer?): WithDefault = IAppCaptureSettings3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppCaptureSettings3 {
      val address = segment.toRawLongValue()
      return makeIAppCaptureSettings3(Pointer(address))
    }

    public override fun toNative(obj: IAppCaptureSettings3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1431836365_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppCaptureSettings3): Array<IAppCaptureSettings3?> =
        (elements as
        Array<IAppCaptureSettings3?>).castToImpl<IAppCaptureSettings3,IAppCaptureSettings3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppCaptureSettings3?> =
        arrayOfNulls<IAppCaptureSettings3_Impl>(size) as Array<IAppCaptureSettings3?>
  }
}
