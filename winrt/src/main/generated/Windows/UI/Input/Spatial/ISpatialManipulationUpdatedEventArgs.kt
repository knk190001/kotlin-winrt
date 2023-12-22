package Windows.UI.Input.Spatial

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpatialManipulationUpdatedEventArgs.ABI::class)
@Signature("{5f230b9b-60c6-4dc6-bdc9-9f4a6f15fe49}")
@Guid("5f230b9b60c64dc6bdc99f4a6f15fe49")
@WinRTInterface("5f230b9b60c64dc6bdc99f4a6f15fe49")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialManipulationUpdatedEventArgs.ByReference::class)
public interface ISpatialManipulationUpdatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InteractionSourceKind(): SpatialInteractionSourceKind?

  @InterfaceMethod(1)
  public fun TryGetCumulativeDelta(coordinateSystem: SpatialCoordinateSystem?):
      SpatialManipulationDelta?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialManipulationUpdatedEventArgs> {
    public override fun getValue() =
        ABI.makeISpatialManipulationUpdatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISpatialManipulationUpdatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialManipulationUpdatedEventArgs {
    public val __1509512091_Ptr: Pointer?

    public val _1509512091_VtblPtr: Pointer?
      get() = __1509512091_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InteractionSourceKind(): SpatialInteractionSourceKind? {
      val fnPtr = _1509512091_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialInteractionSourceKind>()
      val hr = fn.invokeHR(arrayOf(__1509512091_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialInteractionSourceKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryGetCumulativeDelta(coordinateSystem: SpatialCoordinateSystem?):
        SpatialManipulationDelta? {
      val fnPtr = _1509512091_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialManipulationDelta>()
      val hr = fn.invokeHR(arrayOf(__1509512091_Ptr, marshalToNative(coordinateSystem), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialManipulationDelta>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialManipulationUpdatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1509512091_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialManipulationUpdatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5f230b9b60c64dc6bdc99f4a6f15fe49")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialManipulationUpdatedEventArgs(ptr: Pointer?): WithDefault =
        ISpatialManipulationUpdatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialManipulationUpdatedEventArgs {
      val address = segment.toRawLongValue()
      return makeISpatialManipulationUpdatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISpatialManipulationUpdatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1509512091_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialManipulationUpdatedEventArgs):
        Array<ISpatialManipulationUpdatedEventArgs?> = (elements as
        Array<ISpatialManipulationUpdatedEventArgs?>).castToImpl<ISpatialManipulationUpdatedEventArgs,ISpatialManipulationUpdatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialManipulationUpdatedEventArgs?> =
        arrayOfNulls<ISpatialManipulationUpdatedEventArgs_Impl>(size) as
        Array<ISpatialManipulationUpdatedEventArgs?>
  }
}
