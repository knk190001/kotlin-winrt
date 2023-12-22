package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IMediaPlayerPresenterStatics.ABI::class)
@Signature("{84d774fe-ead4-4957-b42b-223158ca0de7}")
@Guid("84d774feead44957b42b223158ca0de7")
@WinRTInterface("84d774feead44957b42b223158ca0de7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlayerPresenterStatics.ByReference::class)
public interface IMediaPlayerPresenterStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MediaPlayerProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_StretchProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_IsFullWindowProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlayerPresenterStatics> {
    public override fun getValue() = ABI.makeIMediaPlayerPresenterStatics(pointer.getPointer(0))

    public fun setValue(value: IMediaPlayerPresenterStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlayerPresenterStatics {
    public val __1004982374_Ptr: Pointer?

    public val _1004982374_VtblPtr: Pointer?
      get() = __1004982374_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MediaPlayerProperty(): DependencyProperty? {
      val fnPtr = _1004982374_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1004982374_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_StretchProperty(): DependencyProperty? {
      val fnPtr = _1004982374_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1004982374_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsFullWindowProperty(): DependencyProperty? {
      val fnPtr = _1004982374_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1004982374_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IMediaPlayerPresenterStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1004982374_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlayerPresenterStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("84d774feead44957b42b223158ca0de7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlayerPresenterStatics(ptr: Pointer?): WithDefault =
        IMediaPlayerPresenterStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlayerPresenterStatics {
      val address = segment.toRawLongValue()
      return makeIMediaPlayerPresenterStatics(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlayerPresenterStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1004982374_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlayerPresenterStatics):
        Array<IMediaPlayerPresenterStatics?> = (elements as
        Array<IMediaPlayerPresenterStatics?>).castToImpl<IMediaPlayerPresenterStatics,IMediaPlayerPresenterStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlayerPresenterStatics?> =
        arrayOfNulls<IMediaPlayerPresenterStatics_Impl>(size) as
        Array<IMediaPlayerPresenterStatics?>
  }
}
