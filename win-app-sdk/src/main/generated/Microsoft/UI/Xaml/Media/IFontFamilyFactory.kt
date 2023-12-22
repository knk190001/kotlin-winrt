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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFontFamilyFactory.ABI::class)
@Signature("{61b88a77-d0f9-5e9e-8c28-eda01fede22e}")
@Guid("61b88a77d0f95e9e8c28eda01fede22e")
@WinRTInterface("61b88a77d0f95e9e8c28eda01fede22e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFontFamilyFactory.ByReference::class)
public interface IFontFamilyFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithName(
    familyName: String?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): FontFamily?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFontFamilyFactory> {
    public override fun getValue() = ABI.makeIFontFamilyFactory(pointer.getPointer(0))

    public fun setValue(value: IFontFamilyFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFontFamilyFactory {
    public val __855523098_Ptr: Pointer?

    public val _855523098_VtblPtr: Pointer?
      get() = __855523098_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithName(
      familyName: String?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): FontFamily? {
      val fnPtr = _855523098_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontFamily>()
      val hr = fn.invokeHR(arrayOf(__855523098_Ptr, marshalToNative(familyName),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontFamily>(result.getValue())
      return resultValue
    }
  }

  public class IFontFamilyFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __855523098_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFontFamilyFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("61b88a77d0f95e9e8c28eda01fede22e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFontFamilyFactory(ptr: Pointer?): WithDefault = IFontFamilyFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFontFamilyFactory {
      val address = segment.toRawLongValue()
      return makeIFontFamilyFactory(Pointer(address))
    }

    public override fun toNative(obj: IFontFamilyFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__855523098_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFontFamilyFactory): Array<IFontFamilyFactory?> =
        (elements as
        Array<IFontFamilyFactory?>).castToImpl<IFontFamilyFactory,IFontFamilyFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFontFamilyFactory?> =
        arrayOfNulls<IFontFamilyFactory_Impl>(size) as Array<IFontFamilyFactory?>
  }
}
