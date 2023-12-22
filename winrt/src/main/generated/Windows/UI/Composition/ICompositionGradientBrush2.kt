package Windows.UI.Composition

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

@ABIMarker(ICompositionGradientBrush2.ABI::class)
@Signature("{899dd5a1-b4c7-4b33-a1b6-264addc26d10}")
@Guid("899dd5a1b4c74b33a1b6264addc26d10")
@WinRTInterface("899dd5a1b4c74b33a1b6264addc26d10")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionGradientBrush2.ByReference::class)
public interface ICompositionGradientBrush2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MappingMode(): CompositionMappingMode?

  @InterfaceMethod(1)
  public fun put_MappingMode(value: CompositionMappingMode?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionGradientBrush2> {
    public override fun getValue() = ABI.makeICompositionGradientBrush2(pointer.getPointer(0))

    public fun setValue(value: ICompositionGradientBrush2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionGradientBrush2 {
    public val __33739804_Ptr: Pointer?

    public val _33739804_VtblPtr: Pointer?
      get() = __33739804_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MappingMode(): CompositionMappingMode? {
      val fnPtr = _33739804_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionMappingMode>()
      val hr = fn.invokeHR(arrayOf(__33739804_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionMappingMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_MappingMode(value: CompositionMappingMode?): Unit {
      val fnPtr = _33739804_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__33739804_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionGradientBrush2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __33739804_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionGradientBrush2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("899dd5a1b4c74b33a1b6264addc26d10")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionGradientBrush2(ptr: Pointer?): WithDefault =
        ICompositionGradientBrush2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionGradientBrush2 {
      val address = segment.toRawLongValue()
      return makeICompositionGradientBrush2(Pointer(address))
    }

    public override fun toNative(obj: ICompositionGradientBrush2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__33739804_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionGradientBrush2):
        Array<ICompositionGradientBrush2?> = (elements as
        Array<ICompositionGradientBrush2?>).castToImpl<ICompositionGradientBrush2,ICompositionGradientBrush2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionGradientBrush2?> =
        arrayOfNulls<ICompositionGradientBrush2_Impl>(size) as Array<ICompositionGradientBrush2?>
  }
}
