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

@ABIMarker(IXboxLiveInboundEndpointPairCreatedEventArgs.ABI::class)
@Signature("{dc183b62-22ba-48d2-80de-c23968bd198b}")
@Guid("dc183b6222ba48d280dec23968bd198b")
@WinRTInterface("dc183b6222ba48d280dec23968bd198b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXboxLiveInboundEndpointPairCreatedEventArgs.ByReference::class)
public interface IXboxLiveInboundEndpointPairCreatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EndpointPair(): XboxLiveEndpointPair?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXboxLiveInboundEndpointPairCreatedEventArgs> {
    public override fun getValue() =
        ABI.makeIXboxLiveInboundEndpointPairCreatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IXboxLiveInboundEndpointPairCreatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXboxLiveInboundEndpointPairCreatedEventArgs {
    public val __1637454595_Ptr: Pointer?

    public val _1637454595_VtblPtr: Pointer?
      get() = __1637454595_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EndpointPair(): XboxLiveEndpointPair? {
      val fnPtr = _1637454595_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XboxLiveEndpointPair>()
      val hr = fn.invokeHR(arrayOf(__1637454595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XboxLiveEndpointPair>(result.getValue())
      return resultValue
    }
  }

  public class IXboxLiveInboundEndpointPairCreatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1637454595_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXboxLiveInboundEndpointPairCreatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dc183b6222ba48d280dec23968bd198b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXboxLiveInboundEndpointPairCreatedEventArgs(ptr: Pointer?): WithDefault =
        IXboxLiveInboundEndpointPairCreatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IXboxLiveInboundEndpointPairCreatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIXboxLiveInboundEndpointPairCreatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IXboxLiveInboundEndpointPairCreatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1637454595_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXboxLiveInboundEndpointPairCreatedEventArgs):
        Array<IXboxLiveInboundEndpointPairCreatedEventArgs?> = (elements as
        Array<IXboxLiveInboundEndpointPairCreatedEventArgs?>).castToImpl<IXboxLiveInboundEndpointPairCreatedEventArgs,IXboxLiveInboundEndpointPairCreatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXboxLiveInboundEndpointPairCreatedEventArgs?> =
        arrayOfNulls<IXboxLiveInboundEndpointPairCreatedEventArgs_Impl>(size) as
        Array<IXboxLiveInboundEndpointPairCreatedEventArgs?>
  }
}
