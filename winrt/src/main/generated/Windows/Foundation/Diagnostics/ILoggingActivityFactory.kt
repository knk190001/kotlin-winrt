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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILoggingActivityFactory.ABI::class)
@Signature("{6b33b483-e10a-4c58-97d5-10fb451074fb}")
@Guid("6b33b483e10a4c5897d510fb451074fb")
@WinRTInterface("6b33b483e10a4c5897d510fb451074fb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILoggingActivityFactory.ByReference::class)
public interface ILoggingActivityFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateLoggingActivity(activityName: String?, loggingChannel: ILoggingChannel?):
      LoggingActivity?

  @InterfaceMethod(1)
  public fun CreateLoggingActivityWithLevel(
    activityName: String?,
    loggingChannel: ILoggingChannel?,
    level: LoggingLevel?
  ): LoggingActivity?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILoggingActivityFactory> {
    public override fun getValue() = ABI.makeILoggingActivityFactory(pointer.getPointer(0))

    public fun setValue(value: ILoggingActivityFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILoggingActivityFactory {
    public val __470359273_Ptr: Pointer?

    public val _470359273_VtblPtr: Pointer?
      get() = __470359273_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateLoggingActivity(activityName: String?,
        loggingChannel: ILoggingChannel?): LoggingActivity? {
      val fnPtr = _470359273_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LoggingActivity>()
      val hr = fn.invokeHR(arrayOf(__470359273_Ptr, marshalToNative(activityName),
          marshalToNative(loggingChannel), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LoggingActivity>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateLoggingActivityWithLevel(
      activityName: String?,
      loggingChannel: ILoggingChannel?,
      level: LoggingLevel?
    ): LoggingActivity? {
      val fnPtr = _470359273_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LoggingActivity>()
      val hr = fn.invokeHR(arrayOf(__470359273_Ptr, marshalToNative(activityName),
          marshalToNative(loggingChannel), marshalToNative(level), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LoggingActivity>(result.getValue())
      return resultValue
    }
  }

  public class ILoggingActivityFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __470359273_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILoggingActivityFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6b33b483e10a4c5897d510fb451074fb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILoggingActivityFactory(ptr: Pointer?): WithDefault =
        ILoggingActivityFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILoggingActivityFactory {
      val address = segment.toRawLongValue()
      return makeILoggingActivityFactory(Pointer(address))
    }

    public override fun toNative(obj: ILoggingActivityFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__470359273_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILoggingActivityFactory): Array<ILoggingActivityFactory?>
        = (elements as
        Array<ILoggingActivityFactory?>).castToImpl<ILoggingActivityFactory,ILoggingActivityFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILoggingActivityFactory?> =
        arrayOfNulls<ILoggingActivityFactory_Impl>(size) as Array<ILoggingActivityFactory?>
  }
}
