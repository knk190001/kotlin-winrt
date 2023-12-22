package Windows.Perception.Spatial

import Windows.Foundation.IReference
import Windows.Foundation.Numerics.Quaternion
import Windows.Foundation.Numerics.Vector3
import Windows.Perception.PerceptionTimestamp
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpatialLocatorAttachedFrameOfReference.ABI::class)
@Signature("{e1774ef6-1f4f-499c-9625-ef5e6ed7a048}")
@Guid("e1774ef61f4f499c9625ef5e6ed7a048")
@WinRTInterface("e1774ef61f4f499c9625ef5e6ed7a048")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialLocatorAttachedFrameOfReference.ByReference::class)
public interface ISpatialLocatorAttachedFrameOfReference : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RelativePosition(): Vector3?

  @InterfaceMethod(1)
  public fun put_RelativePosition(value: Vector3?): Unit

  @InterfaceMethod(2)
  public fun get_RelativeOrientation(): Quaternion?

  @InterfaceMethod(3)
  public fun put_RelativeOrientation(value: Quaternion?): Unit

  @InterfaceMethod(4)
  public fun AdjustHeading(headingOffsetInRadians: Double): Unit

  @InterfaceMethod(5)
  public fun GetStationaryCoordinateSystemAtTimestamp(timestamp: PerceptionTimestamp?):
      SpatialCoordinateSystem?

  @InterfaceMethod(6)
  public fun TryGetRelativeHeadingAtTimestamp(timestamp: PerceptionTimestamp?): IReference<Double>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialLocatorAttachedFrameOfReference> {
    public override fun getValue() =
        ABI.makeISpatialLocatorAttachedFrameOfReference(pointer.getPointer(0))

    public fun setValue(value: ISpatialLocatorAttachedFrameOfReference_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialLocatorAttachedFrameOfReference {
    public val __1968190240_Ptr: Pointer?

    public val _1968190240_VtblPtr: Pointer?
      get() = __1968190240_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RelativePosition(): Vector3? {
      val fnPtr = _1968190240_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1968190240_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_RelativePosition(value: Vector3?): Unit {
      val fnPtr = _1968190240_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1968190240_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_RelativeOrientation(): Quaternion? {
      val fnPtr = _1968190240_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Quaternion>()
      val hr = fn.invokeHR(arrayOf(__1968190240_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Quaternion>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_RelativeOrientation(value: Quaternion?): Unit {
      val fnPtr = _1968190240_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1968190240_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun AdjustHeading(headingOffsetInRadians: Double): Unit {
      val fnPtr = _1968190240_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1968190240_Ptr, headingOffsetInRadians,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun GetStationaryCoordinateSystemAtTimestamp(timestamp: PerceptionTimestamp?):
        SpatialCoordinateSystem? {
      val fnPtr = _1968190240_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialCoordinateSystem>()
      val hr = fn.invokeHR(arrayOf(__1968190240_Ptr, marshalToNative(timestamp), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialCoordinateSystem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun TryGetRelativeHeadingAtTimestamp(timestamp: PerceptionTimestamp?):
        IReference<Double>? {
      val fnPtr = _1968190240_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__1968190240_Ptr, marshalToNative(timestamp), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialLocatorAttachedFrameOfReference_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1968190240_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialLocatorAttachedFrameOfReference, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e1774ef61f4f499c9625ef5e6ed7a048")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialLocatorAttachedFrameOfReference(ptr: Pointer?): WithDefault =
        ISpatialLocatorAttachedFrameOfReference_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISpatialLocatorAttachedFrameOfReference {
      val address = segment.toRawLongValue()
      return makeISpatialLocatorAttachedFrameOfReference(Pointer(address))
    }

    public override fun toNative(obj: ISpatialLocatorAttachedFrameOfReference): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1968190240_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialLocatorAttachedFrameOfReference):
        Array<ISpatialLocatorAttachedFrameOfReference?> = (elements as
        Array<ISpatialLocatorAttachedFrameOfReference?>).castToImpl<ISpatialLocatorAttachedFrameOfReference,ISpatialLocatorAttachedFrameOfReference_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialLocatorAttachedFrameOfReference?> =
        arrayOfNulls<ISpatialLocatorAttachedFrameOfReference_Impl>(size) as
        Array<ISpatialLocatorAttachedFrameOfReference?>
  }
}
