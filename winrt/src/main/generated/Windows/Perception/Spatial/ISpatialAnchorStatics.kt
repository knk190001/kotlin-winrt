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

@ABIMarker(ISpatialAnchorStatics.ABI::class)
@Signature("{a9928642-0174-311c-ae79-0e5107669f16}")
@Guid("a99286420174311cae790e5107669f16")
@WinRTInterface("a99286420174311cae790e5107669f16")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialAnchorStatics.ByReference::class)
public interface ISpatialAnchorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryCreateRelativeTo(coordinateSystem: SpatialCoordinateSystem?): SpatialAnchor?

  @InterfaceMethod(1)
  public fun TryCreateRelativeTo(coordinateSystem: SpatialCoordinateSystem?, position: Vector3?):
      SpatialAnchor?

  @InterfaceMethod(2)
  public fun TryCreateRelativeTo(
    coordinateSystem: SpatialCoordinateSystem?,
    position: Vector3?,
    orientation: Quaternion?
  ): SpatialAnchor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialAnchorStatics> {
    public override fun getValue() = ABI.makeISpatialAnchorStatics(pointer.getPointer(0))

    public fun setValue(value: ISpatialAnchorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialAnchorStatics {
    public val __621901777_Ptr: Pointer?

    public val _621901777_VtblPtr: Pointer?
      get() = __621901777_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryCreateRelativeTo(coordinateSystem: SpatialCoordinateSystem?):
        SpatialAnchor? {
      val fnPtr = _621901777_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialAnchor>()
      val hr = fn.invokeHR(arrayOf(__621901777_Ptr, marshalToNative(coordinateSystem), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialAnchor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryCreateRelativeTo(coordinateSystem: SpatialCoordinateSystem?,
        position: Vector3?): SpatialAnchor? {
      val fnPtr = _621901777_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialAnchor>()
      val hr = fn.invokeHR(arrayOf(__621901777_Ptr, marshalToNative(coordinateSystem),
          marshalToNative(position), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialAnchor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun TryCreateRelativeTo(
      coordinateSystem: SpatialCoordinateSystem?,
      position: Vector3?,
      orientation: Quaternion?
    ): SpatialAnchor? {
      val fnPtr = _621901777_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialAnchor>()
      val hr = fn.invokeHR(arrayOf(__621901777_Ptr, marshalToNative(coordinateSystem),
          marshalToNative(position), marshalToNative(orientation), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialAnchor>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialAnchorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __621901777_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialAnchorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a99286420174311cae790e5107669f16")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialAnchorStatics(ptr: Pointer?): WithDefault =
        ISpatialAnchorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialAnchorStatics {
      val address = segment.toRawLongValue()
      return makeISpatialAnchorStatics(Pointer(address))
    }

    public override fun toNative(obj: ISpatialAnchorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__621901777_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialAnchorStatics): Array<ISpatialAnchorStatics?> =
        (elements as
        Array<ISpatialAnchorStatics?>).castToImpl<ISpatialAnchorStatics,ISpatialAnchorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialAnchorStatics?> =
        arrayOfNulls<ISpatialAnchorStatics_Impl>(size) as Array<ISpatialAnchorStatics?>
  }
}
