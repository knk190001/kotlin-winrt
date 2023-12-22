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

@ABIMarker(IMediaSourceStatics2.ABI::class)
@Signature("{eee161a4-7f13-4896-b8cb-df0de5bcb9f1}")
@Guid("eee161a47f134896b8cbdf0de5bcb9f1")
@WinRTInterface("eee161a47f134896b8cbdf0de5bcb9f1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaSourceStatics2.ByReference::class)
public interface IMediaSourceStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromMediaBinder(binder: MediaBinder?): MediaSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaSourceStatics2> {
    public override fun getValue() = ABI.makeIMediaSourceStatics2(pointer.getPointer(0))

    public fun setValue(value: IMediaSourceStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaSourceStatics2 {
    public val __106552919_Ptr: Pointer?

    public val _106552919_VtblPtr: Pointer?
      get() = __106552919_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromMediaBinder(binder: MediaBinder?): MediaSource? {
      val fnPtr = _106552919_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaSource>()
      val hr = fn.invokeHR(arrayOf(__106552919_Ptr, marshalToNative(binder), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaSource>(result.getValue())
      return resultValue
    }
  }

  public class IMediaSourceStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __106552919_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaSourceStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eee161a47f134896b8cbdf0de5bcb9f1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaSourceStatics2(ptr: Pointer?): WithDefault = IMediaSourceStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaSourceStatics2 {
      val address = segment.toRawLongValue()
      return makeIMediaSourceStatics2(Pointer(address))
    }

    public override fun toNative(obj: IMediaSourceStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__106552919_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaSourceStatics2): Array<IMediaSourceStatics2?> =
        (elements as
        Array<IMediaSourceStatics2?>).castToImpl<IMediaSourceStatics2,IMediaSourceStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaSourceStatics2?> =
        arrayOfNulls<IMediaSourceStatics2_Impl>(size) as Array<IMediaSourceStatics2?>
  }
}
