package Windows.Devices.Perception

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IPerceptionFrameSourcePropertyChangeResult.ABI::class)
@Signature("{1e33390a-3c90-4d22-b898-f42bba6418ff}")
@Guid("1e33390a3c904d22b898f42bba6418ff")
@WinRTInterface("1e33390a3c904d22b898f42bba6418ff")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionFrameSourcePropertyChangeResult.ByReference::class)
public interface IPerceptionFrameSourcePropertyChangeResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): PerceptionFrameSourcePropertyChangeStatus?

  @InterfaceMethod(1)
  public fun get_NewValue(): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionFrameSourcePropertyChangeResult> {
    public override fun getValue() =
        ABI.makeIPerceptionFrameSourcePropertyChangeResult(pointer.getPointer(0))

    public fun setValue(value: IPerceptionFrameSourcePropertyChangeResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionFrameSourcePropertyChangeResult {
    public val __1766631805_Ptr: Pointer?

    public val _1766631805_VtblPtr: Pointer?
      get() = __1766631805_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): PerceptionFrameSourcePropertyChangeStatus? {
      val fnPtr = _1766631805_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionFrameSourcePropertyChangeStatus>()
      val hr = fn.invokeHR(arrayOf(__1766631805_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<PerceptionFrameSourcePropertyChangeStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NewValue(): IUnknown? {
      val fnPtr = _1766631805_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1766631805_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionFrameSourcePropertyChangeResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1766631805_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionFrameSourcePropertyChangeResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1e33390a3c904d22b898f42bba6418ff")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionFrameSourcePropertyChangeResult(ptr: Pointer?): WithDefault =
        IPerceptionFrameSourcePropertyChangeResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPerceptionFrameSourcePropertyChangeResult {
      val address = segment.toRawLongValue()
      return makeIPerceptionFrameSourcePropertyChangeResult(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionFrameSourcePropertyChangeResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1766631805_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionFrameSourcePropertyChangeResult):
        Array<IPerceptionFrameSourcePropertyChangeResult?> = (elements as
        Array<IPerceptionFrameSourcePropertyChangeResult?>).castToImpl<IPerceptionFrameSourcePropertyChangeResult,IPerceptionFrameSourcePropertyChangeResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionFrameSourcePropertyChangeResult?> =
        arrayOfNulls<IPerceptionFrameSourcePropertyChangeResult_Impl>(size) as
        Array<IPerceptionFrameSourcePropertyChangeResult?>
  }
}
