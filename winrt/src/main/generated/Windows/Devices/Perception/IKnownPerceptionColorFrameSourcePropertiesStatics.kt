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

@ABIMarker(IKnownPerceptionColorFrameSourcePropertiesStatics.ABI::class)
@Signature("{5df1cca2-01f8-4a87-b859-d5e5b7e1de4b}")
@Guid("5df1cca201f84a87b859d5e5b7e1de4b")
@WinRTInterface("5df1cca201f84a87b859d5e5b7e1de4b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKnownPerceptionColorFrameSourcePropertiesStatics.ByReference::class)
public interface IKnownPerceptionColorFrameSourcePropertiesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Exposure(): String?

  @InterfaceMethod(1)
  public fun get_AutoExposureEnabled(): String?

  @InterfaceMethod(2)
  public fun get_ExposureCompensation(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKnownPerceptionColorFrameSourcePropertiesStatics> {
    public override fun getValue() =
        ABI.makeIKnownPerceptionColorFrameSourcePropertiesStatics(pointer.getPointer(0))

    public fun setValue(value: IKnownPerceptionColorFrameSourcePropertiesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKnownPerceptionColorFrameSourcePropertiesStatics {
    public val __1401969197_Ptr: Pointer?

    public val _1401969197_VtblPtr: Pointer?
      get() = __1401969197_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Exposure(): String? {
      val fnPtr = _1401969197_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1401969197_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AutoExposureEnabled(): String? {
      val fnPtr = _1401969197_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1401969197_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ExposureCompensation(): String? {
      val fnPtr = _1401969197_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1401969197_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IKnownPerceptionColorFrameSourcePropertiesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1401969197_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKnownPerceptionColorFrameSourcePropertiesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5df1cca201f84a87b859d5e5b7e1de4b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKnownPerceptionColorFrameSourcePropertiesStatics(ptr: Pointer?): WithDefault =
        IKnownPerceptionColorFrameSourcePropertiesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IKnownPerceptionColorFrameSourcePropertiesStatics {
      val address = segment.toRawLongValue()
      return makeIKnownPerceptionColorFrameSourcePropertiesStatics(Pointer(address))
    }

    public override fun toNative(obj: IKnownPerceptionColorFrameSourcePropertiesStatics):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1401969197_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKnownPerceptionColorFrameSourcePropertiesStatics):
        Array<IKnownPerceptionColorFrameSourcePropertiesStatics?> = (elements as
        Array<IKnownPerceptionColorFrameSourcePropertiesStatics?>).castToImpl<IKnownPerceptionColorFrameSourcePropertiesStatics,IKnownPerceptionColorFrameSourcePropertiesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IKnownPerceptionColorFrameSourcePropertiesStatics?> =
        arrayOfNulls<IKnownPerceptionColorFrameSourcePropertiesStatics_Impl>(size) as
        Array<IKnownPerceptionColorFrameSourcePropertiesStatics?>
  }
}
