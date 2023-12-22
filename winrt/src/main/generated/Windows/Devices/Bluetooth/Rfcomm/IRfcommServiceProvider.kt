package Windows.Devices.Bluetooth.Rfcomm

import Windows.Foundation.Collections.IMap
import Windows.Networking.Sockets.StreamSocketListener
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IRfcommServiceProvider.ABI::class)
@Signature("{eadbfdc4-b1f6-44ff-9f7c-e7a82ab86821}")
@Guid("eadbfdc4b1f644ff9f7ce7a82ab86821")
@WinRTInterface("eadbfdc4b1f644ff9f7ce7a82ab86821")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRfcommServiceProvider.ByReference::class)
public interface IRfcommServiceProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ServiceId(): RfcommServiceId?

  @InterfaceMethod(1)
  public fun get_SdpRawAttributes(): IMap<WinDef.UINT, IBuffer?>?

  @InterfaceMethod(2)
  public fun StartAdvertising(listener: StreamSocketListener?): Unit

  @InterfaceMethod(3)
  public fun StopAdvertising(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRfcommServiceProvider> {
    public override fun getValue() = ABI.makeIRfcommServiceProvider(pointer.getPointer(0))

    public fun setValue(value: IRfcommServiceProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRfcommServiceProvider {
    public val __1692746649_Ptr: Pointer?

    public val _1692746649_VtblPtr: Pointer?
      get() = __1692746649_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ServiceId(): RfcommServiceId? {
      val fnPtr = _1692746649_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RfcommServiceId>()
      val hr = fn.invokeHR(arrayOf(__1692746649_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RfcommServiceId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SdpRawAttributes(): IMap<WinDef.UINT, IBuffer?>? {
      val fnPtr = _1692746649_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<WinDef.UINT, IBuffer?>>()
      val hr = fn.invokeHR(arrayOf(__1692746649_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<WinDef.UINT, IBuffer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun StartAdvertising(listener: StreamSocketListener?): Unit {
      val fnPtr = _1692746649_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1692746649_Ptr, marshalToNative(listener),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun StopAdvertising(): Unit {
      val fnPtr = _1692746649_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1692746649_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRfcommServiceProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1692746649_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRfcommServiceProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eadbfdc4b1f644ff9f7ce7a82ab86821")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRfcommServiceProvider(ptr: Pointer?): WithDefault =
        IRfcommServiceProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRfcommServiceProvider {
      val address = segment.toRawLongValue()
      return makeIRfcommServiceProvider(Pointer(address))
    }

    public override fun toNative(obj: IRfcommServiceProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1692746649_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRfcommServiceProvider): Array<IRfcommServiceProvider?> =
        (elements as
        Array<IRfcommServiceProvider?>).castToImpl<IRfcommServiceProvider,IRfcommServiceProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRfcommServiceProvider?> =
        arrayOfNulls<IRfcommServiceProvider_Impl>(size) as Array<IRfcommServiceProvider?>
  }
}
