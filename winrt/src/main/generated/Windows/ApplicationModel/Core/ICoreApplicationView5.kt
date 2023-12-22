package Windows.ApplicationModel.Core

import Windows.Foundation.Collections.IPropertySet
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

@ABIMarker(ICoreApplicationView5.ABI::class)
@Signature("{2bc095a8-8ef0-446d-9e60-3a3e0428c671}")
@Guid("2bc095a88ef0446d9e603a3e0428c671")
@WinRTInterface("2bc095a88ef0446d9e603a3e0428c671")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreApplicationView5.ByReference::class)
public interface ICoreApplicationView5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Properties(): IPropertySet?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreApplicationView5> {
    public override fun getValue() = ABI.makeICoreApplicationView5(pointer.getPointer(0))

    public fun setValue(value: ICoreApplicationView5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreApplicationView5 {
    public val __503948959_Ptr: Pointer?

    public val _503948959_VtblPtr: Pointer?
      get() = __503948959_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Properties(): IPropertySet? {
      val fnPtr = _503948959_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IPropertySet>()
      val hr = fn.invokeHR(arrayOf(__503948959_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IPropertySet>(result.getValue())
      return resultValue
    }
  }

  public class ICoreApplicationView5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __503948959_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreApplicationView5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2bc095a88ef0446d9e603a3e0428c671")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreApplicationView5(ptr: Pointer?): WithDefault =
        ICoreApplicationView5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreApplicationView5 {
      val address = segment.toRawLongValue()
      return makeICoreApplicationView5(Pointer(address))
    }

    public override fun toNative(obj: ICoreApplicationView5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__503948959_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreApplicationView5): Array<ICoreApplicationView5?> =
        (elements as
        Array<ICoreApplicationView5?>).castToImpl<ICoreApplicationView5,ICoreApplicationView5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreApplicationView5?> =
        arrayOfNulls<ICoreApplicationView5_Impl>(size) as Array<ICoreApplicationView5?>
  }
}
