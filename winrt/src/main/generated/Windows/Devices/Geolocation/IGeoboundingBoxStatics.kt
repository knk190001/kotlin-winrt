package Windows.Devices.Geolocation

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(IGeoboundingBoxStatics.ABI::class)
@Signature("{67b80708-e61a-4cd0-841b-93233792b5ca}")
@Guid("67b80708e61a4cd0841b93233792b5ca")
@WinRTInterface("67b80708e61a4cd0841b93233792b5ca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeoboundingBoxStatics.ByReference::class)
public interface IGeoboundingBoxStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryCompute(positions: IIterable<BasicGeoposition?>?): GeoboundingBox?

  @InterfaceMethod(1)
  public fun TryCompute(positions: IIterable<BasicGeoposition?>?,
      altitudeRefSystem: AltitudeReferenceSystem?): GeoboundingBox?

  @InterfaceMethod(2)
  public fun TryCompute(
    positions: IIterable<BasicGeoposition?>?,
    altitudeRefSystem: AltitudeReferenceSystem?,
    spatialReferenceId: WinDef.UINT
  ): GeoboundingBox?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeoboundingBoxStatics> {
    public override fun getValue() = ABI.makeIGeoboundingBoxStatics(pointer.getPointer(0))

    public fun setValue(value: IGeoboundingBoxStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeoboundingBoxStatics {
    public val __659190992_Ptr: Pointer?

    public val _659190992_VtblPtr: Pointer?
      get() = __659190992_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryCompute(positions: IIterable<BasicGeoposition?>?): GeoboundingBox? {
      val fnPtr = _659190992_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GeoboundingBox>()
      val hr = fn.invokeHR(arrayOf(__659190992_Ptr, marshalToNative(positions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GeoboundingBox>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryCompute(positions: IIterable<BasicGeoposition?>?,
        altitudeRefSystem: AltitudeReferenceSystem?): GeoboundingBox? {
      val fnPtr = _659190992_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GeoboundingBox>()
      val hr = fn.invokeHR(arrayOf(__659190992_Ptr, marshalToNative(positions),
          marshalToNative(altitudeRefSystem), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GeoboundingBox>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun TryCompute(
      positions: IIterable<BasicGeoposition?>?,
      altitudeRefSystem: AltitudeReferenceSystem?,
      spatialReferenceId: WinDef.UINT
    ): GeoboundingBox? {
      val fnPtr = _659190992_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GeoboundingBox>()
      val hr = fn.invokeHR(arrayOf(__659190992_Ptr, marshalToNative(positions),
          marshalToNative(altitudeRefSystem), spatialReferenceId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GeoboundingBox>(result.getValue())
      return resultValue
    }
  }

  public class IGeoboundingBoxStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __659190992_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeoboundingBoxStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("67b80708e61a4cd0841b93233792b5ca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeoboundingBoxStatics(ptr: Pointer?): WithDefault =
        IGeoboundingBoxStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeoboundingBoxStatics {
      val address = segment.toRawLongValue()
      return makeIGeoboundingBoxStatics(Pointer(address))
    }

    public override fun toNative(obj: IGeoboundingBoxStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__659190992_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeoboundingBoxStatics): Array<IGeoboundingBoxStatics?> =
        (elements as
        Array<IGeoboundingBoxStatics?>).castToImpl<IGeoboundingBoxStatics,IGeoboundingBoxStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeoboundingBoxStatics?> =
        arrayOfNulls<IGeoboundingBoxStatics_Impl>(size) as Array<IGeoboundingBoxStatics?>
  }
}
