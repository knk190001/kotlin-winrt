package Windows.UI.Xaml.Controls

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

@ABIMarker(IAutoSuggestBox4.ABI::class)
@Signature("{c22df897-a3e8-5051-b3cc-b5f0f5262950}")
@Guid("c22df897a3e85051b3ccb5f0f5262950")
@WinRTInterface("c22df897a3e85051b3ccb5f0f5262950")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutoSuggestBox4.ByReference::class)
public interface IAutoSuggestBox4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Description(): IUnknown?

  @InterfaceMethod(1)
  public fun put_Description(value: IUnknown?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutoSuggestBox4> {
    public override fun getValue() = ABI.makeIAutoSuggestBox4(pointer.getPointer(0))

    public fun setValue(value: IAutoSuggestBox4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutoSuggestBox4 {
    public val __1925569698_Ptr: Pointer?

    public val _1925569698_VtblPtr: Pointer?
      get() = __1925569698_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Description(): IUnknown? {
      val fnPtr = _1925569698_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1925569698_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Description(value: IUnknown?): Unit {
      val fnPtr = _1925569698_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1925569698_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAutoSuggestBox4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1925569698_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutoSuggestBox4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c22df897a3e85051b3ccb5f0f5262950")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutoSuggestBox4(ptr: Pointer?): WithDefault = IAutoSuggestBox4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutoSuggestBox4 {
      val address = segment.toRawLongValue()
      return makeIAutoSuggestBox4(Pointer(address))
    }

    public override fun toNative(obj: IAutoSuggestBox4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1925569698_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutoSuggestBox4): Array<IAutoSuggestBox4?> = (elements as
        Array<IAutoSuggestBox4?>).castToImpl<IAutoSuggestBox4,IAutoSuggestBox4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutoSuggestBox4?> =
        arrayOfNulls<IAutoSuggestBox4_Impl>(size) as Array<IAutoSuggestBox4?>
  }
}
