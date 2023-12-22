package Windows.Devices.Geolocation

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IGeovisitTriggerDetails.ABI::class)
@Signature("{ea770d9e-d1c9-454b-99b7-b2f8cdd2482f}")
@Guid("ea770d9ed1c9454b99b7b2f8cdd2482f")
@WinRTInterface("ea770d9ed1c9454b99b7b2f8cdd2482f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeovisitTriggerDetails.ByReference::class)
public interface IGeovisitTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ReadReports(): IVectorView<Geovisit?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeovisitTriggerDetails> {
    public override fun getValue() = ABI.makeIGeovisitTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IGeovisitTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeovisitTriggerDetails {
    public val __473880291_Ptr: Pointer?

    public val _473880291_VtblPtr: Pointer?
      get() = __473880291_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReadReports(): IVectorView<Geovisit?>? {
      val fnPtr = _473880291_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Geovisit?>>()
      val hr = fn.invokeHR(arrayOf(__473880291_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Geovisit?>>(result.getValue())
      return resultValue
    }
  }

  public class IGeovisitTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __473880291_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeovisitTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ea770d9ed1c9454b99b7b2f8cdd2482f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeovisitTriggerDetails(ptr: Pointer?): WithDefault =
        IGeovisitTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeovisitTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIGeovisitTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IGeovisitTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__473880291_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeovisitTriggerDetails): Array<IGeovisitTriggerDetails?>
        = (elements as
        Array<IGeovisitTriggerDetails?>).castToImpl<IGeovisitTriggerDetails,IGeovisitTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeovisitTriggerDetails?> =
        arrayOfNulls<IGeovisitTriggerDetails_Impl>(size) as Array<IGeovisitTriggerDetails?>
  }
}
