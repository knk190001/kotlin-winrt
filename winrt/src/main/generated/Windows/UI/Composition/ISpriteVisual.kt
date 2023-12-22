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

@ABIMarker(ISpriteVisual.ABI::class)
@Signature("{08e05581-1ad1-4f97-9757-402d76e4233b}")
@Guid("08e055811ad14f979757402d76e4233b")
@WinRTInterface("08e055811ad14f979757402d76e4233b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpriteVisual.ByReference::class)
public interface ISpriteVisual : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Brush(): CompositionBrush?

  @InterfaceMethod(1)
  public fun put_Brush(value: CompositionBrush?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISpriteVisual>
      {
    public override fun getValue() = ABI.makeISpriteVisual(pointer.getPointer(0))

    public fun setValue(value: ISpriteVisual_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpriteVisual {
    public val __174481683_Ptr: Pointer?

    public val _174481683_VtblPtr: Pointer?
      get() = __174481683_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Brush(): CompositionBrush? {
      val fnPtr = _174481683_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionBrush>()
      val hr = fn.invokeHR(arrayOf(__174481683_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Brush(value: CompositionBrush?): Unit {
      val fnPtr = _174481683_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__174481683_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISpriteVisual_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __174481683_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpriteVisual, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("08e055811ad14f979757402d76e4233b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpriteVisual(ptr: Pointer?): WithDefault = ISpriteVisual_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpriteVisual {
      val address = segment.toRawLongValue()
      return makeISpriteVisual(Pointer(address))
    }

    public override fun toNative(obj: ISpriteVisual): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__174481683_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpriteVisual): Array<ISpriteVisual?> = (elements as
        Array<ISpriteVisual?>).castToImpl<ISpriteVisual,ISpriteVisual_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpriteVisual?> =
        arrayOfNulls<ISpriteVisual_Impl>(size) as Array<ISpriteVisual?>
  }
}
