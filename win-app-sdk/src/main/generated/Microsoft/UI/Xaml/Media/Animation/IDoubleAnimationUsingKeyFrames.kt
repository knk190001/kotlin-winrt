package Microsoft.UI.Xaml.Media.Animation

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDoubleAnimationUsingKeyFrames.ABI::class)
@Signature("{815437d5-63cf-54a5-aea5-24b84708d12d}")
@Guid("815437d563cf54a5aea524b84708d12d")
@WinRTInterface("815437d563cf54a5aea524b84708d12d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDoubleAnimationUsingKeyFrames.ByReference::class)
public interface IDoubleAnimationUsingKeyFrames : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KeyFrames(): DoubleKeyFrameCollection?

  @InterfaceMethod(1)
  public fun get_EnableDependentAnimation(): Boolean

  @InterfaceMethod(2)
  public fun put_EnableDependentAnimation(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDoubleAnimationUsingKeyFrames> {
    public override fun getValue() = ABI.makeIDoubleAnimationUsingKeyFrames(pointer.getPointer(0))

    public fun setValue(value: IDoubleAnimationUsingKeyFrames_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDoubleAnimationUsingKeyFrames {
    public val __701944519_Ptr: Pointer?

    public val _701944519_VtblPtr: Pointer?
      get() = __701944519_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KeyFrames(): DoubleKeyFrameCollection? {
      val fnPtr = _701944519_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DoubleKeyFrameCollection>()
      val hr = fn.invokeHR(arrayOf(__701944519_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DoubleKeyFrameCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_EnableDependentAnimation(): Boolean {
      val fnPtr = _701944519_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__701944519_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_EnableDependentAnimation(value: Boolean): Unit {
      val fnPtr = _701944519_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__701944519_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDoubleAnimationUsingKeyFrames_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __701944519_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDoubleAnimationUsingKeyFrames, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("815437d563cf54a5aea524b84708d12d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDoubleAnimationUsingKeyFrames(ptr: Pointer?): WithDefault =
        IDoubleAnimationUsingKeyFrames_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDoubleAnimationUsingKeyFrames {
      val address = segment.toRawLongValue()
      return makeIDoubleAnimationUsingKeyFrames(Pointer(address))
    }

    public override fun toNative(obj: IDoubleAnimationUsingKeyFrames): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__701944519_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDoubleAnimationUsingKeyFrames):
        Array<IDoubleAnimationUsingKeyFrames?> = (elements as
        Array<IDoubleAnimationUsingKeyFrames?>).castToImpl<IDoubleAnimationUsingKeyFrames,IDoubleAnimationUsingKeyFrames_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDoubleAnimationUsingKeyFrames?> =
        arrayOfNulls<IDoubleAnimationUsingKeyFrames_Impl>(size) as
        Array<IDoubleAnimationUsingKeyFrames?>
  }
}
