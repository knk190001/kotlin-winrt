package Windows.UI.Input.Inking

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

@ABIMarker(IInkPresenterRulerFactory.ABI::class)
@Signature("{34361beb-9001-4a4b-a690-69dbaf63e501}")
@Guid("34361beb90014a4ba69069dbaf63e501")
@WinRTInterface("34361beb90014a4ba69069dbaf63e501")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkPresenterRulerFactory.ByReference::class)
public interface IInkPresenterRulerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(inkPresenter: InkPresenter?): InkPresenterRuler?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkPresenterRulerFactory> {
    public override fun getValue() = ABI.makeIInkPresenterRulerFactory(pointer.getPointer(0))

    public fun setValue(value: IInkPresenterRulerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkPresenterRulerFactory {
    public val __1760887120_Ptr: Pointer?

    public val _1760887120_VtblPtr: Pointer?
      get() = __1760887120_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(inkPresenter: InkPresenter?): InkPresenterRuler? {
      val fnPtr = _1760887120_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkPresenterRuler>()
      val hr = fn.invokeHR(arrayOf(__1760887120_Ptr, marshalToNative(inkPresenter), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkPresenterRuler>(result.getValue())
      return resultValue
    }
  }

  public class IInkPresenterRulerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1760887120_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkPresenterRulerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("34361beb90014a4ba69069dbaf63e501")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkPresenterRulerFactory(ptr: Pointer?): WithDefault =
        IInkPresenterRulerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkPresenterRulerFactory {
      val address = segment.toRawLongValue()
      return makeIInkPresenterRulerFactory(Pointer(address))
    }

    public override fun toNative(obj: IInkPresenterRulerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1760887120_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkPresenterRulerFactory):
        Array<IInkPresenterRulerFactory?> = (elements as
        Array<IInkPresenterRulerFactory?>).castToImpl<IInkPresenterRulerFactory,IInkPresenterRulerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkPresenterRulerFactory?> =
        arrayOfNulls<IInkPresenterRulerFactory_Impl>(size) as Array<IInkPresenterRulerFactory?>
  }
}
