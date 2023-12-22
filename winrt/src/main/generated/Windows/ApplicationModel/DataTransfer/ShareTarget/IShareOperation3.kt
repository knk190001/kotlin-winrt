package Windows.ApplicationModel.DataTransfer.ShareTarget

import Windows.ApplicationModel.Contacts.Contact
import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IShareOperation3.ABI::class)
@Signature("{5ef6b382-b7a7-4571-a2a6-994a034988b2}")
@Guid("5ef6b382b7a74571a2a6994a034988b2")
@WinRTInterface("5ef6b382b7a74571a2a6994a034988b2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IShareOperation3.ByReference::class)
public interface IShareOperation3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Contacts(): IVectorView<Contact?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IShareOperation3> {
    public override fun getValue() = ABI.makeIShareOperation3(pointer.getPointer(0))

    public fun setValue(value: IShareOperation3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IShareOperation3 {
    public val __480746077_Ptr: Pointer?

    public val _480746077_VtblPtr: Pointer?
      get() = __480746077_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Contacts(): IVectorView<Contact?>? {
      val fnPtr = _480746077_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Contact?>>()
      val hr = fn.invokeHR(arrayOf(__480746077_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Contact?>>(result.getValue())
      return resultValue
    }
  }

  public class IShareOperation3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __480746077_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IShareOperation3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5ef6b382b7a74571a2a6994a034988b2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIShareOperation3(ptr: Pointer?): WithDefault = IShareOperation3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IShareOperation3 {
      val address = segment.toRawLongValue()
      return makeIShareOperation3(Pointer(address))
    }

    public override fun toNative(obj: IShareOperation3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__480746077_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IShareOperation3): Array<IShareOperation3?> = (elements as
        Array<IShareOperation3?>).castToImpl<IShareOperation3,IShareOperation3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IShareOperation3?> =
        arrayOfNulls<IShareOperation3_Impl>(size) as Array<IShareOperation3?>
  }
}
