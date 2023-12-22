package Windows.UI.Composition.Desktop

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

@ABIMarker(IDesktopWindowTarget.ABI::class)
@Signature("{6329d6ca-3366-490e-9db3-25312929ac51}")
@Guid("6329d6ca3366490e9db325312929ac51")
@WinRTInterface("6329d6ca3366490e9db325312929ac51")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDesktopWindowTarget.ByReference::class)
public interface IDesktopWindowTarget : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsTopmost(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDesktopWindowTarget> {
    public override fun getValue() = ABI.makeIDesktopWindowTarget(pointer.getPointer(0))

    public fun setValue(value: IDesktopWindowTarget_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDesktopWindowTarget {
    public val __516135043_Ptr: Pointer?

    public val _516135043_VtblPtr: Pointer?
      get() = __516135043_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsTopmost(): Boolean {
      val fnPtr = _516135043_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__516135043_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IDesktopWindowTarget_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __516135043_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDesktopWindowTarget, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6329d6ca3366490e9db325312929ac51")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDesktopWindowTarget(ptr: Pointer?): WithDefault = IDesktopWindowTarget_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDesktopWindowTarget {
      val address = segment.toRawLongValue()
      return makeIDesktopWindowTarget(Pointer(address))
    }

    public override fun toNative(obj: IDesktopWindowTarget): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__516135043_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDesktopWindowTarget): Array<IDesktopWindowTarget?> =
        (elements as
        Array<IDesktopWindowTarget?>).castToImpl<IDesktopWindowTarget,IDesktopWindowTarget_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDesktopWindowTarget?> =
        arrayOfNulls<IDesktopWindowTarget_Impl>(size) as Array<IDesktopWindowTarget?>
  }
}
