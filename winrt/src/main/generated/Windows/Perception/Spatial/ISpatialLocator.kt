package Windows.Perception.Spatial

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Numerics.Quaternion
import Windows.Foundation.Numerics.Vector3
import Windows.Foundation.TypedEventHandler
import Windows.Perception.PerceptionTimestamp
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpatialLocator.ABI::class)
@Signature("{f6478925-9e0c-3bb6-997e-b64ecca24cf4}")
@Guid("f64789259e0c3bb6997eb64ecca24cf4")
@WinRTInterface("f64789259e0c3bb6997eb64ecca24cf4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialLocator.ByReference::class)
public interface ISpatialLocator : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Locatability(): SpatialLocatability?

  @InterfaceMethod(1)
  public fun add_LocatabilityChanged(handler: TypedEventHandler<SpatialLocator?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_LocatabilityChanged(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun add_PositionalTrackingDeactivating(handler: TypedEventHandler<SpatialLocator?,
      SpatialLocatorPositionalTrackingDeactivatingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_PositionalTrackingDeactivating(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun TryLocateAtTimestamp(timestamp: PerceptionTimestamp?,
      coordinateSystem: SpatialCoordinateSystem?): SpatialLocation?

  @InterfaceMethod(6)
  public fun CreateAttachedFrameOfReferenceAtCurrentHeading():
      SpatialLocatorAttachedFrameOfReference?

  @InterfaceMethod(7)
  public fun CreateAttachedFrameOfReferenceAtCurrentHeading(relativePosition: Vector3?):
      SpatialLocatorAttachedFrameOfReference?

  @InterfaceMethod(8)
  public fun CreateAttachedFrameOfReferenceAtCurrentHeading(relativePosition: Vector3?,
      relativeOrientation: Quaternion?): SpatialLocatorAttachedFrameOfReference?

  @InterfaceMethod(9)
  public fun CreateAttachedFrameOfReferenceAtCurrentHeading(
    relativePosition: Vector3?,
    relativeOrientation: Quaternion?,
    relativeHeadingInRadians: Double
  ): SpatialLocatorAttachedFrameOfReference?

  @InterfaceMethod(10)
  public fun CreateStationaryFrameOfReferenceAtCurrentLocation(): SpatialStationaryFrameOfReference?

  @InterfaceMethod(11)
  public fun CreateStationaryFrameOfReferenceAtCurrentLocation(relativePosition: Vector3?):
      SpatialStationaryFrameOfReference?

  @InterfaceMethod(12)
  public fun CreateStationaryFrameOfReferenceAtCurrentLocation(relativePosition: Vector3?,
      relativeOrientation: Quaternion?): SpatialStationaryFrameOfReference?

  @InterfaceMethod(13)
  public fun CreateStationaryFrameOfReferenceAtCurrentLocation(
    relativePosition: Vector3?,
    relativeOrientation: Quaternion?,
    relativeHeadingInRadians: Double
  ): SpatialStationaryFrameOfReference?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialLocator> {
    public override fun getValue() = ABI.makeISpatialLocator(pointer.getPointer(0))

    public fun setValue(value: ISpatialLocator_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialLocator {
    public val __1218046133_Ptr: Pointer?

    public val _1218046133_VtblPtr: Pointer?
      get() = __1218046133_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Locatability(): SpatialLocatability? {
      val fnPtr = _1218046133_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialLocatability>()
      val hr = fn.invokeHR(arrayOf(__1218046133_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialLocatability>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_LocatabilityChanged(handler: TypedEventHandler<SpatialLocator?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1218046133_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1218046133_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_LocatabilityChanged(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1218046133_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1218046133_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override
        fun add_PositionalTrackingDeactivating(handler: TypedEventHandler<SpatialLocator?,
        SpatialLocatorPositionalTrackingDeactivatingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1218046133_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1218046133_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_PositionalTrackingDeactivating(cookie: EventRegistrationToken?):
        Unit {
      val fnPtr = _1218046133_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1218046133_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun TryLocateAtTimestamp(timestamp: PerceptionTimestamp?,
        coordinateSystem: SpatialCoordinateSystem?): SpatialLocation? {
      val fnPtr = _1218046133_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialLocation>()
      val hr = fn.invokeHR(arrayOf(__1218046133_Ptr, marshalToNative(timestamp),
          marshalToNative(coordinateSystem), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialLocation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun CreateAttachedFrameOfReferenceAtCurrentHeading():
        SpatialLocatorAttachedFrameOfReference? {
      val fnPtr = _1218046133_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialLocatorAttachedFrameOfReference>()
      val hr = fn.invokeHR(arrayOf(__1218046133_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialLocatorAttachedFrameOfReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun CreateAttachedFrameOfReferenceAtCurrentHeading(relativePosition: Vector3?):
        SpatialLocatorAttachedFrameOfReference? {
      val fnPtr = _1218046133_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialLocatorAttachedFrameOfReference>()
      val hr = fn.invokeHR(arrayOf(__1218046133_Ptr, marshalToNative(relativePosition), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialLocatorAttachedFrameOfReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun CreateAttachedFrameOfReferenceAtCurrentHeading(relativePosition: Vector3?,
        relativeOrientation: Quaternion?): SpatialLocatorAttachedFrameOfReference? {
      val fnPtr = _1218046133_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialLocatorAttachedFrameOfReference>()
      val hr = fn.invokeHR(arrayOf(__1218046133_Ptr, marshalToNative(relativePosition),
          marshalToNative(relativeOrientation), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialLocatorAttachedFrameOfReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun CreateAttachedFrameOfReferenceAtCurrentHeading(
      relativePosition: Vector3?,
      relativeOrientation: Quaternion?,
      relativeHeadingInRadians: Double
    ): SpatialLocatorAttachedFrameOfReference? {
      val fnPtr = _1218046133_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialLocatorAttachedFrameOfReference>()
      val hr = fn.invokeHR(arrayOf(__1218046133_Ptr, marshalToNative(relativePosition),
          marshalToNative(relativeOrientation), relativeHeadingInRadians, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialLocatorAttachedFrameOfReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun CreateStationaryFrameOfReferenceAtCurrentLocation():
        SpatialStationaryFrameOfReference? {
      val fnPtr = _1218046133_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialStationaryFrameOfReference>()
      val hr = fn.invokeHR(arrayOf(__1218046133_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialStationaryFrameOfReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override
        fun CreateStationaryFrameOfReferenceAtCurrentLocation(relativePosition: Vector3?):
        SpatialStationaryFrameOfReference? {
      val fnPtr = _1218046133_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialStationaryFrameOfReference>()
      val hr = fn.invokeHR(arrayOf(__1218046133_Ptr, marshalToNative(relativePosition), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialStationaryFrameOfReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override
        fun CreateStationaryFrameOfReferenceAtCurrentLocation(relativePosition: Vector3?,
        relativeOrientation: Quaternion?): SpatialStationaryFrameOfReference? {
      val fnPtr = _1218046133_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialStationaryFrameOfReference>()
      val hr = fn.invokeHR(arrayOf(__1218046133_Ptr, marshalToNative(relativePosition),
          marshalToNative(relativeOrientation), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialStationaryFrameOfReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun CreateStationaryFrameOfReferenceAtCurrentLocation(
      relativePosition: Vector3?,
      relativeOrientation: Quaternion?,
      relativeHeadingInRadians: Double
    ): SpatialStationaryFrameOfReference? {
      val fnPtr = _1218046133_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialStationaryFrameOfReference>()
      val hr = fn.invokeHR(arrayOf(__1218046133_Ptr, marshalToNative(relativePosition),
          marshalToNative(relativeOrientation), relativeHeadingInRadians, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialStationaryFrameOfReference>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialLocator_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1218046133_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialLocator, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f64789259e0c3bb6997eb64ecca24cf4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialLocator(ptr: Pointer?): WithDefault = ISpatialLocator_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialLocator {
      val address = segment.toRawLongValue()
      return makeISpatialLocator(Pointer(address))
    }

    public override fun toNative(obj: ISpatialLocator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1218046133_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialLocator): Array<ISpatialLocator?> = (elements as
        Array<ISpatialLocator?>).castToImpl<ISpatialLocator,ISpatialLocator_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialLocator?> =
        arrayOfNulls<ISpatialLocator_Impl>(size) as Array<ISpatialLocator?>
  }
}
