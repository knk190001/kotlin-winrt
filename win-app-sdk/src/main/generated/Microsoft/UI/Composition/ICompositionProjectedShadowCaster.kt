package Microsoft.UI.Composition

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

@ABIMarker(ICompositionProjectedShadowCaster.ABI::class)
@Signature("{15a9f2d0-6bae-521b-90c7-c7500f2bf562}")
@Guid("15a9f2d06bae521b90c7c7500f2bf562")
@WinRTInterface("15a9f2d06bae521b90c7c7500f2bf562")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionProjectedShadowCaster.ByReference::class)
public interface ICompositionProjectedShadowCaster : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Brush(): CompositionBrush?

  @InterfaceMethod(1)
  public fun put_Brush(value: CompositionBrush?): Unit

  @InterfaceMethod(2)
  public fun get_CastingVisual(): Visual?

  @InterfaceMethod(3)
  public fun put_CastingVisual(value: Visual?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionProjectedShadowCaster> {
    public override fun getValue() =
        ABI.makeICompositionProjectedShadowCaster(pointer.getPointer(0))

    public fun setValue(value: ICompositionProjectedShadowCaster_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionProjectedShadowCaster {
    public val __1871343725_Ptr: Pointer?

    public val _1871343725_VtblPtr: Pointer?
      get() = __1871343725_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Brush(): CompositionBrush? {
      val fnPtr = _1871343725_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionBrush>()
      val hr = fn.invokeHR(arrayOf(__1871343725_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Brush(value: CompositionBrush?): Unit {
      val fnPtr = _1871343725_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1871343725_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CastingVisual(): Visual? {
      val fnPtr = _1871343725_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Visual>()
      val hr = fn.invokeHR(arrayOf(__1871343725_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Visual>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_CastingVisual(value: Visual?): Unit {
      val fnPtr = _1871343725_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1871343725_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionProjectedShadowCaster_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1871343725_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionProjectedShadowCaster, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("15a9f2d06bae521b90c7c7500f2bf562")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionProjectedShadowCaster(ptr: Pointer?): WithDefault =
        ICompositionProjectedShadowCaster_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionProjectedShadowCaster {
      val address = segment.toRawLongValue()
      return makeICompositionProjectedShadowCaster(Pointer(address))
    }

    public override fun toNative(obj: ICompositionProjectedShadowCaster): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1871343725_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionProjectedShadowCaster):
        Array<ICompositionProjectedShadowCaster?> = (elements as
        Array<ICompositionProjectedShadowCaster?>).castToImpl<ICompositionProjectedShadowCaster,ICompositionProjectedShadowCaster_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionProjectedShadowCaster?> =
        arrayOfNulls<ICompositionProjectedShadowCaster_Impl>(size) as
        Array<ICompositionProjectedShadowCaster?>
  }
}
