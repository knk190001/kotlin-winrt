package Windows.UI.Input

import Windows.Foundation.Uri
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRadialControllerMenuItemStatics2.ABI::class)
@Signature("{0cbb70be-7e3e-48bd-be04-2c7fcaa9c1ff}")
@Guid("0cbb70be7e3e48bdbe042c7fcaa9c1ff")
@WinRTInterface("0cbb70be7e3e48bdbe042c7fcaa9c1ff")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadialControllerMenuItemStatics2.ByReference::class)
public interface IRadialControllerMenuItemStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromFontGlyph(
    displayText: String?,
    glyph: String?,
    fontFamily: String?
  ): RadialControllerMenuItem?

  @InterfaceMethod(1)
  public fun CreateFromFontGlyph(
    displayText: String?,
    glyph: String?,
    fontFamily: String?,
    fontUri: Uri?
  ): RadialControllerMenuItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadialControllerMenuItemStatics2> {
    public override fun getValue() =
        ABI.makeIRadialControllerMenuItemStatics2(pointer.getPointer(0))

    public fun setValue(value: IRadialControllerMenuItemStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadialControllerMenuItemStatics2 {
    public val __883246520_Ptr: Pointer?

    public val _883246520_VtblPtr: Pointer?
      get() = __883246520_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromFontGlyph(
      displayText: String?,
      glyph: String?,
      fontFamily: String?
    ): RadialControllerMenuItem? {
      val fnPtr = _883246520_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RadialControllerMenuItem>()
      val hr = fn.invokeHR(arrayOf(__883246520_Ptr, marshalToNative(displayText),
          marshalToNative(glyph), marshalToNative(fontFamily), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RadialControllerMenuItem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromFontGlyph(
      displayText: String?,
      glyph: String?,
      fontFamily: String?,
      fontUri: Uri?
    ): RadialControllerMenuItem? {
      val fnPtr = _883246520_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RadialControllerMenuItem>()
      val hr = fn.invokeHR(arrayOf(__883246520_Ptr, marshalToNative(displayText),
          marshalToNative(glyph), marshalToNative(fontFamily), marshalToNative(fontUri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RadialControllerMenuItem>(result.getValue())
      return resultValue
    }
  }

  public class IRadialControllerMenuItemStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __883246520_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadialControllerMenuItemStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0cbb70be7e3e48bdbe042c7fcaa9c1ff")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadialControllerMenuItemStatics2(ptr: Pointer?): WithDefault =
        IRadialControllerMenuItemStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRadialControllerMenuItemStatics2 {
      val address = segment.toRawLongValue()
      return makeIRadialControllerMenuItemStatics2(Pointer(address))
    }

    public override fun toNative(obj: IRadialControllerMenuItemStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__883246520_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadialControllerMenuItemStatics2):
        Array<IRadialControllerMenuItemStatics2?> = (elements as
        Array<IRadialControllerMenuItemStatics2?>).castToImpl<IRadialControllerMenuItemStatics2,IRadialControllerMenuItemStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadialControllerMenuItemStatics2?> =
        arrayOfNulls<IRadialControllerMenuItemStatics2_Impl>(size) as
        Array<IRadialControllerMenuItemStatics2?>
  }
}
