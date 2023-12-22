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

@ABIMarker(ISpatialHoldStartedEventArgs.ABI::class)
@Signature("{8e343d79-acb6-4144-8615-2cfba8a3cb3f}")
@Guid("8e343d79acb6414486152cfba8a3cb3f")
@WinRTInterface("8e343d79acb6414486152cfba8a3cb3f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialHoldStartedEventArgs.ByReference::class)
public interface ISpatialHoldStartedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InteractionSourceKind(): SpatialInteractionSourceKind?

  @InterfaceMethod(1)
  public fun TryGetPointerPose(coordinateSystem: SpatialCoordinateSystem?): SpatialPointerPose?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialHoldStartedEventArgs> {
    public override fun getValue() = ABI.makeISpatialHoldStartedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISpatialHoldStartedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialHoldStartedEventArgs {
    public val __889310337_Ptr: Pointer?

    public val _889310337_VtblPtr: Pointer?
      get() = __889310337_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InteractionSourceKind(): SpatialInteractionSourceKind? {
      val fnPtr = _889310337_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialInteractionSourceKind>()
      val hr = fn.invokeHR(arrayOf(__889310337_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialInteractionSourceKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryGetPointerPose(coordinateSystem: SpatialCoordinateSystem?):
        SpatialPointerPose? {
      val fnPtr = _889310337_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialPointerPose>()
      val hr = fn.invokeHR(arrayOf(__889310337_Ptr, marshalToNative(coordinateSystem), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialPointerPose>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialHoldStartedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __889310337_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialHoldStartedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8e343d79acb6414486152cfba8a3cb3f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialHoldStartedEventArgs(ptr: Pointer?): WithDefault =
        ISpatialHoldStartedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialHoldStartedEventArgs {
      val address = segment.toRawLongValue()
      return makeISpatialHoldStartedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISpatialHoldStartedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__889310337_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialHoldStartedEventArgs):
        Array<ISpatialHoldStartedEventArgs?> = (elements as
        Array<ISpatialHoldStartedEventArgs?>).castToImpl<ISpatialHoldStartedEventArgs,ISpatialHoldStartedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialHoldStartedEventArgs?> =
        arrayOfNulls<ISpatialHoldStartedEventArgs_Impl>(size) as
        Array<ISpatialHoldStartedEventArgs?>
  }
}
