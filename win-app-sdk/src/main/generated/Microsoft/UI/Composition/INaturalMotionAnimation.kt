package Microsoft.UI.Composition

import Windows.Foundation.TimeSpan
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INaturalMotionAnimation.ABI::class)
@Signature("{2ff54ebb-a035-50be-a73c-20014975ee31}")
@Guid("2ff54ebba03550bea73c20014975ee31")
@WinRTInterface("2ff54ebba03550bea73c20014975ee31")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INaturalMotionAnimation.ByReference::class)
public interface INaturalMotionAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DelayBehavior(): AnimationDelayBehavior?

  @InterfaceMethod(1)
  public fun put_DelayBehavior(value: AnimationDelayBehavior?): Unit

  @InterfaceMethod(2)
  public fun get_DelayTime(): TimeSpan?

  @InterfaceMethod(3)
  public fun put_DelayTime(value: TimeSpan?): Unit

  @InterfaceMethod(4)
  public fun get_StopBehavior(): AnimationStopBehavior?

  @InterfaceMethod(5)
  public fun put_StopBehavior(value: AnimationStopBehavior?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INaturalMotionAnimation> {
    public override fun getValue() = ABI.makeINaturalMotionAnimation(pointer.getPointer(0))

    public fun setValue(value: INaturalMotionAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INaturalMotionAnimation {
    public val __1573236830_Ptr: Pointer?

    public val _1573236830_VtblPtr: Pointer?
      get() = __1573236830_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DelayBehavior(): AnimationDelayBehavior? {
      val fnPtr = _1573236830_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AnimationDelayBehavior>()
      val hr = fn.invokeHR(arrayOf(__1573236830_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AnimationDelayBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DelayBehavior(value: AnimationDelayBehavior?): Unit {
      val fnPtr = _1573236830_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1573236830_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DelayTime(): TimeSpan? {
      val fnPtr = _1573236830_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1573236830_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_DelayTime(value: TimeSpan?): Unit {
      val fnPtr = _1573236830_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1573236830_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_StopBehavior(): AnimationStopBehavior? {
      val fnPtr = _1573236830_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AnimationStopBehavior>()
      val hr = fn.invokeHR(arrayOf(__1573236830_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AnimationStopBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_StopBehavior(value: AnimationStopBehavior?): Unit {
      val fnPtr = _1573236830_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1573236830_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class INaturalMotionAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1573236830_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INaturalMotionAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2ff54ebba03550bea73c20014975ee31")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINaturalMotionAnimation(ptr: Pointer?): WithDefault =
        INaturalMotionAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INaturalMotionAnimation {
      val address = segment.toRawLongValue()
      return makeINaturalMotionAnimation(Pointer(address))
    }

    public override fun toNative(obj: INaturalMotionAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1573236830_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INaturalMotionAnimation): Array<INaturalMotionAnimation?>
        = (elements as
        Array<INaturalMotionAnimation?>).castToImpl<INaturalMotionAnimation,INaturalMotionAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INaturalMotionAnimation?> =
        arrayOfNulls<INaturalMotionAnimation_Impl>(size) as Array<INaturalMotionAnimation?>
  }
}
