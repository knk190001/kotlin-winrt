package Windows.Media.Playback

import Windows.Foundation.TimeSpan
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPlaybackMediaMarker.ABI::class)
@Signature("{c4d22f5c-3c1c-4444-b6b9-778b0422d41a}")
@Guid("c4d22f5c3c1c4444b6b9778b0422d41a")
@WinRTInterface("c4d22f5c3c1c4444b6b9778b0422d41a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlaybackMediaMarker.ByReference::class)
public interface IPlaybackMediaMarker : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Time(): TimeSpan?

  @InterfaceMethod(1)
  public fun get_MediaMarkerType(): String?

  @InterfaceMethod(2)
  public fun get_Text(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlaybackMediaMarker> {
    public override fun getValue() = ABI.makeIPlaybackMediaMarker(pointer.getPointer(0))

    public fun setValue(value: IPlaybackMediaMarker_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlaybackMediaMarker {
    public val __1212140842_Ptr: Pointer?

    public val _1212140842_VtblPtr: Pointer?
      get() = __1212140842_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Time(): TimeSpan? {
      val fnPtr = _1212140842_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1212140842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MediaMarkerType(): String? {
      val fnPtr = _1212140842_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1212140842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Text(): String? {
      val fnPtr = _1212140842_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1212140842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPlaybackMediaMarker_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1212140842_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlaybackMediaMarker, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c4d22f5c3c1c4444b6b9778b0422d41a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlaybackMediaMarker(ptr: Pointer?): WithDefault = IPlaybackMediaMarker_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlaybackMediaMarker {
      val address = segment.toRawLongValue()
      return makeIPlaybackMediaMarker(Pointer(address))
    }

    public override fun toNative(obj: IPlaybackMediaMarker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1212140842_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlaybackMediaMarker): Array<IPlaybackMediaMarker?> =
        (elements as
        Array<IPlaybackMediaMarker?>).castToImpl<IPlaybackMediaMarker,IPlaybackMediaMarker_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlaybackMediaMarker?> =
        arrayOfNulls<IPlaybackMediaMarker_Impl>(size) as Array<IPlaybackMediaMarker?>
  }
}
