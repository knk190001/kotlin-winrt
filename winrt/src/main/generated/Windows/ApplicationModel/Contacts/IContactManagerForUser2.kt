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

@ABIMarker(IContactManagerForUser2.ABI::class)
@Signature("{4d469c2e-3b75-4a73-bb30-736645472256}")
@Guid("4d469c2e3b754a73bb30736645472256")
@WinRTInterface("4d469c2e3b754a73bb30736645472256")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactManagerForUser2.ByReference::class)
public interface IContactManagerForUser2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ShowFullContactCard(contact: Contact?,
      fullContactCardOptions: FullContactCardOptions?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactManagerForUser2> {
    public override fun getValue() = ABI.makeIContactManagerForUser2(pointer.getPointer(0))

    public fun setValue(value: IContactManagerForUser2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactManagerForUser2 {
    public val __18867977_Ptr: Pointer?

    public val _18867977_VtblPtr: Pointer?
      get() = __18867977_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ShowFullContactCard(contact: Contact?,
        fullContactCardOptions: FullContactCardOptions?): Unit {
      val fnPtr = _18867977_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__18867977_Ptr, marshalToNative(contact),
          marshalToNative(fullContactCardOptions),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContactManagerForUser2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __18867977_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactManagerForUser2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4d469c2e3b754a73bb30736645472256")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactManagerForUser2(ptr: Pointer?): WithDefault =
        IContactManagerForUser2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactManagerForUser2 {
      val address = segment.toRawLongValue()
      return makeIContactManagerForUser2(Pointer(address))
    }

    public override fun toNative(obj: IContactManagerForUser2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__18867977_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactManagerForUser2): Array<IContactManagerForUser2?>
        = (elements as
        Array<IContactManagerForUser2?>).castToImpl<IContactManagerForUser2,IContactManagerForUser2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactManagerForUser2?> =
        arrayOfNulls<IContactManagerForUser2_Impl>(size) as Array<IContactManagerForUser2?>
  }
}
