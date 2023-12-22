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

@ABIMarker(IInfoBarFactory.ABI::class)
@Signature("{60618a60-9be7-5df5-be0d-933d34ddb44c}")
@Guid("60618a609be75df5be0d933d34ddb44c")
@WinRTInterface("60618a609be75df5be0d933d34ddb44c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInfoBarFactory.ByReference::class)
public interface IInfoBarFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): InfoBar?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInfoBarFactory> {
    public override fun getValue() = ABI.makeIInfoBarFactory(pointer.getPointer(0))

    public fun setValue(value: IInfoBarFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInfoBarFactory {
    public val __707364428_Ptr: Pointer?

    public val _707364428_VtblPtr: Pointer?
      get() = __707364428_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        InfoBar? {
      val fnPtr = _707364428_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InfoBar>()
      val hr = fn.invokeHR(arrayOf(__707364428_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InfoBar>(result.getValue())
      return resultValue
    }
  }

  public class IInfoBarFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __707364428_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInfoBarFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("60618a609be75df5be0d933d34ddb44c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInfoBarFactory(ptr: Pointer?): WithDefault = IInfoBarFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInfoBarFactory {
      val address = segment.toRawLongValue()
      return makeIInfoBarFactory(Pointer(address))
    }

    public override fun toNative(obj: IInfoBarFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__707364428_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInfoBarFactory): Array<IInfoBarFactory?> = (elements as
        Array<IInfoBarFactory?>).castToImpl<IInfoBarFactory,IInfoBarFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInfoBarFactory?> =
        arrayOfNulls<IInfoBarFactory_Impl>(size) as Array<IInfoBarFactory?>
  }
}
