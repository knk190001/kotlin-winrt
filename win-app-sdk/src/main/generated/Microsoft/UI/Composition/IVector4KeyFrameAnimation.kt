package Microsoft.UI.Composition

import Windows.Foundation.Numerics.Vector4
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

@ABIMarker(IVector4KeyFrameAnimation.ABI::class)
@Signature("{16cea3b9-c5e3-5f6f-b5c7-da29a31ccfc7}")
@Guid("16cea3b9c5e35f6fb5c7da29a31ccfc7")
@WinRTInterface("16cea3b9c5e35f6fb5c7da29a31ccfc7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVector4KeyFrameAnimation.ByReference::class)
public interface IVector4KeyFrameAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun InsertKeyFrame(normalizedProgressKey: Float, value: Vector4?): Unit

  @InterfaceMethod(1)
  public fun InsertKeyFrame(
    normalizedProgressKey: Float,
    value: Vector4?,
    easingFunction: CompositionEasingFunction?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVector4KeyFrameAnimation> {
    public override fun getValue() = ABI.makeIVector4KeyFrameAnimation(pointer.getPointer(0))

    public fun setValue(value: IVector4KeyFrameAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVector4KeyFrameAnimation {
    public val __1323047266_Ptr: Pointer?

    public val _1323047266_VtblPtr: Pointer?
      get() = __1323047266_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun InsertKeyFrame(normalizedProgressKey: Float, value: Vector4?): Unit {
      val fnPtr = _1323047266_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1323047266_Ptr, normalizedProgressKey,
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun InsertKeyFrame(
      normalizedProgressKey: Float,
      value: Vector4?,
      easingFunction: CompositionEasingFunction?
    ): Unit {
      val fnPtr = _1323047266_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1323047266_Ptr, normalizedProgressKey, marshalToNative(value),
          marshalToNative(easingFunction),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVector4KeyFrameAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1323047266_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVector4KeyFrameAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("16cea3b9c5e35f6fb5c7da29a31ccfc7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVector4KeyFrameAnimation(ptr: Pointer?): WithDefault =
        IVector4KeyFrameAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVector4KeyFrameAnimation {
      val address = segment.toRawLongValue()
      return makeIVector4KeyFrameAnimation(Pointer(address))
    }

    public override fun toNative(obj: IVector4KeyFrameAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1323047266_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVector4KeyFrameAnimation):
        Array<IVector4KeyFrameAnimation?> = (elements as
        Array<IVector4KeyFrameAnimation?>).castToImpl<IVector4KeyFrameAnimation,IVector4KeyFrameAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVector4KeyFrameAnimation?> =
        arrayOfNulls<IVector4KeyFrameAnimation_Impl>(size) as Array<IVector4KeyFrameAnimation?>
  }
}
