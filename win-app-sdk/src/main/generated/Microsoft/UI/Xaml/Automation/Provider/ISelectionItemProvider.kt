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

@ABIMarker(ISelectionItemProvider.ABI::class)
@Signature("{c9dfdd81-d4ac-5d31-be7f-24fab16060e4}")
@Guid("c9dfdd81d4ac5d31be7f24fab16060e4")
@WinRTInterface("c9dfdd81d4ac5d31be7f24fab16060e4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISelectionItemProvider.ByReference::class)
public interface ISelectionItemProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsSelected(): Boolean

  @InterfaceMethod(1)
  public fun get_SelectionContainer(): IRawElementProviderSimple?

  @InterfaceMethod(2)
  public fun AddToSelection(): Unit

  @InterfaceMethod(3)
  public fun RemoveFromSelection(): Unit

  @InterfaceMethod(4)
  public fun Select(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISelectionItemProvider> {
    public override fun getValue() = ABI.makeISelectionItemProvider(pointer.getPointer(0))

    public fun setValue(value: ISelectionItemProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISelectionItemProvider {
    public val __1229913757_Ptr: Pointer?

    public val _1229913757_VtblPtr: Pointer?
      get() = __1229913757_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsSelected(): Boolean {
      val fnPtr = _1229913757_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1229913757_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_SelectionContainer(): IRawElementProviderSimple? {
      val fnPtr = _1229913757_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRawElementProviderSimple>()
      val hr = fn.invokeHR(arrayOf(__1229913757_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRawElementProviderSimple>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun AddToSelection(): Unit {
      val fnPtr = _1229913757_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1229913757_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun RemoveFromSelection(): Unit {
      val fnPtr = _1229913757_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1229913757_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun Select(): Unit {
      val fnPtr = _1229913757_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1229913757_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISelectionItemProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1229913757_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISelectionItemProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c9dfdd81d4ac5d31be7f24fab16060e4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISelectionItemProvider(ptr: Pointer?): WithDefault =
        ISelectionItemProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISelectionItemProvider {
      val address = segment.toRawLongValue()
      return makeISelectionItemProvider(Pointer(address))
    }

    public override fun toNative(obj: ISelectionItemProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1229913757_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISelectionItemProvider): Array<ISelectionItemProvider?> =
        (elements as
        Array<ISelectionItemProvider?>).castToImpl<ISelectionItemProvider,ISelectionItemProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISelectionItemProvider?> =
        arrayOfNulls<ISelectionItemProvider_Impl>(size) as Array<ISelectionItemProvider?>
  }
}
