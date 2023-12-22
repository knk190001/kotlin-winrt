package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IActivatedEventArgs.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IContactsProviderActivatedEventArgs.ABI::class)
@Signature("{4580dca8-5750-4916-aa52-c0829521eb94}")
@Guid("4580dca857504916aa52c0829521eb94")
@WinRTInterface("4580dca857504916aa52c0829521eb94")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactsProviderActivatedEventArgs.ByReference::class)
public interface IContactsProviderActivatedEventArgs : NativeMapped, IWinRTInterface,
    IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_Verb(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactsProviderActivatedEventArgs> {
    public override fun getValue() =
        ABI.makeIContactsProviderActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IContactsProviderActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactsProviderActivatedEventArgs,
      IActivatedEventArgs.WithDefault {
    public val __1497084691_Ptr: Pointer?

    public val _1497084691_VtblPtr: Pointer?
      get() = __1497084691_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Verb(): String? {
      val fnPtr = _1497084691_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1497084691_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IContactsProviderActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1497084691_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1497084691_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactsProviderActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4580dca857504916aa52c0829521eb94")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactsProviderActivatedEventArgs(ptr: Pointer?): WithDefault =
        IContactsProviderActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactsProviderActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIContactsProviderActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IContactsProviderActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1497084691_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactsProviderActivatedEventArgs):
        Array<IContactsProviderActivatedEventArgs?> = (elements as
        Array<IContactsProviderActivatedEventArgs?>).castToImpl<IContactsProviderActivatedEventArgs,IContactsProviderActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactsProviderActivatedEventArgs?> =
        arrayOfNulls<IContactsProviderActivatedEventArgs_Impl>(size) as
        Array<IContactsProviderActivatedEventArgs?>
  }
}
