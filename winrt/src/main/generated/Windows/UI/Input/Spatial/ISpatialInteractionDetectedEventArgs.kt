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

@ABIMarker(ISpatialInteractionDetectedEventArgs.ABI::class)
@Signature("{075878e4-5961-3b41-9dfb-cea5d89cc38a}")
@Guid("075878e459613b419dfbcea5d89cc38a")
@WinRTInterface("075878e459613b419dfbcea5d89cc38a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialInteractionDetectedEventArgs.ByReference::class)
public interface ISpatialInteractionDetectedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InteractionSourceKind(): SpatialInteractionSourceKind?

  @InterfaceMethod(1)
  public fun TryGetPointerPose(coordinateSystem: SpatialCoordinateSystem?): SpatialPointerPose?

  @InterfaceMethod(2)
  public fun get_Interaction(): SpatialInteraction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialInteractionDetectedEventArgs> {
    public override fun getValue() =
        ABI.makeISpatialInteractionDetectedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISpatialInteractionDetectedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialInteractionDetectedEventArgs {
    public val __1141512399_Ptr: Pointer?

    public val _1141512399_VtblPtr: Pointer?
      get() = __1141512399_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InteractionSourceKind(): SpatialInteractionSourceKind? {
      val fnPtr = _1141512399_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialInteractionSourceKind>()
      val hr = fn.invokeHR(arrayOf(__1141512399_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialInteractionSourceKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryGetPointerPose(coordinateSystem: SpatialCoordinateSystem?):
        SpatialPointerPose? {
      val fnPtr = _1141512399_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialPointerPose>()
      val hr = fn.invokeHR(arrayOf(__1141512399_Ptr, marshalToNative(coordinateSystem), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialPointerPose>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Interaction(): SpatialInteraction? {
      val fnPtr = _1141512399_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialInteraction>()
      val hr = fn.invokeHR(arrayOf(__1141512399_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialInteraction>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialInteractionDetectedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1141512399_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialInteractionDetectedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("075878e459613b419dfbcea5d89cc38a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialInteractionDetectedEventArgs(ptr: Pointer?): WithDefault =
        ISpatialInteractionDetectedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialInteractionDetectedEventArgs {
      val address = segment.toRawLongValue()
      return makeISpatialInteractionDetectedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISpatialInteractionDetectedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1141512399_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialInteractionDetectedEventArgs):
        Array<ISpatialInteractionDetectedEventArgs?> = (elements as
        Array<ISpatialInteractionDetectedEventArgs?>).castToImpl<ISpatialInteractionDetectedEventArgs,ISpatialInteractionDetectedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialInteractionDetectedEventArgs?> =
        arrayOfNulls<ISpatialInteractionDetectedEventArgs_Impl>(size) as
        Array<ISpatialInteractionDetectedEventArgs?>
  }
}
