package Microsoft.UI.Xaml.Automation.Provider

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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStylesProvider.ABI::class)
@Signature("{d8895839-0048-54de-9c1f-152de6665e80}")
@Guid("d8895839004854de9c1f152de6665e80")
@WinRTInterface("d8895839004854de9c1f152de6665e80")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStylesProvider.ByReference::class)
public interface IStylesProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExtendedProperties(): String?

  @InterfaceMethod(1)
  public fun get_FillColor(): Color?

  @InterfaceMethod(2)
  public fun get_FillPatternColor(): Color?

  @InterfaceMethod(3)
  public fun get_FillPatternStyle(): String?

  @InterfaceMethod(4)
  public fun get_Shape(): String?

  @InterfaceMethod(5)
  public fun get_StyleId(): Int

  @InterfaceMethod(6)
  public fun get_StyleName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStylesProvider> {
    public override fun getValue() = ABI.makeIStylesProvider(pointer.getPointer(0))

    public fun setValue(value: IStylesProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStylesProvider {
    public val __1447199936_Ptr: Pointer?

    public val _1447199936_VtblPtr: Pointer?
      get() = __1447199936_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExtendedProperties(): String? {
      val fnPtr = _1447199936_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1447199936_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_FillColor(): Color? {
      val fnPtr = _1447199936_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__1447199936_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_FillPatternColor(): Color? {
      val fnPtr = _1447199936_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__1447199936_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_FillPatternStyle(): String? {
      val fnPtr = _1447199936_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1447199936_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Shape(): String? {
      val fnPtr = _1447199936_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1447199936_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_StyleId(): Int {
      val fnPtr = _1447199936_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1447199936_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_StyleName(): String? {
      val fnPtr = _1447199936_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1447199936_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IStylesProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1447199936_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStylesProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d8895839004854de9c1f152de6665e80")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStylesProvider(ptr: Pointer?): WithDefault = IStylesProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStylesProvider {
      val address = segment.toRawLongValue()
      return makeIStylesProvider(Pointer(address))
    }

    public override fun toNative(obj: IStylesProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1447199936_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStylesProvider): Array<IStylesProvider?> = (elements as
        Array<IStylesProvider?>).castToImpl<IStylesProvider,IStylesProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStylesProvider?> =
        arrayOfNulls<IStylesProvider_Impl>(size) as Array<IStylesProvider?>
  }
}
