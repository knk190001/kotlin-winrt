package Windows.ApplicationModel.Holographic

import Windows.Foundation.Numerics.Quaternion
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

@ABIMarker(IHolographicKeyboard.ABI::class)
@Signature("{07dd0893-aa21-5e6f-a91b-11b2b3fd7be3}")
@Guid("07dd0893aa215e6fa91b11b2b3fd7be3")
@WinRTInterface("07dd0893aa215e6fa91b11b2b3fd7be3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicKeyboard.ByReference::class)
public interface IHolographicKeyboard : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetPlacementOverride(
    coordinateSystem: SpatialCoordinateSystem?,
    topCenterPosition: Vector3?,
    orientation: Quaternion?
  ): Unit

  @InterfaceMethod(1)
  public fun SetPlacementOverride(
    coordinateSystem: SpatialCoordinateSystem?,
    topCenterPosition: Vector3?,
    orientation: Quaternion?,
    maxSize: Vector2?
  ): Unit

  @InterfaceMethod(2)
  public fun ResetPlacementOverride(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicKeyboard> {
    public override fun getValue() = ABI.makeIHolographicKeyboard(pointer.getPointer(0))

    public fun setValue(value: IHolographicKeyboard_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicKeyboard {
    public val __138997840_Ptr: Pointer?

    public val _138997840_VtblPtr: Pointer?
      get() = __138997840_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetPlacementOverride(
      coordinateSystem: SpatialCoordinateSystem?,
      topCenterPosition: Vector3?,
      orientation: Quaternion?
    ): Unit {
      val fnPtr = _138997840_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__138997840_Ptr, marshalToNative(coordinateSystem),
          marshalToNative(topCenterPosition), marshalToNative(orientation),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun SetPlacementOverride(
      coordinateSystem: SpatialCoordinateSystem?,
      topCenterPosition: Vector3?,
      orientation: Quaternion?,
      maxSize: Vector2?
    ): Unit {
      val fnPtr = _138997840_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__138997840_Ptr, marshalToNative(coordinateSystem),
          marshalToNative(topCenterPosition), marshalToNative(orientation),
          marshalToNative(maxSize),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun ResetPlacementOverride(): Unit {
      val fnPtr = _138997840_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__138997840_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHolographicKeyboard_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __138997840_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicKeyboard, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("07dd0893aa215e6fa91b11b2b3fd7be3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicKeyboard(ptr: Pointer?): WithDefault = IHolographicKeyboard_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicKeyboard {
      val address = segment.toRawLongValue()
      return makeIHolographicKeyboard(Pointer(address))
    }

    public override fun toNative(obj: IHolographicKeyboard): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__138997840_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicKeyboard): Array<IHolographicKeyboard?> =
        (elements as
        Array<IHolographicKeyboard?>).castToImpl<IHolographicKeyboard,IHolographicKeyboard_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicKeyboard?> =
        arrayOfNulls<IHolographicKeyboard_Impl>(size) as Array<IHolographicKeyboard?>
  }
}
