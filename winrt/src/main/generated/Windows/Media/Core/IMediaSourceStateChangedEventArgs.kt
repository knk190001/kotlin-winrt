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

@ABIMarker(IMediaSourceStateChangedEventArgs.ABI::class)
@Signature("{0a30af82-9071-4bac-bc39-ca2a93b717a9}")
@Guid("0a30af8290714bacbc39ca2a93b717a9")
@WinRTInterface("0a30af8290714bacbc39ca2a93b717a9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaSourceStateChangedEventArgs.ByReference::class)
public interface IMediaSourceStateChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OldState(): MediaSourceState?

  @InterfaceMethod(1)
  public fun get_NewState(): MediaSourceState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaSourceStateChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIMediaSourceStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMediaSourceStateChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaSourceStateChangedEventArgs {
    public val __1222618090_Ptr: Pointer?

    public val _1222618090_VtblPtr: Pointer?
      get() = __1222618090_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OldState(): MediaSourceState? {
      val fnPtr = _1222618090_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaSourceState>()
      val hr = fn.invokeHR(arrayOf(__1222618090_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaSourceState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NewState(): MediaSourceState? {
      val fnPtr = _1222618090_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaSourceState>()
      val hr = fn.invokeHR(arrayOf(__1222618090_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaSourceState>(result.getValue())
      return resultValue
    }
  }

  public class IMediaSourceStateChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1222618090_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaSourceStateChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0a30af8290714bacbc39ca2a93b717a9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaSourceStateChangedEventArgs(ptr: Pointer?): WithDefault =
        IMediaSourceStateChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaSourceStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMediaSourceStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMediaSourceStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1222618090_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaSourceStateChangedEventArgs):
        Array<IMediaSourceStateChangedEventArgs?> = (elements as
        Array<IMediaSourceStateChangedEventArgs?>).castToImpl<IMediaSourceStateChangedEventArgs,IMediaSourceStateChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaSourceStateChangedEventArgs?> =
        arrayOfNulls<IMediaSourceStateChangedEventArgs_Impl>(size) as
        Array<IMediaSourceStateChangedEventArgs?>
  }
}
