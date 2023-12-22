package Windows.Perception.Spatial.Surfaces

import Windows.Foundation.IAsyncOperation
import Windows.Perception.Spatial.SpatialPerceptionAccessStatus
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

@ABIMarker(ISpatialSurfaceObserverStatics.ABI::class)
@Signature("{165951ed-2108-4168-9175-87e027bc9285}")
@Guid("165951ed21084168917587e027bc9285")
@WinRTInterface("165951ed21084168917587e027bc9285")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialSurfaceObserverStatics.ByReference::class)
public interface ISpatialSurfaceObserverStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestAccessAsync(): IAsyncOperation<SpatialPerceptionAccessStatus?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialSurfaceObserverStatics> {
    public override fun getValue() = ABI.makeISpatialSurfaceObserverStatics(pointer.getPointer(0))

    public fun setValue(value: ISpatialSurfaceObserverStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialSurfaceObserverStatics {
    public val __789162549_Ptr: Pointer?

    public val _789162549_VtblPtr: Pointer?
      get() = __789162549_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestAccessAsync(): IAsyncOperation<SpatialPerceptionAccessStatus?>? {
      val fnPtr = _789162549_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SpatialPerceptionAccessStatus?>>()
      val hr = fn.invokeHR(arrayOf(__789162549_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SpatialPerceptionAccessStatus?>>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialSurfaceObserverStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __789162549_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialSurfaceObserverStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("165951ed21084168917587e027bc9285")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialSurfaceObserverStatics(ptr: Pointer?): WithDefault =
        ISpatialSurfaceObserverStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialSurfaceObserverStatics {
      val address = segment.toRawLongValue()
      return makeISpatialSurfaceObserverStatics(Pointer(address))
    }

    public override fun toNative(obj: ISpatialSurfaceObserverStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__789162549_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialSurfaceObserverStatics):
        Array<ISpatialSurfaceObserverStatics?> = (elements as
        Array<ISpatialSurfaceObserverStatics?>).castToImpl<ISpatialSurfaceObserverStatics,ISpatialSurfaceObserverStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialSurfaceObserverStatics?> =
        arrayOfNulls<ISpatialSurfaceObserverStatics_Impl>(size) as
        Array<ISpatialSurfaceObserverStatics?>
  }
}
