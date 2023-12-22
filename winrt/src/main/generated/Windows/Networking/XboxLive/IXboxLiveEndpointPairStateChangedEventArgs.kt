package Windows.Networking.XboxLive

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

@ABIMarker(IXboxLiveEndpointPairStateChangedEventArgs.ABI::class)
@Signature("{592e3b55-de08-44e7-ac3b-b9b9a169583a}")
@Guid("592e3b55de0844e7ac3bb9b9a169583a")
@WinRTInterface("592e3b55de0844e7ac3bb9b9a169583a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXboxLiveEndpointPairStateChangedEventArgs.ByReference::class)
public interface IXboxLiveEndpointPairStateChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OldState(): XboxLiveEndpointPairState?

  @InterfaceMethod(1)
  public fun get_NewState(): XboxLiveEndpointPairState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXboxLiveEndpointPairStateChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIXboxLiveEndpointPairStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IXboxLiveEndpointPairStateChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXboxLiveEndpointPairStateChangedEventArgs {
    public val __1155568693_Ptr: Pointer?

    public val _1155568693_VtblPtr: Pointer?
      get() = __1155568693_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OldState(): XboxLiveEndpointPairState? {
      val fnPtr = _1155568693_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XboxLiveEndpointPairState>()
      val hr = fn.invokeHR(arrayOf(__1155568693_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XboxLiveEndpointPairState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NewState(): XboxLiveEndpointPairState? {
      val fnPtr = _1155568693_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XboxLiveEndpointPairState>()
      val hr = fn.invokeHR(arrayOf(__1155568693_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XboxLiveEndpointPairState>(result.getValue())
      return resultValue
    }
  }

  public class IXboxLiveEndpointPairStateChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1155568693_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXboxLiveEndpointPairStateChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("592e3b55de0844e7ac3bb9b9a169583a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXboxLiveEndpointPairStateChangedEventArgs(ptr: Pointer?): WithDefault =
        IXboxLiveEndpointPairStateChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IXboxLiveEndpointPairStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIXboxLiveEndpointPairStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IXboxLiveEndpointPairStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1155568693_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXboxLiveEndpointPairStateChangedEventArgs):
        Array<IXboxLiveEndpointPairStateChangedEventArgs?> = (elements as
        Array<IXboxLiveEndpointPairStateChangedEventArgs?>).castToImpl<IXboxLiveEndpointPairStateChangedEventArgs,IXboxLiveEndpointPairStateChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXboxLiveEndpointPairStateChangedEventArgs?> =
        arrayOfNulls<IXboxLiveEndpointPairStateChangedEventArgs_Impl>(size) as
        Array<IXboxLiveEndpointPairStateChangedEventArgs?>
  }
}
