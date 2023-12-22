package Windows.Devices.Display.Core

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IDisplayTaskResult.ABI::class)
@Signature("{6fbc7d67-f9b1-55e0-9d88-d3a5197a3f59}")
@Guid("6fbc7d67f9b155e09d88d3a5197a3f59")
@WinRTInterface("6fbc7d67f9b155e09d88d3a5197a3f59")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayTaskResult.ByReference::class)
public interface IDisplayTaskResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PresentStatus(): DisplayPresentStatus?

  @InterfaceMethod(1)
  public fun get_PresentId(): WinDef.ULONG

  @InterfaceMethod(2)
  public fun get_SourceStatus(): DisplaySourceStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayTaskResult> {
    public override fun getValue() = ABI.makeIDisplayTaskResult(pointer.getPointer(0))

    public fun setValue(value: IDisplayTaskResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayTaskResult {
    public val __1695341278_Ptr: Pointer?

    public val _1695341278_VtblPtr: Pointer?
      get() = __1695341278_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PresentStatus(): DisplayPresentStatus? {
      val fnPtr = _1695341278_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayPresentStatus>()
      val hr = fn.invokeHR(arrayOf(__1695341278_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayPresentStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PresentId(): WinDef.ULONG {
      val fnPtr = _1695341278_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1695341278_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_SourceStatus(): DisplaySourceStatus? {
      val fnPtr = _1695341278_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplaySourceStatus>()
      val hr = fn.invokeHR(arrayOf(__1695341278_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplaySourceStatus>(result.getValue())
      return resultValue
    }
  }

  public class IDisplayTaskResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1695341278_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayTaskResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6fbc7d67f9b155e09d88d3a5197a3f59")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayTaskResult(ptr: Pointer?): WithDefault = IDisplayTaskResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayTaskResult {
      val address = segment.toRawLongValue()
      return makeIDisplayTaskResult(Pointer(address))
    }

    public override fun toNative(obj: IDisplayTaskResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1695341278_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayTaskResult): Array<IDisplayTaskResult?> =
        (elements as
        Array<IDisplayTaskResult?>).castToImpl<IDisplayTaskResult,IDisplayTaskResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayTaskResult?> =
        arrayOfNulls<IDisplayTaskResult_Impl>(size) as Array<IDisplayTaskResult?>
  }
}
