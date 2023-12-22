package Windows.Media.Core

import Windows.Media.Streaming.Adaptive.AdaptiveMediaSource
import Windows.Storage.IStorageFile
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

@ABIMarker(IMediaBindingEventArgs2.ABI::class)
@Signature("{0464cceb-bb5a-482f-b8ba-f0284c696567}")
@Guid("0464ccebbb5a482fb8baf0284c696567")
@WinRTInterface("0464ccebbb5a482fb8baf0284c696567")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaBindingEventArgs2.ByReference::class)
public interface IMediaBindingEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetAdaptiveMediaSource(mediaSource: AdaptiveMediaSource?): Unit

  @InterfaceMethod(1)
  public fun SetStorageFile(`file`: IStorageFile?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaBindingEventArgs2> {
    public override fun getValue() = ABI.makeIMediaBindingEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IMediaBindingEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaBindingEventArgs2 {
    public val __2068008561_Ptr: Pointer?

    public val _2068008561_VtblPtr: Pointer?
      get() = __2068008561_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetAdaptiveMediaSource(mediaSource: AdaptiveMediaSource?): Unit {
      val fnPtr = _2068008561_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2068008561_Ptr, marshalToNative(mediaSource),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun SetStorageFile(`file`: IStorageFile?): Unit {
      val fnPtr = _2068008561_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2068008561_Ptr, marshalToNative(file),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaBindingEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2068008561_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaBindingEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0464ccebbb5a482fb8baf0284c696567")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaBindingEventArgs2(ptr: Pointer?): WithDefault =
        IMediaBindingEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaBindingEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIMediaBindingEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IMediaBindingEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2068008561_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaBindingEventArgs2): Array<IMediaBindingEventArgs2?>
        = (elements as
        Array<IMediaBindingEventArgs2?>).castToImpl<IMediaBindingEventArgs2,IMediaBindingEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaBindingEventArgs2?> =
        arrayOfNulls<IMediaBindingEventArgs2_Impl>(size) as Array<IMediaBindingEventArgs2?>
  }
}
