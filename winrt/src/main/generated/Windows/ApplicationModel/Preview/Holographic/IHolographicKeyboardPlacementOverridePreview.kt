package Windows.ApplicationModel.Preview.Holographic

import Windows.Foundation.Numerics.Vector2
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

@ABIMarker(IHolographicKeyboardPlacementOverridePreview.ABI::class)
@Signature("{c8a8ce3a-dfde-5a14-8d5f-182c526dd9c4}")
@Guid("c8a8ce3adfde5a148d5f182c526dd9c4")
@WinRTInterface("c8a8ce3adfde5a148d5f182c526dd9c4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicKeyboardPlacementOverridePreview.ByReference::class)
public interface IHolographicKeyboardPlacementOverridePreview : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetPlacementOverride(
    coordinateSystem: SpatialCoordinateSystem?,
    topCenterPosition: Vector3?,
    normal: Vector3?
  ): Unit

  @InterfaceMethod(1)
  public fun SetPlacementOverride(
    coordinateSystem: SpatialCoordinateSystem?,
    topCenterPosition: Vector3?,
    normal: Vector3?,
    maxSize: Vector2?
  ): Unit

  @InterfaceMethod(2)
  public fun ResetPlacementOverride(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicKeyboardPlacementOverridePreview> {
    public override fun getValue() =
        ABI.makeIHolographicKeyboardPlacementOverridePreview(pointer.getPointer(0))

    public fun setValue(value: IHolographicKeyboardPlacementOverridePreview_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicKeyboardPlacementOverridePreview {
    public val __622564929_Ptr: Pointer?

    public val _622564929_VtblPtr: Pointer?
      get() = __622564929_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetPlacementOverride(
      coordinateSystem: SpatialCoordinateSystem?,
      topCenterPosition: Vector3?,
      normal: Vector3?
    ): Unit {
      val fnPtr = _622564929_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__622564929_Ptr, marshalToNative(coordinateSystem),
          marshalToNative(topCenterPosition), marshalToNative(normal),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun SetPlacementOverride(
      coordinateSystem: SpatialCoordinateSystem?,
      topCenterPosition: Vector3?,
      normal: Vector3?,
      maxSize: Vector2?
    ): Unit {
      val fnPtr = _622564929_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__622564929_Ptr, marshalToNative(coordinateSystem),
          marshalToNative(topCenterPosition), marshalToNative(normal), marshalToNative(maxSize),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun ResetPlacementOverride(): Unit {
      val fnPtr = _622564929_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__622564929_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHolographicKeyboardPlacementOverridePreview_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __622564929_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicKeyboardPlacementOverridePreview, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c8a8ce3adfde5a148d5f182c526dd9c4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicKeyboardPlacementOverridePreview(ptr: Pointer?): WithDefault =
        IHolographicKeyboardPlacementOverridePreview_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IHolographicKeyboardPlacementOverridePreview {
      val address = segment.toRawLongValue()
      return makeIHolographicKeyboardPlacementOverridePreview(Pointer(address))
    }

    public override fun toNative(obj: IHolographicKeyboardPlacementOverridePreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__622564929_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicKeyboardPlacementOverridePreview):
        Array<IHolographicKeyboardPlacementOverridePreview?> = (elements as
        Array<IHolographicKeyboardPlacementOverridePreview?>).castToImpl<IHolographicKeyboardPlacementOverridePreview,IHolographicKeyboardPlacementOverridePreview_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicKeyboardPlacementOverridePreview?> =
        arrayOfNulls<IHolographicKeyboardPlacementOverridePreview_Impl>(size) as
        Array<IHolographicKeyboardPlacementOverridePreview?>
  }
}
