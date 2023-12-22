package Windows.Devices.Perception

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

@ABIMarker(IKnownPerceptionInfraredFrameSourcePropertiesStatics.ABI::class)
@Signature("{5df1cca2-01f8-4a87-b859-d5e5b7e1de49}")
@Guid("5df1cca201f84a87b859d5e5b7e1de49")
@WinRTInterface("5df1cca201f84a87b859d5e5b7e1de49")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKnownPerceptionInfraredFrameSourcePropertiesStatics.ByReference::class)
public interface IKnownPerceptionInfraredFrameSourcePropertiesStatics : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Exposure(): String?

  @InterfaceMethod(1)
  public fun get_AutoExposureEnabled(): String?

  @InterfaceMethod(2)
  public fun get_ExposureCompensation(): String?

  @InterfaceMethod(3)
  public fun get_ActiveIlluminationEnabled(): String?

  @InterfaceMethod(4)
  public fun get_AmbientSubtractionEnabled(): String?

  @InterfaceMethod(5)
  public fun get_StructureLightPatternEnabled(): String?

  @InterfaceMethod(6)
  public fun get_InterleavedIlluminationEnabled(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKnownPerceptionInfraredFrameSourcePropertiesStatics> {
    public override fun getValue() =
        ABI.makeIKnownPerceptionInfraredFrameSourcePropertiesStatics(pointer.getPointer(0))

    public fun setValue(value: IKnownPerceptionInfraredFrameSourcePropertiesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKnownPerceptionInfraredFrameSourcePropertiesStatics {
    public val __1581539403_Ptr: Pointer?

    public val _1581539403_VtblPtr: Pointer?
      get() = __1581539403_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Exposure(): String? {
      val fnPtr = _1581539403_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1581539403_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AutoExposureEnabled(): String? {
      val fnPtr = _1581539403_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1581539403_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ExposureCompensation(): String? {
      val fnPtr = _1581539403_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1581539403_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ActiveIlluminationEnabled(): String? {
      val fnPtr = _1581539403_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1581539403_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_AmbientSubtractionEnabled(): String? {
      val fnPtr = _1581539403_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1581539403_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_StructureLightPatternEnabled(): String? {
      val fnPtr = _1581539403_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1581539403_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_InterleavedIlluminationEnabled(): String? {
      val fnPtr = _1581539403_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1581539403_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IKnownPerceptionInfraredFrameSourcePropertiesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1581539403_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKnownPerceptionInfraredFrameSourcePropertiesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5df1cca201f84a87b859d5e5b7e1de49")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKnownPerceptionInfraredFrameSourcePropertiesStatics(ptr: Pointer?): WithDefault
        = IKnownPerceptionInfraredFrameSourcePropertiesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IKnownPerceptionInfraredFrameSourcePropertiesStatics {
      val address = segment.toRawLongValue()
      return makeIKnownPerceptionInfraredFrameSourcePropertiesStatics(Pointer(address))
    }

    public override fun toNative(obj: IKnownPerceptionInfraredFrameSourcePropertiesStatics):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1581539403_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKnownPerceptionInfraredFrameSourcePropertiesStatics):
        Array<IKnownPerceptionInfraredFrameSourcePropertiesStatics?> = (elements as
        Array<IKnownPerceptionInfraredFrameSourcePropertiesStatics?>).castToImpl<IKnownPerceptionInfraredFrameSourcePropertiesStatics,IKnownPerceptionInfraredFrameSourcePropertiesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IKnownPerceptionInfraredFrameSourcePropertiesStatics?> =
        arrayOfNulls<IKnownPerceptionInfraredFrameSourcePropertiesStatics_Impl>(size) as
        Array<IKnownPerceptionInfraredFrameSourcePropertiesStatics?>
  }
}
