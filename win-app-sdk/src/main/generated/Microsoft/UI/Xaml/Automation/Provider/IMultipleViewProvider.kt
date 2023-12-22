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

@ABIMarker(IMultipleViewProvider.ABI::class)
@Signature("{60be5484-3d8f-51fd-beab-423422ee1e03}")
@Guid("60be54843d8f51fdbeab423422ee1e03")
@WinRTInterface("60be54843d8f51fdbeab423422ee1e03")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMultipleViewProvider.ByReference::class)
public interface IMultipleViewProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CurrentView(): Int

  @InterfaceMethod(1)
  public fun GetSupportedViews(): Array<Int>?

  @InterfaceMethod(2)
  public fun GetViewName(viewId: Int): String?

  @InterfaceMethod(3)
  public fun SetCurrentView(viewId: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMultipleViewProvider> {
    public override fun getValue() = ABI.makeIMultipleViewProvider(pointer.getPointer(0))

    public fun setValue(value: IMultipleViewProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMultipleViewProvider {
    public val __1733605389_Ptr: Pointer?

    public val _1733605389_VtblPtr: Pointer?
      get() = __1733605389_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CurrentView(): Int {
      val fnPtr = _1733605389_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1733605389_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun GetSupportedViews(): Array<Int>? {
      val fnPtr = _1733605389_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makePrimitiveOutArray<Int>()
      val hr = fn.invokeHR(arrayOf(__1733605389_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetViewName(viewId: Int): String? {
      val fnPtr = _1733605389_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1733605389_Ptr, viewId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SetCurrentView(viewId: Int): Unit {
      val fnPtr = _1733605389_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1733605389_Ptr, viewId,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMultipleViewProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1733605389_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMultipleViewProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("60be54843d8f51fdbeab423422ee1e03")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMultipleViewProvider(ptr: Pointer?): WithDefault =
        IMultipleViewProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMultipleViewProvider {
      val address = segment.toRawLongValue()
      return makeIMultipleViewProvider(Pointer(address))
    }

    public override fun toNative(obj: IMultipleViewProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1733605389_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMultipleViewProvider): Array<IMultipleViewProvider?> =
        (elements as
        Array<IMultipleViewProvider?>).castToImpl<IMultipleViewProvider,IMultipleViewProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMultipleViewProvider?> =
        arrayOfNulls<IMultipleViewProvider_Impl>(size) as Array<IMultipleViewProvider?>
  }
}
