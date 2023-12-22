package Microsoft.UI.Composition

import Windows.Foundation.Numerics.Vector3
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

@ABIMarker(IVector3KeyFrameAnimation.ABI::class)
@Signature("{d7da980e-2dde-5dd1-a40c-d6868dd2449e}")
@Guid("d7da980e2dde5dd1a40cd6868dd2449e")
@WinRTInterface("d7da980e2dde5dd1a40cd6868dd2449e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVector3KeyFrameAnimation.ByReference::class)
public interface IVector3KeyFrameAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun InsertKeyFrame(normalizedProgressKey: Float, value: Vector3?): Unit

  @InterfaceMethod(1)
  public fun InsertKeyFrame(
    normalizedProgressKey: Float,
    value: Vector3?,
    easingFunction: CompositionEasingFunction?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVector3KeyFrameAnimation> {
    public override fun getValue() = ABI.makeIVector3KeyFrameAnimation(pointer.getPointer(0))

    public fun setValue(value: IVector3KeyFrameAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVector3KeyFrameAnimation {
    public val __325974913_Ptr: Pointer?

    public val _325974913_VtblPtr: Pointer?
      get() = __325974913_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun InsertKeyFrame(normalizedProgressKey: Float, value: Vector3?): Unit {
      val fnPtr = _325974913_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__325974913_Ptr, normalizedProgressKey, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun InsertKeyFrame(
      normalizedProgressKey: Float,
      value: Vector3?,
      easingFunction: CompositionEasingFunction?
    ): Unit {
      val fnPtr = _325974913_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__325974913_Ptr, normalizedProgressKey, marshalToNative(value),
          marshalToNative(easingFunction),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVector3KeyFrameAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __325974913_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVector3KeyFrameAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d7da980e2dde5dd1a40cd6868dd2449e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVector3KeyFrameAnimation(ptr: Pointer?): WithDefault =
        IVector3KeyFrameAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVector3KeyFrameAnimation {
      val address = segment.toRawLongValue()
      return makeIVector3KeyFrameAnimation(Pointer(address))
    }

    public override fun toNative(obj: IVector3KeyFrameAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__325974913_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVector3KeyFrameAnimation):
        Array<IVector3KeyFrameAnimation?> = (elements as
        Array<IVector3KeyFrameAnimation?>).castToImpl<IVector3KeyFrameAnimation,IVector3KeyFrameAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVector3KeyFrameAnimation?> =
        arrayOfNulls<IVector3KeyFrameAnimation_Impl>(size) as Array<IVector3KeyFrameAnimation?>
  }
}
