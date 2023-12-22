package Windows.Media.Control

import Windows.Foundation.DateTime
import Windows.Foundation.TimeSpan
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

@ABIMarker(IGlobalSystemMediaTransportControlsSessionTimelineProperties.ABI::class)
@Signature("{ede34136-6f25-588d-8ecf-ea5b6735aaa5}")
@Guid("ede341366f25588d8ecfea5b6735aaa5")
@WinRTInterface("ede341366f25588d8ecfea5b6735aaa5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    IGlobalSystemMediaTransportControlsSessionTimelineProperties.ByReference::class)
public interface IGlobalSystemMediaTransportControlsSessionTimelineProperties : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StartTime(): TimeSpan?

  @InterfaceMethod(1)
  public fun get_EndTime(): TimeSpan?

  @InterfaceMethod(2)
  public fun get_MinSeekTime(): TimeSpan?

  @InterfaceMethod(3)
  public fun get_MaxSeekTime(): TimeSpan?

  @InterfaceMethod(4)
  public fun get_Position(): TimeSpan?

  @InterfaceMethod(5)
  public fun get_LastUpdatedTime(): DateTime?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGlobalSystemMediaTransportControlsSessionTimelineProperties> {
    public override fun getValue() =
        ABI.makeIGlobalSystemMediaTransportControlsSessionTimelineProperties(pointer.getPointer(0))

    public fun setValue(value: IGlobalSystemMediaTransportControlsSessionTimelineProperties_Impl):
        Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGlobalSystemMediaTransportControlsSessionTimelineProperties {
    public val __1475411716_Ptr: Pointer?

    public val _1475411716_VtblPtr: Pointer?
      get() = __1475411716_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StartTime(): TimeSpan? {
      val fnPtr = _1475411716_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1475411716_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_EndTime(): TimeSpan? {
      val fnPtr = _1475411716_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1475411716_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MinSeekTime(): TimeSpan? {
      val fnPtr = _1475411716_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1475411716_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_MaxSeekTime(): TimeSpan? {
      val fnPtr = _1475411716_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1475411716_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Position(): TimeSpan? {
      val fnPtr = _1475411716_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1475411716_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_LastUpdatedTime(): DateTime? {
      val fnPtr = _1475411716_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1475411716_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }
  }

  public class IGlobalSystemMediaTransportControlsSessionTimelineProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1475411716_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGlobalSystemMediaTransportControlsSessionTimelineProperties,
      MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ede341366f25588d8ecfea5b6735aaa5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGlobalSystemMediaTransportControlsSessionTimelineProperties(ptr: Pointer?):
        WithDefault = IGlobalSystemMediaTransportControlsSessionTimelineProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IGlobalSystemMediaTransportControlsSessionTimelineProperties {
      val address = segment.toRawLongValue()
      return makeIGlobalSystemMediaTransportControlsSessionTimelineProperties(Pointer(address))
    }

    public override fun toNative(obj: IGlobalSystemMediaTransportControlsSessionTimelineProperties):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1475411716_Ptr))
  }

  public companion object {
    public fun makeArray(vararg
        elements: IGlobalSystemMediaTransportControlsSessionTimelineProperties):
        Array<IGlobalSystemMediaTransportControlsSessionTimelineProperties?> = (elements as
        Array<IGlobalSystemMediaTransportControlsSessionTimelineProperties?>).castToImpl<IGlobalSystemMediaTransportControlsSessionTimelineProperties,IGlobalSystemMediaTransportControlsSessionTimelineProperties_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IGlobalSystemMediaTransportControlsSessionTimelineProperties?> =
        arrayOfNulls<IGlobalSystemMediaTransportControlsSessionTimelineProperties_Impl>(size) as
        Array<IGlobalSystemMediaTransportControlsSessionTimelineProperties?>
  }
}
