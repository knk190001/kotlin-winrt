package Windows.UI.Xaml.Media.Animation

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

@ABIMarker(IColorAnimationUsingKeyFrames.ABI::class)
@Signature("{f5c82640-13c3-42aa-9ae2-7e6b51c92f95}")
@Guid("f5c8264013c342aa9ae27e6b51c92f95")
@WinRTInterface("f5c8264013c342aa9ae27e6b51c92f95")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColorAnimationUsingKeyFrames.ByReference::class)
public interface IColorAnimationUsingKeyFrames : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KeyFrames(): ColorKeyFrameCollection?

  @InterfaceMethod(1)
  public fun get_EnableDependentAnimation(): Boolean

  @InterfaceMethod(2)
  public fun put_EnableDependentAnimation(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IColorAnimationUsingKeyFrames> {
    public override fun getValue() = ABI.makeIColorAnimationUsingKeyFrames(pointer.getPointer(0))

    public fun setValue(value: IColorAnimationUsingKeyFrames_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColorAnimationUsingKeyFrames {
    public val __659521912_Ptr: Pointer?

    public val _659521912_VtblPtr: Pointer?
      get() = __659521912_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KeyFrames(): ColorKeyFrameCollection? {
      val fnPtr = _659521912_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ColorKeyFrameCollection>()
      val hr = fn.invokeHR(arrayOf(__659521912_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ColorKeyFrameCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_EnableDependentAnimation(): Boolean {
      val fnPtr = _659521912_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__659521912_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_EnableDependentAnimation(value: Boolean): Unit {
      val fnPtr = _659521912_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__659521912_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IColorAnimationUsingKeyFrames_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __659521912_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColorAnimationUsingKeyFrames, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f5c8264013c342aa9ae27e6b51c92f95")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColorAnimationUsingKeyFrames(ptr: Pointer?): WithDefault =
        IColorAnimationUsingKeyFrames_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColorAnimationUsingKeyFrames {
      val address = segment.toRawLongValue()
      return makeIColorAnimationUsingKeyFrames(Pointer(address))
    }

    public override fun toNative(obj: IColorAnimationUsingKeyFrames): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__659521912_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColorAnimationUsingKeyFrames):
        Array<IColorAnimationUsingKeyFrames?> = (elements as
        Array<IColorAnimationUsingKeyFrames?>).castToImpl<IColorAnimationUsingKeyFrames,IColorAnimationUsingKeyFrames_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColorAnimationUsingKeyFrames?> =
        arrayOfNulls<IColorAnimationUsingKeyFrames_Impl>(size) as
        Array<IColorAnimationUsingKeyFrames?>
  }
}
