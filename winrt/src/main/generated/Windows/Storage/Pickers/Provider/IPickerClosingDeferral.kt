package Windows.Storage.Pickers.Provider

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

@ABIMarker(IPickerClosingDeferral.ABI::class)
@Signature("{7af7f71e-1a67-4a31-ae80-e907708a619b}")
@Guid("7af7f71e1a674a31ae80e907708a619b")
@WinRTInterface("7af7f71e1a674a31ae80e907708a619b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPickerClosingDeferral.ByReference::class)
public interface IPickerClosingDeferral : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPickerClosingDeferral> {
    public override fun getValue() = ABI.makeIPickerClosingDeferral(pointer.getPointer(0))

    public fun setValue(value: IPickerClosingDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPickerClosingDeferral {
    public val __813433151_Ptr: Pointer?

    public val _813433151_VtblPtr: Pointer?
      get() = __813433151_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(): Unit {
      val fnPtr = _813433151_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__813433151_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPickerClosingDeferral_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __813433151_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPickerClosingDeferral, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7af7f71e1a674a31ae80e907708a619b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPickerClosingDeferral(ptr: Pointer?): WithDefault =
        IPickerClosingDeferral_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPickerClosingDeferral {
      val address = segment.toRawLongValue()
      return makeIPickerClosingDeferral(Pointer(address))
    }

    public override fun toNative(obj: IPickerClosingDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__813433151_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPickerClosingDeferral): Array<IPickerClosingDeferral?> =
        (elements as
        Array<IPickerClosingDeferral?>).castToImpl<IPickerClosingDeferral,IPickerClosingDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPickerClosingDeferral?> =
        arrayOfNulls<IPickerClosingDeferral_Impl>(size) as Array<IPickerClosingDeferral?>
  }
}
