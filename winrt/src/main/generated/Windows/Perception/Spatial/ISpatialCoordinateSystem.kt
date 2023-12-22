package Windows.Perception.Spatial

import Windows.Foundation.IReference
import Windows.Foundation.Numerics.Matrix4x4
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

@ABIMarker(ISpatialCoordinateSystem.ABI::class)
@Signature("{69ebca4b-60a3-3586-a653-59a7bd676d07}")
@Guid("69ebca4b60a33586a65359a7bd676d07")
@WinRTInterface("69ebca4b60a33586a65359a7bd676d07")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialCoordinateSystem.ByReference::class)
public interface ISpatialCoordinateSystem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryGetTransformTo(target: SpatialCoordinateSystem?): IReference<Matrix4x4?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialCoordinateSystem> {
    public override fun getValue() = ABI.makeISpatialCoordinateSystem(pointer.getPointer(0))

    public fun setValue(value: ISpatialCoordinateSystem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialCoordinateSystem {
    public val __44105864_Ptr: Pointer?

    public val _44105864_VtblPtr: Pointer?
      get() = __44105864_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryGetTransformTo(target: SpatialCoordinateSystem?):
        IReference<Matrix4x4?>? {
      val fnPtr = _44105864_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Matrix4x4?>>()
      val hr = fn.invokeHR(arrayOf(__44105864_Ptr, marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Matrix4x4?>>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialCoordinateSystem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __44105864_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialCoordinateSystem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("69ebca4b60a33586a65359a7bd676d07")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialCoordinateSystem(ptr: Pointer?): WithDefault =
        ISpatialCoordinateSystem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialCoordinateSystem {
      val address = segment.toRawLongValue()
      return makeISpatialCoordinateSystem(Pointer(address))
    }

    public override fun toNative(obj: ISpatialCoordinateSystem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__44105864_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialCoordinateSystem):
        Array<ISpatialCoordinateSystem?> = (elements as
        Array<ISpatialCoordinateSystem?>).castToImpl<ISpatialCoordinateSystem,ISpatialCoordinateSystem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialCoordinateSystem?> =
        arrayOfNulls<ISpatialCoordinateSystem_Impl>(size) as Array<ISpatialCoordinateSystem?>
  }
}
