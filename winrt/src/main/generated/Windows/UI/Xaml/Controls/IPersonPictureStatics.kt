package Windows.UI.Xaml.Controls

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

@ABIMarker(IPersonPictureStatics.ABI::class)
@Signature("{dbec0982-3c10-4639-9614-aa5b7cdc32ca}")
@Guid("dbec09823c1046399614aa5b7cdc32ca")
@WinRTInterface("dbec09823c1046399614aa5b7cdc32ca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPersonPictureStatics.ByReference::class)
public interface IPersonPictureStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BadgeNumberProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_BadgeGlyphProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_BadgeImageSourceProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_BadgeTextProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_IsGroupProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_ContactProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_DisplayNameProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_InitialsProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_PreferSmallImageProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_ProfilePictureProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPersonPictureStatics> {
    public override fun getValue() = ABI.makeIPersonPictureStatics(pointer.getPointer(0))

    public fun setValue(value: IPersonPictureStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPersonPictureStatics {
    public val __1051452856_Ptr: Pointer?

    public val _1051452856_VtblPtr: Pointer?
      get() = __1051452856_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BadgeNumberProperty(): DependencyProperty? {
      val fnPtr = _1051452856_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1051452856_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_BadgeGlyphProperty(): DependencyProperty? {
      val fnPtr = _1051452856_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1051452856_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_BadgeImageSourceProperty(): DependencyProperty? {
      val fnPtr = _1051452856_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1051452856_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_BadgeTextProperty(): DependencyProperty? {
      val fnPtr = _1051452856_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1051452856_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_IsGroupProperty(): DependencyProperty? {
      val fnPtr = _1051452856_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1051452856_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ContactProperty(): DependencyProperty? {
      val fnPtr = _1051452856_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1051452856_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_DisplayNameProperty(): DependencyProperty? {
      val fnPtr = _1051452856_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1051452856_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_InitialsProperty(): DependencyProperty? {
      val fnPtr = _1051452856_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1051452856_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_PreferSmallImageProperty(): DependencyProperty? {
      val fnPtr = _1051452856_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1051452856_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_ProfilePictureProperty(): DependencyProperty? {
      val fnPtr = _1051452856_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1051452856_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPersonPictureStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1051452856_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPersonPictureStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dbec09823c1046399614aa5b7cdc32ca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPersonPictureStatics(ptr: Pointer?): WithDefault =
        IPersonPictureStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPersonPictureStatics {
      val address = segment.toRawLongValue()
      return makeIPersonPictureStatics(Pointer(address))
    }

    public override fun toNative(obj: IPersonPictureStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1051452856_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPersonPictureStatics): Array<IPersonPictureStatics?> =
        (elements as
        Array<IPersonPictureStatics?>).castToImpl<IPersonPictureStatics,IPersonPictureStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPersonPictureStatics?> =
        arrayOfNulls<IPersonPictureStatics_Impl>(size) as Array<IPersonPictureStatics?>
  }
}
