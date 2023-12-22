package Windows.UI.Xaml.Media.Animation

import Windows.UI.Xaml.Controls.Primitives.EdgeTransitionLocation
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

@ABIMarker(IPaneThemeTransition.ABI::class)
@Signature("{4708eb8e-4bfc-ee46-d4f9-708def3fbb2b}")
@Guid("4708eb8e4bfcee46d4f9708def3fbb2b")
@WinRTInterface("4708eb8e4bfcee46d4f9708def3fbb2b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaneThemeTransition.ByReference::class)
public interface IPaneThemeTransition : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Edge(): EdgeTransitionLocation?

  @InterfaceMethod(1)
  public fun put_Edge(value: EdgeTransitionLocation?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaneThemeTransition> {
    public override fun getValue() = ABI.makeIPaneThemeTransition(pointer.getPointer(0))

    public fun setValue(value: IPaneThemeTransition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaneThemeTransition {
    public val __60583856_Ptr: Pointer?

    public val _60583856_VtblPtr: Pointer?
      get() = __60583856_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Edge(): EdgeTransitionLocation? {
      val fnPtr = _60583856_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EdgeTransitionLocation>()
      val hr = fn.invokeHR(arrayOf(__60583856_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EdgeTransitionLocation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Edge(value: EdgeTransitionLocation?): Unit {
      val fnPtr = _60583856_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__60583856_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPaneThemeTransition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __60583856_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaneThemeTransition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4708eb8e4bfcee46d4f9708def3fbb2b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaneThemeTransition(ptr: Pointer?): WithDefault = IPaneThemeTransition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaneThemeTransition {
      val address = segment.toRawLongValue()
      return makeIPaneThemeTransition(Pointer(address))
    }

    public override fun toNative(obj: IPaneThemeTransition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__60583856_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaneThemeTransition): Array<IPaneThemeTransition?> =
        (elements as
        Array<IPaneThemeTransition?>).castToImpl<IPaneThemeTransition,IPaneThemeTransition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaneThemeTransition?> =
        arrayOfNulls<IPaneThemeTransition_Impl>(size) as Array<IPaneThemeTransition?>
  }
}
