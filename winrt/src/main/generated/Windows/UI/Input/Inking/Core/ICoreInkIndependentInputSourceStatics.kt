package Windows.UI.Input.Inking.Core

import Windows.UI.Input.Inking.InkPresenter
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

@ABIMarker(ICoreInkIndependentInputSourceStatics.ABI::class)
@Signature("{73e6011b-80c0-4dfb-9b66-10ba7f3f9c84}")
@Guid("73e6011b80c04dfb9b6610ba7f3f9c84")
@WinRTInterface("73e6011b80c04dfb9b6610ba7f3f9c84")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreInkIndependentInputSourceStatics.ByReference::class)
public interface ICoreInkIndependentInputSourceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(inkPresenter: InkPresenter?): CoreInkIndependentInputSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreInkIndependentInputSourceStatics> {
    public override fun getValue() =
        ABI.makeICoreInkIndependentInputSourceStatics(pointer.getPointer(0))

    public fun setValue(value: ICoreInkIndependentInputSourceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreInkIndependentInputSourceStatics {
    public val __1504941282_Ptr: Pointer?

    public val _1504941282_VtblPtr: Pointer?
      get() = __1504941282_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(inkPresenter: InkPresenter?): CoreInkIndependentInputSource? {
      val fnPtr = _1504941282_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreInkIndependentInputSource>()
      val hr = fn.invokeHR(arrayOf(__1504941282_Ptr, marshalToNative(inkPresenter), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreInkIndependentInputSource>(result.getValue())
      return resultValue
    }
  }

  public class ICoreInkIndependentInputSourceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1504941282_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreInkIndependentInputSourceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("73e6011b80c04dfb9b6610ba7f3f9c84")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreInkIndependentInputSourceStatics(ptr: Pointer?): WithDefault =
        ICoreInkIndependentInputSourceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreInkIndependentInputSourceStatics {
      val address = segment.toRawLongValue()
      return makeICoreInkIndependentInputSourceStatics(Pointer(address))
    }

    public override fun toNative(obj: ICoreInkIndependentInputSourceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1504941282_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreInkIndependentInputSourceStatics):
        Array<ICoreInkIndependentInputSourceStatics?> = (elements as
        Array<ICoreInkIndependentInputSourceStatics?>).castToImpl<ICoreInkIndependentInputSourceStatics,ICoreInkIndependentInputSourceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreInkIndependentInputSourceStatics?> =
        arrayOfNulls<ICoreInkIndependentInputSourceStatics_Impl>(size) as
        Array<ICoreInkIndependentInputSourceStatics?>
  }
}
