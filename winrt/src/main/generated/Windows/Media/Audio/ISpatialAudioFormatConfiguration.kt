package Windows.Media.Audio

import Windows.Foundation.IAsyncAction
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpatialAudioFormatConfiguration.ABI::class)
@Signature("{32df09a8-50f0-5395-9923-7d44ca71ed6d}")
@Guid("32df09a850f0539599237d44ca71ed6d")
@WinRTInterface("32df09a850f0539599237d44ca71ed6d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialAudioFormatConfiguration.ByReference::class)
public interface ISpatialAudioFormatConfiguration : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ReportLicenseChangedAsync(subtype: String?): IAsyncAction?

  @InterfaceMethod(1)
  public fun ReportConfigurationChangedAsync(subtype: String?): IAsyncAction?

  @InterfaceMethod(2)
  public fun get_MixedRealityExclusiveModePolicy(): MixedRealitySpatialAudioFormatPolicy?

  @InterfaceMethod(3)
  public fun put_MixedRealityExclusiveModePolicy(value: MixedRealitySpatialAudioFormatPolicy?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialAudioFormatConfiguration> {
    public override fun getValue() = ABI.makeISpatialAudioFormatConfiguration(pointer.getPointer(0))

    public fun setValue(value: ISpatialAudioFormatConfiguration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialAudioFormatConfiguration {
    public val __1573363749_Ptr: Pointer?

    public val _1573363749_VtblPtr: Pointer?
      get() = __1573363749_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReportLicenseChangedAsync(subtype: String?): IAsyncAction? {
      val fnPtr = _1573363749_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1573363749_Ptr, marshalToNative(subtype), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ReportConfigurationChangedAsync(subtype: String?): IAsyncAction? {
      val fnPtr = _1573363749_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1573363749_Ptr, marshalToNative(subtype), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MixedRealityExclusiveModePolicy():
        MixedRealitySpatialAudioFormatPolicy? {
      val fnPtr = _1573363749_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MixedRealitySpatialAudioFormatPolicy>()
      val hr = fn.invokeHR(arrayOf(__1573363749_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MixedRealitySpatialAudioFormatPolicy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override
        fun put_MixedRealityExclusiveModePolicy(value: MixedRealitySpatialAudioFormatPolicy?):
        Unit {
      val fnPtr = _1573363749_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1573363749_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISpatialAudioFormatConfiguration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1573363749_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialAudioFormatConfiguration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("32df09a850f0539599237d44ca71ed6d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialAudioFormatConfiguration(ptr: Pointer?): WithDefault =
        ISpatialAudioFormatConfiguration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialAudioFormatConfiguration {
      val address = segment.toRawLongValue()
      return makeISpatialAudioFormatConfiguration(Pointer(address))
    }

    public override fun toNative(obj: ISpatialAudioFormatConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1573363749_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialAudioFormatConfiguration):
        Array<ISpatialAudioFormatConfiguration?> = (elements as
        Array<ISpatialAudioFormatConfiguration?>).castToImpl<ISpatialAudioFormatConfiguration,ISpatialAudioFormatConfiguration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialAudioFormatConfiguration?> =
        arrayOfNulls<ISpatialAudioFormatConfiguration_Impl>(size) as
        Array<ISpatialAudioFormatConfiguration?>
  }
}
