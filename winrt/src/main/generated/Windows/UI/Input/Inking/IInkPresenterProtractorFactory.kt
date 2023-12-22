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

@ABIMarker(IInkPresenterProtractorFactory.ABI::class)
@Signature("{320103c9-68fa-47e9-8127-8370711fc46c}")
@Guid("320103c968fa47e981278370711fc46c")
@WinRTInterface("320103c968fa47e981278370711fc46c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkPresenterProtractorFactory.ByReference::class)
public interface IInkPresenterProtractorFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(inkPresenter: InkPresenter?): InkPresenterProtractor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkPresenterProtractorFactory> {
    public override fun getValue() = ABI.makeIInkPresenterProtractorFactory(pointer.getPointer(0))

    public fun setValue(value: IInkPresenterProtractorFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkPresenterProtractorFactory {
    public val __1927660068_Ptr: Pointer?

    public val _1927660068_VtblPtr: Pointer?
      get() = __1927660068_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(inkPresenter: InkPresenter?): InkPresenterProtractor? {
      val fnPtr = _1927660068_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkPresenterProtractor>()
      val hr = fn.invokeHR(arrayOf(__1927660068_Ptr, marshalToNative(inkPresenter), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkPresenterProtractor>(result.getValue())
      return resultValue
    }
  }

  public class IInkPresenterProtractorFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1927660068_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkPresenterProtractorFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("320103c968fa47e981278370711fc46c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkPresenterProtractorFactory(ptr: Pointer?): WithDefault =
        IInkPresenterProtractorFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkPresenterProtractorFactory {
      val address = segment.toRawLongValue()
      return makeIInkPresenterProtractorFactory(Pointer(address))
    }

    public override fun toNative(obj: IInkPresenterProtractorFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1927660068_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkPresenterProtractorFactory):
        Array<IInkPresenterProtractorFactory?> = (elements as
        Array<IInkPresenterProtractorFactory?>).castToImpl<IInkPresenterProtractorFactory,IInkPresenterProtractorFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkPresenterProtractorFactory?> =
        arrayOfNulls<IInkPresenterProtractorFactory_Impl>(size) as
        Array<IInkPresenterProtractorFactory?>
  }
}
