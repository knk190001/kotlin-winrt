package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IActivatedEventArgs.ABI.IID
import Windows.Security.Authentication.Web.Provider.IWebAccountProviderOperation
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebAccountProviderActivatedEventArgs.ABI::class)
@Signature("{72b71774-98ea-4ccf-9752-46d9051004f1}")
@Guid("72b7177498ea4ccf975246d9051004f1")
@WinRTInterface("72b7177498ea4ccf975246d9051004f1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAccountProviderActivatedEventArgs.ByReference::class)
public interface IWebAccountProviderActivatedEventArgs : NativeMapped, IWinRTInterface,
    IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_Operation(): IWebAccountProviderOperation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAccountProviderActivatedEventArgs> {
    public override fun getValue() =
        ABI.makeIWebAccountProviderActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWebAccountProviderActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAccountProviderActivatedEventArgs,
      IActivatedEventArgs.WithDefault {
    public val __528531143_Ptr: Pointer?

    public val _528531143_VtblPtr: Pointer?
      get() = __528531143_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Operation(): IWebAccountProviderOperation? {
      val fnPtr = _528531143_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IWebAccountProviderOperation>()
      val hr = fn.invokeHR(arrayOf(__528531143_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IWebAccountProviderOperation>(result.getValue())
      return resultValue
    }
  }

  public class IWebAccountProviderActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_528531143_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __528531143_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAccountProviderActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("72b7177498ea4ccf975246d9051004f1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAccountProviderActivatedEventArgs(ptr: Pointer?): WithDefault =
        IWebAccountProviderActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAccountProviderActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWebAccountProviderActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWebAccountProviderActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__528531143_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAccountProviderActivatedEventArgs):
        Array<IWebAccountProviderActivatedEventArgs?> = (elements as
        Array<IWebAccountProviderActivatedEventArgs?>).castToImpl<IWebAccountProviderActivatedEventArgs,IWebAccountProviderActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAccountProviderActivatedEventArgs?> =
        arrayOfNulls<IWebAccountProviderActivatedEventArgs_Impl>(size) as
        Array<IWebAccountProviderActivatedEventArgs?>
  }
}
