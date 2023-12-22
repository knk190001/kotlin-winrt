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
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBooleanKeyFrameAnimation.ABI::class)
@Signature("{95e23a08-d1f4-4972-9770-3efe68d82e14}")
@Guid("95e23a08d1f4497297703efe68d82e14")
@WinRTInterface("95e23a08d1f4497297703efe68d82e14")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBooleanKeyFrameAnimation.ByReference::class)
public interface IBooleanKeyFrameAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun InsertKeyFrame(normalizedProgressKey: Float, value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBooleanKeyFrameAnimation> {
    public override fun getValue() = ABI.makeIBooleanKeyFrameAnimation(pointer.getPointer(0))

    public fun setValue(value: IBooleanKeyFrameAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBooleanKeyFrameAnimation {
    public val __133424324_Ptr: Pointer?

    public val _133424324_VtblPtr: Pointer?
      get() = __133424324_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun InsertKeyFrame(normalizedProgressKey: Float, value: Boolean): Unit {
      val fnPtr = _133424324_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__133424324_Ptr, normalizedProgressKey, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBooleanKeyFrameAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __133424324_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBooleanKeyFrameAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("95e23a08d1f4497297703efe68d82e14")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBooleanKeyFrameAnimation(ptr: Pointer?): WithDefault =
        IBooleanKeyFrameAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBooleanKeyFrameAnimation {
      val address = segment.toRawLongValue()
      return makeIBooleanKeyFrameAnimation(Pointer(address))
    }

    public override fun toNative(obj: IBooleanKeyFrameAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__133424324_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBooleanKeyFrameAnimation):
        Array<IBooleanKeyFrameAnimation?> = (elements as
        Array<IBooleanKeyFrameAnimation?>).castToImpl<IBooleanKeyFrameAnimation,IBooleanKeyFrameAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBooleanKeyFrameAnimation?> =
        arrayOfNulls<IBooleanKeyFrameAnimation_Impl>(size) as Array<IBooleanKeyFrameAnimation?>
  }
}
