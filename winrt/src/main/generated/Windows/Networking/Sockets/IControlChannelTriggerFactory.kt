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

@ABIMarker(IControlChannelTriggerFactory.ABI::class)
@Signature("{da4b7cf0-8d71-446f-88c3-b95184a2d6cd}")
@Guid("da4b7cf08d71446f88c3b95184a2d6cd")
@WinRTInterface("da4b7cf08d71446f88c3b95184a2d6cd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IControlChannelTriggerFactory.ByReference::class)
public interface IControlChannelTriggerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateControlChannelTrigger(channelId: String?,
      serverKeepAliveIntervalInMinutes: WinDef.UINT): ControlChannelTrigger?

  @InterfaceMethod(1)
  public fun CreateControlChannelTriggerEx(
    channelId: String?,
    serverKeepAliveIntervalInMinutes: WinDef.UINT,
    resourceRequestType: ControlChannelTriggerResourceType?
  ): ControlChannelTrigger?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IControlChannelTriggerFactory> {
    public override fun getValue() = ABI.makeIControlChannelTriggerFactory(pointer.getPointer(0))

    public fun setValue(value: IControlChannelTriggerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IControlChannelTriggerFactory {
    public val __2086996336_Ptr: Pointer?

    public val _2086996336_VtblPtr: Pointer?
      get() = __2086996336_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateControlChannelTrigger(channelId: String?,
        serverKeepAliveIntervalInMinutes: WinDef.UINT): ControlChannelTrigger? {
      val fnPtr = _2086996336_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ControlChannelTrigger>()
      val hr = fn.invokeHR(arrayOf(__2086996336_Ptr, marshalToNative(channelId),
          serverKeepAliveIntervalInMinutes, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ControlChannelTrigger>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateControlChannelTriggerEx(
      channelId: String?,
      serverKeepAliveIntervalInMinutes: WinDef.UINT,
      resourceRequestType: ControlChannelTriggerResourceType?
    ): ControlChannelTrigger? {
      val fnPtr = _2086996336_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ControlChannelTrigger>()
      val hr = fn.invokeHR(arrayOf(__2086996336_Ptr, marshalToNative(channelId),
          serverKeepAliveIntervalInMinutes, marshalToNative(resourceRequestType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ControlChannelTrigger>(result.getValue())
      return resultValue
    }
  }

  public class IControlChannelTriggerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2086996336_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IControlChannelTriggerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("da4b7cf08d71446f88c3b95184a2d6cd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIControlChannelTriggerFactory(ptr: Pointer?): WithDefault =
        IControlChannelTriggerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IControlChannelTriggerFactory {
      val address = segment.toRawLongValue()
      return makeIControlChannelTriggerFactory(Pointer(address))
    }

    public override fun toNative(obj: IControlChannelTriggerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2086996336_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IControlChannelTriggerFactory):
        Array<IControlChannelTriggerFactory?> = (elements as
        Array<IControlChannelTriggerFactory?>).castToImpl<IControlChannelTriggerFactory,IControlChannelTriggerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IControlChannelTriggerFactory?> =
        arrayOfNulls<IControlChannelTriggerFactory_Impl>(size) as
        Array<IControlChannelTriggerFactory?>
  }
}
