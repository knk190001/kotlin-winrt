package Microsoft.UI.Xaml.Media

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

@ABIMarker(IDesktopAcrylicBackdropFactory.ABI::class)
@Signature("{00922e6d-ae51-564a-bce2-1973d5e463dd}")
@Guid("00922e6dae51564abce21973d5e463dd")
@WinRTInterface("00922e6dae51564abce21973d5e463dd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDesktopAcrylicBackdropFactory.ByReference::class)
public interface IDesktopAcrylicBackdropFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      DesktopAcrylicBackdrop?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDesktopAcrylicBackdropFactory> {
    public override fun getValue() = ABI.makeIDesktopAcrylicBackdropFactory(pointer.getPointer(0))

    public fun setValue(value: IDesktopAcrylicBackdropFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDesktopAcrylicBackdropFactory {
    public val __495477054_Ptr: Pointer?

    public val _495477054_VtblPtr: Pointer?
      get() = __495477054_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        DesktopAcrylicBackdrop? {
      val fnPtr = _495477054_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DesktopAcrylicBackdrop>()
      val hr = fn.invokeHR(arrayOf(__495477054_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DesktopAcrylicBackdrop>(result.getValue())
      return resultValue
    }
  }

  public class IDesktopAcrylicBackdropFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __495477054_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDesktopAcrylicBackdropFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("00922e6dae51564abce21973d5e463dd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDesktopAcrylicBackdropFactory(ptr: Pointer?): WithDefault =
        IDesktopAcrylicBackdropFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDesktopAcrylicBackdropFactory {
      val address = segment.toRawLongValue()
      return makeIDesktopAcrylicBackdropFactory(Pointer(address))
    }

    public override fun toNative(obj: IDesktopAcrylicBackdropFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__495477054_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDesktopAcrylicBackdropFactory):
        Array<IDesktopAcrylicBackdropFactory?> = (elements as
        Array<IDesktopAcrylicBackdropFactory?>).castToImpl<IDesktopAcrylicBackdropFactory,IDesktopAcrylicBackdropFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDesktopAcrylicBackdropFactory?> =
        arrayOfNulls<IDesktopAcrylicBackdropFactory_Impl>(size) as
        Array<IDesktopAcrylicBackdropFactory?>
  }
}
