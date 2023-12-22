package Windows.ApplicationModel

import Windows.Foundation.Deferral
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

@ABIMarker(IEnteredBackgroundEventArgs.ABI::class)
@Signature("{f722dcc2-9827-403d-aaed-ecca9ac17398}")
@Guid("f722dcc29827403daaedecca9ac17398")
@WinRTInterface("f722dcc29827403daaedecca9ac17398")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEnteredBackgroundEventArgs.ByReference::class)
public interface IEnteredBackgroundEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEnteredBackgroundEventArgs> {
    public override fun getValue() = ABI.makeIEnteredBackgroundEventArgs(pointer.getPointer(0))

    public fun setValue(value: IEnteredBackgroundEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEnteredBackgroundEventArgs {
    public val __259902793_Ptr: Pointer?

    public val _259902793_VtblPtr: Pointer?
      get() = __259902793_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _259902793_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__259902793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IEnteredBackgroundEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __259902793_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEnteredBackgroundEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f722dcc29827403daaedecca9ac17398")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEnteredBackgroundEventArgs(ptr: Pointer?): WithDefault =
        IEnteredBackgroundEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEnteredBackgroundEventArgs {
      val address = segment.toRawLongValue()
      return makeIEnteredBackgroundEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IEnteredBackgroundEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__259902793_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEnteredBackgroundEventArgs):
        Array<IEnteredBackgroundEventArgs?> = (elements as
        Array<IEnteredBackgroundEventArgs?>).castToImpl<IEnteredBackgroundEventArgs,IEnteredBackgroundEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEnteredBackgroundEventArgs?> =
        arrayOfNulls<IEnteredBackgroundEventArgs_Impl>(size) as Array<IEnteredBackgroundEventArgs?>
  }
}
