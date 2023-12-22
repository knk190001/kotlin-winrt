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

@ABIMarker(IMediaStreamSourceStartingRequestDeferral.ABI::class)
@Signature("{3f1356a5-6340-4dc4-9910-068ed9f598f8}")
@Guid("3f1356a563404dc49910068ed9f598f8")
@WinRTInterface("3f1356a563404dc49910068ed9f598f8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaStreamSourceStartingRequestDeferral.ByReference::class)
public interface IMediaStreamSourceStartingRequestDeferral : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaStreamSourceStartingRequestDeferral> {
    public override fun getValue() =
        ABI.makeIMediaStreamSourceStartingRequestDeferral(pointer.getPointer(0))

    public fun setValue(value: IMediaStreamSourceStartingRequestDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaStreamSourceStartingRequestDeferral {
    public val __1430418480_Ptr: Pointer?

    public val _1430418480_VtblPtr: Pointer?
      get() = __1430418480_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(): Unit {
      val fnPtr = _1430418480_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1430418480_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaStreamSourceStartingRequestDeferral_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1430418480_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaStreamSourceStartingRequestDeferral, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3f1356a563404dc49910068ed9f598f8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaStreamSourceStartingRequestDeferral(ptr: Pointer?): WithDefault =
        IMediaStreamSourceStartingRequestDeferral_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMediaStreamSourceStartingRequestDeferral {
      val address = segment.toRawLongValue()
      return makeIMediaStreamSourceStartingRequestDeferral(Pointer(address))
    }

    public override fun toNative(obj: IMediaStreamSourceStartingRequestDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1430418480_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaStreamSourceStartingRequestDeferral):
        Array<IMediaStreamSourceStartingRequestDeferral?> = (elements as
        Array<IMediaStreamSourceStartingRequestDeferral?>).castToImpl<IMediaStreamSourceStartingRequestDeferral,IMediaStreamSourceStartingRequestDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaStreamSourceStartingRequestDeferral?> =
        arrayOfNulls<IMediaStreamSourceStartingRequestDeferral_Impl>(size) as
        Array<IMediaStreamSourceStartingRequestDeferral?>
  }
}
