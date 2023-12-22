package Windows.ApplicationModel

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

@ABIMarker(IFullTrustProcessLaunchResult.ABI::class)
@Signature("{8917d888-edfb-515f-8e22-5ebceb69dfd9}")
@Guid("8917d888edfb515f8e225ebceb69dfd9")
@WinRTInterface("8917d888edfb515f8e225ebceb69dfd9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFullTrustProcessLaunchResult.ByReference::class)
public interface IFullTrustProcessLaunchResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LaunchResult(): FullTrustLaunchResult?

  @InterfaceMethod(1)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFullTrustProcessLaunchResult> {
    public override fun getValue() = ABI.makeIFullTrustProcessLaunchResult(pointer.getPointer(0))

    public fun setValue(value: IFullTrustProcessLaunchResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFullTrustProcessLaunchResult {
    public val __2021753179_Ptr: Pointer?

    public val _2021753179_VtblPtr: Pointer?
      get() = __2021753179_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LaunchResult(): FullTrustLaunchResult? {
      val fnPtr = _2021753179_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FullTrustLaunchResult>()
      val hr = fn.invokeHR(arrayOf(__2021753179_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FullTrustLaunchResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _2021753179_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__2021753179_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IFullTrustProcessLaunchResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2021753179_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFullTrustProcessLaunchResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8917d888edfb515f8e225ebceb69dfd9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFullTrustProcessLaunchResult(ptr: Pointer?): WithDefault =
        IFullTrustProcessLaunchResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFullTrustProcessLaunchResult {
      val address = segment.toRawLongValue()
      return makeIFullTrustProcessLaunchResult(Pointer(address))
    }

    public override fun toNative(obj: IFullTrustProcessLaunchResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2021753179_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFullTrustProcessLaunchResult):
        Array<IFullTrustProcessLaunchResult?> = (elements as
        Array<IFullTrustProcessLaunchResult?>).castToImpl<IFullTrustProcessLaunchResult,IFullTrustProcessLaunchResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFullTrustProcessLaunchResult?> =
        arrayOfNulls<IFullTrustProcessLaunchResult_Impl>(size) as
        Array<IFullTrustProcessLaunchResult?>
  }
}
