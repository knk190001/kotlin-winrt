package Windows.System

import Windows.Foundation.Collections.ValueSet
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

@ABIMarker(ILaunchUriResult.ABI::class)
@Signature("{ec27a8df-f6d5-45ca-913a-70a40c5c8221}")
@Guid("ec27a8dff6d545ca913a70a40c5c8221")
@WinRTInterface("ec27a8dff6d545ca913a70a40c5c8221")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILaunchUriResult.ByReference::class)
public interface ILaunchUriResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): LaunchUriStatus?

  @InterfaceMethod(1)
  public fun get_Result(): ValueSet?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILaunchUriResult> {
    public override fun getValue() = ABI.makeILaunchUriResult(pointer.getPointer(0))

    public fun setValue(value: ILaunchUriResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILaunchUriResult {
    public val __34495207_Ptr: Pointer?

    public val _34495207_VtblPtr: Pointer?
      get() = __34495207_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): LaunchUriStatus? {
      val fnPtr = _34495207_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LaunchUriStatus>()
      val hr = fn.invokeHR(arrayOf(__34495207_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LaunchUriStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Result(): ValueSet? {
      val fnPtr = _34495207_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ValueSet>()
      val hr = fn.invokeHR(arrayOf(__34495207_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ValueSet>(result.getValue())
      return resultValue
    }
  }

  public class ILaunchUriResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __34495207_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILaunchUriResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ec27a8dff6d545ca913a70a40c5c8221")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILaunchUriResult(ptr: Pointer?): WithDefault = ILaunchUriResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILaunchUriResult {
      val address = segment.toRawLongValue()
      return makeILaunchUriResult(Pointer(address))
    }

    public override fun toNative(obj: ILaunchUriResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__34495207_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILaunchUriResult): Array<ILaunchUriResult?> = (elements as
        Array<ILaunchUriResult?>).castToImpl<ILaunchUriResult,ILaunchUriResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILaunchUriResult?> =
        arrayOfNulls<ILaunchUriResult_Impl>(size) as Array<ILaunchUriResult?>
  }
}
