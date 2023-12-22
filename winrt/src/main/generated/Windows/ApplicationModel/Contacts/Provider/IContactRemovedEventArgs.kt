package Windows.ApplicationModel.Contacts.Provider

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

@ABIMarker(IContactRemovedEventArgs.ABI::class)
@Signature("{6f354338-3302-4d13-ad8d-adcc0ff9e47c}")
@Guid("6f35433833024d13ad8dadcc0ff9e47c")
@WinRTInterface("6f35433833024d13ad8dadcc0ff9e47c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactRemovedEventArgs.ByReference::class)
public interface IContactRemovedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactRemovedEventArgs> {
    public override fun getValue() = ABI.makeIContactRemovedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IContactRemovedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactRemovedEventArgs {
    public val __1960439696_Ptr: Pointer?

    public val _1960439696_VtblPtr: Pointer?
      get() = __1960439696_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _1960439696_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1960439696_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IContactRemovedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1960439696_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactRemovedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6f35433833024d13ad8dadcc0ff9e47c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactRemovedEventArgs(ptr: Pointer?): WithDefault =
        IContactRemovedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactRemovedEventArgs {
      val address = segment.toRawLongValue()
      return makeIContactRemovedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IContactRemovedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1960439696_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactRemovedEventArgs):
        Array<IContactRemovedEventArgs?> = (elements as
        Array<IContactRemovedEventArgs?>).castToImpl<IContactRemovedEventArgs,IContactRemovedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactRemovedEventArgs?> =
        arrayOfNulls<IContactRemovedEventArgs_Impl>(size) as Array<IContactRemovedEventArgs?>
  }
}
