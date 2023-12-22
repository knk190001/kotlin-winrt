package Microsoft.UI.Windowing

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

@ABIMarker(IOverlappedPresenterStatics.ABI::class)
@Signature("{997225e4-7b00-5aee-a4be-d4068d1999e2}")
@Guid("997225e47b005aeea4bed4068d1999e2")
@WinRTInterface("997225e47b005aeea4bed4068d1999e2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOverlappedPresenterStatics.ByReference::class)
public interface IOverlappedPresenterStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(): OverlappedPresenter?

  @InterfaceMethod(1)
  public fun CreateForContextMenu(): OverlappedPresenter?

  @InterfaceMethod(2)
  public fun CreateForDialog(): OverlappedPresenter?

  @InterfaceMethod(3)
  public fun CreateForToolWindow(): OverlappedPresenter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IOverlappedPresenterStatics> {
    public override fun getValue() = ABI.makeIOverlappedPresenterStatics(pointer.getPointer(0))

    public fun setValue(value: IOverlappedPresenterStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOverlappedPresenterStatics {
    public val __532373398_Ptr: Pointer?

    public val _532373398_VtblPtr: Pointer?
      get() = __532373398_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(): OverlappedPresenter? {
      val fnPtr = _532373398_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<OverlappedPresenter>()
      val hr = fn.invokeHR(arrayOf(__532373398_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<OverlappedPresenter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateForContextMenu(): OverlappedPresenter? {
      val fnPtr = _532373398_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<OverlappedPresenter>()
      val hr = fn.invokeHR(arrayOf(__532373398_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<OverlappedPresenter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateForDialog(): OverlappedPresenter? {
      val fnPtr = _532373398_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<OverlappedPresenter>()
      val hr = fn.invokeHR(arrayOf(__532373398_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<OverlappedPresenter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateForToolWindow(): OverlappedPresenter? {
      val fnPtr = _532373398_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<OverlappedPresenter>()
      val hr = fn.invokeHR(arrayOf(__532373398_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<OverlappedPresenter>(result.getValue())
      return resultValue
    }
  }

  public class IOverlappedPresenterStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __532373398_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOverlappedPresenterStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("997225e47b005aeea4bed4068d1999e2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOverlappedPresenterStatics(ptr: Pointer?): WithDefault =
        IOverlappedPresenterStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IOverlappedPresenterStatics {
      val address = segment.toRawLongValue()
      return makeIOverlappedPresenterStatics(Pointer(address))
    }

    public override fun toNative(obj: IOverlappedPresenterStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__532373398_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOverlappedPresenterStatics):
        Array<IOverlappedPresenterStatics?> = (elements as
        Array<IOverlappedPresenterStatics?>).castToImpl<IOverlappedPresenterStatics,IOverlappedPresenterStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOverlappedPresenterStatics?> =
        arrayOfNulls<IOverlappedPresenterStatics_Impl>(size) as Array<IOverlappedPresenterStatics?>
  }
}
