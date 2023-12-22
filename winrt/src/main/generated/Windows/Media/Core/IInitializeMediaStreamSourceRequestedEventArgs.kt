package Windows.Media.Core

import Windows.Foundation.Deferral
import Windows.Storage.Streams.IRandomAccessStream
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

@ABIMarker(IInitializeMediaStreamSourceRequestedEventArgs.ABI::class)
@Signature("{25bc45e1-9b08-4c2e-a855-4542f1a75deb}")
@Guid("25bc45e19b084c2ea8554542f1a75deb")
@WinRTInterface("25bc45e19b084c2ea8554542f1a75deb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInitializeMediaStreamSourceRequestedEventArgs.ByReference::class)
public interface IInitializeMediaStreamSourceRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Source(): MediaStreamSource?

  @InterfaceMethod(1)
  public fun get_RandomAccessStream(): IRandomAccessStream?

  @InterfaceMethod(2)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInitializeMediaStreamSourceRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIInitializeMediaStreamSourceRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IInitializeMediaStreamSourceRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInitializeMediaStreamSourceRequestedEventArgs {
    public val __1090399363_Ptr: Pointer?

    public val _1090399363_VtblPtr: Pointer?
      get() = __1090399363_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Source(): MediaStreamSource? {
      val fnPtr = _1090399363_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaStreamSource>()
      val hr = fn.invokeHR(arrayOf(__1090399363_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaStreamSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RandomAccessStream(): IRandomAccessStream? {
      val fnPtr = _1090399363_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStream>()
      val hr = fn.invokeHR(arrayOf(__1090399363_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1090399363_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1090399363_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IInitializeMediaStreamSourceRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1090399363_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInitializeMediaStreamSourceRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("25bc45e19b084c2ea8554542f1a75deb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInitializeMediaStreamSourceRequestedEventArgs(ptr: Pointer?): WithDefault =
        IInitializeMediaStreamSourceRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IInitializeMediaStreamSourceRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIInitializeMediaStreamSourceRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IInitializeMediaStreamSourceRequestedEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1090399363_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInitializeMediaStreamSourceRequestedEventArgs):
        Array<IInitializeMediaStreamSourceRequestedEventArgs?> = (elements as
        Array<IInitializeMediaStreamSourceRequestedEventArgs?>).castToImpl<IInitializeMediaStreamSourceRequestedEventArgs,IInitializeMediaStreamSourceRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInitializeMediaStreamSourceRequestedEventArgs?> =
        arrayOfNulls<IInitializeMediaStreamSourceRequestedEventArgs_Impl>(size) as
        Array<IInitializeMediaStreamSourceRequestedEventArgs?>
  }
}
