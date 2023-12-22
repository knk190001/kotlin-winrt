package Windows.Media.Capture

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

@ABIMarker(IAppBroadcastPlugInStateChangedEventArgs.ABI::class)
@Signature("{4881d0f2-abc5-4fc6-84b0-89370bb47212}")
@Guid("4881d0f2abc54fc684b089370bb47212")
@WinRTInterface("4881d0f2abc54fc684b089370bb47212")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastPlugInStateChangedEventArgs.ByReference::class)
public interface IAppBroadcastPlugInStateChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PlugInState(): AppBroadcastPlugInState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastPlugInStateChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIAppBroadcastPlugInStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastPlugInStateChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastPlugInStateChangedEventArgs {
    public val __422106935_Ptr: Pointer?

    public val _422106935_VtblPtr: Pointer?
      get() = __422106935_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PlugInState(): AppBroadcastPlugInState? {
      val fnPtr = _422106935_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastPlugInState>()
      val hr = fn.invokeHR(arrayOf(__422106935_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastPlugInState>(result.getValue())
      return resultValue
    }
  }

  public class IAppBroadcastPlugInStateChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __422106935_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastPlugInStateChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4881d0f2abc54fc684b089370bb47212")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastPlugInStateChangedEventArgs(ptr: Pointer?): WithDefault =
        IAppBroadcastPlugInStateChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppBroadcastPlugInStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastPlugInStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastPlugInStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__422106935_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastPlugInStateChangedEventArgs):
        Array<IAppBroadcastPlugInStateChangedEventArgs?> = (elements as
        Array<IAppBroadcastPlugInStateChangedEventArgs?>).castToImpl<IAppBroadcastPlugInStateChangedEventArgs,IAppBroadcastPlugInStateChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastPlugInStateChangedEventArgs?> =
        arrayOfNulls<IAppBroadcastPlugInStateChangedEventArgs_Impl>(size) as
        Array<IAppBroadcastPlugInStateChangedEventArgs?>
  }
}
