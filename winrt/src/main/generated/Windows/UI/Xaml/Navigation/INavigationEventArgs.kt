package Windows.UI.Xaml.Navigation

import Windows.Foundation.Uri
import Windows.UI.Xaml.Interop.TypeName
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

@ABIMarker(INavigationEventArgs.ABI::class)
@Signature("{b6aa9834-6691-44d1-bdf7-58820c27b0d0}")
@Guid("b6aa9834669144d1bdf758820c27b0d0")
@WinRTInterface("b6aa9834669144d1bdf758820c27b0d0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationEventArgs.ByReference::class)
public interface INavigationEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Content(): IUnknown?

  @InterfaceMethod(1)
  public fun get_Parameter(): IUnknown?

  @InterfaceMethod(2)
  public fun get_SourcePageType(): TypeName?

  @InterfaceMethod(3)
  public fun get_NavigationMode(): NavigationMode?

  @InterfaceMethod(4)
  public fun get_Uri(): Uri?

  @InterfaceMethod(5)
  public fun put_Uri(value: Uri?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationEventArgs> {
    public override fun getValue() = ABI.makeINavigationEventArgs(pointer.getPointer(0))

    public fun setValue(value: INavigationEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationEventArgs {
    public val __551908325_Ptr: Pointer?

    public val _551908325_VtblPtr: Pointer?
      get() = __551908325_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Content(): IUnknown? {
      val fnPtr = _551908325_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__551908325_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Parameter(): IUnknown? {
      val fnPtr = _551908325_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__551908325_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SourcePageType(): TypeName? {
      val fnPtr = _551908325_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TypeName>()
      val hr = fn.invokeHR(arrayOf(__551908325_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TypeName>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_NavigationMode(): NavigationMode? {
      val fnPtr = _551908325_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationMode>()
      val hr = fn.invokeHR(arrayOf(__551908325_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Uri(): Uri? {
      val fnPtr = _551908325_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__551908325_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Uri(value: Uri?): Unit {
      val fnPtr = _551908325_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__551908325_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class INavigationEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __551908325_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b6aa9834669144d1bdf758820c27b0d0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationEventArgs(ptr: Pointer?): WithDefault = INavigationEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationEventArgs {
      val address = segment.toRawLongValue()
      return makeINavigationEventArgs(Pointer(address))
    }

    public override fun toNative(obj: INavigationEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__551908325_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationEventArgs): Array<INavigationEventArgs?> =
        (elements as
        Array<INavigationEventArgs?>).castToImpl<INavigationEventArgs,INavigationEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationEventArgs?> =
        arrayOfNulls<INavigationEventArgs_Impl>(size) as Array<INavigationEventArgs?>
  }
}
