package Microsoft.UI.Xaml.Media.Imaging

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(IBitmapImageStatics.ABI::class)
@Signature("{4bcf71a9-1897-51dc-8e3f-2c5c796d1cd9}")
@Guid("4bcf71a9189751dc8e3f2c5c796d1cd9")
@WinRTInterface("4bcf71a9189751dc8e3f2c5c796d1cd9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBitmapImageStatics.ByReference::class)
public interface IBitmapImageStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CreateOptionsProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_UriSourceProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_DecodePixelWidthProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_DecodePixelHeightProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_DecodePixelTypeProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_IsAnimatedBitmapProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_IsPlayingProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_AutoPlayProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBitmapImageStatics> {
    public override fun getValue() = ABI.makeIBitmapImageStatics(pointer.getPointer(0))

    public fun setValue(value: IBitmapImageStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBitmapImageStatics {
    public val __1327320288_Ptr: Pointer?

    public val _1327320288_VtblPtr: Pointer?
      get() = __1327320288_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CreateOptionsProperty(): DependencyProperty? {
      val fnPtr = _1327320288_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1327320288_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_UriSourceProperty(): DependencyProperty? {
      val fnPtr = _1327320288_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1327320288_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DecodePixelWidthProperty(): DependencyProperty? {
      val fnPtr = _1327320288_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1327320288_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DecodePixelHeightProperty(): DependencyProperty? {
      val fnPtr = _1327320288_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1327320288_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_DecodePixelTypeProperty(): DependencyProperty? {
      val fnPtr = _1327320288_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1327320288_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_IsAnimatedBitmapProperty(): DependencyProperty? {
      val fnPtr = _1327320288_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1327320288_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_IsPlayingProperty(): DependencyProperty? {
      val fnPtr = _1327320288_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1327320288_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_AutoPlayProperty(): DependencyProperty? {
      val fnPtr = _1327320288_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1327320288_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IBitmapImageStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1327320288_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBitmapImageStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4bcf71a9189751dc8e3f2c5c796d1cd9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBitmapImageStatics(ptr: Pointer?): WithDefault = IBitmapImageStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBitmapImageStatics {
      val address = segment.toRawLongValue()
      return makeIBitmapImageStatics(Pointer(address))
    }

    public override fun toNative(obj: IBitmapImageStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1327320288_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBitmapImageStatics): Array<IBitmapImageStatics?> =
        (elements as
        Array<IBitmapImageStatics?>).castToImpl<IBitmapImageStatics,IBitmapImageStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBitmapImageStatics?> =
        arrayOfNulls<IBitmapImageStatics_Impl>(size) as Array<IBitmapImageStatics?>
  }
}
