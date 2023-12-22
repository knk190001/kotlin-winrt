package Windows.UI.Xaml.Controls

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

@ABIMarker(IPasswordBoxPasswordChangingEventArgs.ABI::class)
@Signature("{142eda22-3552-4ab8-81a6-a48620ee9c53}")
@Guid("142eda2235524ab881a6a48620ee9c53")
@WinRTInterface("142eda2235524ab881a6a48620ee9c53")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPasswordBoxPasswordChangingEventArgs.ByReference::class)
public interface IPasswordBoxPasswordChangingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsContentChanging(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPasswordBoxPasswordChangingEventArgs> {
    public override fun getValue() =
        ABI.makeIPasswordBoxPasswordChangingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPasswordBoxPasswordChangingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPasswordBoxPasswordChangingEventArgs {
    public val __617324005_Ptr: Pointer?

    public val _617324005_VtblPtr: Pointer?
      get() = __617324005_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsContentChanging(): Boolean {
      val fnPtr = _617324005_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__617324005_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPasswordBoxPasswordChangingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __617324005_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPasswordBoxPasswordChangingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("142eda2235524ab881a6a48620ee9c53")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPasswordBoxPasswordChangingEventArgs(ptr: Pointer?): WithDefault =
        IPasswordBoxPasswordChangingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPasswordBoxPasswordChangingEventArgs {
      val address = segment.toRawLongValue()
      return makeIPasswordBoxPasswordChangingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPasswordBoxPasswordChangingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__617324005_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPasswordBoxPasswordChangingEventArgs):
        Array<IPasswordBoxPasswordChangingEventArgs?> = (elements as
        Array<IPasswordBoxPasswordChangingEventArgs?>).castToImpl<IPasswordBoxPasswordChangingEventArgs,IPasswordBoxPasswordChangingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPasswordBoxPasswordChangingEventArgs?> =
        arrayOfNulls<IPasswordBoxPasswordChangingEventArgs_Impl>(size) as
        Array<IPasswordBoxPasswordChangingEventArgs?>
  }
}
