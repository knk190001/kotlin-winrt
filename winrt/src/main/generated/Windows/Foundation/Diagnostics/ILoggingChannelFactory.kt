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

@ABIMarker(ILoggingChannelFactory.ABI::class)
@Signature("{4edc5b9c-af80-4a9b-b0dc-398f9ae5207b}")
@Guid("4edc5b9caf804a9bb0dc398f9ae5207b")
@WinRTInterface("4edc5b9caf804a9bb0dc398f9ae5207b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILoggingChannelFactory.ByReference::class)
public interface ILoggingChannelFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(name: String?): LoggingChannel?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILoggingChannelFactory> {
    public override fun getValue() = ABI.makeILoggingChannelFactory(pointer.getPointer(0))

    public fun setValue(value: ILoggingChannelFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILoggingChannelFactory {
    public val __1034860249_Ptr: Pointer?

    public val _1034860249_VtblPtr: Pointer?
      get() = __1034860249_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(name: String?): LoggingChannel? {
      val fnPtr = _1034860249_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LoggingChannel>()
      val hr = fn.invokeHR(arrayOf(__1034860249_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LoggingChannel>(result.getValue())
      return resultValue
    }
  }

  public class ILoggingChannelFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1034860249_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILoggingChannelFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4edc5b9caf804a9bb0dc398f9ae5207b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILoggingChannelFactory(ptr: Pointer?): WithDefault =
        ILoggingChannelFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILoggingChannelFactory {
      val address = segment.toRawLongValue()
      return makeILoggingChannelFactory(Pointer(address))
    }

    public override fun toNative(obj: ILoggingChannelFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1034860249_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILoggingChannelFactory): Array<ILoggingChannelFactory?> =
        (elements as
        Array<ILoggingChannelFactory?>).castToImpl<ILoggingChannelFactory,ILoggingChannelFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILoggingChannelFactory?> =
        arrayOfNulls<ILoggingChannelFactory_Impl>(size) as Array<ILoggingChannelFactory?>
  }
}
