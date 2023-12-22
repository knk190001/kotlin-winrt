package Windows.Perception.Spatial.Preview

import Windows.Foundation.Numerics.Quaternion
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpatialGraphInteropPreviewStatics2.ABI::class)
@Signature("{2490b15f-6cbd-4b1e-b765-31e462a32df2}")
@Guid("2490b15f6cbd4b1eb76531e462a32df2")
@WinRTInterface("2490b15f6cbd4b1eb76531e462a32df2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialGraphInteropPreviewStatics2.ByReference::class)
public interface ISpatialGraphInteropPreviewStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryCreateFrameOfReference(coordinateSystem: SpatialCoordinateSystem?):
      SpatialGraphInteropFrameOfReferencePreview?

  @InterfaceMethod(1)
  public fun TryCreateFrameOfReference(coordinateSystem: SpatialCoordinateSystem?,
      relativePosition: Vector3?): SpatialGraphInteropFrameOfReferencePreview?

  @InterfaceMethod(2)
  public fun TryCreateFrameOfReference(
    coordinateSystem: SpatialCoordinateSystem?,
    relativePosition: Vector3?,
    relativeOrientation: Quaternion?
  ): SpatialGraphInteropFrameOfReferencePreview?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialGraphInteropPreviewStatics2> {
    public override fun getValue() =
        ABI.makeISpatialGraphInteropPreviewStatics2(pointer.getPointer(0))

    public fun setValue(value: ISpatialGraphInteropPreviewStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialGraphInteropPreviewStatics2 {
    public val __563439883_Ptr: Pointer?

    public val _563439883_VtblPtr: Pointer?
      get() = __563439883_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryCreateFrameOfReference(coordinateSystem: SpatialCoordinateSystem?):
        SpatialGraphInteropFrameOfReferencePreview? {
      val fnPtr = _563439883_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialGraphInteropFrameOfReferencePreview>()
      val hr = fn.invokeHR(arrayOf(__563439883_Ptr, marshalToNative(coordinateSystem), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<SpatialGraphInteropFrameOfReferencePreview>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryCreateFrameOfReference(coordinateSystem: SpatialCoordinateSystem?,
        relativePosition: Vector3?): SpatialGraphInteropFrameOfReferencePreview? {
      val fnPtr = _563439883_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialGraphInteropFrameOfReferencePreview>()
      val hr = fn.invokeHR(arrayOf(__563439883_Ptr, marshalToNative(coordinateSystem),
          marshalToNative(relativePosition), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<SpatialGraphInteropFrameOfReferencePreview>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun TryCreateFrameOfReference(
      coordinateSystem: SpatialCoordinateSystem?,
      relativePosition: Vector3?,
      relativeOrientation: Quaternion?
    ): SpatialGraphInteropFrameOfReferencePreview? {
      val fnPtr = _563439883_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialGraphInteropFrameOfReferencePreview>()
      val hr = fn.invokeHR(arrayOf(__563439883_Ptr, marshalToNative(coordinateSystem),
          marshalToNative(relativePosition), marshalToNative(relativeOrientation), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<SpatialGraphInteropFrameOfReferencePreview>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialGraphInteropPreviewStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __563439883_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialGraphInteropPreviewStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2490b15f6cbd4b1eb76531e462a32df2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialGraphInteropPreviewStatics2(ptr: Pointer?): WithDefault =
        ISpatialGraphInteropPreviewStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialGraphInteropPreviewStatics2 {
      val address = segment.toRawLongValue()
      return makeISpatialGraphInteropPreviewStatics2(Pointer(address))
    }

    public override fun toNative(obj: ISpatialGraphInteropPreviewStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__563439883_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialGraphInteropPreviewStatics2):
        Array<ISpatialGraphInteropPreviewStatics2?> = (elements as
        Array<ISpatialGraphInteropPreviewStatics2?>).castToImpl<ISpatialGraphInteropPreviewStatics2,ISpatialGraphInteropPreviewStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialGraphInteropPreviewStatics2?> =
        arrayOfNulls<ISpatialGraphInteropPreviewStatics2_Impl>(size) as
        Array<ISpatialGraphInteropPreviewStatics2?>
  }
}
