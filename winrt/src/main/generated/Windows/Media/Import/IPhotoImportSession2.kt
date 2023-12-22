package Windows.Media.Import

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

@ABIMarker(IPhotoImportSession2.ABI::class)
@Signature("{2a526710-3ec6-469d-a375-2b9f4785391e}")
@Guid("2a5267103ec6469da3752b9f4785391e")
@WinRTInterface("2a5267103ec6469da3752b9f4785391e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhotoImportSession2.ByReference::class)
public interface IPhotoImportSession2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_SubfolderDateFormat(value: PhotoImportSubfolderDateFormat?): Unit

  @InterfaceMethod(1)
  public fun get_SubfolderDateFormat(): PhotoImportSubfolderDateFormat?

  @InterfaceMethod(2)
  public fun put_RememberDeselectedItems(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_RememberDeselectedItems(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhotoImportSession2> {
    public override fun getValue() = ABI.makeIPhotoImportSession2(pointer.getPointer(0))

    public fun setValue(value: IPhotoImportSession2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhotoImportSession2 {
    public val __696688836_Ptr: Pointer?

    public val _696688836_VtblPtr: Pointer?
      get() = __696688836_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_SubfolderDateFormat(value: PhotoImportSubfolderDateFormat?): Unit {
      val fnPtr = _696688836_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__696688836_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_SubfolderDateFormat(): PhotoImportSubfolderDateFormat? {
      val fnPtr = _696688836_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhotoImportSubfolderDateFormat>()
      val hr = fn.invokeHR(arrayOf(__696688836_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhotoImportSubfolderDateFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_RememberDeselectedItems(value: Boolean): Unit {
      val fnPtr = _696688836_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__696688836_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_RememberDeselectedItems(): Boolean {
      val fnPtr = _696688836_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__696688836_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPhotoImportSession2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __696688836_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhotoImportSession2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2a5267103ec6469da3752b9f4785391e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhotoImportSession2(ptr: Pointer?): WithDefault = IPhotoImportSession2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhotoImportSession2 {
      val address = segment.toRawLongValue()
      return makeIPhotoImportSession2(Pointer(address))
    }

    public override fun toNative(obj: IPhotoImportSession2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__696688836_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhotoImportSession2): Array<IPhotoImportSession2?> =
        (elements as
        Array<IPhotoImportSession2?>).castToImpl<IPhotoImportSession2,IPhotoImportSession2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhotoImportSession2?> =
        arrayOfNulls<IPhotoImportSession2_Impl>(size) as Array<IPhotoImportSession2?>
  }
}
