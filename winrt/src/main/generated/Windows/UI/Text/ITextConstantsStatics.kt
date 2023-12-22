package Windows.UI.Text

import Windows.UI.Color
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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITextConstantsStatics.ABI::class)
@Signature("{779e7c33-189d-4bfa-97c8-10db135d976e}")
@Guid("779e7c33189d4bfa97c810db135d976e")
@WinRTInterface("779e7c33189d4bfa97c810db135d976e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextConstantsStatics.ByReference::class)
public interface ITextConstantsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AutoColor(): Color?

  @InterfaceMethod(1)
  public fun get_MinUnitCount(): Int

  @InterfaceMethod(2)
  public fun get_MaxUnitCount(): Int

  @InterfaceMethod(3)
  public fun get_UndefinedColor(): Color?

  @InterfaceMethod(4)
  public fun get_UndefinedFloatValue(): Float

  @InterfaceMethod(5)
  public fun get_UndefinedInt32Value(): Int

  @InterfaceMethod(6)
  public fun get_UndefinedFontStretch(): FontStretch?

  @InterfaceMethod(7)
  public fun get_UndefinedFontStyle(): FontStyle?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextConstantsStatics> {
    public override fun getValue() = ABI.makeITextConstantsStatics(pointer.getPointer(0))

    public fun setValue(value: ITextConstantsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextConstantsStatics {
    public val __268708432_Ptr: Pointer?

    public val _268708432_VtblPtr: Pointer?
      get() = __268708432_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AutoColor(): Color? {
      val fnPtr = _268708432_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__268708432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MinUnitCount(): Int {
      val fnPtr = _268708432_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__268708432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_MaxUnitCount(): Int {
      val fnPtr = _268708432_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__268708432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_UndefinedColor(): Color? {
      val fnPtr = _268708432_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__268708432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_UndefinedFloatValue(): Float {
      val fnPtr = _268708432_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__268708432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_UndefinedInt32Value(): Int {
      val fnPtr = _268708432_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__268708432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_UndefinedFontStretch(): FontStretch? {
      val fnPtr = _268708432_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontStretch>()
      val hr = fn.invokeHR(arrayOf(__268708432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontStretch>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_UndefinedFontStyle(): FontStyle? {
      val fnPtr = _268708432_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontStyle>()
      val hr = fn.invokeHR(arrayOf(__268708432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontStyle>(result.getValue())
      return resultValue
    }
  }

  public class ITextConstantsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __268708432_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextConstantsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("779e7c33189d4bfa97c810db135d976e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextConstantsStatics(ptr: Pointer?): WithDefault =
        ITextConstantsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextConstantsStatics {
      val address = segment.toRawLongValue()
      return makeITextConstantsStatics(Pointer(address))
    }

    public override fun toNative(obj: ITextConstantsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__268708432_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextConstantsStatics): Array<ITextConstantsStatics?> =
        (elements as
        Array<ITextConstantsStatics?>).castToImpl<ITextConstantsStatics,ITextConstantsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextConstantsStatics?> =
        arrayOfNulls<ITextConstantsStatics_Impl>(size) as Array<ITextConstantsStatics?>
  }
}
