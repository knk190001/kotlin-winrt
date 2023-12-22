package Windows.UI.Input.Spatial

import Windows.Foundation.IReference
import Windows.Foundation.Numerics.Vector3
import Windows.Perception.Spatial.SpatialCoordinateSystem
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

@ABIMarker(ISpatialInteractionSourceProperties.ABI::class)
@Signature("{05604542-3ef7-3222-9f53-63c9cb7e3bc7}")
@Guid("056045423ef732229f5363c9cb7e3bc7")
@WinRTInterface("056045423ef732229f5363c9cb7e3bc7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialInteractionSourceProperties.ByReference::class)
public interface ISpatialInteractionSourceProperties : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryGetSourceLossMitigationDirection(coordinateSystem: SpatialCoordinateSystem?):
      IReference<Vector3?>?

  @InterfaceMethod(1)
  public fun get_SourceLossRisk(): Double

  @InterfaceMethod(2)
  public fun TryGetLocation(coordinateSystem: SpatialCoordinateSystem?):
      SpatialInteractionSourceLocation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialInteractionSourceProperties> {
    public override fun getValue() =
        ABI.makeISpatialInteractionSourceProperties(pointer.getPointer(0))

    public fun setValue(value: ISpatialInteractionSourceProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialInteractionSourceProperties {
    public val __1491276332_Ptr: Pointer?

    public val _1491276332_VtblPtr: Pointer?
      get() = __1491276332_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun TryGetSourceLossMitigationDirection(coordinateSystem: SpatialCoordinateSystem?):
        IReference<Vector3?>? {
      val fnPtr = _1491276332_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Vector3?>>()
      val hr = fn.invokeHR(arrayOf(__1491276332_Ptr, marshalToNative(coordinateSystem), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Vector3?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SourceLossRisk(): Double {
      val fnPtr = _1491276332_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1491276332_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun TryGetLocation(coordinateSystem: SpatialCoordinateSystem?):
        SpatialInteractionSourceLocation? {
      val fnPtr = _1491276332_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialInteractionSourceLocation>()
      val hr = fn.invokeHR(arrayOf(__1491276332_Ptr, marshalToNative(coordinateSystem), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialInteractionSourceLocation>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialInteractionSourceProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1491276332_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialInteractionSourceProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("056045423ef732229f5363c9cb7e3bc7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialInteractionSourceProperties(ptr: Pointer?): WithDefault =
        ISpatialInteractionSourceProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialInteractionSourceProperties {
      val address = segment.toRawLongValue()
      return makeISpatialInteractionSourceProperties(Pointer(address))
    }

    public override fun toNative(obj: ISpatialInteractionSourceProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1491276332_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialInteractionSourceProperties):
        Array<ISpatialInteractionSourceProperties?> = (elements as
        Array<ISpatialInteractionSourceProperties?>).castToImpl<ISpatialInteractionSourceProperties,ISpatialInteractionSourceProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialInteractionSourceProperties?> =
        arrayOfNulls<ISpatialInteractionSourceProperties_Impl>(size) as
        Array<ISpatialInteractionSourceProperties?>
  }
}
