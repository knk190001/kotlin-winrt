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

@ABIMarker(ISpatialManipulationCompletedEventArgs.ABI::class)
@Signature("{05086802-f301-4343-9250-2fbaa5f87a37}")
@Guid("05086802f301434392502fbaa5f87a37")
@WinRTInterface("05086802f301434392502fbaa5f87a37")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialManipulationCompletedEventArgs.ByReference::class)
public interface ISpatialManipulationCompletedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InteractionSourceKind(): SpatialInteractionSourceKind?

  @InterfaceMethod(1)
  public fun TryGetCumulativeDelta(coordinateSystem: SpatialCoordinateSystem?):
      SpatialManipulationDelta?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialManipulationCompletedEventArgs> {
    public override fun getValue() =
        ABI.makeISpatialManipulationCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISpatialManipulationCompletedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialManipulationCompletedEventArgs {
    public val __327740053_Ptr: Pointer?

    public val _327740053_VtblPtr: Pointer?
      get() = __327740053_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InteractionSourceKind(): SpatialInteractionSourceKind? {
      val fnPtr = _327740053_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialInteractionSourceKind>()
      val hr = fn.invokeHR(arrayOf(__327740053_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialInteractionSourceKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryGetCumulativeDelta(coordinateSystem: SpatialCoordinateSystem?):
        SpatialManipulationDelta? {
      val fnPtr = _327740053_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialManipulationDelta>()
      val hr = fn.invokeHR(arrayOf(__327740053_Ptr, marshalToNative(coordinateSystem), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialManipulationDelta>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialManipulationCompletedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __327740053_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialManipulationCompletedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("05086802f301434392502fbaa5f87a37")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialManipulationCompletedEventArgs(ptr: Pointer?): WithDefault =
        ISpatialManipulationCompletedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialManipulationCompletedEventArgs {
      val address = segment.toRawLongValue()
      return makeISpatialManipulationCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISpatialManipulationCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__327740053_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialManipulationCompletedEventArgs):
        Array<ISpatialManipulationCompletedEventArgs?> = (elements as
        Array<ISpatialManipulationCompletedEventArgs?>).castToImpl<ISpatialManipulationCompletedEventArgs,ISpatialManipulationCompletedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialManipulationCompletedEventArgs?> =
        arrayOfNulls<ISpatialManipulationCompletedEventArgs_Impl>(size) as
        Array<ISpatialManipulationCompletedEventArgs?>
  }
}
