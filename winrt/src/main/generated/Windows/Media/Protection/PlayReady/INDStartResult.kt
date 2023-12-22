package Windows.Media.Protection.PlayReady

import Windows.Media.Core.MediaStreamSource
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

@ABIMarker(INDStartResult.ABI::class)
@Signature("{79f6e96e-f50f-4015-8ba4-c2bc344ebd4e}")
@Guid("79f6e96ef50f40158ba4c2bc344ebd4e")
@WinRTInterface("79f6e96ef50f40158ba4c2bc344ebd4e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INDStartResult.ByReference::class)
public interface INDStartResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MediaStreamSource(): MediaStreamSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<INDStartResult>
      {
    public override fun getValue() = ABI.makeINDStartResult(pointer.getPointer(0))

    public fun setValue(value: INDStartResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INDStartResult {
    public val __152811537_Ptr: Pointer?

    public val _152811537_VtblPtr: Pointer?
      get() = __152811537_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MediaStreamSource(): MediaStreamSource? {
      val fnPtr = _152811537_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaStreamSource>()
      val hr = fn.invokeHR(arrayOf(__152811537_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaStreamSource>(result.getValue())
      return resultValue
    }
  }

  public class INDStartResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __152811537_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INDStartResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("79f6e96ef50f40158ba4c2bc344ebd4e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINDStartResult(ptr: Pointer?): WithDefault = INDStartResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INDStartResult {
      val address = segment.toRawLongValue()
      return makeINDStartResult(Pointer(address))
    }

    public override fun toNative(obj: INDStartResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__152811537_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INDStartResult): Array<INDStartResult?> = (elements as
        Array<INDStartResult?>).castToImpl<INDStartResult,INDStartResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INDStartResult?> =
        arrayOfNulls<INDStartResult_Impl>(size) as Array<INDStartResult?>
  }
}
