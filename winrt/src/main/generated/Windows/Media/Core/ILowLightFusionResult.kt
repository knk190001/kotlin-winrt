package Windows.Media.Core

import Windows.Graphics.Imaging.SoftwareBitmap
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILowLightFusionResult.ABI::class)
@Signature("{78edbe35-27a0-42e0-9cd3-738d2089de9c}")
@Guid("78edbe3527a042e09cd3738d2089de9c")
@WinRTInterface("78edbe3527a042e09cd3738d2089de9c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILowLightFusionResult.ByReference::class)
public interface ILowLightFusionResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Frame(): SoftwareBitmap?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILowLightFusionResult> {
    public override fun getValue() = ABI.makeILowLightFusionResult(pointer.getPointer(0))

    public fun setValue(value: ILowLightFusionResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILowLightFusionResult {
    public val __47943976_Ptr: Pointer?

    public val _47943976_VtblPtr: Pointer?
      get() = __47943976_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Frame(): SoftwareBitmap? {
      val fnPtr = _47943976_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SoftwareBitmap>()
      val hr = fn.invokeHR(arrayOf(__47943976_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SoftwareBitmap>(result.getValue())
      return resultValue
    }
  }

  public class ILowLightFusionResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __47943976_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILowLightFusionResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("78edbe3527a042e09cd3738d2089de9c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILowLightFusionResult(ptr: Pointer?): WithDefault =
        ILowLightFusionResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILowLightFusionResult {
      val address = segment.toRawLongValue()
      return makeILowLightFusionResult(Pointer(address))
    }

    public override fun toNative(obj: ILowLightFusionResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__47943976_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILowLightFusionResult): Array<ILowLightFusionResult?> =
        (elements as
        Array<ILowLightFusionResult?>).castToImpl<ILowLightFusionResult,ILowLightFusionResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILowLightFusionResult?> =
        arrayOfNulls<ILowLightFusionResult_Impl>(size) as Array<ILowLightFusionResult?>
  }
}
