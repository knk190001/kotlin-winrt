package Windows.Media

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

@ABIMarker(ISystemMediaTransportControlsTimelineProperties.ABI::class)
@Signature("{5125316a-c3a2-475b-8507-93534dc88f15}")
@Guid("5125316ac3a2475b850793534dc88f15")
@WinRTInterface("5125316ac3a2475b850793534dc88f15")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemMediaTransportControlsTimelineProperties.ByReference::class)
public interface ISystemMediaTransportControlsTimelineProperties : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StartTime(): TimeSpan?

  @InterfaceMethod(1)
  public fun put_StartTime(value: TimeSpan?): Unit

  @InterfaceMethod(2)
  public fun get_EndTime(): TimeSpan?

  @InterfaceMethod(3)
  public fun put_EndTime(value: TimeSpan?): Unit

  @InterfaceMethod(4)
  public fun get_MinSeekTime(): TimeSpan?

  @InterfaceMethod(5)
  public fun put_MinSeekTime(value: TimeSpan?): Unit

  @InterfaceMethod(6)
  public fun get_MaxSeekTime(): TimeSpan?

  @InterfaceMethod(7)
  public fun put_MaxSeekTime(value: TimeSpan?): Unit

  @InterfaceMethod(8)
  public fun get_Position(): TimeSpan?

  @InterfaceMethod(9)
  public fun put_Position(value: TimeSpan?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemMediaTransportControlsTimelineProperties> {
    public override fun getValue() =
        ABI.makeISystemMediaTransportControlsTimelineProperties(pointer.getPointer(0))

    public fun setValue(value: ISystemMediaTransportControlsTimelineProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemMediaTransportControlsTimelineProperties {
    public val __1067027570_Ptr: Pointer?

    public val _1067027570_VtblPtr: Pointer?
      get() = __1067027570_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StartTime(): TimeSpan? {
      val fnPtr = _1067027570_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1067027570_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_StartTime(value: TimeSpan?): Unit {
      val fnPtr = _1067027570_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1067027570_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_EndTime(): TimeSpan? {
      val fnPtr = _1067027570_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1067027570_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_EndTime(value: TimeSpan?): Unit {
      val fnPtr = _1067027570_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1067027570_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_MinSeekTime(): TimeSpan? {
      val fnPtr = _1067027570_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1067027570_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_MinSeekTime(value: TimeSpan?): Unit {
      val fnPtr = _1067027570_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1067027570_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_MaxSeekTime(): TimeSpan? {
      val fnPtr = _1067027570_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1067027570_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_MaxSeekTime(value: TimeSpan?): Unit {
      val fnPtr = _1067027570_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1067027570_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Position(): TimeSpan? {
      val fnPtr = _1067027570_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1067027570_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_Position(value: TimeSpan?): Unit {
      val fnPtr = _1067027570_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1067027570_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISystemMediaTransportControlsTimelineProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1067027570_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemMediaTransportControlsTimelineProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5125316ac3a2475b850793534dc88f15")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemMediaTransportControlsTimelineProperties(ptr: Pointer?): WithDefault =
        ISystemMediaTransportControlsTimelineProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISystemMediaTransportControlsTimelineProperties {
      val address = segment.toRawLongValue()
      return makeISystemMediaTransportControlsTimelineProperties(Pointer(address))
    }

    public override fun toNative(obj: ISystemMediaTransportControlsTimelineProperties):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1067027570_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemMediaTransportControlsTimelineProperties):
        Array<ISystemMediaTransportControlsTimelineProperties?> = (elements as
        Array<ISystemMediaTransportControlsTimelineProperties?>).castToImpl<ISystemMediaTransportControlsTimelineProperties,ISystemMediaTransportControlsTimelineProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemMediaTransportControlsTimelineProperties?>
        = arrayOfNulls<ISystemMediaTransportControlsTimelineProperties_Impl>(size) as
        Array<ISystemMediaTransportControlsTimelineProperties?>
  }
}
