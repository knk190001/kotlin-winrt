package Windows.System

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

@ABIMarker(IAppDiagnosticInfoWatcherEventArgs.ABI::class)
@Signature("{7017c716-e1da-4c65-99df-046dff5be71a}")
@Guid("7017c716e1da4c6599df046dff5be71a")
@WinRTInterface("7017c716e1da4c6599df046dff5be71a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppDiagnosticInfoWatcherEventArgs.ByReference::class)
public interface IAppDiagnosticInfoWatcherEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AppDiagnosticInfo(): AppDiagnosticInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppDiagnosticInfoWatcherEventArgs> {
    public override fun getValue() =
        ABI.makeIAppDiagnosticInfoWatcherEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppDiagnosticInfoWatcherEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppDiagnosticInfoWatcherEventArgs {
    public val __922898366_Ptr: Pointer?

    public val _922898366_VtblPtr: Pointer?
      get() = __922898366_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppDiagnosticInfo(): AppDiagnosticInfo? {
      val fnPtr = _922898366_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppDiagnosticInfo>()
      val hr = fn.invokeHR(arrayOf(__922898366_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppDiagnosticInfo>(result.getValue())
      return resultValue
    }
  }

  public class IAppDiagnosticInfoWatcherEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __922898366_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppDiagnosticInfoWatcherEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7017c716e1da4c6599df046dff5be71a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppDiagnosticInfoWatcherEventArgs(ptr: Pointer?): WithDefault =
        IAppDiagnosticInfoWatcherEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppDiagnosticInfoWatcherEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppDiagnosticInfoWatcherEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppDiagnosticInfoWatcherEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__922898366_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppDiagnosticInfoWatcherEventArgs):
        Array<IAppDiagnosticInfoWatcherEventArgs?> = (elements as
        Array<IAppDiagnosticInfoWatcherEventArgs?>).castToImpl<IAppDiagnosticInfoWatcherEventArgs,IAppDiagnosticInfoWatcherEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppDiagnosticInfoWatcherEventArgs?> =
        arrayOfNulls<IAppDiagnosticInfoWatcherEventArgs_Impl>(size) as
        Array<IAppDiagnosticInfoWatcherEventArgs?>
  }
}
