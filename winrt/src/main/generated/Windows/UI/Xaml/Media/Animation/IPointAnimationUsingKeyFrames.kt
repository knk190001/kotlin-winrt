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

@ABIMarker(IPointAnimationUsingKeyFrames.ABI::class)
@Signature("{9b944f72-446a-41d0-a129-41a620f4595d}")
@Guid("9b944f72446a41d0a12941a620f4595d")
@WinRTInterface("9b944f72446a41d0a12941a620f4595d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPointAnimationUsingKeyFrames.ByReference::class)
public interface IPointAnimationUsingKeyFrames : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KeyFrames(): PointKeyFrameCollection?

  @InterfaceMethod(1)
  public fun get_EnableDependentAnimation(): Boolean

  @InterfaceMethod(2)
  public fun put_EnableDependentAnimation(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPointAnimationUsingKeyFrames> {
    public override fun getValue() = ABI.makeIPointAnimationUsingKeyFrames(pointer.getPointer(0))

    public fun setValue(value: IPointAnimationUsingKeyFrames_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPointAnimationUsingKeyFrames {
    public val __2120960581_Ptr: Pointer?

    public val _2120960581_VtblPtr: Pointer?
      get() = __2120960581_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KeyFrames(): PointKeyFrameCollection? {
      val fnPtr = _2120960581_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointKeyFrameCollection>()
      val hr = fn.invokeHR(arrayOf(__2120960581_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointKeyFrameCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_EnableDependentAnimation(): Boolean {
      val fnPtr = _2120960581_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2120960581_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_EnableDependentAnimation(value: Boolean): Unit {
      val fnPtr = _2120960581_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2120960581_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPointAnimationUsingKeyFrames_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2120960581_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPointAnimationUsingKeyFrames, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9b944f72446a41d0a12941a620f4595d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPointAnimationUsingKeyFrames(ptr: Pointer?): WithDefault =
        IPointAnimationUsingKeyFrames_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPointAnimationUsingKeyFrames {
      val address = segment.toRawLongValue()
      return makeIPointAnimationUsingKeyFrames(Pointer(address))
    }

    public override fun toNative(obj: IPointAnimationUsingKeyFrames): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2120960581_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPointAnimationUsingKeyFrames):
        Array<IPointAnimationUsingKeyFrames?> = (elements as
        Array<IPointAnimationUsingKeyFrames?>).castToImpl<IPointAnimationUsingKeyFrames,IPointAnimationUsingKeyFrames_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPointAnimationUsingKeyFrames?> =
        arrayOfNulls<IPointAnimationUsingKeyFrames_Impl>(size) as
        Array<IPointAnimationUsingKeyFrames?>
  }
}
