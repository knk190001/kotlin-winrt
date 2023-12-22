package Windows.Devices.PointOfService

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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMagneticStripeReaderCapabilities.ABI::class)
@Signature("{7128809c-c440-44a2-a467-469175d02896}")
@Guid("7128809cc44044a2a467469175d02896")
@WinRTInterface("7128809cc44044a2a467469175d02896")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMagneticStripeReaderCapabilities.ByReference::class)
public interface IMagneticStripeReaderCapabilities : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CardAuthentication(): String?

  @InterfaceMethod(1)
  public fun get_SupportedEncryptionAlgorithms(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_AuthenticationLevel(): MagneticStripeReaderAuthenticationLevel?

  @InterfaceMethod(3)
  public fun get_IsIsoSupported(): Boolean

  @InterfaceMethod(4)
  public fun get_IsJisOneSupported(): Boolean

  @InterfaceMethod(5)
  public fun get_IsJisTwoSupported(): Boolean

  @InterfaceMethod(6)
  public fun get_PowerReportingType(): UnifiedPosPowerReportingType?

  @InterfaceMethod(7)
  public fun get_IsStatisticsReportingSupported(): Boolean

  @InterfaceMethod(8)
  public fun get_IsStatisticsUpdatingSupported(): Boolean

  @InterfaceMethod(9)
  public fun get_IsTrackDataMaskingSupported(): Boolean

  @InterfaceMethod(10)
  public fun get_IsTransmitSentinelsSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMagneticStripeReaderCapabilities> {
    public override fun getValue() =
        ABI.makeIMagneticStripeReaderCapabilities(pointer.getPointer(0))

    public fun setValue(value: IMagneticStripeReaderCapabilities_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMagneticStripeReaderCapabilities {
    public val __1567099767_Ptr: Pointer?

    public val _1567099767_VtblPtr: Pointer?
      get() = __1567099767_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CardAuthentication(): String? {
      val fnPtr = _1567099767_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1567099767_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SupportedEncryptionAlgorithms(): WinDef.UINT {
      val fnPtr = _1567099767_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1567099767_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_AuthenticationLevel(): MagneticStripeReaderAuthenticationLevel? {
      val fnPtr = _1567099767_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MagneticStripeReaderAuthenticationLevel>()
      val hr = fn.invokeHR(arrayOf(__1567099767_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<MagneticStripeReaderAuthenticationLevel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_IsIsoSupported(): Boolean {
      val fnPtr = _1567099767_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1567099767_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_IsJisOneSupported(): Boolean {
      val fnPtr = _1567099767_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1567099767_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_IsJisTwoSupported(): Boolean {
      val fnPtr = _1567099767_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1567099767_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_PowerReportingType(): UnifiedPosPowerReportingType? {
      val fnPtr = _1567099767_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UnifiedPosPowerReportingType>()
      val hr = fn.invokeHR(arrayOf(__1567099767_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UnifiedPosPowerReportingType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_IsStatisticsReportingSupported(): Boolean {
      val fnPtr = _1567099767_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1567099767_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_IsStatisticsUpdatingSupported(): Boolean {
      val fnPtr = _1567099767_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1567099767_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_IsTrackDataMaskingSupported(): Boolean {
      val fnPtr = _1567099767_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1567099767_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun get_IsTransmitSentinelsSupported(): Boolean {
      val fnPtr = _1567099767_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1567099767_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IMagneticStripeReaderCapabilities_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1567099767_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMagneticStripeReaderCapabilities, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7128809cc44044a2a467469175d02896")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMagneticStripeReaderCapabilities(ptr: Pointer?): WithDefault =
        IMagneticStripeReaderCapabilities_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMagneticStripeReaderCapabilities {
      val address = segment.toRawLongValue()
      return makeIMagneticStripeReaderCapabilities(Pointer(address))
    }

    public override fun toNative(obj: IMagneticStripeReaderCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1567099767_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMagneticStripeReaderCapabilities):
        Array<IMagneticStripeReaderCapabilities?> = (elements as
        Array<IMagneticStripeReaderCapabilities?>).castToImpl<IMagneticStripeReaderCapabilities,IMagneticStripeReaderCapabilities_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMagneticStripeReaderCapabilities?> =
        arrayOfNulls<IMagneticStripeReaderCapabilities_Impl>(size) as
        Array<IMagneticStripeReaderCapabilities?>
  }
}
