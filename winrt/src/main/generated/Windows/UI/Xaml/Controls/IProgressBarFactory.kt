package Windows.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IProgressBarFactory.ABI::class)
@Signature("{da9a8c11-1591-400b-a993-0f1c5cc12f3b}")
@Guid("da9a8c111591400ba9930f1c5cc12f3b")
@WinRTInterface("da9a8c111591400ba9930f1c5cc12f3b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProgressBarFactory.ByReference::class)
public interface IProgressBarFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): ProgressBar?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProgressBarFactory> {
    public override fun getValue() = ABI.makeIProgressBarFactory(pointer.getPointer(0))

    public fun setValue(value: IProgressBarFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProgressBarFactory {
    public val __2080815264_Ptr: Pointer?

    public val _2080815264_VtblPtr: Pointer?
      get() = __2080815264_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ProgressBar? {
      val fnPtr = _2080815264_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProgressBar>()
      val hr = fn.invokeHR(arrayOf(__2080815264_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProgressBar>(result.getValue())
      return resultValue
    }
  }

  public class IProgressBarFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2080815264_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProgressBarFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("da9a8c111591400ba9930f1c5cc12f3b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProgressBarFactory(ptr: Pointer?): WithDefault = IProgressBarFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProgressBarFactory {
      val address = segment.toRawLongValue()
      return makeIProgressBarFactory(Pointer(address))
    }

    public override fun toNative(obj: IProgressBarFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2080815264_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProgressBarFactory): Array<IProgressBarFactory?> =
        (elements as
        Array<IProgressBarFactory?>).castToImpl<IProgressBarFactory,IProgressBarFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProgressBarFactory?> =
        arrayOfNulls<IProgressBarFactory_Impl>(size) as Array<IProgressBarFactory?>
  }
}
