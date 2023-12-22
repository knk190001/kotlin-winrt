package Windows.Networking.Sockets

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

@ABIMarker(IControlChannelTriggerEventDetails.ABI::class)
@Signature("{1b36e047-89bb-4236-96ac-71d012bb4869}")
@Guid("1b36e04789bb423696ac71d012bb4869")
@WinRTInterface("1b36e04789bb423696ac71d012bb4869")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IControlChannelTriggerEventDetails.ByReference::class)
public interface IControlChannelTriggerEventDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ControlChannelTrigger(): ControlChannelTrigger?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IControlChannelTriggerEventDetails> {
    public override fun getValue() =
        ABI.makeIControlChannelTriggerEventDetails(pointer.getPointer(0))

    public fun setValue(value: IControlChannelTriggerEventDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IControlChannelTriggerEventDetails {
    public val __1644737118_Ptr: Pointer?

    public val _1644737118_VtblPtr: Pointer?
      get() = __1644737118_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ControlChannelTrigger(): ControlChannelTrigger? {
      val fnPtr = _1644737118_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ControlChannelTrigger>()
      val hr = fn.invokeHR(arrayOf(__1644737118_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ControlChannelTrigger>(result.getValue())
      return resultValue
    }
  }

  public class IControlChannelTriggerEventDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1644737118_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IControlChannelTriggerEventDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1b36e04789bb423696ac71d012bb4869")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIControlChannelTriggerEventDetails(ptr: Pointer?): WithDefault =
        IControlChannelTriggerEventDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IControlChannelTriggerEventDetails {
      val address = segment.toRawLongValue()
      return makeIControlChannelTriggerEventDetails(Pointer(address))
    }

    public override fun toNative(obj: IControlChannelTriggerEventDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1644737118_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IControlChannelTriggerEventDetails):
        Array<IControlChannelTriggerEventDetails?> = (elements as
        Array<IControlChannelTriggerEventDetails?>).castToImpl<IControlChannelTriggerEventDetails,IControlChannelTriggerEventDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IControlChannelTriggerEventDetails?> =
        arrayOfNulls<IControlChannelTriggerEventDetails_Impl>(size) as
        Array<IControlChannelTriggerEventDetails?>
  }
}
