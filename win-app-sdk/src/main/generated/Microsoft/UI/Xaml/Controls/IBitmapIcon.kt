package Microsoft.UI.Xaml.Controls

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBitmapIcon.ABI::class)
@Signature("{c370bc29-805b-5bad-b615-ec640e579dbb}")
@Guid("c370bc29805b5badb615ec640e579dbb")
@WinRTInterface("c370bc29805b5badb615ec640e579dbb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBitmapIcon.ByReference::class)
public interface IBitmapIcon : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UriSource(): Uri?

  @InterfaceMethod(1)
  public fun put_UriSource(value: Uri?): Unit

  @InterfaceMethod(2)
  public fun get_ShowAsMonochrome(): Boolean

  @InterfaceMethod(3)
  public fun put_ShowAsMonochrome(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBitmapIcon> {
    public override fun getValue() = ABI.makeIBitmapIcon(pointer.getPointer(0))

    public fun setValue(value: IBitmapIcon_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBitmapIcon {
    public val __1669591887_Ptr: Pointer?

    public val _1669591887_VtblPtr: Pointer?
      get() = __1669591887_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UriSource(): Uri? {
      val fnPtr = _1669591887_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1669591887_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_UriSource(value: Uri?): Unit {
      val fnPtr = _1669591887_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1669591887_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ShowAsMonochrome(): Boolean {
      val fnPtr = _1669591887_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1669591887_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_ShowAsMonochrome(value: Boolean): Unit {
      val fnPtr = _1669591887_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1669591887_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBitmapIcon_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1669591887_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBitmapIcon, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c370bc29805b5badb615ec640e579dbb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBitmapIcon(ptr: Pointer?): WithDefault = IBitmapIcon_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBitmapIcon {
      val address = segment.toRawLongValue()
      return makeIBitmapIcon(Pointer(address))
    }

    public override fun toNative(obj: IBitmapIcon): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1669591887_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBitmapIcon): Array<IBitmapIcon?> = (elements as
        Array<IBitmapIcon?>).castToImpl<IBitmapIcon,IBitmapIcon_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBitmapIcon?> =
        arrayOfNulls<IBitmapIcon_Impl>(size) as Array<IBitmapIcon?>
  }
}
