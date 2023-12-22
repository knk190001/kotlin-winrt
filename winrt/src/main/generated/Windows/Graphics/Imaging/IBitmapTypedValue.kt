package Windows.Graphics.Imaging

import Windows.Foundation.PropertyType
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

@ABIMarker(IBitmapTypedValue.ABI::class)
@Signature("{cd8044a9-2443-4000-b0cd-79316c56f589}")
@Guid("cd8044a924434000b0cd79316c56f589")
@WinRTInterface("cd8044a924434000b0cd79316c56f589")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBitmapTypedValue.ByReference::class)
public interface IBitmapTypedValue : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Value(): IUnknown?

  @InterfaceMethod(1)
  public fun get_Type(): PropertyType?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBitmapTypedValue> {
    public override fun getValue() = ABI.makeIBitmapTypedValue(pointer.getPointer(0))

    public fun setValue(value: IBitmapTypedValue_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBitmapTypedValue {
    public val __492602113_Ptr: Pointer?

    public val _492602113_VtblPtr: Pointer?
      get() = __492602113_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Value(): IUnknown? {
      val fnPtr = _492602113_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__492602113_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Type(): PropertyType? {
      val fnPtr = _492602113_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PropertyType>()
      val hr = fn.invokeHR(arrayOf(__492602113_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PropertyType>(result.getValue())
      return resultValue
    }
  }

  public class IBitmapTypedValue_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __492602113_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBitmapTypedValue, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cd8044a924434000b0cd79316c56f589")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBitmapTypedValue(ptr: Pointer?): WithDefault = IBitmapTypedValue_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBitmapTypedValue {
      val address = segment.toRawLongValue()
      return makeIBitmapTypedValue(Pointer(address))
    }

    public override fun toNative(obj: IBitmapTypedValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__492602113_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBitmapTypedValue): Array<IBitmapTypedValue?> = (elements
        as Array<IBitmapTypedValue?>).castToImpl<IBitmapTypedValue,IBitmapTypedValue_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBitmapTypedValue?> =
        arrayOfNulls<IBitmapTypedValue_Impl>(size) as Array<IBitmapTypedValue?>
  }
}
