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
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IKeyFrameAnimation.ABI::class)
@Signature("{5a8f57f0-f059-5b47-b308-c4c80fc71248}")
@Guid("5a8f57f0f0595b47b308c4c80fc71248")
@WinRTInterface("5a8f57f0f0595b47b308c4c80fc71248")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyFrameAnimation.ByReference::class)
public interface IKeyFrameAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DelayTime(): TimeSpan?

  @InterfaceMethod(1)
  public fun put_DelayTime(value: TimeSpan?): Unit

  @InterfaceMethod(2)
  public fun get_Duration(): TimeSpan?

  @InterfaceMethod(3)
  public fun put_Duration(value: TimeSpan?): Unit

  @InterfaceMethod(4)
  public fun get_IterationBehavior(): AnimationIterationBehavior?

  @InterfaceMethod(5)
  public fun put_IterationBehavior(value: AnimationIterationBehavior?): Unit

  @InterfaceMethod(6)
  public fun get_IterationCount(): Int

  @InterfaceMethod(7)
  public fun put_IterationCount(value: Int): Unit

  @InterfaceMethod(8)
  public fun get_KeyFrameCount(): Int

  @InterfaceMethod(9)
  public fun get_StopBehavior(): AnimationStopBehavior?

  @InterfaceMethod(10)
  public fun put_StopBehavior(value: AnimationStopBehavior?): Unit

  @InterfaceMethod(11)
  public fun InsertExpressionKeyFrame(normalizedProgressKey: Float, value: String?): Unit

  @InterfaceMethod(12)
  public fun InsertExpressionKeyFrame(
    normalizedProgressKey: Float,
    value: String?,
    easingFunction: CompositionEasingFunction?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyFrameAnimation> {
    public override fun getValue() = ABI.makeIKeyFrameAnimation(pointer.getPointer(0))

    public fun setValue(value: IKeyFrameAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyFrameAnimation {
    public val __51281443_Ptr: Pointer?

    public val _51281443_VtblPtr: Pointer?
      get() = __51281443_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DelayTime(): TimeSpan? {
      val fnPtr = _51281443_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__51281443_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DelayTime(value: TimeSpan?): Unit {
      val fnPtr = _51281443_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__51281443_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Duration(): TimeSpan? {
      val fnPtr = _51281443_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__51281443_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Duration(value: TimeSpan?): Unit {
      val fnPtr = _51281443_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__51281443_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IterationBehavior(): AnimationIterationBehavior? {
      val fnPtr = _51281443_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AnimationIterationBehavior>()
      val hr = fn.invokeHR(arrayOf(__51281443_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AnimationIterationBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_IterationBehavior(value: AnimationIterationBehavior?): Unit {
      val fnPtr = _51281443_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__51281443_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IterationCount(): Int {
      val fnPtr = _51281443_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__51281443_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_IterationCount(value: Int): Unit {
      val fnPtr = _51281443_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__51281443_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_KeyFrameCount(): Int {
      val fnPtr = _51281443_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__51281443_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_StopBehavior(): AnimationStopBehavior? {
      val fnPtr = _51281443_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AnimationStopBehavior>()
      val hr = fn.invokeHR(arrayOf(__51281443_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AnimationStopBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_StopBehavior(value: AnimationStopBehavior?): Unit {
      val fnPtr = _51281443_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__51281443_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun InsertExpressionKeyFrame(normalizedProgressKey: Float, value: String?):
        Unit {
      val fnPtr = _51281443_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__51281443_Ptr, normalizedProgressKey, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun InsertExpressionKeyFrame(
      normalizedProgressKey: Float,
      value: String?,
      easingFunction: CompositionEasingFunction?
    ): Unit {
      val fnPtr = _51281443_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__51281443_Ptr, normalizedProgressKey, marshalToNative(value),
          marshalToNative(easingFunction),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IKeyFrameAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __51281443_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyFrameAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5a8f57f0f0595b47b308c4c80fc71248")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyFrameAnimation(ptr: Pointer?): WithDefault = IKeyFrameAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyFrameAnimation {
      val address = segment.toRawLongValue()
      return makeIKeyFrameAnimation(Pointer(address))
    }

    public override fun toNative(obj: IKeyFrameAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__51281443_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyFrameAnimation): Array<IKeyFrameAnimation?> =
        (elements as
        Array<IKeyFrameAnimation?>).castToImpl<IKeyFrameAnimation,IKeyFrameAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyFrameAnimation?> =
        arrayOfNulls<IKeyFrameAnimation_Impl>(size) as Array<IKeyFrameAnimation?>
  }
}
