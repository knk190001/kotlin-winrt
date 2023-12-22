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

@ABIMarker(IAppCaptureSettings2.ABI::class)
@Signature("{fcb8cee7-e26b-476f-9b1a-ec342d2a8fde}")
@Guid("fcb8cee7e26b476f9b1aec342d2a8fde")
@WinRTInterface("fcb8cee7e26b476f9b1aec342d2a8fde")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppCaptureSettings2.ByReference::class)
public interface IAppCaptureSettings2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsGpuConstrained(): Boolean

  @InterfaceMethod(1)
  public fun get_AlternateShortcutKeys(): AppCaptureAlternateShortcutKeys?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppCaptureSettings2> {
    public override fun getValue() = ABI.makeIAppCaptureSettings2(pointer.getPointer(0))

    public fun setValue(value: IAppCaptureSettings2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppCaptureSettings2 {
    public val __1431836366_Ptr: Pointer?

    public val _1431836366_VtblPtr: Pointer?
      get() = __1431836366_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsGpuConstrained(): Boolean {
      val fnPtr = _1431836366_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1431836366_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_AlternateShortcutKeys(): AppCaptureAlternateShortcutKeys? {
      val fnPtr = _1431836366_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppCaptureAlternateShortcutKeys>()
      val hr = fn.invokeHR(arrayOf(__1431836366_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppCaptureAlternateShortcutKeys>(result.getValue())
      return resultValue
    }
  }

  public class IAppCaptureSettings2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1431836366_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppCaptureSettings2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fcb8cee7e26b476f9b1aec342d2a8fde")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppCaptureSettings2(ptr: Pointer?): WithDefault = IAppCaptureSettings2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppCaptureSettings2 {
      val address = segment.toRawLongValue()
      return makeIAppCaptureSettings2(Pointer(address))
    }

    public override fun toNative(obj: IAppCaptureSettings2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1431836366_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppCaptureSettings2): Array<IAppCaptureSettings2?> =
        (elements as
        Array<IAppCaptureSettings2?>).castToImpl<IAppCaptureSettings2,IAppCaptureSettings2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppCaptureSettings2?> =
        arrayOfNulls<IAppCaptureSettings2_Impl>(size) as Array<IAppCaptureSettings2?>
  }
}
