package Windows.Perception.Spatial

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

@ABIMarker(ISpatialBoundingVolumeStatics.ABI::class)
@Signature("{05889117-b3e1-36d8-b017-566181a5b196}")
@Guid("05889117b3e136d8b017566181a5b196")
@WinRTInterface("05889117b3e136d8b017566181a5b196")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialBoundingVolumeStatics.ByReference::class)
public interface ISpatialBoundingVolumeStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromBox(coordinateSystem: SpatialCoordinateSystem?, box: SpatialBoundingBox?):
      SpatialBoundingVolume?

  @InterfaceMethod(1)
  public fun FromOrientedBox(coordinateSystem: SpatialCoordinateSystem?,
      box: SpatialBoundingOrientedBox?): SpatialBoundingVolume?

  @InterfaceMethod(2)
  public fun FromSphere(coordinateSystem: SpatialCoordinateSystem?, sphere: SpatialBoundingSphere?):
      SpatialBoundingVolume?

  @InterfaceMethod(3)
  public fun FromFrustum(coordinateSystem: SpatialCoordinateSystem?,
      frustum: SpatialBoundingFrustum?): SpatialBoundingVolume?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialBoundingVolumeStatics> {
    public override fun getValue() = ABI.makeISpatialBoundingVolumeStatics(pointer.getPointer(0))

    public fun setValue(value: ISpatialBoundingVolumeStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialBoundingVolumeStatics {
    public val __1017822694_Ptr: Pointer?

    public val _1017822694_VtblPtr: Pointer?
      get() = __1017822694_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromBox(coordinateSystem: SpatialCoordinateSystem?,
        box: SpatialBoundingBox?): SpatialBoundingVolume? {
      val fnPtr = _1017822694_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialBoundingVolume>()
      val hr = fn.invokeHR(arrayOf(__1017822694_Ptr, marshalToNative(coordinateSystem),
          marshalToNative(box), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialBoundingVolume>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FromOrientedBox(coordinateSystem: SpatialCoordinateSystem?,
        box: SpatialBoundingOrientedBox?): SpatialBoundingVolume? {
      val fnPtr = _1017822694_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialBoundingVolume>()
      val hr = fn.invokeHR(arrayOf(__1017822694_Ptr, marshalToNative(coordinateSystem),
          marshalToNative(box), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialBoundingVolume>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FromSphere(coordinateSystem: SpatialCoordinateSystem?,
        sphere: SpatialBoundingSphere?): SpatialBoundingVolume? {
      val fnPtr = _1017822694_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialBoundingVolume>()
      val hr = fn.invokeHR(arrayOf(__1017822694_Ptr, marshalToNative(coordinateSystem),
          marshalToNative(sphere), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialBoundingVolume>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun FromFrustum(coordinateSystem: SpatialCoordinateSystem?,
        frustum: SpatialBoundingFrustum?): SpatialBoundingVolume? {
      val fnPtr = _1017822694_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialBoundingVolume>()
      val hr = fn.invokeHR(arrayOf(__1017822694_Ptr, marshalToNative(coordinateSystem),
          marshalToNative(frustum), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialBoundingVolume>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialBoundingVolumeStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1017822694_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialBoundingVolumeStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("05889117b3e136d8b017566181a5b196")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialBoundingVolumeStatics(ptr: Pointer?): WithDefault =
        ISpatialBoundingVolumeStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialBoundingVolumeStatics {
      val address = segment.toRawLongValue()
      return makeISpatialBoundingVolumeStatics(Pointer(address))
    }

    public override fun toNative(obj: ISpatialBoundingVolumeStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1017822694_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialBoundingVolumeStatics):
        Array<ISpatialBoundingVolumeStatics?> = (elements as
        Array<ISpatialBoundingVolumeStatics?>).castToImpl<ISpatialBoundingVolumeStatics,ISpatialBoundingVolumeStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialBoundingVolumeStatics?> =
        arrayOfNulls<ISpatialBoundingVolumeStatics_Impl>(size) as
        Array<ISpatialBoundingVolumeStatics?>
  }
}
