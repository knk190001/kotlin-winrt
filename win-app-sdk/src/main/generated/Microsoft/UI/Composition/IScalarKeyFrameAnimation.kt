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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IScalarKeyFrameAnimation.ABI::class)
@Signature("{5a5f8abe-d129-5b25-8aff-8180fd9bfb22}")
@Guid("5a5f8abed1295b258aff8180fd9bfb22")
@WinRTInterface("5a5f8abed1295b258aff8180fd9bfb22")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScalarKeyFrameAnimation.ByReference::class)
public interface IScalarKeyFrameAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun InsertKeyFrame(normalizedProgressKey: Float, value: Float): Unit

  @InterfaceMethod(1)
  public fun InsertKeyFrame(
    normalizedProgressKey: Float,
    value: Float,
    easingFunction: CompositionEasingFunction?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScalarKeyFrameAnimation> {
    public override fun getValue() = ABI.makeIScalarKeyFrameAnimation(pointer.getPointer(0))

    public fun setValue(value: IScalarKeyFrameAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScalarKeyFrameAnimation {
    public val __866920943_Ptr: Pointer?

    public val _866920943_VtblPtr: Pointer?
      get() = __866920943_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun InsertKeyFrame(normalizedProgressKey: Float, value: Float): Unit {
      val fnPtr = _866920943_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__866920943_Ptr, normalizedProgressKey, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun InsertKeyFrame(
      normalizedProgressKey: Float,
      value: Float,
      easingFunction: CompositionEasingFunction?
    ): Unit {
      val fnPtr = _866920943_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__866920943_Ptr, normalizedProgressKey, value,
          marshalToNative(easingFunction),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IScalarKeyFrameAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __866920943_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScalarKeyFrameAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5a5f8abed1295b258aff8180fd9bfb22")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScalarKeyFrameAnimation(ptr: Pointer?): WithDefault =
        IScalarKeyFrameAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScalarKeyFrameAnimation {
      val address = segment.toRawLongValue()
      return makeIScalarKeyFrameAnimation(Pointer(address))
    }

    public override fun toNative(obj: IScalarKeyFrameAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__866920943_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScalarKeyFrameAnimation):
        Array<IScalarKeyFrameAnimation?> = (elements as
        Array<IScalarKeyFrameAnimation?>).castToImpl<IScalarKeyFrameAnimation,IScalarKeyFrameAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScalarKeyFrameAnimation?> =
        arrayOfNulls<IScalarKeyFrameAnimation_Impl>(size) as Array<IScalarKeyFrameAnimation?>
  }
}
