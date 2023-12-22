package Windows.ApplicationModel.Contacts

import Windows.UI.ViewManagement.ViewSizePreference
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

@ABIMarker(IFullContactCardOptions.ABI::class)
@Signature("{8744436c-5cf9-4683-bdca-a1fdebf8dbce}")
@Guid("8744436c5cf94683bdcaa1fdebf8dbce")
@WinRTInterface("8744436c5cf94683bdcaa1fdebf8dbce")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFullContactCardOptions.ByReference::class)
public interface IFullContactCardOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DesiredRemainingView(): ViewSizePreference?

  @InterfaceMethod(1)
  public fun put_DesiredRemainingView(value: ViewSizePreference?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFullContactCardOptions> {
    public override fun getValue() = ABI.makeIFullContactCardOptions(pointer.getPointer(0))

    public fun setValue(value: IFullContactCardOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFullContactCardOptions {
    public val __428743159_Ptr: Pointer?

    public val _428743159_VtblPtr: Pointer?
      get() = __428743159_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DesiredRemainingView(): ViewSizePreference? {
      val fnPtr = _428743159_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ViewSizePreference>()
      val hr = fn.invokeHR(arrayOf(__428743159_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ViewSizePreference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DesiredRemainingView(value: ViewSizePreference?): Unit {
      val fnPtr = _428743159_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__428743159_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFullContactCardOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __428743159_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFullContactCardOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8744436c5cf94683bdcaa1fdebf8dbce")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFullContactCardOptions(ptr: Pointer?): WithDefault =
        IFullContactCardOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFullContactCardOptions {
      val address = segment.toRawLongValue()
      return makeIFullContactCardOptions(Pointer(address))
    }

    public override fun toNative(obj: IFullContactCardOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__428743159_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFullContactCardOptions): Array<IFullContactCardOptions?>
        = (elements as
        Array<IFullContactCardOptions?>).castToImpl<IFullContactCardOptions,IFullContactCardOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFullContactCardOptions?> =
        arrayOfNulls<IFullContactCardOptions_Impl>(size) as Array<IFullContactCardOptions?>
  }
}
