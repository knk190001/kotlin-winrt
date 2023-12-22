package Windows.Perception.Spatial

import Windows.Foundation.Numerics.Quaternion
import Windows.Foundation.Numerics.Vector3
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

@ABIMarker(ISpatialLocation.ABI::class)
@Signature("{1d81d29d-24a1-37d5-8fa1-39b4f9ad67e2}")
@Guid("1d81d29d24a137d58fa139b4f9ad67e2")
@WinRTInterface("1d81d29d24a137d58fa139b4f9ad67e2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialLocation.ByReference::class)
public interface ISpatialLocation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Position(): Vector3?

  @InterfaceMethod(1)
  public fun get_Orientation(): Quaternion?

  @InterfaceMethod(2)
  public fun get_AbsoluteLinearVelocity(): Vector3?

  @InterfaceMethod(3)
  public fun get_AbsoluteLinearAcceleration(): Vector3?

  @InterfaceMethod(4)
  public fun get_AbsoluteAngularVelocity(): Quaternion?

  @InterfaceMethod(5)
  public fun get_AbsoluteAngularAcceleration(): Quaternion?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialLocation> {
    public override fun getValue() = ABI.makeISpatialLocation(pointer.getPointer(0))

    public fun setValue(value: ISpatialLocation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialLocation {
    public val __895281290_Ptr: Pointer?

    public val _895281290_VtblPtr: Pointer?
      get() = __895281290_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Position(): Vector3? {
      val fnPtr = _895281290_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__895281290_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Orientation(): Quaternion? {
      val fnPtr = _895281290_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Quaternion>()
      val hr = fn.invokeHR(arrayOf(__895281290_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Quaternion>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_AbsoluteLinearVelocity(): Vector3? {
      val fnPtr = _895281290_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__895281290_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_AbsoluteLinearAcceleration(): Vector3? {
      val fnPtr = _895281290_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__895281290_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_AbsoluteAngularVelocity(): Quaternion? {
      val fnPtr = _895281290_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Quaternion>()
      val hr = fn.invokeHR(arrayOf(__895281290_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Quaternion>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_AbsoluteAngularAcceleration(): Quaternion? {
      val fnPtr = _895281290_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Quaternion>()
      val hr = fn.invokeHR(arrayOf(__895281290_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Quaternion>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialLocation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __895281290_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialLocation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1d81d29d24a137d58fa139b4f9ad67e2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialLocation(ptr: Pointer?): WithDefault = ISpatialLocation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialLocation {
      val address = segment.toRawLongValue()
      return makeISpatialLocation(Pointer(address))
    }

    public override fun toNative(obj: ISpatialLocation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__895281290_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialLocation): Array<ISpatialLocation?> = (elements as
        Array<ISpatialLocation?>).castToImpl<ISpatialLocation,ISpatialLocation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialLocation?> =
        arrayOfNulls<ISpatialLocation_Impl>(size) as Array<ISpatialLocation?>
  }
}
