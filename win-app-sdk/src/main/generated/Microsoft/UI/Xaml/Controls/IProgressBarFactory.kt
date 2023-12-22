package Microsoft.UI.Xaml.Controls

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
@Signature("{189826ad-f6f2-533e-9ddb-b6600e88675b}")
@Guid("189826adf6f2533e9ddbb6600e88675b")
@WinRTInterface("189826adf6f2533e9ddbb6600e88675b")
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
    public val __931476875_Ptr: Pointer?

    public val _931476875_VtblPtr: Pointer?
      get() = __931476875_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ProgressBar? {
      val fnPtr = _931476875_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProgressBar>()
      val hr = fn.invokeHR(arrayOf(__931476875_Ptr, marshalToNative(baseInterface),
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
    public override val __931476875_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProgressBarFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("189826adf6f2533e9ddbb6600e88675b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProgressBarFactory(ptr: Pointer?): WithDefault = IProgressBarFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProgressBarFactory {
      val address = segment.toRawLongValue()
      return makeIProgressBarFactory(Pointer(address))
    }

    public override fun toNative(obj: IProgressBarFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__931476875_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProgressBarFactory): Array<IProgressBarFactory?> =
        (elements as
        Array<IProgressBarFactory?>).castToImpl<IProgressBarFactory,IProgressBarFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProgressBarFactory?> =
        arrayOfNulls<IProgressBarFactory_Impl>(size) as Array<IProgressBarFactory?>
  }
}
