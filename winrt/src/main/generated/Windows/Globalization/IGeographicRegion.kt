package Windows.Globalization

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IGeographicRegion.ABI::class)
@Signature("{01e9a621-4a64-4ed9-954f-9edeb07bd903}")
@Guid("01e9a6214a644ed9954f9edeb07bd903")
@WinRTInterface("01e9a6214a644ed9954f9edeb07bd903")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeographicRegion.ByReference::class)
public interface IGeographicRegion : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Code(): String?

  @InterfaceMethod(1)
  public fun get_CodeTwoLetter(): String?

  @InterfaceMethod(2)
  public fun get_CodeThreeLetter(): String?

  @InterfaceMethod(3)
  public fun get_CodeThreeDigit(): String?

  @InterfaceMethod(4)
  public fun get_DisplayName(): String?

  @InterfaceMethod(5)
  public fun get_NativeName(): String?

  @InterfaceMethod(6)
  public fun get_CurrenciesInUse(): IVectorView<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeographicRegion> {
    public override fun getValue() = ABI.makeIGeographicRegion(pointer.getPointer(0))

    public fun setValue(value: IGeographicRegion_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeographicRegion {
    public val __764805758_Ptr: Pointer?

    public val _764805758_VtblPtr: Pointer?
      get() = __764805758_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Code(): String? {
      val fnPtr = _764805758_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__764805758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CodeTwoLetter(): String? {
      val fnPtr = _764805758_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__764805758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CodeThreeLetter(): String? {
      val fnPtr = _764805758_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__764805758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CodeThreeDigit(): String? {
      val fnPtr = _764805758_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__764805758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_DisplayName(): String? {
      val fnPtr = _764805758_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__764805758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_NativeName(): String? {
      val fnPtr = _764805758_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__764805758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_CurrenciesInUse(): IVectorView<String?>? {
      val fnPtr = _764805758_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__764805758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }
  }

  public class IGeographicRegion_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __764805758_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeographicRegion, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("01e9a6214a644ed9954f9edeb07bd903")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeographicRegion(ptr: Pointer?): WithDefault = IGeographicRegion_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeographicRegion {
      val address = segment.toRawLongValue()
      return makeIGeographicRegion(Pointer(address))
    }

    public override fun toNative(obj: IGeographicRegion): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__764805758_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeographicRegion): Array<IGeographicRegion?> = (elements
        as Array<IGeographicRegion?>).castToImpl<IGeographicRegion,IGeographicRegion_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeographicRegion?> =
        arrayOfNulls<IGeographicRegion_Impl>(size) as Array<IGeographicRegion?>
  }
}
