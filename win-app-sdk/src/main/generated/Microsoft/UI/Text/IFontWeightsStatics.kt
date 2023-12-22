package Microsoft.UI.Text

import Windows.UI.Text.FontWeight
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

@ABIMarker(IFontWeightsStatics.ABI::class)
@Signature("{cc390df6-76b0-5807-8b9d-e949a4e623ae}")
@Guid("cc390df676b058078b9de949a4e623ae")
@WinRTInterface("cc390df676b058078b9de949a4e623ae")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFontWeightsStatics.ByReference::class)
public interface IFontWeightsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Black(): FontWeight?

  @InterfaceMethod(1)
  public fun get_Bold(): FontWeight?

  @InterfaceMethod(2)
  public fun get_ExtraBlack(): FontWeight?

  @InterfaceMethod(3)
  public fun get_ExtraBold(): FontWeight?

  @InterfaceMethod(4)
  public fun get_ExtraLight(): FontWeight?

  @InterfaceMethod(5)
  public fun get_Light(): FontWeight?

  @InterfaceMethod(6)
  public fun get_Medium(): FontWeight?

  @InterfaceMethod(7)
  public fun get_Normal(): FontWeight?

  @InterfaceMethod(8)
  public fun get_SemiBold(): FontWeight?

  @InterfaceMethod(9)
  public fun get_SemiLight(): FontWeight?

  @InterfaceMethod(10)
  public fun get_Thin(): FontWeight?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFontWeightsStatics> {
    public override fun getValue() = ABI.makeIFontWeightsStatics(pointer.getPointer(0))

    public fun setValue(value: IFontWeightsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFontWeightsStatics {
    public val __1213613563_Ptr: Pointer?

    public val _1213613563_VtblPtr: Pointer?
      get() = __1213613563_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Black(): FontWeight? {
      val fnPtr = _1213613563_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontWeight>()
      val hr = fn.invokeHR(arrayOf(__1213613563_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontWeight>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Bold(): FontWeight? {
      val fnPtr = _1213613563_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontWeight>()
      val hr = fn.invokeHR(arrayOf(__1213613563_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontWeight>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ExtraBlack(): FontWeight? {
      val fnPtr = _1213613563_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontWeight>()
      val hr = fn.invokeHR(arrayOf(__1213613563_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontWeight>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ExtraBold(): FontWeight? {
      val fnPtr = _1213613563_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontWeight>()
      val hr = fn.invokeHR(arrayOf(__1213613563_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontWeight>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ExtraLight(): FontWeight? {
      val fnPtr = _1213613563_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontWeight>()
      val hr = fn.invokeHR(arrayOf(__1213613563_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontWeight>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Light(): FontWeight? {
      val fnPtr = _1213613563_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontWeight>()
      val hr = fn.invokeHR(arrayOf(__1213613563_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontWeight>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Medium(): FontWeight? {
      val fnPtr = _1213613563_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontWeight>()
      val hr = fn.invokeHR(arrayOf(__1213613563_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontWeight>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_Normal(): FontWeight? {
      val fnPtr = _1213613563_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontWeight>()
      val hr = fn.invokeHR(arrayOf(__1213613563_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontWeight>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_SemiBold(): FontWeight? {
      val fnPtr = _1213613563_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontWeight>()
      val hr = fn.invokeHR(arrayOf(__1213613563_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontWeight>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_SemiLight(): FontWeight? {
      val fnPtr = _1213613563_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontWeight>()
      val hr = fn.invokeHR(arrayOf(__1213613563_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontWeight>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_Thin(): FontWeight? {
      val fnPtr = _1213613563_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontWeight>()
      val hr = fn.invokeHR(arrayOf(__1213613563_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontWeight>(result.getValue())
      return resultValue
    }
  }

  public class IFontWeightsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1213613563_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFontWeightsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cc390df676b058078b9de949a4e623ae")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFontWeightsStatics(ptr: Pointer?): WithDefault = IFontWeightsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFontWeightsStatics {
      val address = segment.toRawLongValue()
      return makeIFontWeightsStatics(Pointer(address))
    }

    public override fun toNative(obj: IFontWeightsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1213613563_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFontWeightsStatics): Array<IFontWeightsStatics?> =
        (elements as
        Array<IFontWeightsStatics?>).castToImpl<IFontWeightsStatics,IFontWeightsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFontWeightsStatics?> =
        arrayOfNulls<IFontWeightsStatics_Impl>(size) as Array<IFontWeightsStatics?>
  }
}
