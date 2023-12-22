package Windows.Media.Core

import Windows.Foundation.Collections.IVectorView
import Windows.Media.Devices.Core.FrameController
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

@ABIMarker(IHighDynamicRangeOutput.ABI::class)
@Signature("{0f57806b-253b-4119-bb40-3a90e51384f7}")
@Guid("0f57806b253b4119bb403a90e51384f7")
@WinRTInterface("0f57806b253b4119bb403a90e51384f7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHighDynamicRangeOutput.ByReference::class)
public interface IHighDynamicRangeOutput : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Certainty(): Double

  @InterfaceMethod(1)
  public fun get_FrameControllers(): IVectorView<FrameController?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHighDynamicRangeOutput> {
    public override fun getValue() = ABI.makeIHighDynamicRangeOutput(pointer.getPointer(0))

    public fun setValue(value: IHighDynamicRangeOutput_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHighDynamicRangeOutput {
    public val __279160118_Ptr: Pointer?

    public val _279160118_VtblPtr: Pointer?
      get() = __279160118_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Certainty(): Double {
      val fnPtr = _279160118_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__279160118_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_FrameControllers(): IVectorView<FrameController?>? {
      val fnPtr = _279160118_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<FrameController?>>()
      val hr = fn.invokeHR(arrayOf(__279160118_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<FrameController?>>(result.getValue())
      return resultValue
    }
  }

  public class IHighDynamicRangeOutput_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __279160118_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHighDynamicRangeOutput, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0f57806b253b4119bb403a90e51384f7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHighDynamicRangeOutput(ptr: Pointer?): WithDefault =
        IHighDynamicRangeOutput_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHighDynamicRangeOutput {
      val address = segment.toRawLongValue()
      return makeIHighDynamicRangeOutput(Pointer(address))
    }

    public override fun toNative(obj: IHighDynamicRangeOutput): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__279160118_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHighDynamicRangeOutput): Array<IHighDynamicRangeOutput?>
        = (elements as
        Array<IHighDynamicRangeOutput?>).castToImpl<IHighDynamicRangeOutput,IHighDynamicRangeOutput_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHighDynamicRangeOutput?> =
        arrayOfNulls<IHighDynamicRangeOutput_Impl>(size) as Array<IHighDynamicRangeOutput?>
  }
}
