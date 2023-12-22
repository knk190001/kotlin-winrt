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

@ABIMarker(IKnownPerceptionVideoFrameSourcePropertiesStatics.ABI::class)
@Signature("{5df1cca2-01f8-4a87-b859-d5e5b7e1de48}")
@Guid("5df1cca201f84a87b859d5e5b7e1de48")
@WinRTInterface("5df1cca201f84a87b859d5e5b7e1de48")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKnownPerceptionVideoFrameSourcePropertiesStatics.ByReference::class)
public interface IKnownPerceptionVideoFrameSourcePropertiesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_VideoProfile(): String?

  @InterfaceMethod(1)
  public fun get_SupportedVideoProfiles(): String?

  @InterfaceMethod(2)
  public fun get_AvailableVideoProfiles(): String?

  @InterfaceMethod(3)
  public fun get_IsMirrored(): String?

  @InterfaceMethod(4)
  public fun get_CameraIntrinsics(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKnownPerceptionVideoFrameSourcePropertiesStatics> {
    public override fun getValue() =
        ABI.makeIKnownPerceptionVideoFrameSourcePropertiesStatics(pointer.getPointer(0))

    public fun setValue(value: IKnownPerceptionVideoFrameSourcePropertiesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKnownPerceptionVideoFrameSourcePropertiesStatics {
    public val __1333603141_Ptr: Pointer?

    public val _1333603141_VtblPtr: Pointer?
      get() = __1333603141_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_VideoProfile(): String? {
      val fnPtr = _1333603141_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1333603141_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SupportedVideoProfiles(): String? {
      val fnPtr = _1333603141_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1333603141_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_AvailableVideoProfiles(): String? {
      val fnPtr = _1333603141_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1333603141_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_IsMirrored(): String? {
      val fnPtr = _1333603141_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1333603141_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_CameraIntrinsics(): String? {
      val fnPtr = _1333603141_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1333603141_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IKnownPerceptionVideoFrameSourcePropertiesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1333603141_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKnownPerceptionVideoFrameSourcePropertiesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5df1cca201f84a87b859d5e5b7e1de48")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKnownPerceptionVideoFrameSourcePropertiesStatics(ptr: Pointer?): WithDefault =
        IKnownPerceptionVideoFrameSourcePropertiesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IKnownPerceptionVideoFrameSourcePropertiesStatics {
      val address = segment.toRawLongValue()
      return makeIKnownPerceptionVideoFrameSourcePropertiesStatics(Pointer(address))
    }

    public override fun toNative(obj: IKnownPerceptionVideoFrameSourcePropertiesStatics):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1333603141_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKnownPerceptionVideoFrameSourcePropertiesStatics):
        Array<IKnownPerceptionVideoFrameSourcePropertiesStatics?> = (elements as
        Array<IKnownPerceptionVideoFrameSourcePropertiesStatics?>).castToImpl<IKnownPerceptionVideoFrameSourcePropertiesStatics,IKnownPerceptionVideoFrameSourcePropertiesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IKnownPerceptionVideoFrameSourcePropertiesStatics?> =
        arrayOfNulls<IKnownPerceptionVideoFrameSourcePropertiesStatics_Impl>(size) as
        Array<IKnownPerceptionVideoFrameSourcePropertiesStatics?>
  }
}
