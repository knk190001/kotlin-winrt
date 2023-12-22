package Windows.ApplicationModel.Contacts

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

@ABIMarker(IContactChangedEventArgs.ABI::class)
@Signature("{525e7fd1-73f3-4b7d-a918-580be4366121}")
@Guid("525e7fd173f34b7da918580be4366121")
@WinRTInterface("525e7fd173f34b7da918580be4366121")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactChangedEventArgs.ByReference::class)
public interface IContactChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeferral(): ContactChangedDeferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactChangedEventArgs> {
    public override fun getValue() = ABI.makeIContactChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IContactChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactChangedEventArgs {
    public val __2002133993_Ptr: Pointer?

    public val _2002133993_VtblPtr: Pointer?
      get() = __2002133993_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeferral(): ContactChangedDeferral? {
      val fnPtr = _2002133993_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactChangedDeferral>()
      val hr = fn.invokeHR(arrayOf(__2002133993_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactChangedDeferral>(result.getValue())
      return resultValue
    }
  }

  public class IContactChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2002133993_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("525e7fd173f34b7da918580be4366121")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactChangedEventArgs(ptr: Pointer?): WithDefault =
        IContactChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIContactChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IContactChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2002133993_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactChangedEventArgs):
        Array<IContactChangedEventArgs?> = (elements as
        Array<IContactChangedEventArgs?>).castToImpl<IContactChangedEventArgs,IContactChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactChangedEventArgs?> =
        arrayOfNulls<IContactChangedEventArgs_Impl>(size) as Array<IContactChangedEventArgs?>
  }
}
