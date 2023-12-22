package Windows.ApplicationModel.Core

import Windows.Foundation.Deferral
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

@ABIMarker(IHostedViewClosingEventArgs.ABI::class)
@Signature("{d238943c-b24e-4790-acb5-3e4243c4ff87}")
@Guid("d238943cb24e4790acb53e4243c4ff87")
@WinRTInterface("d238943cb24e4790acb53e4243c4ff87")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHostedViewClosingEventArgs.ByReference::class)
public interface IHostedViewClosingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHostedViewClosingEventArgs> {
    public override fun getValue() = ABI.makeIHostedViewClosingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IHostedViewClosingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHostedViewClosingEventArgs {
    public val __1085403950_Ptr: Pointer?

    public val _1085403950_VtblPtr: Pointer?
      get() = __1085403950_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1085403950_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1085403950_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IHostedViewClosingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1085403950_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHostedViewClosingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d238943cb24e4790acb53e4243c4ff87")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHostedViewClosingEventArgs(ptr: Pointer?): WithDefault =
        IHostedViewClosingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHostedViewClosingEventArgs {
      val address = segment.toRawLongValue()
      return makeIHostedViewClosingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IHostedViewClosingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1085403950_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHostedViewClosingEventArgs):
        Array<IHostedViewClosingEventArgs?> = (elements as
        Array<IHostedViewClosingEventArgs?>).castToImpl<IHostedViewClosingEventArgs,IHostedViewClosingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHostedViewClosingEventArgs?> =
        arrayOfNulls<IHostedViewClosingEventArgs_Impl>(size) as Array<IHostedViewClosingEventArgs?>
  }
}
