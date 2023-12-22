package Windows.Media.Core

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(ITimedTextSourceResolveResultEventArgs.ABI::class)
@Signature("{48907c9c-dcd8-4c33-9ad3-6cdce7b1c566}")
@Guid("48907c9cdcd84c339ad36cdce7b1c566")
@WinRTInterface("48907c9cdcd84c339ad36cdce7b1c566")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimedTextSourceResolveResultEventArgs.ByReference::class)
public interface ITimedTextSourceResolveResultEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Error(): TimedMetadataTrackError?

  @InterfaceMethod(1)
  public fun get_Tracks(): IVectorView<TimedMetadataTrack?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimedTextSourceResolveResultEventArgs> {
    public override fun getValue() =
        ABI.makeITimedTextSourceResolveResultEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITimedTextSourceResolveResultEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimedTextSourceResolveResultEventArgs {
    public val __1585221336_Ptr: Pointer?

    public val _1585221336_VtblPtr: Pointer?
      get() = __1585221336_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Error(): TimedMetadataTrackError? {
      val fnPtr = _1585221336_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedMetadataTrackError>()
      val hr = fn.invokeHR(arrayOf(__1585221336_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedMetadataTrackError>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Tracks(): IVectorView<TimedMetadataTrack?>? {
      val fnPtr = _1585221336_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<TimedMetadataTrack?>>()
      val hr = fn.invokeHR(arrayOf(__1585221336_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<TimedMetadataTrack?>>(result.getValue())
      return resultValue
    }
  }

  public class ITimedTextSourceResolveResultEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1585221336_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimedTextSourceResolveResultEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("48907c9cdcd84c339ad36cdce7b1c566")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimedTextSourceResolveResultEventArgs(ptr: Pointer?): WithDefault =
        ITimedTextSourceResolveResultEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimedTextSourceResolveResultEventArgs {
      val address = segment.toRawLongValue()
      return makeITimedTextSourceResolveResultEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITimedTextSourceResolveResultEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1585221336_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimedTextSourceResolveResultEventArgs):
        Array<ITimedTextSourceResolveResultEventArgs?> = (elements as
        Array<ITimedTextSourceResolveResultEventArgs?>).castToImpl<ITimedTextSourceResolveResultEventArgs,ITimedTextSourceResolveResultEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimedTextSourceResolveResultEventArgs?> =
        arrayOfNulls<ITimedTextSourceResolveResultEventArgs_Impl>(size) as
        Array<ITimedTextSourceResolveResultEventArgs?>
  }
}
