package Windows.System.Threading

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

@ABIMarker(IThreadPoolTimerStatics.ABI::class)
@Signature("{1a8a9d02-e482-461b-b8c7-8efad1cce590}")
@Guid("1a8a9d02e482461bb8c78efad1cce590")
@WinRTInterface("1a8a9d02e482461bb8c78efad1cce590")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IThreadPoolTimerStatics.ByReference::class)
public interface IThreadPoolTimerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreatePeriodicTimer(handler: TimerElapsedHandler?, period: TimeSpan?): ThreadPoolTimer?

  @InterfaceMethod(1)
  public fun CreateTimer(handler: TimerElapsedHandler?, delay: TimeSpan?): ThreadPoolTimer?

  @InterfaceMethod(2)
  public fun CreatePeriodicTimer(
    handler: TimerElapsedHandler?,
    period: TimeSpan?,
    destroyed: TimerDestroyedHandler?
  ): ThreadPoolTimer?

  @InterfaceMethod(3)
  public fun CreateTimer(
    handler: TimerElapsedHandler?,
    delay: TimeSpan?,
    destroyed: TimerDestroyedHandler?
  ): ThreadPoolTimer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IThreadPoolTimerStatics> {
    public override fun getValue() = ABI.makeIThreadPoolTimerStatics(pointer.getPointer(0))

    public fun setValue(value: IThreadPoolTimerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IThreadPoolTimerStatics {
    public val __2094760053_Ptr: Pointer?

    public val _2094760053_VtblPtr: Pointer?
      get() = __2094760053_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreatePeriodicTimer(handler: TimerElapsedHandler?, period: TimeSpan?):
        ThreadPoolTimer? {
      val fnPtr = _2094760053_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ThreadPoolTimer>()
      val hr = fn.invokeHR(arrayOf(__2094760053_Ptr, marshalToNative(handler),
          marshalToNative(period), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ThreadPoolTimer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateTimer(handler: TimerElapsedHandler?, delay: TimeSpan?):
        ThreadPoolTimer? {
      val fnPtr = _2094760053_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ThreadPoolTimer>()
      val hr = fn.invokeHR(arrayOf(__2094760053_Ptr, marshalToNative(handler),
          marshalToNative(delay), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ThreadPoolTimer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreatePeriodicTimer(
      handler: TimerElapsedHandler?,
      period: TimeSpan?,
      destroyed: TimerDestroyedHandler?
    ): ThreadPoolTimer? {
      val fnPtr = _2094760053_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ThreadPoolTimer>()
      val hr = fn.invokeHR(arrayOf(__2094760053_Ptr, marshalToNative(handler),
          marshalToNative(period), marshalToNative(destroyed), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ThreadPoolTimer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateTimer(
      handler: TimerElapsedHandler?,
      delay: TimeSpan?,
      destroyed: TimerDestroyedHandler?
    ): ThreadPoolTimer? {
      val fnPtr = _2094760053_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ThreadPoolTimer>()
      val hr = fn.invokeHR(arrayOf(__2094760053_Ptr, marshalToNative(handler),
          marshalToNative(delay), marshalToNative(destroyed), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ThreadPoolTimer>(result.getValue())
      return resultValue
    }
  }

  public class IThreadPoolTimerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2094760053_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IThreadPoolTimerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1a8a9d02e482461bb8c78efad1cce590")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIThreadPoolTimerStatics(ptr: Pointer?): WithDefault =
        IThreadPoolTimerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IThreadPoolTimerStatics {
      val address = segment.toRawLongValue()
      return makeIThreadPoolTimerStatics(Pointer(address))
    }

    public override fun toNative(obj: IThreadPoolTimerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2094760053_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IThreadPoolTimerStatics): Array<IThreadPoolTimerStatics?>
        = (elements as
        Array<IThreadPoolTimerStatics?>).castToImpl<IThreadPoolTimerStatics,IThreadPoolTimerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IThreadPoolTimerStatics?> =
        arrayOfNulls<IThreadPoolTimerStatics_Impl>(size) as Array<IThreadPoolTimerStatics?>
  }
}
