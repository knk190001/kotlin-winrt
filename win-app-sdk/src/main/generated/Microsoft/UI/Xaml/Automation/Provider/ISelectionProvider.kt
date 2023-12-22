package Microsoft.UI.Xaml.Automation.Provider

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISelectionProvider.ABI::class)
@Signature("{80d56d4e-0052-541f-9411-9d1778b3bfca}")
@Guid("80d56d4e0052541f94119d1778b3bfca")
@WinRTInterface("80d56d4e0052541f94119d1778b3bfca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISelectionProvider.ByReference::class)
public interface ISelectionProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanSelectMultiple(): Boolean

  @InterfaceMethod(1)
  public fun get_IsSelectionRequired(): Boolean

  @InterfaceMethod(2)
  public fun GetSelection(): Array<IRawElementProviderSimple?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISelectionProvider> {
    public override fun getValue() = ABI.makeISelectionProvider(pointer.getPointer(0))

    public fun setValue(value: ISelectionProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISelectionProvider {
    public val __95200080_Ptr: Pointer?

    public val _95200080_VtblPtr: Pointer?
      get() = __95200080_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanSelectMultiple(): Boolean {
      val fnPtr = _95200080_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__95200080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsSelectionRequired(): Boolean {
      val fnPtr = _95200080_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__95200080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun GetSelection(): Array<IRawElementProviderSimple?>? {
      val fnPtr = _95200080_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<IRawElementProviderSimple>()
      val hr = fn.invokeHR(arrayOf(__95200080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }
  }

  public class ISelectionProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __95200080_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISelectionProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("80d56d4e0052541f94119d1778b3bfca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISelectionProvider(ptr: Pointer?): WithDefault = ISelectionProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISelectionProvider {
      val address = segment.toRawLongValue()
      return makeISelectionProvider(Pointer(address))
    }

    public override fun toNative(obj: ISelectionProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__95200080_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISelectionProvider): Array<ISelectionProvider?> =
        (elements as
        Array<ISelectionProvider?>).castToImpl<ISelectionProvider,ISelectionProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISelectionProvider?> =
        arrayOfNulls<ISelectionProvider_Impl>(size) as Array<ISelectionProvider?>
  }
}
