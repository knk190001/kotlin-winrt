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

@ABIMarker(IFullScreenPresenterStatics.ABI::class)
@Signature("{2ec0d2c1-e086-55bb-a3b2-44942e231c67}")
@Guid("2ec0d2c1e08655bba3b244942e231c67")
@WinRTInterface("2ec0d2c1e08655bba3b244942e231c67")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFullScreenPresenterStatics.ByReference::class)
public interface IFullScreenPresenterStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(): FullScreenPresenter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFullScreenPresenterStatics> {
    public override fun getValue() = ABI.makeIFullScreenPresenterStatics(pointer.getPointer(0))

    public fun setValue(value: IFullScreenPresenterStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFullScreenPresenterStatics {
    public val __947958263_Ptr: Pointer?

    public val _947958263_VtblPtr: Pointer?
      get() = __947958263_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(): FullScreenPresenter? {
      val fnPtr = _947958263_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FullScreenPresenter>()
      val hr = fn.invokeHR(arrayOf(__947958263_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FullScreenPresenter>(result.getValue())
      return resultValue
    }
  }

  public class IFullScreenPresenterStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __947958263_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFullScreenPresenterStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2ec0d2c1e08655bba3b244942e231c67")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFullScreenPresenterStatics(ptr: Pointer?): WithDefault =
        IFullScreenPresenterStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFullScreenPresenterStatics {
      val address = segment.toRawLongValue()
      return makeIFullScreenPresenterStatics(Pointer(address))
    }

    public override fun toNative(obj: IFullScreenPresenterStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__947958263_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFullScreenPresenterStatics):
        Array<IFullScreenPresenterStatics?> = (elements as
        Array<IFullScreenPresenterStatics?>).castToImpl<IFullScreenPresenterStatics,IFullScreenPresenterStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFullScreenPresenterStatics?> =
        arrayOfNulls<IFullScreenPresenterStatics_Impl>(size) as Array<IFullScreenPresenterStatics?>
  }
}
