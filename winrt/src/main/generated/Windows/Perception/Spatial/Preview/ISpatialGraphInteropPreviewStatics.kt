package Windows.Perception.Spatial.Preview

import Windows.Foundation.Numerics.Quaternion
import Windows.Foundation.Numerics.Vector3
import Windows.Perception.Spatial.SpatialCoordinateSystem
import Windows.Perception.Spatial.SpatialLocator
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

@ABIMarker(ISpatialGraphInteropPreviewStatics.ABI::class)
@Signature("{c042644c-20d8-4ed0-aef7-6805b8e53f55}")
@Guid("c042644c20d84ed0aef76805b8e53f55")
@WinRTInterface("c042644c20d84ed0aef76805b8e53f55")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialGraphInteropPreviewStatics.ByReference::class)
public interface ISpatialGraphInteropPreviewStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateCoordinateSystemForNode(nodeId: com.sun.jna.platform.win32.Guid.GUID?):
      SpatialCoordinateSystem?

  @InterfaceMethod(1)
  public fun CreateCoordinateSystemForNode(nodeId: com.sun.jna.platform.win32.Guid.GUID?,
      relativePosition: Vector3?): SpatialCoordinateSystem?

  @InterfaceMethod(2)
  public fun CreateCoordinateSystemForNode(
    nodeId: com.sun.jna.platform.win32.Guid.GUID?,
    relativePosition: Vector3?,
    relativeOrientation: Quaternion?
  ): SpatialCoordinateSystem?

  @InterfaceMethod(3)
  public fun CreateLocatorForNode(nodeId: com.sun.jna.platform.win32.Guid.GUID?): SpatialLocator?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialGraphInteropPreviewStatics> {
    public override fun getValue() =
        ABI.makeISpatialGraphInteropPreviewStatics(pointer.getPointer(0))

    public fun setValue(value: ISpatialGraphInteropPreviewStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialGraphInteropPreviewStatics {
    public val __572364807_Ptr: Pointer?

    public val _572364807_VtblPtr: Pointer?
      get() = __572364807_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun CreateCoordinateSystemForNode(nodeId: com.sun.jna.platform.win32.Guid.GUID?):
        SpatialCoordinateSystem? {
      val fnPtr = _572364807_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialCoordinateSystem>()
      val hr = fn.invokeHR(arrayOf(__572364807_Ptr, marshalToNative(nodeId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialCoordinateSystem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateCoordinateSystemForNode(nodeId: com.sun.jna.platform.win32.Guid.GUID?,
        relativePosition: Vector3?): SpatialCoordinateSystem? {
      val fnPtr = _572364807_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialCoordinateSystem>()
      val hr = fn.invokeHR(arrayOf(__572364807_Ptr, marshalToNative(nodeId),
          marshalToNative(relativePosition), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialCoordinateSystem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateCoordinateSystemForNode(
      nodeId: com.sun.jna.platform.win32.Guid.GUID?,
      relativePosition: Vector3?,
      relativeOrientation: Quaternion?
    ): SpatialCoordinateSystem? {
      val fnPtr = _572364807_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialCoordinateSystem>()
      val hr = fn.invokeHR(arrayOf(__572364807_Ptr, marshalToNative(nodeId),
          marshalToNative(relativePosition), marshalToNative(relativeOrientation), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialCoordinateSystem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateLocatorForNode(nodeId: com.sun.jna.platform.win32.Guid.GUID?):
        SpatialLocator? {
      val fnPtr = _572364807_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialLocator>()
      val hr = fn.invokeHR(arrayOf(__572364807_Ptr, marshalToNative(nodeId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialLocator>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialGraphInteropPreviewStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __572364807_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialGraphInteropPreviewStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c042644c20d84ed0aef76805b8e53f55")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialGraphInteropPreviewStatics(ptr: Pointer?): WithDefault =
        ISpatialGraphInteropPreviewStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialGraphInteropPreviewStatics {
      val address = segment.toRawLongValue()
      return makeISpatialGraphInteropPreviewStatics(Pointer(address))
    }

    public override fun toNative(obj: ISpatialGraphInteropPreviewStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__572364807_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialGraphInteropPreviewStatics):
        Array<ISpatialGraphInteropPreviewStatics?> = (elements as
        Array<ISpatialGraphInteropPreviewStatics?>).castToImpl<ISpatialGraphInteropPreviewStatics,ISpatialGraphInteropPreviewStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialGraphInteropPreviewStatics?> =
        arrayOfNulls<ISpatialGraphInteropPreviewStatics_Impl>(size) as
        Array<ISpatialGraphInteropPreviewStatics?>
  }
}
