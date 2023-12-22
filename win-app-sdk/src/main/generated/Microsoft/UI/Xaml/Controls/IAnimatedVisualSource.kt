package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Composition.Compositor
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IAnimatedVisualSource.ABI::class)
@Signature("{294765c3-70e3-555c-9657-01fc4051169d}")
@Guid("294765c370e3555c965701fc4051169d")
@WinRTInterface("294765c370e3555c965701fc4051169d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnimatedVisualSource.ByReference::class)
public interface IAnimatedVisualSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryCreateAnimatedVisual(compositor: Compositor?, diagnostics: IUnknown?):
      IAnimatedVisual?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnimatedVisualSource> {
    public override fun getValue() = ABI.makeIAnimatedVisualSource(pointer.getPointer(0))

    public fun setValue(value: IAnimatedVisualSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnimatedVisualSource {
    public val __243289851_Ptr: Pointer?

    public val _243289851_VtblPtr: Pointer?
      get() = __243289851_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryCreateAnimatedVisual(compositor: Compositor?, diagnostics: IUnknown?):
        IAnimatedVisual? {
      val fnPtr = _243289851_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAnimatedVisual>()
      val hr = fn.invokeHR(arrayOf(__243289851_Ptr, marshalToNative(compositor),
          marshalToNative(diagnostics), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAnimatedVisual>(result.getValue())
      return resultValue
    }
  }

  public class IAnimatedVisualSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __243289851_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnimatedVisualSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("294765c370e3555c965701fc4051169d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnimatedVisualSource(ptr: Pointer?): WithDefault =
        IAnimatedVisualSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnimatedVisualSource {
      val address = segment.toRawLongValue()
      return makeIAnimatedVisualSource(Pointer(address))
    }

    public override fun toNative(obj: IAnimatedVisualSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__243289851_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnimatedVisualSource): Array<IAnimatedVisualSource?> =
        (elements as
        Array<IAnimatedVisualSource?>).castToImpl<IAnimatedVisualSource,IAnimatedVisualSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnimatedVisualSource?> =
        arrayOfNulls<IAnimatedVisualSource_Impl>(size) as Array<IAnimatedVisualSource?>
  }
}
