package Windows.Foundation.Diagnostics

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
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILoggingTarget.ABI::class)
@Signature("{65f16c35-e388-4e26-b17a-f51cd3a83916}")
@Guid("65f16c35e3884e26b17af51cd3a83916")
@WinRTInterface("65f16c35e3884e26b17af51cd3a83916")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILoggingTarget.ByReference::class)
public interface ILoggingTarget : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsEnabled(): Boolean

  @InterfaceMethod(1)
  public fun IsEnabled(level: LoggingLevel?): Boolean

  @InterfaceMethod(2)
  public fun IsEnabled(level: LoggingLevel?, keywords: Long): Boolean

  @InterfaceMethod(3)
  public fun LogEvent(eventName: String?): Unit

  @InterfaceMethod(4)
  public fun LogEvent(eventName: String?, fields: LoggingFields?): Unit

  @InterfaceMethod(5)
  public fun LogEvent(
    eventName: String?,
    fields: LoggingFields?,
    level: LoggingLevel?
  ): Unit

  @InterfaceMethod(6)
  public fun LogEvent(
    eventName: String?,
    fields: LoggingFields?,
    level: LoggingLevel?,
    options: LoggingOptions?
  ): Unit

  @InterfaceMethod(7)
  public fun StartActivity(startEventName: String?): LoggingActivity?

  @InterfaceMethod(8)
  public fun StartActivity(startEventName: String?, fields: LoggingFields?): LoggingActivity?

  @InterfaceMethod(9)
  public fun StartActivity(
    startEventName: String?,
    fields: LoggingFields?,
    level: LoggingLevel?
  ): LoggingActivity?

  @InterfaceMethod(10)
  public fun StartActivity(
    startEventName: String?,
    fields: LoggingFields?,
    level: LoggingLevel?,
    options: LoggingOptions?
  ): LoggingActivity?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ILoggingTarget>
      {
    public override fun getValue() = ABI.makeILoggingTarget(pointer.getPointer(0))

    public fun setValue(value: ILoggingTarget_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILoggingTarget {
    public val __1118672925_Ptr: Pointer?

    public val _1118672925_VtblPtr: Pointer?
      get() = __1118672925_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsEnabled(): Boolean {
      val fnPtr = _1118672925_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1118672925_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun IsEnabled(level: LoggingLevel?): Boolean {
      val fnPtr = _1118672925_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1118672925_Ptr, marshalToNative(level), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun IsEnabled(level: LoggingLevel?, keywords: Long): Boolean {
      val fnPtr = _1118672925_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1118672925_Ptr, marshalToNative(level), keywords, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun LogEvent(eventName: String?): Unit {
      val fnPtr = _1118672925_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1118672925_Ptr, marshalToNative(eventName),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun LogEvent(eventName: String?, fields: LoggingFields?): Unit {
      val fnPtr = _1118672925_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1118672925_Ptr, marshalToNative(eventName),
          marshalToNative(fields),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun LogEvent(
      eventName: String?,
      fields: LoggingFields?,
      level: LoggingLevel?
    ): Unit {
      val fnPtr = _1118672925_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1118672925_Ptr, marshalToNative(eventName),
          marshalToNative(fields), marshalToNative(level),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun LogEvent(
      eventName: String?,
      fields: LoggingFields?,
      level: LoggingLevel?,
      options: LoggingOptions?
    ): Unit {
      val fnPtr = _1118672925_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1118672925_Ptr, marshalToNative(eventName),
          marshalToNative(fields), marshalToNative(level), marshalToNative(options),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun StartActivity(startEventName: String?): LoggingActivity? {
      val fnPtr = _1118672925_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LoggingActivity>()
      val hr = fn.invokeHR(arrayOf(__1118672925_Ptr, marshalToNative(startEventName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LoggingActivity>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun StartActivity(startEventName: String?, fields: LoggingFields?):
        LoggingActivity? {
      val fnPtr = _1118672925_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LoggingActivity>()
      val hr = fn.invokeHR(arrayOf(__1118672925_Ptr, marshalToNative(startEventName),
          marshalToNative(fields), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LoggingActivity>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun StartActivity(
      startEventName: String?,
      fields: LoggingFields?,
      level: LoggingLevel?
    ): LoggingActivity? {
      val fnPtr = _1118672925_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LoggingActivity>()
      val hr = fn.invokeHR(arrayOf(__1118672925_Ptr, marshalToNative(startEventName),
          marshalToNative(fields), marshalToNative(level), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LoggingActivity>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun StartActivity(
      startEventName: String?,
      fields: LoggingFields?,
      level: LoggingLevel?,
      options: LoggingOptions?
    ): LoggingActivity? {
      val fnPtr = _1118672925_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LoggingActivity>()
      val hr = fn.invokeHR(arrayOf(__1118672925_Ptr, marshalToNative(startEventName),
          marshalToNative(fields), marshalToNative(level), marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LoggingActivity>(result.getValue())
      return resultValue
    }
  }

  public class ILoggingTarget_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1118672925_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILoggingTarget, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("65f16c35e3884e26b17af51cd3a83916")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILoggingTarget(ptr: Pointer?): WithDefault = ILoggingTarget_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILoggingTarget {
      val address = segment.toRawLongValue()
      return makeILoggingTarget(Pointer(address))
    }

    public override fun toNative(obj: ILoggingTarget): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1118672925_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILoggingTarget): Array<ILoggingTarget?> = (elements as
        Array<ILoggingTarget?>).castToImpl<ILoggingTarget,ILoggingTarget_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILoggingTarget?> =
        arrayOfNulls<ILoggingTarget_Impl>(size) as Array<ILoggingTarget?>
  }
}
