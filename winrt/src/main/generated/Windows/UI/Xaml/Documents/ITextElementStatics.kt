package Windows.UI.Xaml.Documents

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(ITextElementStatics.ABI::class)
@Signature("{0a2f9b98-6c03-4470-a79b-3298a10482ce}")
@Guid("0a2f9b986c034470a79b3298a10482ce")
@WinRTInterface("0a2f9b986c034470a79b3298a10482ce")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextElementStatics.ByReference::class)
public interface ITextElementStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FontSizeProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_FontFamilyProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_FontWeightProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_FontStyleProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_FontStretchProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_CharacterSpacingProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_ForegroundProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_LanguageProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextElementStatics> {
    public override fun getValue() = ABI.makeITextElementStatics(pointer.getPointer(0))

    public fun setValue(value: ITextElementStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextElementStatics {
    public val __1006116898_Ptr: Pointer?

    public val _1006116898_VtblPtr: Pointer?
      get() = __1006116898_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FontSizeProperty(): DependencyProperty? {
      val fnPtr = _1006116898_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1006116898_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_FontFamilyProperty(): DependencyProperty? {
      val fnPtr = _1006116898_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1006116898_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_FontWeightProperty(): DependencyProperty? {
      val fnPtr = _1006116898_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1006116898_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_FontStyleProperty(): DependencyProperty? {
      val fnPtr = _1006116898_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1006116898_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_FontStretchProperty(): DependencyProperty? {
      val fnPtr = _1006116898_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1006116898_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_CharacterSpacingProperty(): DependencyProperty? {
      val fnPtr = _1006116898_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1006116898_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_ForegroundProperty(): DependencyProperty? {
      val fnPtr = _1006116898_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1006116898_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_LanguageProperty(): DependencyProperty? {
      val fnPtr = _1006116898_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1006116898_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITextElementStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1006116898_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextElementStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0a2f9b986c034470a79b3298a10482ce")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextElementStatics(ptr: Pointer?): WithDefault = ITextElementStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextElementStatics {
      val address = segment.toRawLongValue()
      return makeITextElementStatics(Pointer(address))
    }

    public override fun toNative(obj: ITextElementStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1006116898_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextElementStatics): Array<ITextElementStatics?> =
        (elements as
        Array<ITextElementStatics?>).castToImpl<ITextElementStatics,ITextElementStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextElementStatics?> =
        arrayOfNulls<ITextElementStatics_Impl>(size) as Array<ITextElementStatics?>
  }
}
