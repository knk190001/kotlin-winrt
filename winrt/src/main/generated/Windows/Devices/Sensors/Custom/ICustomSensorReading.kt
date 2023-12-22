package Windows.Devices.Sensors.Custom

import Windows.Foundation.Collections.IMapView
import Windows.Foundation.DateTime
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICustomSensorReading.ABI::class)
@Signature("{64004f4d-446a-4366-a87a-5f963268ec53}")
@Guid("64004f4d446a4366a87a5f963268ec53")
@WinRTInterface("64004f4d446a4366a87a5f963268ec53")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICustomSensorReading.ByReference::class)
public interface ICustomSensorReading : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Timestamp(): DateTime?

  @InterfaceMethod(1)
  public fun get_Properties(): IMapView<String?, IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICustomSensorReading> {
    public override fun getValue() = ABI.makeICustomSensorReading(pointer.getPointer(0))

    public fun setValue(value: ICustomSensorReading_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICustomSensorReading {
    public val __1590878714_Ptr: Pointer?

    public val _1590878714_VtblPtr: Pointer?
      get() = __1590878714_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _1590878714_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1590878714_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Properties(): IMapView<String?, IUnknown?>? {
      val fnPtr = _1590878714_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__1590878714_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class ICustomSensorReading_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1590878714_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICustomSensorReading, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("64004f4d446a4366a87a5f963268ec53")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICustomSensorReading(ptr: Pointer?): WithDefault = ICustomSensorReading_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICustomSensorReading {
      val address = segment.toRawLongValue()
      return makeICustomSensorReading(Pointer(address))
    }

    public override fun toNative(obj: ICustomSensorReading): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1590878714_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICustomSensorReading): Array<ICustomSensorReading?> =
        (elements as
        Array<ICustomSensorReading?>).castToImpl<ICustomSensorReading,ICustomSensorReading_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICustomSensorReading?> =
        arrayOfNulls<ICustomSensorReading_Impl>(size) as Array<ICustomSensorReading?>
  }
}
