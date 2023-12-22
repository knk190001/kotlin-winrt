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

@ABIMarker(IAppBroadcastStreamStateChangedEventArgs.ABI::class)
@Signature("{5108a733-d008-4a89-93be-58aed961374e}")
@Guid("5108a733d0084a8993be58aed961374e")
@WinRTInterface("5108a733d0084a8993be58aed961374e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastStreamStateChangedEventArgs.ByReference::class)
public interface IAppBroadcastStreamStateChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StreamState(): AppBroadcastStreamState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastStreamStateChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIAppBroadcastStreamStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastStreamStateChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastStreamStateChangedEventArgs {
    public val __1960734020_Ptr: Pointer?

    public val _1960734020_VtblPtr: Pointer?
      get() = __1960734020_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StreamState(): AppBroadcastStreamState? {
      val fnPtr = _1960734020_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastStreamState>()
      val hr = fn.invokeHR(arrayOf(__1960734020_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastStreamState>(result.getValue())
      return resultValue
    }
  }

  public class IAppBroadcastStreamStateChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1960734020_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastStreamStateChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5108a733d0084a8993be58aed961374e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastStreamStateChangedEventArgs(ptr: Pointer?): WithDefault =
        IAppBroadcastStreamStateChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppBroadcastStreamStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastStreamStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastStreamStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1960734020_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastStreamStateChangedEventArgs):
        Array<IAppBroadcastStreamStateChangedEventArgs?> = (elements as
        Array<IAppBroadcastStreamStateChangedEventArgs?>).castToImpl<IAppBroadcastStreamStateChangedEventArgs,IAppBroadcastStreamStateChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastStreamStateChangedEventArgs?> =
        arrayOfNulls<IAppBroadcastStreamStateChangedEventArgs_Impl>(size) as
        Array<IAppBroadcastStreamStateChangedEventArgs?>
  }
}
