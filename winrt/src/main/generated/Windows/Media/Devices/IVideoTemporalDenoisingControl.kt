package Windows.Media.Devices

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IVideoTemporalDenoisingControl.ABI::class)
@Signature("{7ab34735-3e2a-4a32-baff-4358c4fbdd57}")
@Guid("7ab347353e2a4a32baff4358c4fbdd57")
@WinRTInterface("7ab347353e2a4a32baff4358c4fbdd57")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVideoTemporalDenoisingControl.ByReference::class)
public interface IVideoTemporalDenoisingControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Supported(): Boolean

  @InterfaceMethod(1)
  public fun get_SupportedModes(): IVectorView<VideoTemporalDenoisingMode?>?

  @InterfaceMethod(2)
  public fun get_Mode(): VideoTemporalDenoisingMode?

  @InterfaceMethod(3)
  public fun put_Mode(value: VideoTemporalDenoisingMode?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVideoTemporalDenoisingControl> {
    public override fun getValue() = ABI.makeIVideoTemporalDenoisingControl(pointer.getPointer(0))

    public fun setValue(value: IVideoTemporalDenoisingControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVideoTemporalDenoisingControl {
    public val __1588804643_Ptr: Pointer?

    public val _1588804643_VtblPtr: Pointer?
      get() = __1588804643_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Supported(): Boolean {
      val fnPtr = _1588804643_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1588804643_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_SupportedModes(): IVectorView<VideoTemporalDenoisingMode?>? {
      val fnPtr = _1588804643_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<VideoTemporalDenoisingMode?>>()
      val hr = fn.invokeHR(arrayOf(__1588804643_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<VideoTemporalDenoisingMode?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Mode(): VideoTemporalDenoisingMode? {
      val fnPtr = _1588804643_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoTemporalDenoisingMode>()
      val hr = fn.invokeHR(arrayOf(__1588804643_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoTemporalDenoisingMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Mode(value: VideoTemporalDenoisingMode?): Unit {
      val fnPtr = _1588804643_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1588804643_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVideoTemporalDenoisingControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1588804643_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVideoTemporalDenoisingControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7ab347353e2a4a32baff4358c4fbdd57")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVideoTemporalDenoisingControl(ptr: Pointer?): WithDefault =
        IVideoTemporalDenoisingControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVideoTemporalDenoisingControl {
      val address = segment.toRawLongValue()
      return makeIVideoTemporalDenoisingControl(Pointer(address))
    }

    public override fun toNative(obj: IVideoTemporalDenoisingControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1588804643_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVideoTemporalDenoisingControl):
        Array<IVideoTemporalDenoisingControl?> = (elements as
        Array<IVideoTemporalDenoisingControl?>).castToImpl<IVideoTemporalDenoisingControl,IVideoTemporalDenoisingControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVideoTemporalDenoisingControl?> =
        arrayOfNulls<IVideoTemporalDenoisingControl_Impl>(size) as
        Array<IVideoTemporalDenoisingControl?>
  }
}
