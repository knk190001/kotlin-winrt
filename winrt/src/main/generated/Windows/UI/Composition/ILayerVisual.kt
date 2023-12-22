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

@ABIMarker(ILayerVisual.ABI::class)
@Signature("{af843985-0444-4887-8e83-b40b253f822c}")
@Guid("af843985044448878e83b40b253f822c")
@WinRTInterface("af843985044448878e83b40b253f822c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILayerVisual.ByReference::class)
public interface ILayerVisual : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Effect(): CompositionEffectBrush?

  @InterfaceMethod(1)
  public fun put_Effect(value: CompositionEffectBrush?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ILayerVisual> {
    public override fun getValue() = ABI.makeILayerVisual(pointer.getPointer(0))

    public fun setValue(value: ILayerVisual_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILayerVisual {
    public val __1342072707_Ptr: Pointer?

    public val _1342072707_VtblPtr: Pointer?
      get() = __1342072707_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Effect(): CompositionEffectBrush? {
      val fnPtr = _1342072707_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionEffectBrush>()
      val hr = fn.invokeHR(arrayOf(__1342072707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionEffectBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Effect(value: CompositionEffectBrush?): Unit {
      val fnPtr = _1342072707_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1342072707_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILayerVisual_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1342072707_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILayerVisual, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("af843985044448878e83b40b253f822c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILayerVisual(ptr: Pointer?): WithDefault = ILayerVisual_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILayerVisual {
      val address = segment.toRawLongValue()
      return makeILayerVisual(Pointer(address))
    }

    public override fun toNative(obj: ILayerVisual): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1342072707_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILayerVisual): Array<ILayerVisual?> = (elements as
        Array<ILayerVisual?>).castToImpl<ILayerVisual,ILayerVisual_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILayerVisual?> =
        arrayOfNulls<ILayerVisual_Impl>(size) as Array<ILayerVisual?>
  }
}
