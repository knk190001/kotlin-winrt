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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAnimatedVisualSource3.ABI::class)
@Signature("{a152f00d-b7cf-5a8f-aee7-ea1b97c21639}")
@Guid("a152f00db7cf5a8faee7ea1b97c21639")
@WinRTInterface("a152f00db7cf5a8faee7ea1b97c21639")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnimatedVisualSource3.ByReference::class)
public interface IAnimatedVisualSource3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryCreateAnimatedVisual(
    compositor: Compositor?,
    diagnostics: IUnknown?,
    createAnimations: Boolean
  ): IAnimatedVisual2?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnimatedVisualSource3> {
    public override fun getValue() = ABI.makeIAnimatedVisualSource3(pointer.getPointer(0))

    public fun setValue(value: IAnimatedVisualSource3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnimatedVisualSource3 {
    public val __1047949262_Ptr: Pointer?

    public val _1047949262_VtblPtr: Pointer?
      get() = __1047949262_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryCreateAnimatedVisual(
      compositor: Compositor?,
      diagnostics: IUnknown?,
      createAnimations: Boolean
    ): IAnimatedVisual2? {
      val fnPtr = _1047949262_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAnimatedVisual2>()
      val hr = fn.invokeHR(arrayOf(__1047949262_Ptr, marshalToNative(compositor),
          marshalToNative(diagnostics), createAnimations, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAnimatedVisual2>(result.getValue())
      return resultValue
    }
  }

  public class IAnimatedVisualSource3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1047949262_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnimatedVisualSource3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a152f00db7cf5a8faee7ea1b97c21639")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnimatedVisualSource3(ptr: Pointer?): WithDefault =
        IAnimatedVisualSource3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnimatedVisualSource3 {
      val address = segment.toRawLongValue()
      return makeIAnimatedVisualSource3(Pointer(address))
    }

    public override fun toNative(obj: IAnimatedVisualSource3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1047949262_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnimatedVisualSource3): Array<IAnimatedVisualSource3?> =
        (elements as
        Array<IAnimatedVisualSource3?>).castToImpl<IAnimatedVisualSource3,IAnimatedVisualSource3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnimatedVisualSource3?> =
        arrayOfNulls<IAnimatedVisualSource3_Impl>(size) as Array<IAnimatedVisualSource3?>
  }
}
