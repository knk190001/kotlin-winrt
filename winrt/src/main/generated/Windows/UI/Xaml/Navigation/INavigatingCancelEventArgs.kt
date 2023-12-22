package Windows.UI.Xaml.Navigation

import Windows.UI.Xaml.Interop.TypeName
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

@ABIMarker(INavigatingCancelEventArgs.ABI::class)
@Signature("{fd1d67ae-eafb-4079-be80-6dc92a03aedf}")
@Guid("fd1d67aeeafb4079be806dc92a03aedf")
@WinRTInterface("fd1d67aeeafb4079be806dc92a03aedf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigatingCancelEventArgs.ByReference::class)
public interface INavigatingCancelEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Cancel(): Boolean

  @InterfaceMethod(1)
  public fun put_Cancel(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_NavigationMode(): NavigationMode?

  @InterfaceMethod(3)
  public fun get_SourcePageType(): TypeName?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigatingCancelEventArgs> {
    public override fun getValue() = ABI.makeINavigatingCancelEventArgs(pointer.getPointer(0))

    public fun setValue(value: INavigatingCancelEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigatingCancelEventArgs {
    public val __1775856881_Ptr: Pointer?

    public val _1775856881_VtblPtr: Pointer?
      get() = __1775856881_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Cancel(): Boolean {
      val fnPtr = _1775856881_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1775856881_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Cancel(value: Boolean): Unit {
      val fnPtr = _1775856881_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1775856881_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_NavigationMode(): NavigationMode? {
      val fnPtr = _1775856881_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationMode>()
      val hr = fn.invokeHR(arrayOf(__1775856881_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SourcePageType(): TypeName? {
      val fnPtr = _1775856881_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TypeName>()
      val hr = fn.invokeHR(arrayOf(__1775856881_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TypeName>(result.getValue())
      return resultValue
    }
  }

  public class INavigatingCancelEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1775856881_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigatingCancelEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fd1d67aeeafb4079be806dc92a03aedf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigatingCancelEventArgs(ptr: Pointer?): WithDefault =
        INavigatingCancelEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigatingCancelEventArgs {
      val address = segment.toRawLongValue()
      return makeINavigatingCancelEventArgs(Pointer(address))
    }

    public override fun toNative(obj: INavigatingCancelEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1775856881_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigatingCancelEventArgs):
        Array<INavigatingCancelEventArgs?> = (elements as
        Array<INavigatingCancelEventArgs?>).castToImpl<INavigatingCancelEventArgs,INavigatingCancelEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigatingCancelEventArgs?> =
        arrayOfNulls<INavigatingCancelEventArgs_Impl>(size) as Array<INavigatingCancelEventArgs?>
  }
}
