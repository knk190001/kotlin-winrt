package Microsoft.UI.Xaml.Media.Animation

import Microsoft.UI.Xaml.Duration
import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IReference
import Windows.Foundation.TimeSpan
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITimeline.ABI::class)
@Signature("{d0f9b330-cc2a-5b05-9786-2da4c6584581}")
@Guid("d0f9b330cc2a5b0597862da4c6584581")
@WinRTInterface("d0f9b330cc2a5b0597862da4c6584581")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimeline.ByReference::class)
public interface ITimeline : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AutoReverse(): Boolean

  @InterfaceMethod(1)
  public fun put_AutoReverse(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_BeginTime(): IReference<TimeSpan?>?

  @InterfaceMethod(3)
  public fun put_BeginTime(value: IReference<TimeSpan?>?): Unit

  @InterfaceMethod(4)
  public fun get_Duration(): Duration?

  @InterfaceMethod(5)
  public fun put_Duration(value: Duration?): Unit

  @InterfaceMethod(6)
  public fun get_SpeedRatio(): Double

  @InterfaceMethod(7)
  public fun put_SpeedRatio(value: Double): Unit

  @InterfaceMethod(8)
  public fun get_FillBehavior(): FillBehavior?

  @InterfaceMethod(9)
  public fun put_FillBehavior(value: FillBehavior?): Unit

  @InterfaceMethod(10)
  public fun get_RepeatBehavior(): RepeatBehavior?

  @InterfaceMethod(11)
  public fun put_RepeatBehavior(value: RepeatBehavior?): Unit

  @InterfaceMethod(12)
  public fun add_Completed(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_Completed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITimeline> {
    public override fun getValue() = ABI.makeITimeline(pointer.getPointer(0))

    public fun setValue(value: ITimeline_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimeline {
    public val __2079271108_Ptr: Pointer?

    public val _2079271108_VtblPtr: Pointer?
      get() = __2079271108_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AutoReverse(): Boolean {
      val fnPtr = _2079271108_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2079271108_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AutoReverse(value: Boolean): Unit {
      val fnPtr = _2079271108_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2079271108_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_BeginTime(): IReference<TimeSpan?>? {
      val fnPtr = _2079271108_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__2079271108_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_BeginTime(value: IReference<TimeSpan?>?): Unit {
      val fnPtr = _2079271108_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2079271108_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Duration(): Duration? {
      val fnPtr = _2079271108_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Duration>()
      val hr = fn.invokeHR(arrayOf(__2079271108_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Duration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Duration(value: Duration?): Unit {
      val fnPtr = _2079271108_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2079271108_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_SpeedRatio(): Double {
      val fnPtr = _2079271108_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__2079271108_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_SpeedRatio(value: Double): Unit {
      val fnPtr = _2079271108_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2079271108_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_FillBehavior(): FillBehavior? {
      val fnPtr = _2079271108_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FillBehavior>()
      val hr = fn.invokeHR(arrayOf(__2079271108_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FillBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_FillBehavior(value: FillBehavior?): Unit {
      val fnPtr = _2079271108_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2079271108_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_RepeatBehavior(): RepeatBehavior? {
      val fnPtr = _2079271108_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RepeatBehavior>()
      val hr = fn.invokeHR(arrayOf(__2079271108_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RepeatBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_RepeatBehavior(value: RepeatBehavior?): Unit {
      val fnPtr = _2079271108_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2079271108_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun add_Completed(handler: EventHandler<IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _2079271108_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2079271108_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_Completed(token: EventRegistrationToken?): Unit {
      val fnPtr = _2079271108_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2079271108_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITimeline_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2079271108_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimeline, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d0f9b330cc2a5b0597862da4c6584581")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimeline(ptr: Pointer?): WithDefault = ITimeline_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimeline {
      val address = segment.toRawLongValue()
      return makeITimeline(Pointer(address))
    }

    public override fun toNative(obj: ITimeline): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2079271108_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimeline): Array<ITimeline?> = (elements as
        Array<ITimeline?>).castToImpl<ITimeline,ITimeline_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimeline?> = arrayOfNulls<ITimeline_Impl>(size)
        as Array<ITimeline?>
  }
}
