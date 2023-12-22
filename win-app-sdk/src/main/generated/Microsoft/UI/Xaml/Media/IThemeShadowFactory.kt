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

@ABIMarker(IThemeShadowFactory.ABI::class)
@Signature("{704a9c96-76a0-569e-8ceb-34e92a23fe11}")
@Guid("704a9c9676a0569e8ceb34e92a23fe11")
@WinRTInterface("704a9c9676a0569e8ceb34e92a23fe11")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IThemeShadowFactory.ByReference::class)
public interface IThemeShadowFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): ThemeShadow?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IThemeShadowFactory> {
    public override fun getValue() = ABI.makeIThemeShadowFactory(pointer.getPointer(0))

    public fun setValue(value: IThemeShadowFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IThemeShadowFactory {
    public val __1493213810_Ptr: Pointer?

    public val _1493213810_VtblPtr: Pointer?
      get() = __1493213810_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ThemeShadow? {
      val fnPtr = _1493213810_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ThemeShadow>()
      val hr = fn.invokeHR(arrayOf(__1493213810_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ThemeShadow>(result.getValue())
      return resultValue
    }
  }

  public class IThemeShadowFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1493213810_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IThemeShadowFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("704a9c9676a0569e8ceb34e92a23fe11")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIThemeShadowFactory(ptr: Pointer?): WithDefault = IThemeShadowFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IThemeShadowFactory {
      val address = segment.toRawLongValue()
      return makeIThemeShadowFactory(Pointer(address))
    }

    public override fun toNative(obj: IThemeShadowFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1493213810_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IThemeShadowFactory): Array<IThemeShadowFactory?> =
        (elements as
        Array<IThemeShadowFactory?>).castToImpl<IThemeShadowFactory,IThemeShadowFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IThemeShadowFactory?> =
        arrayOfNulls<IThemeShadowFactory_Impl>(size) as Array<IThemeShadowFactory?>
  }
}
