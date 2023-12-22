package Windows.Devices.WiFiDirect.Services

import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IWiFiDirectServiceSessionDeferredEventArgs.ABI::class)
@Signature("{8dfc197f-1201-4f1f-b6f4-5df1b7b9fb2e}")
@Guid("8dfc197f12014f1fb6f45df1b7b9fb2e")
@WinRTInterface("8dfc197f12014f1fb6f45df1b7b9fb2e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWiFiDirectServiceSessionDeferredEventArgs.ByReference::class)
public interface IWiFiDirectServiceSessionDeferredEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeferredSessionInfo(): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWiFiDirectServiceSessionDeferredEventArgs> {
    public override fun getValue() =
        ABI.makeIWiFiDirectServiceSessionDeferredEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWiFiDirectServiceSessionDeferredEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWiFiDirectServiceSessionDeferredEventArgs {
    public val __1153650242_Ptr: Pointer?

    public val _1153650242_VtblPtr: Pointer?
      get() = __1153650242_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeferredSessionInfo(): IBuffer? {
      val fnPtr = _1153650242_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1153650242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IWiFiDirectServiceSessionDeferredEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1153650242_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWiFiDirectServiceSessionDeferredEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8dfc197f12014f1fb6f45df1b7b9fb2e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWiFiDirectServiceSessionDeferredEventArgs(ptr: Pointer?): WithDefault =
        IWiFiDirectServiceSessionDeferredEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IWiFiDirectServiceSessionDeferredEventArgs {
      val address = segment.toRawLongValue()
      return makeIWiFiDirectServiceSessionDeferredEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWiFiDirectServiceSessionDeferredEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1153650242_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWiFiDirectServiceSessionDeferredEventArgs):
        Array<IWiFiDirectServiceSessionDeferredEventArgs?> = (elements as
        Array<IWiFiDirectServiceSessionDeferredEventArgs?>).castToImpl<IWiFiDirectServiceSessionDeferredEventArgs,IWiFiDirectServiceSessionDeferredEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWiFiDirectServiceSessionDeferredEventArgs?> =
        arrayOfNulls<IWiFiDirectServiceSessionDeferredEventArgs_Impl>(size) as
        Array<IWiFiDirectServiceSessionDeferredEventArgs?>
  }
}
