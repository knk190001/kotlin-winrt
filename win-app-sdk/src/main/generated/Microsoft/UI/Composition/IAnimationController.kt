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

@ABIMarker(IAnimationController.ABI::class)
@Signature("{bd0f88a8-a415-5322-8c3d-1a6d9192754f}")
@Guid("bd0f88a8a41553228c3d1a6d9192754f")
@WinRTInterface("bd0f88a8a41553228c3d1a6d9192754f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnimationController.ByReference::class)
public interface IAnimationController : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PlaybackRate(): Float

  @InterfaceMethod(1)
  public fun put_PlaybackRate(value: Float): Unit

  @InterfaceMethod(2)
  public fun get_Progress(): Float

  @InterfaceMethod(3)
  public fun put_Progress(value: Float): Unit

  @InterfaceMethod(4)
  public fun get_ProgressBehavior(): AnimationControllerProgressBehavior?

  @InterfaceMethod(5)
  public fun put_ProgressBehavior(value: AnimationControllerProgressBehavior?): Unit

  @InterfaceMethod(6)
  public fun Pause(): Unit

  @InterfaceMethod(7)
  public fun Resume(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnimationController> {
    public override fun getValue() = ABI.makeIAnimationController(pointer.getPointer(0))

    public fun setValue(value: IAnimationController_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnimationController {
    public val __130936199_Ptr: Pointer?

    public val _130936199_VtblPtr: Pointer?
      get() = __130936199_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PlaybackRate(): Float {
      val fnPtr = _130936199_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__130936199_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_PlaybackRate(value: Float): Unit {
      val fnPtr = _130936199_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__130936199_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Progress(): Float {
      val fnPtr = _130936199_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__130936199_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Progress(value: Float): Unit {
      val fnPtr = _130936199_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__130936199_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ProgressBehavior(): AnimationControllerProgressBehavior? {
      val fnPtr = _130936199_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AnimationControllerProgressBehavior>()
      val hr = fn.invokeHR(arrayOf(__130936199_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AnimationControllerProgressBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ProgressBehavior(value: AnimationControllerProgressBehavior?): Unit {
      val fnPtr = _130936199_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__130936199_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun Pause(): Unit {
      val fnPtr = _130936199_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__130936199_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun Resume(): Unit {
      val fnPtr = _130936199_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__130936199_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAnimationController_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __130936199_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnimationController, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bd0f88a8a41553228c3d1a6d9192754f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnimationController(ptr: Pointer?): WithDefault = IAnimationController_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnimationController {
      val address = segment.toRawLongValue()
      return makeIAnimationController(Pointer(address))
    }

    public override fun toNative(obj: IAnimationController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__130936199_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnimationController): Array<IAnimationController?> =
        (elements as
        Array<IAnimationController?>).castToImpl<IAnimationController,IAnimationController_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnimationController?> =
        arrayOfNulls<IAnimationController_Impl>(size) as Array<IAnimationController?>
  }
}
