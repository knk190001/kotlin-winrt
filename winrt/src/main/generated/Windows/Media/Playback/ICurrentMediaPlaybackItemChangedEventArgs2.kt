package Windows.Media.Playback

import Windows.Media.Playback.ICurrentMediaPlaybackItemChangedEventArgs.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(ICurrentMediaPlaybackItemChangedEventArgs2.ABI::class)
@Signature("{1d80a51e-996e-40a9-be48-e66ec90b2b7d}")
@Guid("1d80a51e996e40a9be48e66ec90b2b7d")
@WinRTInterface("1d80a51e996e40a9be48e66ec90b2b7d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICurrentMediaPlaybackItemChangedEventArgs2.ByReference::class)
public interface ICurrentMediaPlaybackItemChangedEventArgs2 : NativeMapped, IWinRTInterface,
    ICurrentMediaPlaybackItemChangedEventArgs {
  @InterfaceMethod(0)
  public fun get_Reason(): MediaPlaybackItemChangedReason?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICurrentMediaPlaybackItemChangedEventArgs2> {
    public override fun getValue() =
        ABI.makeICurrentMediaPlaybackItemChangedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: ICurrentMediaPlaybackItemChangedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICurrentMediaPlaybackItemChangedEventArgs2,
      ICurrentMediaPlaybackItemChangedEventArgs.WithDefault {
    public val __885073987_Ptr: Pointer?

    public val _885073987_VtblPtr: Pointer?
      get() = __885073987_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reason(): MediaPlaybackItemChangedReason? {
      val fnPtr = _885073987_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackItemChangedReason>()
      val hr = fn.invokeHR(arrayOf(__885073987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackItemChangedReason>(result.getValue())
      return resultValue
    }
  }

  public class ICurrentMediaPlaybackItemChangedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      ICurrentMediaPlaybackItemChangedEventArgs {
    public override val __387091221_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_885073987_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __885073987_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICurrentMediaPlaybackItemChangedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1d80a51e996e40a9be48e66ec90b2b7d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICurrentMediaPlaybackItemChangedEventArgs2(ptr: Pointer?): WithDefault =
        ICurrentMediaPlaybackItemChangedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICurrentMediaPlaybackItemChangedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeICurrentMediaPlaybackItemChangedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: ICurrentMediaPlaybackItemChangedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__885073987_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICurrentMediaPlaybackItemChangedEventArgs2):
        Array<ICurrentMediaPlaybackItemChangedEventArgs2?> = (elements as
        Array<ICurrentMediaPlaybackItemChangedEventArgs2?>).castToImpl<ICurrentMediaPlaybackItemChangedEventArgs2,ICurrentMediaPlaybackItemChangedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICurrentMediaPlaybackItemChangedEventArgs2?> =
        arrayOfNulls<ICurrentMediaPlaybackItemChangedEventArgs2_Impl>(size) as
        Array<ICurrentMediaPlaybackItemChangedEventArgs2?>
  }
}
