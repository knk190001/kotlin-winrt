package Windows.Services.Maps

import Windows.Devices.Geolocation.Geopoint
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPlaceInfoStatics.ABI::class)
@Signature("{82b9ff71-6cd0-48a4-afd9-5ed82097936b}")
@Guid("82b9ff716cd048a4afd95ed82097936b")
@WinRTInterface("82b9ff716cd048a4afd95ed82097936b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlaceInfoStatics.ByReference::class)
public interface IPlaceInfoStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(referencePoint: Geopoint?): PlaceInfo?

  @InterfaceMethod(1)
  public fun Create(referencePoint: Geopoint?, options: PlaceInfoCreateOptions?): PlaceInfo?

  @InterfaceMethod(2)
  public fun CreateFromIdentifier(identifier: String?): PlaceInfo?

  @InterfaceMethod(3)
  public fun CreateFromIdentifier(
    identifier: String?,
    defaultPoint: Geopoint?,
    options: PlaceInfoCreateOptions?
  ): PlaceInfo?

  @InterfaceMethod(4)
  public fun CreateFromMapLocation(location: MapLocation?): PlaceInfo?

  @InterfaceMethod(5)
  public fun get_IsShowSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlaceInfoStatics> {
    public override fun getValue() = ABI.makeIPlaceInfoStatics(pointer.getPointer(0))

    public fun setValue(value: IPlaceInfoStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlaceInfoStatics {
    public val __1046969411_Ptr: Pointer?

    public val _1046969411_VtblPtr: Pointer?
      get() = __1046969411_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(referencePoint: Geopoint?): PlaceInfo? {
      val fnPtr = _1046969411_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlaceInfo>()
      val hr = fn.invokeHR(arrayOf(__1046969411_Ptr, marshalToNative(referencePoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlaceInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Create(referencePoint: Geopoint?, options: PlaceInfoCreateOptions?):
        PlaceInfo? {
      val fnPtr = _1046969411_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlaceInfo>()
      val hr = fn.invokeHR(arrayOf(__1046969411_Ptr, marshalToNative(referencePoint),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlaceInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateFromIdentifier(identifier: String?): PlaceInfo? {
      val fnPtr = _1046969411_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlaceInfo>()
      val hr = fn.invokeHR(arrayOf(__1046969411_Ptr, marshalToNative(identifier), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlaceInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateFromIdentifier(
      identifier: String?,
      defaultPoint: Geopoint?,
      options: PlaceInfoCreateOptions?
    ): PlaceInfo? {
      val fnPtr = _1046969411_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlaceInfo>()
      val hr = fn.invokeHR(arrayOf(__1046969411_Ptr, marshalToNative(identifier),
          marshalToNative(defaultPoint), marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlaceInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateFromMapLocation(location: MapLocation?): PlaceInfo? {
      val fnPtr = _1046969411_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlaceInfo>()
      val hr = fn.invokeHR(arrayOf(__1046969411_Ptr, marshalToNative(location), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlaceInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_IsShowSupported(): Boolean {
      val fnPtr = _1046969411_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1046969411_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPlaceInfoStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1046969411_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlaceInfoStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("82b9ff716cd048a4afd95ed82097936b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlaceInfoStatics(ptr: Pointer?): WithDefault = IPlaceInfoStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlaceInfoStatics {
      val address = segment.toRawLongValue()
      return makeIPlaceInfoStatics(Pointer(address))
    }

    public override fun toNative(obj: IPlaceInfoStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1046969411_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlaceInfoStatics): Array<IPlaceInfoStatics?> = (elements
        as Array<IPlaceInfoStatics?>).castToImpl<IPlaceInfoStatics,IPlaceInfoStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlaceInfoStatics?> =
        arrayOfNulls<IPlaceInfoStatics_Impl>(size) as Array<IPlaceInfoStatics?>
  }
}
