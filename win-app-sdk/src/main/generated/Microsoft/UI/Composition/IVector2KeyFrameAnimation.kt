package Microsoft.UI.Composition

import Windows.Foundation.Numerics.Vector2
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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVector2KeyFrameAnimation.ABI::class)
@Signature("{e9c5e3fd-43b7-526e-9da0-4c3ea96db27d}")
@Guid("e9c5e3fd43b7526e9da04c3ea96db27d")
@WinRTInterface("e9c5e3fd43b7526e9da04c3ea96db27d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVector2KeyFrameAnimation.ByReference::class)
public interface IVector2KeyFrameAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun InsertKeyFrame(normalizedProgressKey: Float, value: Vector2?): Unit

  @InterfaceMethod(1)
  public fun InsertKeyFrame(
    normalizedProgressKey: Float,
    value: Vector2?,
    easingFunction: CompositionEasingFunction?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVector2KeyFrameAnimation> {
    public override fun getValue() = ABI.makeIVector2KeyFrameAnimation(pointer.getPointer(0))

    public fun setValue(value: IVector2KeyFrameAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVector2KeyFrameAnimation {
    public val __671097440_Ptr: Pointer?

    public val _671097440_VtblPtr: Pointer?
      get() = __671097440_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun InsertKeyFrame(normalizedProgressKey: Float, value: Vector2?): Unit {
      val fnPtr = _671097440_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__671097440_Ptr, normalizedProgressKey, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun InsertKeyFrame(
      normalizedProgressKey: Float,
      value: Vector2?,
      easingFunction: CompositionEasingFunction?
    ): Unit {
      val fnPtr = _671097440_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__671097440_Ptr, normalizedProgressKey, marshalToNative(value),
          marshalToNative(easingFunction),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVector2KeyFrameAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __671097440_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVector2KeyFrameAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e9c5e3fd43b7526e9da04c3ea96db27d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVector2KeyFrameAnimation(ptr: Pointer?): WithDefault =
        IVector2KeyFrameAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVector2KeyFrameAnimation {
      val address = segment.toRawLongValue()
      return makeIVector2KeyFrameAnimation(Pointer(address))
    }

    public override fun toNative(obj: IVector2KeyFrameAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__671097440_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVector2KeyFrameAnimation):
        Array<IVector2KeyFrameAnimation?> = (elements as
        Array<IVector2KeyFrameAnimation?>).castToImpl<IVector2KeyFrameAnimation,IVector2KeyFrameAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVector2KeyFrameAnimation?> =
        arrayOfNulls<IVector2KeyFrameAnimation_Impl>(size) as Array<IVector2KeyFrameAnimation?>
  }
}
