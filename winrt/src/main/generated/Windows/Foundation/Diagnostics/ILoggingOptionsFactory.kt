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
import kotlin.Long
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILoggingOptionsFactory.ABI::class)
@Signature("{d713c6cb-98ab-464b-9f22-a3268478368a}")
@Guid("d713c6cb98ab464b9f22a3268478368a")
@WinRTInterface("d713c6cb98ab464b9f22a3268478368a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILoggingOptionsFactory.ByReference::class)
public interface ILoggingOptionsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWithKeywords(keywords: Long): LoggingOptions?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILoggingOptionsFactory> {
    public override fun getValue() = ABI.makeILoggingOptionsFactory(pointer.getPointer(0))

    public fun setValue(value: ILoggingOptionsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILoggingOptionsFactory {
    public val __205670178_Ptr: Pointer?

    public val _205670178_VtblPtr: Pointer?
      get() = __205670178_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWithKeywords(keywords: Long): LoggingOptions? {
      val fnPtr = _205670178_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LoggingOptions>()
      val hr = fn.invokeHR(arrayOf(__205670178_Ptr, keywords, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LoggingOptions>(result.getValue())
      return resultValue
    }
  }

  public class ILoggingOptionsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __205670178_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILoggingOptionsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d713c6cb98ab464b9f22a3268478368a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILoggingOptionsFactory(ptr: Pointer?): WithDefault =
        ILoggingOptionsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILoggingOptionsFactory {
      val address = segment.toRawLongValue()
      return makeILoggingOptionsFactory(Pointer(address))
    }

    public override fun toNative(obj: ILoggingOptionsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__205670178_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILoggingOptionsFactory): Array<ILoggingOptionsFactory?> =
        (elements as
        Array<ILoggingOptionsFactory?>).castToImpl<ILoggingOptionsFactory,ILoggingOptionsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILoggingOptionsFactory?> =
        arrayOfNulls<ILoggingOptionsFactory_Impl>(size) as Array<ILoggingOptionsFactory?>
  }
}
