package Windows.Media.Streaming.Adaptive

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

@ABIMarker(IAdaptiveMediaSourceCreationResult2.ABI::class)
@Signature("{1c3243bf-1c44-404b-a201-df45ac7898e8}")
@Guid("1c3243bf1c44404ba201df45ac7898e8")
@WinRTInterface("1c3243bf1c44404ba201df45ac7898e8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdaptiveMediaSourceCreationResult2.ByReference::class)
public interface IAdaptiveMediaSourceCreationResult2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdaptiveMediaSourceCreationResult2> {
    public override fun getValue() =
        ABI.makeIAdaptiveMediaSourceCreationResult2(pointer.getPointer(0))

    public fun setValue(value: IAdaptiveMediaSourceCreationResult2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdaptiveMediaSourceCreationResult2 {
    public val __949335103_Ptr: Pointer?

    public val _949335103_VtblPtr: Pointer?
      get() = __949335103_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _949335103_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__949335103_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IAdaptiveMediaSourceCreationResult2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __949335103_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdaptiveMediaSourceCreationResult2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1c3243bf1c44404ba201df45ac7898e8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdaptiveMediaSourceCreationResult2(ptr: Pointer?): WithDefault =
        IAdaptiveMediaSourceCreationResult2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdaptiveMediaSourceCreationResult2 {
      val address = segment.toRawLongValue()
      return makeIAdaptiveMediaSourceCreationResult2(Pointer(address))
    }

    public override fun toNative(obj: IAdaptiveMediaSourceCreationResult2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__949335103_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdaptiveMediaSourceCreationResult2):
        Array<IAdaptiveMediaSourceCreationResult2?> = (elements as
        Array<IAdaptiveMediaSourceCreationResult2?>).castToImpl<IAdaptiveMediaSourceCreationResult2,IAdaptiveMediaSourceCreationResult2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdaptiveMediaSourceCreationResult2?> =
        arrayOfNulls<IAdaptiveMediaSourceCreationResult2_Impl>(size) as
        Array<IAdaptiveMediaSourceCreationResult2?>
  }
}
