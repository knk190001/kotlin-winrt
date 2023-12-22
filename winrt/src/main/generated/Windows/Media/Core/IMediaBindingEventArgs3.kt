package Windows.Media.Core

import Windows.Networking.BackgroundTransfer.DownloadOperation
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

@ABIMarker(IMediaBindingEventArgs3.ABI::class)
@Signature("{f8eb475e-19be-44fc-a5ed-7aba315037f9}")
@Guid("f8eb475e19be44fca5ed7aba315037f9")
@WinRTInterface("f8eb475e19be44fca5ed7aba315037f9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaBindingEventArgs3.ByReference::class)
public interface IMediaBindingEventArgs3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetDownloadOperation(downloadOperation: DownloadOperation?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaBindingEventArgs3> {
    public override fun getValue() = ABI.makeIMediaBindingEventArgs3(pointer.getPointer(0))

    public fun setValue(value: IMediaBindingEventArgs3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaBindingEventArgs3 {
    public val __2068008562_Ptr: Pointer?

    public val _2068008562_VtblPtr: Pointer?
      get() = __2068008562_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetDownloadOperation(downloadOperation: DownloadOperation?): Unit {
      val fnPtr = _2068008562_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2068008562_Ptr, marshalToNative(downloadOperation),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaBindingEventArgs3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2068008562_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaBindingEventArgs3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f8eb475e19be44fca5ed7aba315037f9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaBindingEventArgs3(ptr: Pointer?): WithDefault =
        IMediaBindingEventArgs3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaBindingEventArgs3 {
      val address = segment.toRawLongValue()
      return makeIMediaBindingEventArgs3(Pointer(address))
    }

    public override fun toNative(obj: IMediaBindingEventArgs3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2068008562_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaBindingEventArgs3): Array<IMediaBindingEventArgs3?>
        = (elements as
        Array<IMediaBindingEventArgs3?>).castToImpl<IMediaBindingEventArgs3,IMediaBindingEventArgs3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaBindingEventArgs3?> =
        arrayOfNulls<IMediaBindingEventArgs3_Impl>(size) as Array<IMediaBindingEventArgs3?>
  }
}
