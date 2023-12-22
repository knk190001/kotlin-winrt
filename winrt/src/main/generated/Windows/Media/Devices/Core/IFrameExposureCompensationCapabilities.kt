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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFrameExposureCompensationCapabilities.ABI::class)
@Signature("{b988a823-8065-41ee-b04f-722265954500}")
@Guid("b988a823806541eeb04f722265954500")
@WinRTInterface("b988a823806541eeb04f722265954500")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameExposureCompensationCapabilities.ByReference::class)
public interface IFrameExposureCompensationCapabilities : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Supported(): Boolean

  @InterfaceMethod(1)
  public fun get_Min(): Float

  @InterfaceMethod(2)
  public fun get_Max(): Float

  @InterfaceMethod(3)
  public fun get_Step(): Float

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameExposureCompensationCapabilities> {
    public override fun getValue() =
        ABI.makeIFrameExposureCompensationCapabilities(pointer.getPointer(0))

    public fun setValue(value: IFrameExposureCompensationCapabilities_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameExposureCompensationCapabilities {
    public val __1017525760_Ptr: Pointer?

    public val _1017525760_VtblPtr: Pointer?
      get() = __1017525760_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Supported(): Boolean {
      val fnPtr = _1017525760_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1017525760_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Min(): Float {
      val fnPtr = _1017525760_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1017525760_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Max(): Float {
      val fnPtr = _1017525760_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1017525760_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Step(): Float {
      val fnPtr = _1017525760_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1017525760_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }
  }

  public class IFrameExposureCompensationCapabilities_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1017525760_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameExposureCompensationCapabilities, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b988a823806541eeb04f722265954500")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameExposureCompensationCapabilities(ptr: Pointer?): WithDefault =
        IFrameExposureCompensationCapabilities_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameExposureCompensationCapabilities {
      val address = segment.toRawLongValue()
      return makeIFrameExposureCompensationCapabilities(Pointer(address))
    }

    public override fun toNative(obj: IFrameExposureCompensationCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1017525760_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameExposureCompensationCapabilities):
        Array<IFrameExposureCompensationCapabilities?> = (elements as
        Array<IFrameExposureCompensationCapabilities?>).castToImpl<IFrameExposureCompensationCapabilities,IFrameExposureCompensationCapabilities_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameExposureCompensationCapabilities?> =
        arrayOfNulls<IFrameExposureCompensationCapabilities_Impl>(size) as
        Array<IFrameExposureCompensationCapabilities?>
  }
}
