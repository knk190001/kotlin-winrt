package Windows.Media.Core

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

@ABIMarker(IMediaStreamSourceSampleRequestDeferral.ABI::class)
@Signature("{7895cc02-f982-43c8-9d16-c62d999319be}")
@Guid("7895cc02f98243c89d16c62d999319be")
@WinRTInterface("7895cc02f98243c89d16c62d999319be")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaStreamSourceSampleRequestDeferral.ByReference::class)
public interface IMediaStreamSourceSampleRequestDeferral : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaStreamSourceSampleRequestDeferral> {
    public override fun getValue() =
        ABI.makeIMediaStreamSourceSampleRequestDeferral(pointer.getPointer(0))

    public fun setValue(value: IMediaStreamSourceSampleRequestDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaStreamSourceSampleRequestDeferral {
    public val __425493158_Ptr: Pointer?

    public val _425493158_VtblPtr: Pointer?
      get() = __425493158_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(): Unit {
      val fnPtr = _425493158_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__425493158_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaStreamSourceSampleRequestDeferral_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __425493158_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaStreamSourceSampleRequestDeferral, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7895cc02f98243c89d16c62d999319be")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaStreamSourceSampleRequestDeferral(ptr: Pointer?): WithDefault =
        IMediaStreamSourceSampleRequestDeferral_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMediaStreamSourceSampleRequestDeferral {
      val address = segment.toRawLongValue()
      return makeIMediaStreamSourceSampleRequestDeferral(Pointer(address))
    }

    public override fun toNative(obj: IMediaStreamSourceSampleRequestDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__425493158_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaStreamSourceSampleRequestDeferral):
        Array<IMediaStreamSourceSampleRequestDeferral?> = (elements as
        Array<IMediaStreamSourceSampleRequestDeferral?>).castToImpl<IMediaStreamSourceSampleRequestDeferral,IMediaStreamSourceSampleRequestDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaStreamSourceSampleRequestDeferral?> =
        arrayOfNulls<IMediaStreamSourceSampleRequestDeferral_Impl>(size) as
        Array<IMediaStreamSourceSampleRequestDeferral?>
  }
}
