package Windows.Networking.XboxLive

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
import kotlin.Boolean
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IXboxLiveQualityOfServiceMeasurementStatics.ABI::class)
@Signature("{6e352dca-23cf-440a-b077-5e30857a8234}")
@Guid("6e352dca23cf440ab0775e30857a8234")
@WinRTInterface("6e352dca23cf440ab0775e30857a8234")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXboxLiveQualityOfServiceMeasurementStatics.ByReference::class)
public interface IXboxLiveQualityOfServiceMeasurementStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun PublishPrivatePayloadBytes(payload: Array<Byte>): Unit

  @InterfaceMethod(1)
  public fun ClearPrivatePayload(): Unit

  @InterfaceMethod(2)
  public fun get_MaxSimultaneousProbeConnections(): WinDef.UINT

  @InterfaceMethod(3)
  public fun put_MaxSimultaneousProbeConnections(value: WinDef.UINT): Unit

  @InterfaceMethod(4)
  public fun get_IsSystemOutboundBandwidthConstrained(): Boolean

  @InterfaceMethod(5)
  public fun put_IsSystemOutboundBandwidthConstrained(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_IsSystemInboundBandwidthConstrained(): Boolean

  @InterfaceMethod(7)
  public fun put_IsSystemInboundBandwidthConstrained(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_PublishedPrivatePayload(): IBuffer?

  @InterfaceMethod(9)
  public fun put_PublishedPrivatePayload(value: IBuffer?): Unit

  @InterfaceMethod(10)
  public fun get_MaxPrivatePayloadSize(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXboxLiveQualityOfServiceMeasurementStatics> {
    public override fun getValue() =
        ABI.makeIXboxLiveQualityOfServiceMeasurementStatics(pointer.getPointer(0))

    public fun setValue(value: IXboxLiveQualityOfServiceMeasurementStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXboxLiveQualityOfServiceMeasurementStatics {
    public val __93618046_Ptr: Pointer?

    public val _93618046_VtblPtr: Pointer?
      get() = __93618046_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun PublishPrivatePayloadBytes(payload: Array<Byte>): Unit {
      val fnPtr = _93618046_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__93618046_Ptr, payload.size,marshalToNative(payload),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun ClearPrivatePayload(): Unit {
      val fnPtr = _93618046_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__93618046_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_MaxSimultaneousProbeConnections(): WinDef.UINT {
      val fnPtr = _93618046_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__93618046_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_MaxSimultaneousProbeConnections(value: WinDef.UINT): Unit {
      val fnPtr = _93618046_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__93618046_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsSystemOutboundBandwidthConstrained(): Boolean {
      val fnPtr = _93618046_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__93618046_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsSystemOutboundBandwidthConstrained(value: Boolean): Unit {
      val fnPtr = _93618046_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__93618046_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IsSystemInboundBandwidthConstrained(): Boolean {
      val fnPtr = _93618046_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__93618046_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_IsSystemInboundBandwidthConstrained(value: Boolean): Unit {
      val fnPtr = _93618046_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__93618046_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_PublishedPrivatePayload(): IBuffer? {
      val fnPtr = _93618046_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__93618046_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_PublishedPrivatePayload(value: IBuffer?): Unit {
      val fnPtr = _93618046_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__93618046_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_MaxPrivatePayloadSize(): WinDef.UINT {
      val fnPtr = _93618046_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__93618046_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IXboxLiveQualityOfServiceMeasurementStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __93618046_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXboxLiveQualityOfServiceMeasurementStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6e352dca23cf440ab0775e30857a8234")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXboxLiveQualityOfServiceMeasurementStatics(ptr: Pointer?): WithDefault =
        IXboxLiveQualityOfServiceMeasurementStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IXboxLiveQualityOfServiceMeasurementStatics {
      val address = segment.toRawLongValue()
      return makeIXboxLiveQualityOfServiceMeasurementStatics(Pointer(address))
    }

    public override fun toNative(obj: IXboxLiveQualityOfServiceMeasurementStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__93618046_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXboxLiveQualityOfServiceMeasurementStatics):
        Array<IXboxLiveQualityOfServiceMeasurementStatics?> = (elements as
        Array<IXboxLiveQualityOfServiceMeasurementStatics?>).castToImpl<IXboxLiveQualityOfServiceMeasurementStatics,IXboxLiveQualityOfServiceMeasurementStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXboxLiveQualityOfServiceMeasurementStatics?> =
        arrayOfNulls<IXboxLiveQualityOfServiceMeasurementStatics_Impl>(size) as
        Array<IXboxLiveQualityOfServiceMeasurementStatics?>
  }
}
