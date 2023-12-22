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

@ABIMarker(ILoggingChannelFactory2.ABI::class)
@Signature("{4c6ef5dd-3b27-4dc9-99f0-299c6e4603a1}")
@Guid("4c6ef5dd3b274dc999f0299c6e4603a1")
@WinRTInterface("4c6ef5dd3b274dc999f0299c6e4603a1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILoggingChannelFactory2.ByReference::class)
public interface ILoggingChannelFactory2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWithOptions(name: String?, options: LoggingChannelOptions?): LoggingChannel?

  @InterfaceMethod(1)
  public fun CreateWithOptionsAndId(
    name: String?,
    options: LoggingChannelOptions?,
    id: com.sun.jna.platform.win32.Guid.GUID?
  ): LoggingChannel?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILoggingChannelFactory2> {
    public override fun getValue() = ABI.makeILoggingChannelFactory2(pointer.getPointer(0))

    public fun setValue(value: ILoggingChannelFactory2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILoggingChannelFactory2 {
    public val __2015896697_Ptr: Pointer?

    public val _2015896697_VtblPtr: Pointer?
      get() = __2015896697_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWithOptions(name: String?, options: LoggingChannelOptions?):
        LoggingChannel? {
      val fnPtr = _2015896697_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LoggingChannel>()
      val hr = fn.invokeHR(arrayOf(__2015896697_Ptr, marshalToNative(name),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LoggingChannel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithOptionsAndId(
      name: String?,
      options: LoggingChannelOptions?,
      id: com.sun.jna.platform.win32.Guid.GUID?
    ): LoggingChannel? {
      val fnPtr = _2015896697_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LoggingChannel>()
      val hr = fn.invokeHR(arrayOf(__2015896697_Ptr, marshalToNative(name),
          marshalToNative(options), marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LoggingChannel>(result.getValue())
      return resultValue
    }
  }

  public class ILoggingChannelFactory2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2015896697_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILoggingChannelFactory2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4c6ef5dd3b274dc999f0299c6e4603a1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILoggingChannelFactory2(ptr: Pointer?): WithDefault =
        ILoggingChannelFactory2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILoggingChannelFactory2 {
      val address = segment.toRawLongValue()
      return makeILoggingChannelFactory2(Pointer(address))
    }

    public override fun toNative(obj: ILoggingChannelFactory2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2015896697_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILoggingChannelFactory2): Array<ILoggingChannelFactory2?>
        = (elements as
        Array<ILoggingChannelFactory2?>).castToImpl<ILoggingChannelFactory2,ILoggingChannelFactory2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILoggingChannelFactory2?> =
        arrayOfNulls<ILoggingChannelFactory2_Impl>(size) as Array<ILoggingChannelFactory2?>
  }
}
