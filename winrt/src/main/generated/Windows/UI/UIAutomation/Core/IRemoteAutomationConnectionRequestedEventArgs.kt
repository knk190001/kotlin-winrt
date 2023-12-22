package Windows.UI.UIAutomation.Core

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IRemoteAutomationConnectionRequestedEventArgs.ABI::class)
@Signature("{ea3319a8-e3a8-5dc6-adf8-044e46b14af5}")
@Guid("ea3319a8e3a85dc6adf8044e46b14af5")
@WinRTInterface("ea3319a8e3a85dc6adf8044e46b14af5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteAutomationConnectionRequestedEventArgs.ByReference::class)
public interface IRemoteAutomationConnectionRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LocalPipeName(): String?

  @InterfaceMethod(1)
  public fun get_RemoteProcessId(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteAutomationConnectionRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIRemoteAutomationConnectionRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRemoteAutomationConnectionRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteAutomationConnectionRequestedEventArgs {
    public val __1161217498_Ptr: Pointer?

    public val _1161217498_VtblPtr: Pointer?
      get() = __1161217498_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LocalPipeName(): String? {
      val fnPtr = _1161217498_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1161217498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RemoteProcessId(): WinDef.UINT {
      val fnPtr = _1161217498_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1161217498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IRemoteAutomationConnectionRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1161217498_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteAutomationConnectionRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ea3319a8e3a85dc6adf8044e46b14af5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteAutomationConnectionRequestedEventArgs(ptr: Pointer?): WithDefault =
        IRemoteAutomationConnectionRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IRemoteAutomationConnectionRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIRemoteAutomationConnectionRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRemoteAutomationConnectionRequestedEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1161217498_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteAutomationConnectionRequestedEventArgs):
        Array<IRemoteAutomationConnectionRequestedEventArgs?> = (elements as
        Array<IRemoteAutomationConnectionRequestedEventArgs?>).castToImpl<IRemoteAutomationConnectionRequestedEventArgs,IRemoteAutomationConnectionRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteAutomationConnectionRequestedEventArgs?> =
        arrayOfNulls<IRemoteAutomationConnectionRequestedEventArgs_Impl>(size) as
        Array<IRemoteAutomationConnectionRequestedEventArgs?>
  }
}
