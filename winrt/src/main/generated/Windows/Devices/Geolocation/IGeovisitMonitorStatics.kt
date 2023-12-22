package Windows.Devices.Geolocation

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IGeovisitMonitorStatics.ABI::class)
@Signature("{bcf976a7-bbf2-4cdd-95cf-554c82edfb87}")
@Guid("bcf976a7bbf24cdd95cf554c82edfb87")
@WinRTInterface("bcf976a7bbf24cdd95cf554c82edfb87")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeovisitMonitorStatics.ByReference::class)
public interface IGeovisitMonitorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetLastReportAsync(): IAsyncOperation<Geovisit?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeovisitMonitorStatics> {
    public override fun getValue() = ABI.makeIGeovisitMonitorStatics(pointer.getPointer(0))

    public fun setValue(value: IGeovisitMonitorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeovisitMonitorStatics {
    public val __664731004_Ptr: Pointer?

    public val _664731004_VtblPtr: Pointer?
      get() = __664731004_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetLastReportAsync(): IAsyncOperation<Geovisit?>? {
      val fnPtr = _664731004_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Geovisit?>>()
      val hr = fn.invokeHR(arrayOf(__664731004_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Geovisit?>>(result.getValue())
      return resultValue
    }
  }

  public class IGeovisitMonitorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __664731004_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeovisitMonitorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bcf976a7bbf24cdd95cf554c82edfb87")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeovisitMonitorStatics(ptr: Pointer?): WithDefault =
        IGeovisitMonitorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeovisitMonitorStatics {
      val address = segment.toRawLongValue()
      return makeIGeovisitMonitorStatics(Pointer(address))
    }

    public override fun toNative(obj: IGeovisitMonitorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__664731004_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeovisitMonitorStatics): Array<IGeovisitMonitorStatics?>
        = (elements as
        Array<IGeovisitMonitorStatics?>).castToImpl<IGeovisitMonitorStatics,IGeovisitMonitorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeovisitMonitorStatics?> =
        arrayOfNulls<IGeovisitMonitorStatics_Impl>(size) as Array<IGeovisitMonitorStatics?>
  }
}
