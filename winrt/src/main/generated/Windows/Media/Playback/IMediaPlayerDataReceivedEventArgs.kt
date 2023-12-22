package Windows.Media.Playback

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

@ABIMarker(IMediaPlayerDataReceivedEventArgs.ABI::class)
@Signature("{c75a9405-c801-412a-835b-83fc0e622a8e}")
@Guid("c75a9405c801412a835b83fc0e622a8e")
@WinRTInterface("c75a9405c801412a835b83fc0e622a8e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlayerDataReceivedEventArgs.ByReference::class)
public interface IMediaPlayerDataReceivedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Data(): ValueSet?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlayerDataReceivedEventArgs> {
    public override fun getValue() =
        ABI.makeIMediaPlayerDataReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMediaPlayerDataReceivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlayerDataReceivedEventArgs {
    public val __272657056_Ptr: Pointer?

    public val _272657056_VtblPtr: Pointer?
      get() = __272657056_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Data(): ValueSet? {
      val fnPtr = _272657056_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ValueSet>()
      val hr = fn.invokeHR(arrayOf(__272657056_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ValueSet>(result.getValue())
      return resultValue
    }
  }

  public class IMediaPlayerDataReceivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __272657056_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlayerDataReceivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c75a9405c801412a835b83fc0e622a8e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlayerDataReceivedEventArgs(ptr: Pointer?): WithDefault =
        IMediaPlayerDataReceivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlayerDataReceivedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMediaPlayerDataReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlayerDataReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__272657056_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlayerDataReceivedEventArgs):
        Array<IMediaPlayerDataReceivedEventArgs?> = (elements as
        Array<IMediaPlayerDataReceivedEventArgs?>).castToImpl<IMediaPlayerDataReceivedEventArgs,IMediaPlayerDataReceivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlayerDataReceivedEventArgs?> =
        arrayOfNulls<IMediaPlayerDataReceivedEventArgs_Impl>(size) as
        Array<IMediaPlayerDataReceivedEventArgs?>
  }
}
