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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILoggingChannelOptionsFactory.ABI::class)
@Signature("{a93151da-7faf-4191-8755-5e86dc65d896}")
@Guid("a93151da7faf419187555e86dc65d896")
@WinRTInterface("a93151da7faf419187555e86dc65d896")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILoggingChannelOptionsFactory.ByReference::class)
public interface ILoggingChannelOptionsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(group: com.sun.jna.platform.win32.Guid.GUID?): LoggingChannelOptions?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILoggingChannelOptionsFactory> {
    public override fun getValue() = ABI.makeILoggingChannelOptionsFactory(pointer.getPointer(0))

    public fun setValue(value: ILoggingChannelOptionsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILoggingChannelOptionsFactory {
    public val __798250973_Ptr: Pointer?

    public val _798250973_VtblPtr: Pointer?
      get() = __798250973_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(group: com.sun.jna.platform.win32.Guid.GUID?):
        LoggingChannelOptions? {
      val fnPtr = _798250973_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LoggingChannelOptions>()
      val hr = fn.invokeHR(arrayOf(__798250973_Ptr, marshalToNative(group), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LoggingChannelOptions>(result.getValue())
      return resultValue
    }
  }

  public class ILoggingChannelOptionsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __798250973_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILoggingChannelOptionsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a93151da7faf419187555e86dc65d896")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILoggingChannelOptionsFactory(ptr: Pointer?): WithDefault =
        ILoggingChannelOptionsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILoggingChannelOptionsFactory {
      val address = segment.toRawLongValue()
      return makeILoggingChannelOptionsFactory(Pointer(address))
    }

    public override fun toNative(obj: ILoggingChannelOptionsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__798250973_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILoggingChannelOptionsFactory):
        Array<ILoggingChannelOptionsFactory?> = (elements as
        Array<ILoggingChannelOptionsFactory?>).castToImpl<ILoggingChannelOptionsFactory,ILoggingChannelOptionsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILoggingChannelOptionsFactory?> =
        arrayOfNulls<ILoggingChannelOptionsFactory_Impl>(size) as
        Array<ILoggingChannelOptionsFactory?>
  }
}
