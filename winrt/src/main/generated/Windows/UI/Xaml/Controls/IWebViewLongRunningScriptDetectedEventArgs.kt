package Windows.UI.Xaml.Controls

import Windows.Foundation.TimeSpan
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebViewLongRunningScriptDetectedEventArgs.ABI::class)
@Signature("{f3f020ab-a46c-42b0-9efe-69764d5cffa6}")
@Guid("f3f020aba46c42b09efe69764d5cffa6")
@WinRTInterface("f3f020aba46c42b09efe69764d5cffa6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewLongRunningScriptDetectedEventArgs.ByReference::class)
public interface IWebViewLongRunningScriptDetectedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExecutionTime(): TimeSpan?

  @InterfaceMethod(1)
  public fun get_StopPageScriptExecution(): Boolean

  @InterfaceMethod(2)
  public fun put_StopPageScriptExecution(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewLongRunningScriptDetectedEventArgs> {
    public override fun getValue() =
        ABI.makeIWebViewLongRunningScriptDetectedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWebViewLongRunningScriptDetectedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewLongRunningScriptDetectedEventArgs {
    public val __1167473380_Ptr: Pointer?

    public val _1167473380_VtblPtr: Pointer?
      get() = __1167473380_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExecutionTime(): TimeSpan? {
      val fnPtr = _1167473380_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1167473380_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_StopPageScriptExecution(): Boolean {
      val fnPtr = _1167473380_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1167473380_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_StopPageScriptExecution(value: Boolean): Unit {
      val fnPtr = _1167473380_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1167473380_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebViewLongRunningScriptDetectedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1167473380_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewLongRunningScriptDetectedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f3f020aba46c42b09efe69764d5cffa6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewLongRunningScriptDetectedEventArgs(ptr: Pointer?): WithDefault =
        IWebViewLongRunningScriptDetectedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IWebViewLongRunningScriptDetectedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWebViewLongRunningScriptDetectedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWebViewLongRunningScriptDetectedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1167473380_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewLongRunningScriptDetectedEventArgs):
        Array<IWebViewLongRunningScriptDetectedEventArgs?> = (elements as
        Array<IWebViewLongRunningScriptDetectedEventArgs?>).castToImpl<IWebViewLongRunningScriptDetectedEventArgs,IWebViewLongRunningScriptDetectedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewLongRunningScriptDetectedEventArgs?> =
        arrayOfNulls<IWebViewLongRunningScriptDetectedEventArgs_Impl>(size) as
        Array<IWebViewLongRunningScriptDetectedEventArgs?>
  }
}
