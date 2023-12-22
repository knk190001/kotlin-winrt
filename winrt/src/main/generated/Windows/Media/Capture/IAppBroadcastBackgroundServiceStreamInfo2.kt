package Windows.Media.Capture

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

@ABIMarker(IAppBroadcastBackgroundServiceStreamInfo2.ABI::class)
@Signature("{bd1e9f6d-94dc-4fce-9541-a9f129596334}")
@Guid("bd1e9f6d94dc4fce9541a9f129596334")
@WinRTInterface("bd1e9f6d94dc4fce9541a9f129596334")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastBackgroundServiceStreamInfo2.ByReference::class)
public interface IAppBroadcastBackgroundServiceStreamInfo2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ReportProblemWithStream(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastBackgroundServiceStreamInfo2> {
    public override fun getValue() =
        ABI.makeIAppBroadcastBackgroundServiceStreamInfo2(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastBackgroundServiceStreamInfo2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastBackgroundServiceStreamInfo2 {
    public val __2013431061_Ptr: Pointer?

    public val _2013431061_VtblPtr: Pointer?
      get() = __2013431061_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReportProblemWithStream(): Unit {
      val fnPtr = _2013431061_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2013431061_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppBroadcastBackgroundServiceStreamInfo2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2013431061_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastBackgroundServiceStreamInfo2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bd1e9f6d94dc4fce9541a9f129596334")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastBackgroundServiceStreamInfo2(ptr: Pointer?): WithDefault =
        IAppBroadcastBackgroundServiceStreamInfo2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppBroadcastBackgroundServiceStreamInfo2 {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastBackgroundServiceStreamInfo2(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastBackgroundServiceStreamInfo2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2013431061_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastBackgroundServiceStreamInfo2):
        Array<IAppBroadcastBackgroundServiceStreamInfo2?> = (elements as
        Array<IAppBroadcastBackgroundServiceStreamInfo2?>).castToImpl<IAppBroadcastBackgroundServiceStreamInfo2,IAppBroadcastBackgroundServiceStreamInfo2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastBackgroundServiceStreamInfo2?> =
        arrayOfNulls<IAppBroadcastBackgroundServiceStreamInfo2_Impl>(size) as
        Array<IAppBroadcastBackgroundServiceStreamInfo2?>
  }
}
