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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDropTargetProvider.ABI::class)
@Signature("{9b2a9f3d-bbb1-510d-99e8-0e0ae14a6e3b}")
@Guid("9b2a9f3dbbb1510d99e80e0ae14a6e3b")
@WinRTInterface("9b2a9f3dbbb1510d99e80e0ae14a6e3b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDropTargetProvider.ByReference::class)
public interface IDropTargetProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DropEffect(): String?

  @InterfaceMethod(1)
  public fun get_DropEffects(): Array<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDropTargetProvider> {
    public override fun getValue() = ABI.makeIDropTargetProvider(pointer.getPointer(0))

    public fun setValue(value: IDropTargetProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDropTargetProvider {
    public val __508378302_Ptr: Pointer?

    public val _508378302_VtblPtr: Pointer?
      get() = __508378302_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DropEffect(): String? {
      val fnPtr = _508378302_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__508378302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DropEffects(): Array<String?>? {
      val fnPtr = _508378302_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<String>()
      val hr = fn.invokeHR(arrayOf(__508378302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }
  }

  public class IDropTargetProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __508378302_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDropTargetProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9b2a9f3dbbb1510d99e80e0ae14a6e3b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDropTargetProvider(ptr: Pointer?): WithDefault = IDropTargetProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDropTargetProvider {
      val address = segment.toRawLongValue()
      return makeIDropTargetProvider(Pointer(address))
    }

    public override fun toNative(obj: IDropTargetProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__508378302_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDropTargetProvider): Array<IDropTargetProvider?> =
        (elements as
        Array<IDropTargetProvider?>).castToImpl<IDropTargetProvider,IDropTargetProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDropTargetProvider?> =
        arrayOfNulls<IDropTargetProvider_Impl>(size) as Array<IDropTargetProvider?>
  }
}
