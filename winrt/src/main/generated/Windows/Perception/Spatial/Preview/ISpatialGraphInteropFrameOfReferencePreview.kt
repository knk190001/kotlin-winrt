package Windows.Perception.Spatial.Preview

import Windows.Foundation.Numerics.Matrix4x4
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

@ABIMarker(ISpatialGraphInteropFrameOfReferencePreview.ABI::class)
@Signature("{a8271b23-735f-5729-a98e-e64ed189abc5}")
@Guid("a8271b23735f5729a98ee64ed189abc5")
@WinRTInterface("a8271b23735f5729a98ee64ed189abc5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialGraphInteropFrameOfReferencePreview.ByReference::class)
public interface ISpatialGraphInteropFrameOfReferencePreview : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CoordinateSystem(): SpatialCoordinateSystem?

  @InterfaceMethod(1)
  public fun get_NodeId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(2)
  public fun get_CoordinateSystemToNodeTransform(): Matrix4x4?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialGraphInteropFrameOfReferencePreview> {
    public override fun getValue() =
        ABI.makeISpatialGraphInteropFrameOfReferencePreview(pointer.getPointer(0))

    public fun setValue(value: ISpatialGraphInteropFrameOfReferencePreview_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialGraphInteropFrameOfReferencePreview {
    public val __445842519_Ptr: Pointer?

    public val _445842519_VtblPtr: Pointer?
      get() = __445842519_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CoordinateSystem(): SpatialCoordinateSystem? {
      val fnPtr = _445842519_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialCoordinateSystem>()
      val hr = fn.invokeHR(arrayOf(__445842519_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialCoordinateSystem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NodeId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _445842519_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__445842519_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CoordinateSystemToNodeTransform(): Matrix4x4? {
      val fnPtr = _445842519_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Matrix4x4>()
      val hr = fn.invokeHR(arrayOf(__445842519_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Matrix4x4>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialGraphInteropFrameOfReferencePreview_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __445842519_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialGraphInteropFrameOfReferencePreview, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a8271b23735f5729a98ee64ed189abc5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialGraphInteropFrameOfReferencePreview(ptr: Pointer?): WithDefault =
        ISpatialGraphInteropFrameOfReferencePreview_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISpatialGraphInteropFrameOfReferencePreview {
      val address = segment.toRawLongValue()
      return makeISpatialGraphInteropFrameOfReferencePreview(Pointer(address))
    }

    public override fun toNative(obj: ISpatialGraphInteropFrameOfReferencePreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__445842519_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialGraphInteropFrameOfReferencePreview):
        Array<ISpatialGraphInteropFrameOfReferencePreview?> = (elements as
        Array<ISpatialGraphInteropFrameOfReferencePreview?>).castToImpl<ISpatialGraphInteropFrameOfReferencePreview,ISpatialGraphInteropFrameOfReferencePreview_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialGraphInteropFrameOfReferencePreview?> =
        arrayOfNulls<ISpatialGraphInteropFrameOfReferencePreview_Impl>(size) as
        Array<ISpatialGraphInteropFrameOfReferencePreview?>
  }
}
