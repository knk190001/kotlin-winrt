package Windows.UI.StartScreen

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

@ABIMarker(IVisualElementsRequestDeferral.ABI::class)
@Signature("{a1656eb0-0126-4357-8204-bd82bb2a046d}")
@Guid("a1656eb0012643578204bd82bb2a046d")
@WinRTInterface("a1656eb0012643578204bd82bb2a046d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisualElementsRequestDeferral.ByReference::class)
public interface IVisualElementsRequestDeferral : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVisualElementsRequestDeferral> {
    public override fun getValue() = ABI.makeIVisualElementsRequestDeferral(pointer.getPointer(0))

    public fun setValue(value: IVisualElementsRequestDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisualElementsRequestDeferral {
    public val __676374631_Ptr: Pointer?

    public val _676374631_VtblPtr: Pointer?
      get() = __676374631_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(): Unit {
      val fnPtr = _676374631_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__676374631_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVisualElementsRequestDeferral_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __676374631_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisualElementsRequestDeferral, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a1656eb0012643578204bd82bb2a046d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisualElementsRequestDeferral(ptr: Pointer?): WithDefault =
        IVisualElementsRequestDeferral_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisualElementsRequestDeferral {
      val address = segment.toRawLongValue()
      return makeIVisualElementsRequestDeferral(Pointer(address))
    }

    public override fun toNative(obj: IVisualElementsRequestDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__676374631_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisualElementsRequestDeferral):
        Array<IVisualElementsRequestDeferral?> = (elements as
        Array<IVisualElementsRequestDeferral?>).castToImpl<IVisualElementsRequestDeferral,IVisualElementsRequestDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisualElementsRequestDeferral?> =
        arrayOfNulls<IVisualElementsRequestDeferral_Impl>(size) as
        Array<IVisualElementsRequestDeferral?>
  }
}
