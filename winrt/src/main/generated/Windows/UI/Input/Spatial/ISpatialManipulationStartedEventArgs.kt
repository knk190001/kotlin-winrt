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

@ABIMarker(ISpatialManipulationStartedEventArgs.ABI::class)
@Signature("{a1d6bbce-42a5-377b-ada6-d28e3d384737}")
@Guid("a1d6bbce42a5377bada6d28e3d384737")
@WinRTInterface("a1d6bbce42a5377bada6d28e3d384737")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialManipulationStartedEventArgs.ByReference::class)
public interface ISpatialManipulationStartedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InteractionSourceKind(): SpatialInteractionSourceKind?

  @InterfaceMethod(1)
  public fun TryGetPointerPose(coordinateSystem: SpatialCoordinateSystem?): SpatialPointerPose?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialManipulationStartedEventArgs> {
    public override fun getValue() =
        ABI.makeISpatialManipulationStartedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISpatialManipulationStartedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialManipulationStartedEventArgs {
    public val __2070588255_Ptr: Pointer?

    public val _2070588255_VtblPtr: Pointer?
      get() = __2070588255_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InteractionSourceKind(): SpatialInteractionSourceKind? {
      val fnPtr = _2070588255_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialInteractionSourceKind>()
      val hr = fn.invokeHR(arrayOf(__2070588255_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialInteractionSourceKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryGetPointerPose(coordinateSystem: SpatialCoordinateSystem?):
        SpatialPointerPose? {
      val fnPtr = _2070588255_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialPointerPose>()
      val hr = fn.invokeHR(arrayOf(__2070588255_Ptr, marshalToNative(coordinateSystem), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialPointerPose>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialManipulationStartedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2070588255_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialManipulationStartedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a1d6bbce42a5377bada6d28e3d384737")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialManipulationStartedEventArgs(ptr: Pointer?): WithDefault =
        ISpatialManipulationStartedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialManipulationStartedEventArgs {
      val address = segment.toRawLongValue()
      return makeISpatialManipulationStartedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISpatialManipulationStartedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2070588255_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialManipulationStartedEventArgs):
        Array<ISpatialManipulationStartedEventArgs?> = (elements as
        Array<ISpatialManipulationStartedEventArgs?>).castToImpl<ISpatialManipulationStartedEventArgs,ISpatialManipulationStartedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialManipulationStartedEventArgs?> =
        arrayOfNulls<ISpatialManipulationStartedEventArgs_Impl>(size) as
        Array<ISpatialManipulationStartedEventArgs?>
  }
}
