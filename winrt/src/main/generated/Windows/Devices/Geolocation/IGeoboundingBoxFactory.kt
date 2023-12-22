package Windows.Devices.Geolocation

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IGeoboundingBoxFactory.ABI::class)
@Signature("{4dfba589-0411-4abc-b3b5-5bbccb57d98c}")
@Guid("4dfba58904114abcb3b55bbccb57d98c")
@WinRTInterface("4dfba58904114abcb3b55bbccb57d98c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeoboundingBoxFactory.ByReference::class)
public interface IGeoboundingBoxFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(northwestCorner: BasicGeoposition?, southeastCorner: BasicGeoposition?):
      GeoboundingBox?

  @InterfaceMethod(1)
  public fun CreateWithAltitudeReference(
    northwestCorner: BasicGeoposition?,
    southeastCorner: BasicGeoposition?,
    altitudeReferenceSystem: AltitudeReferenceSystem?
  ): GeoboundingBox?

  @InterfaceMethod(2)
  public fun CreateWithAltitudeReferenceAndSpatialReference(
    northwestCorner: BasicGeoposition?,
    southeastCorner: BasicGeoposition?,
    altitudeReferenceSystem: AltitudeReferenceSystem?,
    spatialReferenceId: WinDef.UINT
  ): GeoboundingBox?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeoboundingBoxFactory> {
    public override fun getValue() = ABI.makeIGeoboundingBoxFactory(pointer.getPointer(0))

    public fun setValue(value: IGeoboundingBoxFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeoboundingBoxFactory {
    public val __146062453_Ptr: Pointer?

    public val _146062453_VtblPtr: Pointer?
      get() = __146062453_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(northwestCorner: BasicGeoposition?,
        southeastCorner: BasicGeoposition?): GeoboundingBox? {
      val fnPtr = _146062453_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GeoboundingBox>()
      val hr = fn.invokeHR(arrayOf(__146062453_Ptr, marshalToNative(northwestCorner),
          marshalToNative(southeastCorner), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GeoboundingBox>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithAltitudeReference(
      northwestCorner: BasicGeoposition?,
      southeastCorner: BasicGeoposition?,
      altitudeReferenceSystem: AltitudeReferenceSystem?
    ): GeoboundingBox? {
      val fnPtr = _146062453_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GeoboundingBox>()
      val hr = fn.invokeHR(arrayOf(__146062453_Ptr, marshalToNative(northwestCorner),
          marshalToNative(southeastCorner), marshalToNative(altitudeReferenceSystem), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GeoboundingBox>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateWithAltitudeReferenceAndSpatialReference(
      northwestCorner: BasicGeoposition?,
      southeastCorner: BasicGeoposition?,
      altitudeReferenceSystem: AltitudeReferenceSystem?,
      spatialReferenceId: WinDef.UINT
    ): GeoboundingBox? {
      val fnPtr = _146062453_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GeoboundingBox>()
      val hr = fn.invokeHR(arrayOf(__146062453_Ptr, marshalToNative(northwestCorner),
          marshalToNative(southeastCorner), marshalToNative(altitudeReferenceSystem),
          spatialReferenceId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GeoboundingBox>(result.getValue())
      return resultValue
    }
  }

  public class IGeoboundingBoxFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __146062453_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeoboundingBoxFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4dfba58904114abcb3b55bbccb57d98c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeoboundingBoxFactory(ptr: Pointer?): WithDefault =
        IGeoboundingBoxFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeoboundingBoxFactory {
      val address = segment.toRawLongValue()
      return makeIGeoboundingBoxFactory(Pointer(address))
    }

    public override fun toNative(obj: IGeoboundingBoxFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__146062453_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeoboundingBoxFactory): Array<IGeoboundingBoxFactory?> =
        (elements as
        Array<IGeoboundingBoxFactory?>).castToImpl<IGeoboundingBoxFactory,IGeoboundingBoxFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeoboundingBoxFactory?> =
        arrayOfNulls<IGeoboundingBoxFactory_Impl>(size) as Array<IGeoboundingBoxFactory?>
  }
}
