package Windows.Media.Devices.Core

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFrameControlCapabilities.ABI::class)
@Signature("{a8ffae60-4e9e-4377-a789-e24c4ae7e544}")
@Guid("a8ffae604e9e4377a789e24c4ae7e544")
@WinRTInterface("a8ffae604e9e4377a789e24c4ae7e544")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameControlCapabilities.ByReference::class)
public interface IFrameControlCapabilities : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Exposure(): FrameExposureCapabilities?

  @InterfaceMethod(1)
  public fun get_ExposureCompensation(): FrameExposureCompensationCapabilities?

  @InterfaceMethod(2)
  public fun get_IsoSpeed(): FrameIsoSpeedCapabilities?

  @InterfaceMethod(3)
  public fun get_Focus(): FrameFocusCapabilities?

  @InterfaceMethod(4)
  public fun get_PhotoConfirmationSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameControlCapabilities> {
    public override fun getValue() = ABI.makeIFrameControlCapabilities(pointer.getPointer(0))

    public fun setValue(value: IFrameControlCapabilities_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameControlCapabilities {
    public val __938096022_Ptr: Pointer?

    public val _938096022_VtblPtr: Pointer?
      get() = __938096022_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Exposure(): FrameExposureCapabilities? {
      val fnPtr = _938096022_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FrameExposureCapabilities>()
      val hr = fn.invokeHR(arrayOf(__938096022_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FrameExposureCapabilities>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExposureCompensation(): FrameExposureCompensationCapabilities? {
      val fnPtr = _938096022_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FrameExposureCompensationCapabilities>()
      val hr = fn.invokeHR(arrayOf(__938096022_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FrameExposureCompensationCapabilities>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsoSpeed(): FrameIsoSpeedCapabilities? {
      val fnPtr = _938096022_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FrameIsoSpeedCapabilities>()
      val hr = fn.invokeHR(arrayOf(__938096022_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FrameIsoSpeedCapabilities>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Focus(): FrameFocusCapabilities? {
      val fnPtr = _938096022_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FrameFocusCapabilities>()
      val hr = fn.invokeHR(arrayOf(__938096022_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FrameFocusCapabilities>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_PhotoConfirmationSupported(): Boolean {
      val fnPtr = _938096022_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__938096022_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IFrameControlCapabilities_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __938096022_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameControlCapabilities, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a8ffae604e9e4377a789e24c4ae7e544")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameControlCapabilities(ptr: Pointer?): WithDefault =
        IFrameControlCapabilities_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameControlCapabilities {
      val address = segment.toRawLongValue()
      return makeIFrameControlCapabilities(Pointer(address))
    }

    public override fun toNative(obj: IFrameControlCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__938096022_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameControlCapabilities):
        Array<IFrameControlCapabilities?> = (elements as
        Array<IFrameControlCapabilities?>).castToImpl<IFrameControlCapabilities,IFrameControlCapabilities_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameControlCapabilities?> =
        arrayOfNulls<IFrameControlCapabilities_Impl>(size) as Array<IFrameControlCapabilities?>
  }
}
