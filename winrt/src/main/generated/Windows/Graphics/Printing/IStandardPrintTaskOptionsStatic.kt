package Windows.Graphics.Printing

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

@ABIMarker(IStandardPrintTaskOptionsStatic.ABI::class)
@Signature("{b4483d26-0dd0-4cd4-baff-930fc7d6a574}")
@Guid("b4483d260dd04cd4baff930fc7d6a574")
@WinRTInterface("b4483d260dd04cd4baff930fc7d6a574")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStandardPrintTaskOptionsStatic.ByReference::class)
public interface IStandardPrintTaskOptionsStatic : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MediaSize(): String?

  @InterfaceMethod(1)
  public fun get_MediaType(): String?

  @InterfaceMethod(2)
  public fun get_Orientation(): String?

  @InterfaceMethod(3)
  public fun get_PrintQuality(): String?

  @InterfaceMethod(4)
  public fun get_ColorMode(): String?

  @InterfaceMethod(5)
  public fun get_Duplex(): String?

  @InterfaceMethod(6)
  public fun get_Collation(): String?

  @InterfaceMethod(7)
  public fun get_Staple(): String?

  @InterfaceMethod(8)
  public fun get_HolePunch(): String?

  @InterfaceMethod(9)
  public fun get_Binding(): String?

  @InterfaceMethod(10)
  public fun get_Copies(): String?

  @InterfaceMethod(11)
  public fun get_NUp(): String?

  @InterfaceMethod(12)
  public fun get_InputBin(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStandardPrintTaskOptionsStatic> {
    public override fun getValue() = ABI.makeIStandardPrintTaskOptionsStatic(pointer.getPointer(0))

    public fun setValue(value: IStandardPrintTaskOptionsStatic_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStandardPrintTaskOptionsStatic {
    public val __570119469_Ptr: Pointer?

    public val _570119469_VtblPtr: Pointer?
      get() = __570119469_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MediaSize(): String? {
      val fnPtr = _570119469_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__570119469_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MediaType(): String? {
      val fnPtr = _570119469_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__570119469_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Orientation(): String? {
      val fnPtr = _570119469_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__570119469_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_PrintQuality(): String? {
      val fnPtr = _570119469_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__570119469_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ColorMode(): String? {
      val fnPtr = _570119469_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__570119469_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Duplex(): String? {
      val fnPtr = _570119469_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__570119469_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Collation(): String? {
      val fnPtr = _570119469_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__570119469_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_Staple(): String? {
      val fnPtr = _570119469_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__570119469_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_HolePunch(): String? {
      val fnPtr = _570119469_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__570119469_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_Binding(): String? {
      val fnPtr = _570119469_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__570119469_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_Copies(): String? {
      val fnPtr = _570119469_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__570119469_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_NUp(): String? {
      val fnPtr = _570119469_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__570119469_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_InputBin(): String? {
      val fnPtr = _570119469_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__570119469_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IStandardPrintTaskOptionsStatic_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __570119469_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStandardPrintTaskOptionsStatic, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b4483d260dd04cd4baff930fc7d6a574")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStandardPrintTaskOptionsStatic(ptr: Pointer?): WithDefault =
        IStandardPrintTaskOptionsStatic_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStandardPrintTaskOptionsStatic {
      val address = segment.toRawLongValue()
      return makeIStandardPrintTaskOptionsStatic(Pointer(address))
    }

    public override fun toNative(obj: IStandardPrintTaskOptionsStatic): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__570119469_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStandardPrintTaskOptionsStatic):
        Array<IStandardPrintTaskOptionsStatic?> = (elements as
        Array<IStandardPrintTaskOptionsStatic?>).castToImpl<IStandardPrintTaskOptionsStatic,IStandardPrintTaskOptionsStatic_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStandardPrintTaskOptionsStatic?> =
        arrayOfNulls<IStandardPrintTaskOptionsStatic_Impl>(size) as
        Array<IStandardPrintTaskOptionsStatic?>
  }
}
