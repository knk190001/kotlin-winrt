package Windows.Networking.NetworkOperators

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

@ABIMarker(IMobileBroadbandDeviceServiceDataReceivedEventArgs.ABI::class)
@Signature("{b6aa13de-1380-40e3-8618-73cbca48138c}")
@Guid("b6aa13de138040e3861873cbca48138c")
@WinRTInterface("b6aa13de138040e3861873cbca48138c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandDeviceServiceDataReceivedEventArgs.ByReference::class)
public interface IMobileBroadbandDeviceServiceDataReceivedEventArgs : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun get_ReceivedData(): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandDeviceServiceDataReceivedEventArgs> {
    public override fun getValue() =
        ABI.makeIMobileBroadbandDeviceServiceDataReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandDeviceServiceDataReceivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandDeviceServiceDataReceivedEventArgs {
    public val __865766359_Ptr: Pointer?

    public val _865766359_VtblPtr: Pointer?
      get() = __865766359_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ReceivedData(): IBuffer? {
      val fnPtr = _865766359_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__865766359_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandDeviceServiceDataReceivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __865766359_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandDeviceServiceDataReceivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b6aa13de138040e3861873cbca48138c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandDeviceServiceDataReceivedEventArgs(ptr: Pointer?): WithDefault =
        IMobileBroadbandDeviceServiceDataReceivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMobileBroadbandDeviceServiceDataReceivedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandDeviceServiceDataReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandDeviceServiceDataReceivedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__865766359_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandDeviceServiceDataReceivedEventArgs):
        Array<IMobileBroadbandDeviceServiceDataReceivedEventArgs?> = (elements as
        Array<IMobileBroadbandDeviceServiceDataReceivedEventArgs?>).castToImpl<IMobileBroadbandDeviceServiceDataReceivedEventArgs,IMobileBroadbandDeviceServiceDataReceivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IMobileBroadbandDeviceServiceDataReceivedEventArgs?> =
        arrayOfNulls<IMobileBroadbandDeviceServiceDataReceivedEventArgs_Impl>(size) as
        Array<IMobileBroadbandDeviceServiceDataReceivedEventArgs?>
  }
}
