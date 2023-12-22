package Windows.Networking.Vpn

import Windows.Storage.Streams.Buffer
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVpnPacketBuffer.ABI::class)
@Signature("{c2f891fc-4d5c-4a63-b70d-4e307eacce55}")
@Guid("c2f891fc4d5c4a63b70d4e307eacce55")
@WinRTInterface("c2f891fc4d5c4a63b70d4e307eacce55")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnPacketBuffer.ByReference::class)
public interface IVpnPacketBuffer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Buffer(): Buffer?

  @InterfaceMethod(1)
  public fun put_Status(value: VpnPacketBufferStatus?): Unit

  @InterfaceMethod(2)
  public fun get_Status(): VpnPacketBufferStatus?

  @InterfaceMethod(3)
  public fun put_TransportAffinity(value: WinDef.UINT): Unit

  @InterfaceMethod(4)
  public fun get_TransportAffinity(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnPacketBuffer> {
    public override fun getValue() = ABI.makeIVpnPacketBuffer(pointer.getPointer(0))

    public fun setValue(value: IVpnPacketBuffer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnPacketBuffer {
    public val __1595087272_Ptr: Pointer?

    public val _1595087272_VtblPtr: Pointer?
      get() = __1595087272_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Buffer(): Buffer? {
      val fnPtr = _1595087272_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Buffer>()
      val hr = fn.invokeHR(arrayOf(__1595087272_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Buffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Status(value: VpnPacketBufferStatus?): Unit {
      val fnPtr = _1595087272_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1595087272_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Status(): VpnPacketBufferStatus? {
      val fnPtr = _1595087272_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VpnPacketBufferStatus>()
      val hr = fn.invokeHR(arrayOf(__1595087272_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VpnPacketBufferStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_TransportAffinity(value: WinDef.UINT): Unit {
      val fnPtr = _1595087272_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1595087272_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_TransportAffinity(): WinDef.UINT {
      val fnPtr = _1595087272_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1595087272_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IVpnPacketBuffer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1595087272_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnPacketBuffer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c2f891fc4d5c4a63b70d4e307eacce55")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnPacketBuffer(ptr: Pointer?): WithDefault = IVpnPacketBuffer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnPacketBuffer {
      val address = segment.toRawLongValue()
      return makeIVpnPacketBuffer(Pointer(address))
    }

    public override fun toNative(obj: IVpnPacketBuffer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1595087272_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnPacketBuffer): Array<IVpnPacketBuffer?> = (elements as
        Array<IVpnPacketBuffer?>).castToImpl<IVpnPacketBuffer,IVpnPacketBuffer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnPacketBuffer?> =
        arrayOfNulls<IVpnPacketBuffer_Impl>(size) as Array<IVpnPacketBuffer?>
  }
}
