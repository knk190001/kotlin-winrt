package Windows.Media.Miracast

import Windows.Foundation.HResult
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

@ABIMarker(IMiracastReceiverSessionStartResult.ABI::class)
@Signature("{b7c573ee-40ca-51ff-95f2-c9de34f2e90e}")
@Guid("b7c573ee40ca51ff95f2c9de34f2e90e")
@WinRTInterface("b7c573ee40ca51ff95f2c9de34f2e90e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMiracastReceiverSessionStartResult.ByReference::class)
public interface IMiracastReceiverSessionStartResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): MiracastReceiverSessionStartStatus?

  @InterfaceMethod(1)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMiracastReceiverSessionStartResult> {
    public override fun getValue() =
        ABI.makeIMiracastReceiverSessionStartResult(pointer.getPointer(0))

    public fun setValue(value: IMiracastReceiverSessionStartResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMiracastReceiverSessionStartResult {
    public val __1946690156_Ptr: Pointer?

    public val _1946690156_VtblPtr: Pointer?
      get() = __1946690156_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): MiracastReceiverSessionStartStatus? {
      val fnPtr = _1946690156_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MiracastReceiverSessionStartStatus>()
      val hr = fn.invokeHR(arrayOf(__1946690156_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MiracastReceiverSessionStartStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _1946690156_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__1946690156_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IMiracastReceiverSessionStartResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1946690156_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMiracastReceiverSessionStartResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b7c573ee40ca51ff95f2c9de34f2e90e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMiracastReceiverSessionStartResult(ptr: Pointer?): WithDefault =
        IMiracastReceiverSessionStartResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMiracastReceiverSessionStartResult {
      val address = segment.toRawLongValue()
      return makeIMiracastReceiverSessionStartResult(Pointer(address))
    }

    public override fun toNative(obj: IMiracastReceiverSessionStartResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1946690156_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMiracastReceiverSessionStartResult):
        Array<IMiracastReceiverSessionStartResult?> = (elements as
        Array<IMiracastReceiverSessionStartResult?>).castToImpl<IMiracastReceiverSessionStartResult,IMiracastReceiverSessionStartResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMiracastReceiverSessionStartResult?> =
        arrayOfNulls<IMiracastReceiverSessionStartResult_Impl>(size) as
        Array<IMiracastReceiverSessionStartResult?>
  }
}
