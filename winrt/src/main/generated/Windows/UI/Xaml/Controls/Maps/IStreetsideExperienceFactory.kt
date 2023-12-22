package Windows.UI.Xaml.Controls.Maps

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStreetsideExperienceFactory.ABI::class)
@Signature("{7a5bcf3c-649e-4342-9995-68a6cf5961a7}")
@Guid("7a5bcf3c649e4342999568a6cf5961a7")
@WinRTInterface("7a5bcf3c649e4342999568a6cf5961a7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStreetsideExperienceFactory.ByReference::class)
public interface IStreetsideExperienceFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithPanorama(panorama: StreetsidePanorama?): StreetsideExperience?

  @InterfaceMethod(1)
  public fun CreateInstanceWithPanoramaHeadingPitchAndFieldOfView(
    panorama: StreetsidePanorama?,
    headingInDegrees: Double,
    pitchInDegrees: Double,
    fieldOfViewInDegrees: Double
  ): StreetsideExperience?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStreetsideExperienceFactory> {
    public override fun getValue() = ABI.makeIStreetsideExperienceFactory(pointer.getPointer(0))

    public fun setValue(value: IStreetsideExperienceFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStreetsideExperienceFactory {
    public val __1527154581_Ptr: Pointer?

    public val _1527154581_VtblPtr: Pointer?
      get() = __1527154581_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithPanorama(panorama: StreetsidePanorama?):
        StreetsideExperience? {
      val fnPtr = _1527154581_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StreetsideExperience>()
      val hr = fn.invokeHR(arrayOf(__1527154581_Ptr, marshalToNative(panorama), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StreetsideExperience>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateInstanceWithPanoramaHeadingPitchAndFieldOfView(
      panorama: StreetsidePanorama?,
      headingInDegrees: Double,
      pitchInDegrees: Double,
      fieldOfViewInDegrees: Double
    ): StreetsideExperience? {
      val fnPtr = _1527154581_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StreetsideExperience>()
      val hr = fn.invokeHR(arrayOf(__1527154581_Ptr, marshalToNative(panorama), headingInDegrees,
          pitchInDegrees, fieldOfViewInDegrees, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StreetsideExperience>(result.getValue())
      return resultValue
    }
  }

  public class IStreetsideExperienceFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1527154581_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStreetsideExperienceFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7a5bcf3c649e4342999568a6cf5961a7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStreetsideExperienceFactory(ptr: Pointer?): WithDefault =
        IStreetsideExperienceFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStreetsideExperienceFactory {
      val address = segment.toRawLongValue()
      return makeIStreetsideExperienceFactory(Pointer(address))
    }

    public override fun toNative(obj: IStreetsideExperienceFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1527154581_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStreetsideExperienceFactory):
        Array<IStreetsideExperienceFactory?> = (elements as
        Array<IStreetsideExperienceFactory?>).castToImpl<IStreetsideExperienceFactory,IStreetsideExperienceFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStreetsideExperienceFactory?> =
        arrayOfNulls<IStreetsideExperienceFactory_Impl>(size) as
        Array<IStreetsideExperienceFactory?>
  }
}
