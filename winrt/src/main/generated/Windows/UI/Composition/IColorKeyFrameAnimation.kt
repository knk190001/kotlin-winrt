package Windows.UI.Composition

import Windows.UI.Color
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

@ABIMarker(IColorKeyFrameAnimation.ABI::class)
@Signature("{93adb5e9-8e05-4593-84a3-dca152781e56}")
@Guid("93adb5e98e05459384a3dca152781e56")
@WinRTInterface("93adb5e98e05459384a3dca152781e56")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColorKeyFrameAnimation.ByReference::class)
public interface IColorKeyFrameAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InterpolationColorSpace(): CompositionColorSpace?

  @InterfaceMethod(1)
  public fun put_InterpolationColorSpace(value: CompositionColorSpace?): Unit

  @InterfaceMethod(2)
  public fun InsertKeyFrame(normalizedProgressKey: Float, value: Color?): Unit

  @InterfaceMethod(3)
  public fun InsertKeyFrame(
    normalizedProgressKey: Float,
    value: Color?,
    easingFunction: CompositionEasingFunction?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IColorKeyFrameAnimation> {
    public override fun getValue() = ABI.makeIColorKeyFrameAnimation(pointer.getPointer(0))

    public fun setValue(value: IColorKeyFrameAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColorKeyFrameAnimation {
    public val __1305646879_Ptr: Pointer?

    public val _1305646879_VtblPtr: Pointer?
      get() = __1305646879_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InterpolationColorSpace(): CompositionColorSpace? {
      val fnPtr = _1305646879_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionColorSpace>()
      val hr = fn.invokeHR(arrayOf(__1305646879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionColorSpace>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_InterpolationColorSpace(value: CompositionColorSpace?): Unit {
      val fnPtr = _1305646879_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1305646879_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun InsertKeyFrame(normalizedProgressKey: Float, value: Color?): Unit {
      val fnPtr = _1305646879_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1305646879_Ptr, normalizedProgressKey,
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun InsertKeyFrame(
      normalizedProgressKey: Float,
      value: Color?,
      easingFunction: CompositionEasingFunction?
    ): Unit {
      val fnPtr = _1305646879_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1305646879_Ptr, normalizedProgressKey, marshalToNative(value),
          marshalToNative(easingFunction),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IColorKeyFrameAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1305646879_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColorKeyFrameAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("93adb5e98e05459384a3dca152781e56")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColorKeyFrameAnimation(ptr: Pointer?): WithDefault =
        IColorKeyFrameAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColorKeyFrameAnimation {
      val address = segment.toRawLongValue()
      return makeIColorKeyFrameAnimation(Pointer(address))
    }

    public override fun toNative(obj: IColorKeyFrameAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1305646879_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColorKeyFrameAnimation): Array<IColorKeyFrameAnimation?>
        = (elements as
        Array<IColorKeyFrameAnimation?>).castToImpl<IColorKeyFrameAnimation,IColorKeyFrameAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColorKeyFrameAnimation?> =
        arrayOfNulls<IColorKeyFrameAnimation_Impl>(size) as Array<IColorKeyFrameAnimation?>
  }
}
