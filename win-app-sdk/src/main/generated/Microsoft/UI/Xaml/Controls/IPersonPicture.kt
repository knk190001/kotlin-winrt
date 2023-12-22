package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Media.ImageSource
import Windows.ApplicationModel.Contacts.Contact
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPersonPicture.ABI::class)
@Signature("{30ec982c-0efa-5538-a356-e9ebd5aa363c}")
@Guid("30ec982c0efa5538a356e9ebd5aa363c")
@WinRTInterface("30ec982c0efa5538a356e9ebd5aa363c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPersonPicture.ByReference::class)
public interface IPersonPicture : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BadgeNumber(): Int

  @InterfaceMethod(1)
  public fun put_BadgeNumber(value: Int): Unit

  @InterfaceMethod(2)
  public fun get_BadgeGlyph(): String?

  @InterfaceMethod(3)
  public fun put_BadgeGlyph(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_BadgeImageSource(): ImageSource?

  @InterfaceMethod(5)
  public fun put_BadgeImageSource(value: ImageSource?): Unit

  @InterfaceMethod(6)
  public fun get_BadgeText(): String?

  @InterfaceMethod(7)
  public fun put_BadgeText(value: String?): Unit

  @InterfaceMethod(8)
  public fun get_IsGroup(): Boolean

  @InterfaceMethod(9)
  public fun put_IsGroup(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_Contact(): Contact?

  @InterfaceMethod(11)
  public fun put_Contact(value: Contact?): Unit

  @InterfaceMethod(12)
  public fun get_DisplayName(): String?

  @InterfaceMethod(13)
  public fun put_DisplayName(value: String?): Unit

  @InterfaceMethod(14)
  public fun get_Initials(): String?

  @InterfaceMethod(15)
  public fun put_Initials(value: String?): Unit

  @InterfaceMethod(16)
  public fun get_PreferSmallImage(): Boolean

  @InterfaceMethod(17)
  public fun put_PreferSmallImage(value: Boolean): Unit

  @InterfaceMethod(18)
  public fun get_ProfilePicture(): ImageSource?

  @InterfaceMethod(19)
  public fun put_ProfilePicture(value: ImageSource?): Unit

  @InterfaceMethod(20)
  public fun get_TemplateSettings(): PersonPictureTemplateSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPersonPicture>
      {
    public override fun getValue() = ABI.makeIPersonPicture(pointer.getPointer(0))

    public fun setValue(value: IPersonPicture_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPersonPicture {
    public val __60166782_Ptr: Pointer?

    public val _60166782_VtblPtr: Pointer?
      get() = __60166782_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BadgeNumber(): Int {
      val fnPtr = _60166782_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__60166782_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_BadgeNumber(value: Int): Unit {
      val fnPtr = _60166782_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__60166782_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_BadgeGlyph(): String? {
      val fnPtr = _60166782_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__60166782_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_BadgeGlyph(value: String?): Unit {
      val fnPtr = _60166782_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__60166782_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_BadgeImageSource(): ImageSource? {
      val fnPtr = _60166782_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageSource>()
      val hr = fn.invokeHR(arrayOf(__60166782_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_BadgeImageSource(value: ImageSource?): Unit {
      val fnPtr = _60166782_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__60166782_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_BadgeText(): String? {
      val fnPtr = _60166782_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__60166782_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_BadgeText(value: String?): Unit {
      val fnPtr = _60166782_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__60166782_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_IsGroup(): Boolean {
      val fnPtr = _60166782_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__60166782_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_IsGroup(value: Boolean): Unit {
      val fnPtr = _60166782_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__60166782_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_Contact(): Contact? {
      val fnPtr = _60166782_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Contact>()
      val hr = fn.invokeHR(arrayOf(__60166782_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Contact>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_Contact(value: Contact?): Unit {
      val fnPtr = _60166782_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__60166782_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_DisplayName(): String? {
      val fnPtr = _60166782_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__60166782_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_DisplayName(value: String?): Unit {
      val fnPtr = _60166782_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__60166782_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_Initials(): String? {
      val fnPtr = _60166782_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__60166782_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_Initials(value: String?): Unit {
      val fnPtr = _60166782_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__60166782_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_PreferSmallImage(): Boolean {
      val fnPtr = _60166782_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__60166782_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun put_PreferSmallImage(value: Boolean): Unit {
      val fnPtr = _60166782_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__60166782_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_ProfilePicture(): ImageSource? {
      val fnPtr = _60166782_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageSource>()
      val hr = fn.invokeHR(arrayOf(__60166782_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_ProfilePicture(value: ImageSource?): Unit {
      val fnPtr = _60166782_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__60166782_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_TemplateSettings(): PersonPictureTemplateSettings? {
      val fnPtr = _60166782_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PersonPictureTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__60166782_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PersonPictureTemplateSettings>(result.getValue())
      return resultValue
    }
  }

  public class IPersonPicture_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __60166782_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPersonPicture, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("30ec982c0efa5538a356e9ebd5aa363c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPersonPicture(ptr: Pointer?): WithDefault = IPersonPicture_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPersonPicture {
      val address = segment.toRawLongValue()
      return makeIPersonPicture(Pointer(address))
    }

    public override fun toNative(obj: IPersonPicture): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__60166782_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPersonPicture): Array<IPersonPicture?> = (elements as
        Array<IPersonPicture?>).castToImpl<IPersonPicture,IPersonPicture_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPersonPicture?> =
        arrayOfNulls<IPersonPicture_Impl>(size) as Array<IPersonPicture?>
  }
}
