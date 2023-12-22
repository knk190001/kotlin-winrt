package Windows.Networking.Vpn

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

@ABIMarker(IVpnPlugIn.ABI::class)
@Signature("{ceb78d07-d0a8-4703-a091-c8c2c0915bc4}")
@Guid("ceb78d07d0a84703a091c8c2c0915bc4")
@WinRTInterface("ceb78d07d0a84703a091c8c2c0915bc4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnPlugIn.ByReference::class)
public interface IVpnPlugIn : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Connect(channel: VpnChannel?): Unit

  @InterfaceMethod(1)
  public fun Disconnect(channel: VpnChannel?): Unit

  @InterfaceMethod(2)
  public fun GetKeepAlivePayload(channel: VpnChannel?,
      keepAlivePacket: Windows.Networking.Vpn.VpnPacketBuffer.ByReference?): Unit

  @InterfaceMethod(3)
  public fun Encapsulate(
    channel: VpnChannel?,
    packets: VpnPacketBufferList?,
    encapulatedPackets: VpnPacketBufferList?
  ): Unit

  @InterfaceMethod(4)
  public fun Decapsulate(
    channel: VpnChannel?,
    encapBuffer: VpnPacketBuffer?,
    decapsulatedPackets: VpnPacketBufferList?,
    controlPacketsToSend: VpnPacketBufferList?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IVpnPlugIn> {
    public override fun getValue() = ABI.makeIVpnPlugIn(pointer.getPointer(0))

    public fun setValue(value: IVpnPlugIn_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnPlugIn {
    public val __1697734339_Ptr: Pointer?

    public val _1697734339_VtblPtr: Pointer?
      get() = __1697734339_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Connect(channel: VpnChannel?): Unit {
      val fnPtr = _1697734339_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1697734339_Ptr, marshalToNative(channel),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun Disconnect(channel: VpnChannel?): Unit {
      val fnPtr = _1697734339_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1697734339_Ptr, marshalToNative(channel),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetKeepAlivePayload(channel: VpnChannel?,
        keepAlivePacket: Windows.Networking.Vpn.VpnPacketBuffer.ByReference?): Unit {
      val fnPtr = _1697734339_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1697734339_Ptr, marshalToNative(channel),
          marshalToNative(keepAlivePacket),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun Encapsulate(
      channel: VpnChannel?,
      packets: VpnPacketBufferList?,
      encapulatedPackets: VpnPacketBufferList?
    ): Unit {
      val fnPtr = _1697734339_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1697734339_Ptr, marshalToNative(channel),
          marshalToNative(packets), marshalToNative(encapulatedPackets),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun Decapsulate(
      channel: VpnChannel?,
      encapBuffer: VpnPacketBuffer?,
      decapsulatedPackets: VpnPacketBufferList?,
      controlPacketsToSend: VpnPacketBufferList?
    ): Unit {
      val fnPtr = _1697734339_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1697734339_Ptr, marshalToNative(channel),
          marshalToNative(encapBuffer), marshalToNative(decapsulatedPackets),
          marshalToNative(controlPacketsToSend),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVpnPlugIn_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1697734339_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnPlugIn, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ceb78d07d0a84703a091c8c2c0915bc4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnPlugIn(ptr: Pointer?): WithDefault = IVpnPlugIn_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnPlugIn {
      val address = segment.toRawLongValue()
      return makeIVpnPlugIn(Pointer(address))
    }

    public override fun toNative(obj: IVpnPlugIn): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1697734339_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnPlugIn): Array<IVpnPlugIn?> = (elements as
        Array<IVpnPlugIn?>).castToImpl<IVpnPlugIn,IVpnPlugIn_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnPlugIn?> = arrayOfNulls<IVpnPlugIn_Impl>(size)
        as Array<IVpnPlugIn?>
  }
}
