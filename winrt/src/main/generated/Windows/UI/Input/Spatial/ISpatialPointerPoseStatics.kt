package Windows.UI.Input.Spatial

import Windows.Perception.PerceptionTimestamp
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

@ABIMarker(ISpatialPointerPoseStatics.ABI::class)
@Signature("{a25591a9-aca1-3ee0-9816-785cfb2e3fb8}")
@Guid("a25591a9aca13ee09816785cfb2e3fb8")
@WinRTInterface("a25591a9aca13ee09816785cfb2e3fb8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialPointerPoseStatics.ByReference::class)
public interface ISpatialPointerPoseStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryGetAtTimestamp(coordinateSystem: SpatialCoordinateSystem?,
      timestamp: PerceptionTimestamp?): SpatialPointerPose?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialPointerPoseStatics> {
    public override fun getValue() = ABI.makeISpatialPointerPoseStatics(pointer.getPointer(0))

    public fun setValue(value: ISpatialPointerPoseStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialPointerPoseStatics {
    public val __638575875_Ptr: Pointer?

    public val _638575875_VtblPtr: Pointer?
      get() = __638575875_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryGetAtTimestamp(coordinateSystem: SpatialCoordinateSystem?,
        timestamp: PerceptionTimestamp?): SpatialPointerPose? {
      val fnPtr = _638575875_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialPointerPose>()
      val hr = fn.invokeHR(arrayOf(__638575875_Ptr, marshalToNative(coordinateSystem),
          marshalToNative(timestamp), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialPointerPose>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialPointerPoseStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __638575875_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialPointerPoseStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a25591a9aca13ee09816785cfb2e3fb8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialPointerPoseStatics(ptr: Pointer?): WithDefault =
        ISpatialPointerPoseStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialPointerPoseStatics {
      val address = segment.toRawLongValue()
      return makeISpatialPointerPoseStatics(Pointer(address))
    }

    public override fun toNative(obj: ISpatialPointerPoseStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__638575875_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialPointerPoseStatics):
        Array<ISpatialPointerPoseStatics?> = (elements as
        Array<ISpatialPointerPoseStatics?>).castToImpl<ISpatialPointerPoseStatics,ISpatialPointerPoseStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialPointerPoseStatics?> =
        arrayOfNulls<ISpatialPointerPoseStatics_Impl>(size) as Array<ISpatialPointerPoseStatics?>
  }
}
