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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICompositionEffectBrush.ABI::class)
@Signature("{bf7f795e-83cc-44bf-a447-3e3c071789ec}")
@Guid("bf7f795e83cc44bfa4473e3c071789ec")
@WinRTInterface("bf7f795e83cc44bfa4473e3c071789ec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionEffectBrush.ByReference::class)
public interface ICompositionEffectBrush : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetSourceParameter(name: String?): CompositionBrush?

  @InterfaceMethod(1)
  public fun SetSourceParameter(name: String?, source: CompositionBrush?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionEffectBrush> {
    public override fun getValue() = ABI.makeICompositionEffectBrush(pointer.getPointer(0))

    public fun setValue(value: ICompositionEffectBrush_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionEffectBrush {
    public val __930734413_Ptr: Pointer?

    public val _930734413_VtblPtr: Pointer?
      get() = __930734413_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetSourceParameter(name: String?): CompositionBrush? {
      val fnPtr = _930734413_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionBrush>()
      val hr = fn.invokeHR(arrayOf(__930734413_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetSourceParameter(name: String?, source: CompositionBrush?): Unit {
      val fnPtr = _930734413_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__930734413_Ptr, marshalToNative(name),
          marshalToNative(source),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionEffectBrush_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __930734413_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionEffectBrush, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bf7f795e83cc44bfa4473e3c071789ec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionEffectBrush(ptr: Pointer?): WithDefault =
        ICompositionEffectBrush_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionEffectBrush {
      val address = segment.toRawLongValue()
      return makeICompositionEffectBrush(Pointer(address))
    }

    public override fun toNative(obj: ICompositionEffectBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__930734413_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionEffectBrush): Array<ICompositionEffectBrush?>
        = (elements as
        Array<ICompositionEffectBrush?>).castToImpl<ICompositionEffectBrush,ICompositionEffectBrush_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionEffectBrush?> =
        arrayOfNulls<ICompositionEffectBrush_Impl>(size) as Array<ICompositionEffectBrush?>
  }
}
