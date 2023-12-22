package Windows.UI.Composition

import Windows.Foundation.Numerics.Quaternion
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

@ABIMarker(IQuaternionKeyFrameAnimation.ABI::class)
@Signature("{404e5835-ecf6-4240-8520-671279cf36bc}")
@Guid("404e5835ecf642408520671279cf36bc")
@WinRTInterface("404e5835ecf642408520671279cf36bc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IQuaternionKeyFrameAnimation.ByReference::class)
public interface IQuaternionKeyFrameAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun InsertKeyFrame(normalizedProgressKey: Float, value: Quaternion?): Unit

  @InterfaceMethod(1)
  public fun InsertKeyFrame(
    normalizedProgressKey: Float,
    value: Quaternion?,
    easingFunction: CompositionEasingFunction?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IQuaternionKeyFrameAnimation> {
    public override fun getValue() = ABI.makeIQuaternionKeyFrameAnimation(pointer.getPointer(0))

    public fun setValue(value: IQuaternionKeyFrameAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IQuaternionKeyFrameAnimation {
    public val __1716648726_Ptr: Pointer?

    public val _1716648726_VtblPtr: Pointer?
      get() = __1716648726_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun InsertKeyFrame(normalizedProgressKey: Float, value: Quaternion?): Unit {
      val fnPtr = _1716648726_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1716648726_Ptr, normalizedProgressKey,
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun InsertKeyFrame(
      normalizedProgressKey: Float,
      value: Quaternion?,
      easingFunction: CompositionEasingFunction?
    ): Unit {
      val fnPtr = _1716648726_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1716648726_Ptr, normalizedProgressKey, marshalToNative(value),
          marshalToNative(easingFunction),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IQuaternionKeyFrameAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1716648726_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IQuaternionKeyFrameAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("404e5835ecf642408520671279cf36bc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIQuaternionKeyFrameAnimation(ptr: Pointer?): WithDefault =
        IQuaternionKeyFrameAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IQuaternionKeyFrameAnimation {
      val address = segment.toRawLongValue()
      return makeIQuaternionKeyFrameAnimation(Pointer(address))
    }

    public override fun toNative(obj: IQuaternionKeyFrameAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1716648726_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IQuaternionKeyFrameAnimation):
        Array<IQuaternionKeyFrameAnimation?> = (elements as
        Array<IQuaternionKeyFrameAnimation?>).castToImpl<IQuaternionKeyFrameAnimation,IQuaternionKeyFrameAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IQuaternionKeyFrameAnimation?> =
        arrayOfNulls<IQuaternionKeyFrameAnimation_Impl>(size) as
        Array<IQuaternionKeyFrameAnimation?>
  }
}
